/*
 * Copyright (c) 1990-2012 kopiLeft Development SARL, Bizerte, Tunisia
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1 as published by the Free Software Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * $Id$
 */

package org.kopi.ebics.client;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.interfaces.Configuration;
import org.kopi.ebics.interfaces.EbicsBank;
import org.kopi.ebics.interfaces.PasswordCallback;
import org.kopi.ebics.interfaces.SerializationManager;
import org.kopi.ebics.messages.Messages;
import org.kopi.ebics.session.DefaultConfiguration;
import org.kopi.ebics.session.EbicsSession;
import org.kopi.ebics.session.OrderType;
import org.kopi.ebics.session.Product;
import org.kopi.ebics.utils.Constants;

/**
 * The ebics client application. Performs necessary tasks to contact the ebics
 * bank server like sending the INI, HIA and HPB requests for keys retrieval and
 * also performs the files transfer including uploads and downloads.
 *
 */
public class EbicsClient {
	private final Configuration configuration;
    private final Map<String, User> users = new HashMap<>();
    private final Map<String, Partner> partners = new HashMap<>();
    private final Map<String, Bank> banks = new HashMap<>();

    private Product defaultProduct;

    static {
        org.apache.xml.security.Init.init();
        java.security.Security.addProvider(new BouncyCastleProvider());
    }

    public class EbicsUserCertificates {
		public byte[] A005Certificate;
		public byte[] E002Certificate;
		public byte[] X002Certificate;
		public byte[] A005PrivateKey;
		public byte[] E002PrivateKey;
		public byte[] X002PrivateKey;
	}
    
    /**
     * Constructs a new ebics client application
     *
     * @param configuration
     *            the application configuration
     * @param properties
     */
    public EbicsClient(Configuration configuration) {
        this.configuration = configuration;

        Messages.setLocale(configuration.getLocale());
        configuration.getLogger().info(
            Messages.getString("init.configuration", Constants.APPLICATION_BUNDLE_NAME));
        configuration.init();
    }

    private EbicsSession createSession(User user, Product product) {
        EbicsSession session = new EbicsSession(user, configuration);
        session.setProduct(product);
        return session;
    }



    /**
     * Creates a new EBICS bank with the data you should have obtained from the
     * bank.
     *
     * @param url
     *            the bank URL
     * @param url
     *            the bank name
     * @param hostId
     *            the bank host ID
     * @param useCertificate
     *            does the bank use certificates ?
     * @return the created ebics bank
     */
    private Bank createBank(URL url, String name, String hostId, boolean useCertificate) {
        Bank bank = new Bank(url, name, hostId, useCertificate);
        banks.put(hostId, bank);
        return bank;
    }

    /**
     * Creates a new ebics partner
     *
     * @param bank
     *            the bank
     * @param partnerId
     *            the partner ID
     */
    private Partner createPartner(EbicsBank bank, String partnerId) {
        Partner partner = new Partner(bank, partnerId);
        partners.put(partnerId, partner);
        return partner;
    }

    
    public class UserObjects {
    	public byte[] UserObj;
    	public byte[] ParterObj;
    	public byte[] BankObj;
    }
    
