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

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPublicKey;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.kopi.ebics.certificate.KeyUtil;
import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.interfaces.Configuration;
import org.kopi.ebics.interfaces.EbicsBank;
import org.kopi.ebics.interfaces.InitLetter;
import org.kopi.ebics.interfaces.LetterManager;
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
    private Product defaultProduct;

    static {
        org.apache.xml.security.Init.init();
        java.security.Security.addProvider(new BouncyCastleProvider());
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
        configuration.init();
    }

    public EbicsSession createSession(UserParams userParams, PartnerParams partnerParams, BankParams bankParams, String password, byte[] keyStore, BankKeys bankKeys) 
    		throws Exception {
    	Bank bank = new Bank(bankParams);
    	Partner partner = new Partner(partnerParams);
    	User user = new User(userParams, createPasswordCallback(password));
    	
    	if (keyStore != null) {
    		user.loadCertificates(keyStore);
    	}
    	
    	if (bankKeys != null) {
    		RSAPublicKey e002Key = KeyUtil.getPublicKeyFromData(bankKeys.E002Key);
        	RSAPublicKey x002Key = KeyUtil.getPublicKeyFromData(bankKeys.X002Key);
        	
        	bank.setBankKeys(e002Key, x002Key);
        	bank.setDigests(KeyUtil.getKeyDigest(e002Key), KeyUtil.getKeyDigest(x002Key));
    	}
    	
        EbicsSession session = new EbicsSession(user, partner, bank);
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
    public Params createBank(String hostId, URL url, String name, boolean useCertificate) {
        return new Bank(url, name, hostId, useCertificate).export();
    }

    /**
     * Creates a new ebics partner
     *
     * @param bank
     *            the bank
     * @param partnerId
     *            the partner ID
     */
    public Params createPartner(String partnerId, String hostId) {
        return new Partner(partnerId, hostId).export();
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
    public Params createUser(String userId, String partnerId, String name, String email, String country, String organization)
        throws Exception {

        return new User(userId, partnerId, name, email, country, organization, null).export();
    }
    
   

    public Letters createLetters(EbicsSession session)
        throws GeneralSecurityException, EbicsException, IOException {
        LetterManager letterManager = configuration.getLetterManager();
        
        ByteArrayOutputStream a005Stream = new ByteArrayOutputStream();
        ByteArrayOutputStream e002Stream = new ByteArrayOutputStream();
        ByteArrayOutputStream x002Stream = new ByteArrayOutputStream();
        
        InitLetter a005Letter = letterManager.createA005Letter(session);
        InitLetter e002Letter = letterManager.createE002Letter(session);
        InitLetter x002Letter = letterManager.createX002Letter(session);
        
        a005Letter.writeTo(a005Stream);
        e002Letter.writeTo(e002Stream);
        x002Letter.writeTo(x002Stream);
        
        return new Letters(a005Stream.toByteArray(), e002Stream.toByteArray(), x002Stream.toByteArray());
    }
    
    
    public byte[] generateKeyStore(EbicsSession session) throws EbicsException, IOException, GeneralSecurityException{
		User user = (User) session.getUser();
		user.createUserCertificates();
		
		return user.exportKeyStore();
    }
    
    
    public BankKeys exportBankKeys(EbicsSession session) throws Exception {
    	Bank bank = (Bank) session.getBank();
    	
    	if (bank.getE002Key() == null || bank.getX002Key() == null) {
    		return null;
    	}
    	
    	return new BankKeys(bank.getHostId(), bank.getE002Key().getEncoded(), bank.getX002Key().getEncoded());
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
    public void sendINIRequest(EbicsSession session) throws Exception {
        KeyManagement keyManager = new KeyManagement(session, this.configuration, this.defaultProduct);
        keyManager.sendINI(null);
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
    public void sendHIARequest(EbicsSession session) throws Exception {
        KeyManagement keyManager = new KeyManagement(session, this.configuration, this.defaultProduct);
        keyManager.sendHIA(null);
    }

    /**
     * Sends a HPB request to the ebics server.
     */
    public HPBResult sendHPBRequest(EbicsSession session) throws Exception {
        KeyManagement keyManager = new KeyManagement(session, this.configuration, this.defaultProduct);
        User user = (User) session.getUser();

        byte[] updatedKeyStore = keyManager.sendHPB(user.exportKeyStore()); // exportKeyStore??

        
        BankKeys bankKeys = null;
    	Bank bank = (Bank) session.getBank();
    	
    	if (bank.getE002Key() != null && bank.getX002Key() != null) {
    		bankKeys = new BankKeys(bank.getHostId(), bank.getE002Key().getEncoded(), bank.getX002Key().getEncoded());
    	}
    	
 
    	return new HPBResult(bankKeys, updatedKeyStore);
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
    public void revokeSubscriber(EbicsSession session) throws Exception {
        KeyManagement keyManager = new KeyManagement(session, this.configuration, this.defaultProduct);
        keyManager.lockAccess();
    }

    /**
     * Sends a file to the ebics bank server
     * @throws Exception
     */
    public void sendFile(EbicsSession session, OrderType orderType, byte[] fileContent, String orderAttribute) throws Exception {
        String format = null;

        if (orderType == OrderType.XKD) {
            orderAttribute = "OZHNN";
        } else {
            format = "pain.xxx.cfonb160.dct"; // ???
        }

        if (format != null) {
            session.addSessionParam("FORMAT", format);
        }

        FileTransfer transferManager = new FileTransfer(session, this.configuration, this.defaultProduct);
        transferManager.sendFile(fileContent, orderType, orderAttribute);
    }

    public byte[] fetchFile(EbicsSession session, OrderType orderType, Date start, Date end, boolean isTest) throws IOException, EbicsException {
        FileTransfer transferManager;

        session.addSessionParam("FORMAT", "pain.xxx.cfonb160.dct"); // ???
        if (isTest) {
            session.addSessionParam("TEST", "true");
        }
        
        transferManager = new FileTransfer(session, this.configuration, this.defaultProduct);
        return transferManager.fetchFile(orderType, start, end);
    }


    
    
    
    
    public static EbicsClient createEbicsClient(String language, String country, String productName, boolean trace) throws FileNotFoundException,
        IOException {

        final Locale locale = new Locale(language, country);

        DefaultConfiguration configuration = new DefaultConfiguration(trace) {

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
    
    public static void main(String[] args) {
    	
    }
}
