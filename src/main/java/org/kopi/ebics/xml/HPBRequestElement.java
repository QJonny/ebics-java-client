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

import java.io.FileOutputStream;

import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.interfaces.Configuration;
import org.kopi.ebics.session.EbicsSession;
import org.kopi.ebics.session.Product;

/**
 * The <code>HPBRequestElement</code> is the element to be sent when
 * a HPB request is needed to retrieve the bank public keys
 *
 * @author hachani
 *
 */
public class HPBRequestElement extends DefaultEbicsRootElement {

  /**
   * Constructs a new HPB Request element.
   * @param session the current ebics session.
   */
  public HPBRequestElement(EbicsSession session, Configuration configuration, Product product) {
    super(session, configuration, product);
  }

  @Override
  public String getName() {
    return "HPBRequest.xml";
  }

  @Override
  public void build() throws EbicsException {
    SignedInfo			signedInfo;
    byte[]			signature;

    noPubKeyDigestsRequest = new NoPubKeyDigestsRequestElement(session, this.configuration, this.product);
    noPubKeyDigestsRequest.build();
    
    try {
      FileOutputStream fos = new FileOutputStream("C:\\Users\\CGU\\Desktop\\afterBuid");
	  fos.write(noPubKeyDigestsRequest.toByteArray());
	  fos.close(); 
    } catch (Exception e) {
    	// TODO Auto-generated catch block
    	e.printStackTrace();
	}
    
    signedInfo = new SignedInfo(session.getUser(), noPubKeyDigestsRequest.getDigest());
    signedInfo.build();
    
    try {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\CGU\\Desktop\\signedBuild");
  	  fos.write(signedInfo.toByteArray());
  	  fos.close(); 
      } catch (Exception e) {
      	// TODO Auto-generated catch block
      	e.printStackTrace();
  	}
    
    noPubKeyDigestsRequest.setAuthSignature(signedInfo.getSignatureType());
    
    try {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\CGU\\Desktop\\postSetAuth");
  	  fos.write(noPubKeyDigestsRequest.toByteArray());
  	  fos.close(); 
      } catch (Exception e) {
      	// TODO Auto-generated catch block
      	e.printStackTrace();
  	}
    
    signature = signedInfo.sign(noPubKeyDigestsRequest.toByteArray());
    noPubKeyDigestsRequest.setSignatureValue(signature);
    
    try {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\CGU\\Desktop\\final");
  	  fos.write(noPubKeyDigestsRequest.toByteArray());
  	  fos.close(); 
      } catch (Exception e) {
      	// TODO Auto-generated catch block
      	e.printStackTrace();
  	}
  }

  @Override
  public byte[] toByteArray() {
    return noPubKeyDigestsRequest.toByteArray();
  }

  @Override
  public void validate() throws EbicsException {
    noPubKeyDigestsRequest.validate();
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private NoPubKeyDigestsRequestElement		noPubKeyDigestsRequest;
  private static final long 			serialVersionUID = -5565390370996751973L;
}