    /**
     * Creates a new ebics user and generates its certificates.
     *
     * @param url
     *            the bank url
     * @param bankName
     *            the bank name
     * @param hostId
     *            the bank host ID
     * @param partnerId
     *            the partner ID
     * @param userId
     *            UserId as obtained from the bank.
     * @param name
     *            the user name,
     * @param email
     *            the user email
     * @param country
     *            the user country
     * @param organization
     *            the user organization or company
     * @param useCertificates
     *            does the bank use certificates ?
     * @param saveCertificates
     *            save generated certificates?
     * @param passwordCallback
     *            a callback-handler that supplies us with the password. This
     *            parameter can be null, in this case no password is used.
     * @return
     * @throws Exception
     */
    public void createUser(String url, String bankName, String hostId, String partnerId,
        String userId, String name, String email, String country, String organization, String password)
        throws Exception {


        Bank bank = createBank(new URL(url), bankName, hostId, false);
        Partner partner = createPartner(bank, partnerId);
        try {
            User user = new User(partner, userId, name, email, country, organization,
                createPasswordCallback(password));


            users.put(userId, user);
            partners.put(partner.getPartnerId(), partner);
            banks.put(bank.getHostId(), bank);

            
            configuration.getLogger().info(
                Messages.getString("user.create.success", Constants.APPLICATION_BUNDLE_NAME, userId));
        } catch (Exception e) {
            configuration.getLogger().error(
                Messages.getString("user.create.error", Constants.APPLICATION_BUNDLE_NAME), e);
            throw e;
        }
    }
    
    
    public UserObjects exportUserObjects(String userId) throws Exception {
    	if(!users.containsKey(userId)) {
    		throw new EbicsException("User not found");
    	}
		User user = users.get(userId);
		
    	if(!partners.containsKey(user.getPartner().getPartnerId())) {
    		throw new EbicsException("Partner not found");
    	}
		Partner partner = partners.get(user.getPartner().getPartnerId());
		
    	if(!banks.containsKey(partner.getBank().getHostId())) {
    		throw new EbicsException("Bank not found");
    	}
		Bank bank = banks.get(partner.getBank().getHostId());
		
    	
        byte[] bankObj = configuration.getSerializationManager().serialize(bank);
        byte[] partnerObj = configuration.getSerializationManager().serialize(partner);
        byte[] userObj = configuration.getSerializationManager().serialize(user);
        


        UserObjects objs = new UserObjects();
        objs.BankObj = bankObj;
        objs.ParterObj = partnerObj;
        objs.UserObj = userObj;
        
        return objs;
    }
    
    
    public byte[] exportKeyStore(String userId) throws EbicsException, IOException, GeneralSecurityException{
    	if(!users.containsKey(userId)) {
    		throw new EbicsException("User not found");
    	}
    	
		User user = users.get(userId);
    	
    	try {
			return user.exportUserCertificates();
		} catch (GeneralSecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			throw e;
		}
    }
    
    
    public EbicsUserCertificates exportUserCertificates(String userId) throws EbicsException {
    	if(!users.containsKey(userId)) {
    		throw new EbicsException("User not found");
    	}
    	
		User user = users.get(userId);
		EbicsUserCertificates certificates = new EbicsUserCertificates();
			
		certificates.A005Certificate = user.getA005Certificate();
		certificates.E002Certificate = user.getE002Certificate();
		certificates.X002Certificate = user.getX002Certificate();
		
		certificates.A005PrivateKey = user.getA005PrivateKey().getEncoded();
		certificates.E002PrivateKey = user.getE002PrivateKey().getEncoded();
		certificates.X002PrivateKey = user.getX002PrivateKey().getEncoded();
		
		return certificates;
    }
    

