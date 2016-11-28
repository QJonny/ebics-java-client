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

package org.kopi.ebics.xml;

import java.util.Calendar;

import javax.crypto.spec.SecretKeySpec;

import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.interfaces.Configuration;
import org.kopi.ebics.schema.h003.DataTransferRequestType;
import org.kopi.ebics.schema.h003.MutableHeaderType;
import org.kopi.ebics.schema.h003.StandardOrderParamsType;
import org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType;
import org.kopi.ebics.schema.h003.StaticHeaderType;
import org.kopi.ebics.schema.h003.DataEncryptionInfoType.EncryptionPubKeyDigest;
import org.kopi.ebics.schema.h003.DataTransferRequestType.DataEncryptionInfo;
import org.kopi.ebics.schema.h003.DataTransferRequestType.SignatureData;
import org.kopi.ebics.schema.h003.EbicsRequestDocument.EbicsRequest;
import org.kopi.ebics.schema.h003.EbicsRequestDocument.EbicsRequest.Body;
import org.kopi.ebics.schema.h003.EbicsRequestDocument.EbicsRequest.Header;
import org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType.OrderType;
import org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests;
import org.kopi.ebics.schema.h003.StaticHeaderType.Product;
import org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication;
import org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption;
import org.kopi.ebics.session.EbicsSession;
import org.kopi.ebics.utils.Utils;


/**
 * The <code>SPRRequestElement</code> is the request element
 * for revoking a subscriber
 *
 * @author Hachani
 *
 */
public class SPRRequestElement extends InitializationRequestElement {

  /**
   * Constructs a new SPR request element.
   * @param session the current ebic session.
   */
  public SPRRequestElement(EbicsSession session, Configuration configuration) throws EbicsException {
    super(session, configuration, org.kopi.ebics.session.OrderType.SPR, "SPRRequest.xml");
    keySpec = new SecretKeySpec(nonce, "EAS");
  }

  @Override
  public void buildInitialization() throws EbicsException {
    EbicsRequest			request;
    Header 				header;
    Body				body;
    MutableHeaderType 			mutable;
    StaticHeaderType 			xstatic;
    Product 				product;
    BankPubKeyDigests 			bankPubKeyDigests;
    Authentication 			authentication;
    Encryption 				encryption;
    DataTransferRequestType 		dataTransfer;
    DataEncryptionInfo 			dataEncryptionInfo;
    SignatureData 			signatureData;
    EncryptionPubKeyDigest 		encryptionPubKeyDigest;
    StaticHeaderOrderDetailsType 	orderDetails;
    OrderType 				orderType;
    StandardOrderParamsType		standardOrderParamsType;
    UserSignature			userSignature;

    userSignature = new UserSignature(session.getUser(),
			    				  session.getPartner(),
							      generateName("SIG"),
	                              this.configuration.getSignatureVersion(),
	                              " ".getBytes());
    userSignature.build();
    userSignature.validate();

    mutable = EbicsXmlFactory.createMutableHeaderType("Initialisation", null);
    product = EbicsXmlFactory.createProduct(session.getProduct().getLanguage(), session.getProduct().getName());
    authentication = EbicsXmlFactory.createAuthentication(this.configuration.getAuthenticationVersion(),
	                                                  "http://www.w3.org/2001/04/xmlenc#sha256",
	                                                  decodeHex(session.getBank().getX002Digest()));
    encryption = EbicsXmlFactory.createEncryption(this.configuration.getEncryptionVersion(),
	                                          "http://www.w3.org/2001/04/xmlenc#sha256",
	                                          decodeHex(session.getBank().getE002Digest()));
    bankPubKeyDigests = EbicsXmlFactory.createBankPubKeyDigests(authentication, encryption);
    orderType = EbicsXmlFactory.createOrderType(type.toString());
    standardOrderParamsType = EbicsXmlFactory.createStandardOrderParamsType();
    orderDetails = EbicsXmlFactory.createStaticHeaderOrderDetailsType(session.getPartner().nextOrderId(),
	                                                              "UZHNN",
	                                                              orderType,
	                                                              standardOrderParamsType);
    xstatic = EbicsXmlFactory.createStaticHeaderType(session.getBankID(),
	                                             nonce,
	                                             0,
	                                             session.getPartner().getPartnerId(),
	                                             product,
	                                             session.getUser().getSecurityMedium(),
	                                             session.getUser().getUserId(),
	                                             Calendar.getInstance(),
	                                             orderDetails,
	                                             bankPubKeyDigests);
    header = EbicsXmlFactory.createEbicsRequestHeader(true, mutable, xstatic);
    encryptionPubKeyDigest = EbicsXmlFactory.createEncryptionPubKeyDigest(this.configuration.getEncryptionVersion(),
								          "http://www.w3.org/2001/04/xmlenc#sha256",
								          decodeHex(session.getBank().getE002Digest()));
    signatureData = EbicsXmlFactory.createSignatureData(true, Utils.encrypt(Utils.zip(userSignature.prettyPrint()), keySpec));
    dataEncryptionInfo = EbicsXmlFactory.createDataEncryptionInfo(true,
	                                                          encryptionPubKeyDigest,
	                                                          generateTransactionKey());
    dataTransfer = EbicsXmlFactory.createDataTransferRequestType(dataEncryptionInfo, signatureData);
    body = EbicsXmlFactory.createEbicsRequestBody(dataTransfer);
    request = EbicsXmlFactory.createEbicsRequest(this.configuration.getRevision(),
	                                         this.configuration.getVersion(),
	                                         header,
	                                         body);
    document = EbicsXmlFactory.createEbicsRequestDocument(request);
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private SecretKeySpec			keySpec;
  private static final long 		serialVersionUID = -6742241777786111337L;
}