    /**
     * Loads a user knowing its ID
     *
     * @throws Exception
     */
    public void loadUser(String password, byte[] userObj, byte[] bankObj, byte[] partnerObj) throws Exception {
        SerializationManager serializer = configuration.getSerializationManager();
        
        try {
            Bank bank;
            Partner partner;
            User user;
            
            // ??? does it work?
            try (ObjectInputStream input = serializer.deserialize(bankObj)) {
                bank = (Bank) input.readObject();
            }

            try (ObjectInputStream input = serializer.deserialize(partnerObj)) {
                partner = new Partner (bank, input);
            }

            try (ObjectInputStream input = serializer.deserialize(userObj)) {
                user = new User(partner, input, createPasswordCallback(password));
            }
            
            
            
            if (!users.containsKey(user.getUserId())) {
                users.put(user.getUserId(), user);
            }
            
            if (!partners.containsKey(partner.getPartnerId())) {
            	partners.put(partner.getPartnerId(), partner);
            }
            
            if (!banks.containsKey(bank.getHostId())) {
            	banks.put(bank.getHostId(), bank);
            }

            
            
            
            configuration.getLogger().info(
                Messages.getString("user.load.success", Constants.APPLICATION_BUNDLE_NAME, user.getUserId()));
        } catch (Exception e) {
            configuration.getLogger().error(
                Messages.getString("user.load.error", Constants.APPLICATION_BUNDLE_NAME), e);
            throw e;
        }
    }

    
    
    
    /**
     * Sends an INI request to the ebics bank server
     *
     * @param userId
     *            the user ID
     * @param product
     *            the application product
     * @throws Exception
     */
    public void sendINIRequest(String userId) throws Exception {
    	if(!users.containsKey(userId)) {
    		throw new EbicsException("User not found");
    	}
    	
		User user = users.get(userId);
        configuration.getLogger().info(
            Messages.getString("ini.request.send", Constants.APPLICATION_BUNDLE_NAME, userId));
        if (user.isInitialized()) {
            configuration.getLogger().info(
                Messages.getString("user.already.initialized", Constants.APPLICATION_BUNDLE_NAME,
                    userId));
            return;
        }
        EbicsSession session = createSession(user, this.defaultProduct);
        KeyManagement keyManager = new KeyManagement(session);

        try {
            keyManager.sendINI(null);
            user.setInitialized(true);
            configuration.getLogger().info(
                Messages.getString("ini.send.success", Constants.APPLICATION_BUNDLE_NAME, userId));
        } catch (Exception e) {
            configuration.getLogger().error(
                Messages.getString("ini.send.error", Constants.APPLICATION_BUNDLE_NAME, userId), e);
            throw e;
        }
    }

    /**
     * Sends a HIA request to the ebics server.
     *
     * @param userId
     *            the user ID.
     * @param product
     *            the application product.
     * @throws Exception
     */
    public void sendHIARequest(String userId) throws Exception {
    	if(!users.containsKey(userId)) {
    		throw new EbicsException("User not found");
    	}
    	
		User user = users.get(userId);
        configuration.getLogger().info(
            Messages.getString("hia.request.send", Constants.APPLICATION_BUNDLE_NAME, userId));
        if (user.isInitializedHIA()) {
            configuration.getLogger().info(
                Messages.getString("user.already.hia.initialized",
                    Constants.APPLICATION_BUNDLE_NAME, userId));
            return;
        }
        EbicsSession session = createSession(user, this.defaultProduct);
        KeyManagement keyManager = new KeyManagement(session);

        try {
            keyManager.sendHIA(null);
            user.setInitializedHIA(true);
        } catch (Exception e) {
            configuration.getLogger().error(
                Messages.getString("hia.send.error", Constants.APPLICATION_BUNDLE_NAME, userId), e);
            throw e;
        }
        configuration.getLogger().info(
            Messages.getString("hia.send.success", Constants.APPLICATION_BUNDLE_NAME, userId));
    }

    /**
     * Sends a HPB request to the ebics server.
     */
    public byte[] sendHPBRequest(String userId, byte[] keyStore) throws Exception {
    	if(!users.containsKey(userId)) {
    		throw new EbicsException("User not found");
    	}
    	
		User user = users.get(userId);
        configuration.getLogger().info(
            Messages.getString("hpb.request.send", Constants.APPLICATION_BUNDLE_NAME, userId));

        EbicsSession session = createSession(user, this.defaultProduct);
        KeyManagement keyManager = new KeyManagement(session);


        try {
            byte[] updatedKeyStore = keyManager.sendHPB(keyStore);
            configuration.getLogger().info(
                Messages.getString("hpb.send.success", Constants.APPLICATION_BUNDLE_NAME, userId));
            
            return updatedKeyStore;
        } catch (Exception e) {
            configuration.getLogger().error(
                Messages.getString("hpb.send.error", Constants.APPLICATION_BUNDLE_NAME, userId), e);
            throw e;
        }
    }

    /**
     * Sends the SPR order to the bank.
     *
     * @param userId
     *            the user ID
     * @param product
     *            the session product
     * @throws Exception
     */
    public void revokeSubscriber(String userId) throws Exception {
    	if(!users.containsKey(userId)) {
    		throw new EbicsException("User not found");
    	}
    	
		User user = users.get(userId);

        configuration.getLogger().info(
            Messages.getString("spr.request.send", Constants.APPLICATION_BUNDLE_NAME, userId));

        EbicsSession session = createSession(user, this.defaultProduct);
        KeyManagement keyManager = new KeyManagement(session);

        try {
            keyManager.lockAccess();
        } catch (Exception e) {
            configuration.getLogger().error(
                Messages.getString("spr.send.error", Constants.APPLICATION_BUNDLE_NAME, userId), e);
            throw e;
        }

        configuration.getLogger().info(
            Messages.getString("spr.send.success", Constants.APPLICATION_BUNDLE_NAME, userId));
    }

    /**
     * Sends a file to the ebics bank server
     * @throws Exception
     */
    public void sendFile(byte[] fileContent, String userId, OrderType orderType) throws Exception {
    	if(!users.containsKey(userId)) {
    		throw new EbicsException("User not found");
    	}
    	
		User user = users.get(userId);
    	
        EbicsSession session = createSession(user, this.defaultProduct);
        String format = null;
        String orderAttribute = "DZHNN";

        if (orderType == OrderType.XKD) {
            orderAttribute = "OZHNN";
        } else {
            format = "pain.xxx.cfonb160.dct";
        }

        if (format != null) {
            session.addSessionParam("FORMAT", format);
        }

        FileTransfer transferManager = new FileTransfer(session);

        try {
            transferManager.sendFile(fileContent, orderType, orderAttribute);
        } catch (IOException | EbicsException e) {
            configuration.getLogger().error(
                Messages.getString("upload.file.error", Constants.APPLICATION_BUNDLE_NAME,
                    ""), e);
            throw e;
        }
    }

    public byte[] fetchFile(String userId, OrderType orderType,
        boolean isTest, Date start, Date end) throws IOException, EbicsException {
    	if(!users.containsKey(userId)) {
    		throw new EbicsException("User not found");
    	}
    	
		User user = users.get(userId);
    	
        FileTransfer transferManager;
        EbicsSession session = createSession(user, this.defaultProduct);
        session.addSessionParam("FORMAT", "pain.xxx.cfonb160.dct");
        if (isTest) {
            session.addSessionParam("TEST", "true");
        }
        transferManager = new FileTransfer(session);


        try {
            return transferManager.fetchFile(orderType, start, end);
        } catch (Exception e) {
            configuration.getLogger().error(
                Messages.getString("download.file.error", Constants.APPLICATION_BUNDLE_NAME), e);
            throw e;
        }
    }

    public byte[] fetchFile(String userId, OrderType orderType, Date start, Date end) throws IOException,
        EbicsException {
        return fetchFile(userId, orderType, false, start, end);
    }

    /**
     * Performs buffers save before quitting the client application.
     */
    public void quit() {
    	this.users.clear();
    	this.banks.clear();
    	this.partners.clear();
    }


    
    
    public static EbicsClient createEbicsClient(String language, String country, String productName, String traceDir) throws FileNotFoundException,
        IOException {

        final Locale locale = new Locale(language, country);

        DefaultConfiguration configuration = new DefaultConfiguration() {

            @Override
            public Locale getLocale() {
                return locale;
            }
        };

        EbicsClient client = new EbicsClient(configuration);

        Product product = new Product(productName, language, null);

        client.defaultProduct = product;

        return client;
    }



    private PasswordCallback createPasswordCallback(String pwd) {
        final String password = pwd;
        PasswordCallback pwdHandler = new PasswordCallback() {

            @Override
            public char[] getPassword() {
                return password.toCharArray();
            }
        };
        return pwdHandler;
    }


    public static void main(String[] args) throws Exception {
        /*Options options = new Options();
        options.addOption(null, "ini", false, "Send INI request");
        options.addOption(null, "hia", false, "Send HIA request");
        options.addOption(null, "hbp", false, "Send HPB request");
        options.addOption(null, "letters", false, "Create INI Letters");
        options.addOption(null, "create", false, "Create and initialize EBICS user");
        options.addOption(null, "sta", false, "Fetch STA file (MT940 file)");
        options.addOption(null, "vmk", false, "Fetch VMK file (MT942 file)");
        options.addOption(null, "zdf", false, "Fetch ZDF file (zip file with documents)");
        options.addOption(null, "zb6", false, "Fetch ZB6 file");
        options.addOption(null, "ptk", false, "Fetch client protocol file (TXT)");
        options.addOption(null, "hac", false, "Fetch client protocol file (XML)");
        options.addOption(null, "z01", false, "Fetch Z01 file");

        options.addOption(null, "xkd", false, "Send payment order file (DTA format)");
        options.addOption(null, "ful", false, "Send payment order file (any format)");
        options.addOption(null, "xct", false, "Send XCT file (any format)");
        options.addOption(null, "xe2", false, "Send XE2 file (any format)");
        options.addOption(null, "cct", false, "Send CCT file (any format)");

        options.addOption(null, "skip_order", true, "Skip a number of order ids");

        options.addOption("o", "output", true, "output file");
        options.addOption("i", "input", true, "input file");


        CommandLine cmd = parseArguments(options, args);

        File defaultRootDir = new File(System.getProperty("user.home") + File.separator + "ebics"
            + File.separator + "client");
        File ebicsClientProperties = new File(defaultRootDir, "ebics.txt");
        EbicsClient client = createEbicsClient(defaultRootDir, ebicsClientProperties);

        if (cmd.hasOption("create")) {
            client.createDefaultUser();
        } else {
            client.loadDefaultUser();
        }

        if (cmd.hasOption("letters")) {
            //client.createLetters(client.defaultUser, false);
        }

        if (cmd.hasOption("ini")) {
            client.sendINIRequest(client.defaultUser, client.defaultProduct);
        }
        if (cmd.hasOption("hia")) {
            client.sendHIARequest(client.defaultUser, client.defaultProduct);
        }

        if (cmd.hasOption("hpb")) {
            client.sendHPBRequest(client.defaultUser, client.defaultProduct);
        }

        String outputFileValue = cmd.getOptionValue("o");
        String inputFileValue = cmd.getOptionValue("i");

        List<OrderType> fetchFileOrders = Arrays.asList(OrderType.STA, OrderType.VMK,
            OrderType.ZDF, OrderType.ZB6, OrderType.PTK, OrderType.HAC, OrderType.Z01);

        for (OrderType type : fetchFileOrders) {
            if (cmd.hasOption(type.name().toLowerCase())) {
                client.fetchFile(getOutputFile(outputFileValue), client.defaultUser,
                    client.defaultProduct, type, false, null, null);
                break;
            }
        }

        List<OrderType> sendFileOrders = Arrays.asList(OrderType.XKD, OrderType.FUL, OrderType.XCT,
            OrderType.XE2, OrderType.CCT);
        for (OrderType type : sendFileOrders) {
            if (cmd.hasOption(type.name().toLowerCase())) {
                client.sendFile(new File(inputFileValue), client.defaultUser,
                    client.defaultProduct, type);
                break;
            }
        }


        if (cmd.hasOption("skip_order")) {
            int count = Integer.parseInt(cmd.getOptionValue("skip_order"));
            while(count-- > 0) {
                client.defaultUser.getPartner().nextOrderId();
            }
        }

        client.quit();*/
    }
}
