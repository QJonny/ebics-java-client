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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.kopi.ebics.interfaces.EbicsBank;
import org.kopi.ebics.interfaces.EbicsPartner;
import org.kopi.ebics.interfaces.Exportable;
import org.kopi.ebics.interfaces.Savable;


/**
 * Simple implementation of an EBICS customer.
 * This object is not serializable, but it should be persisted every time it needs to be saved.
 * Persistence is achieved via <code>save(ObjectOutputStream)</code> and the matching constructor.
 *
 * @author Hachani
 *
 */
public class Partner implements EbicsPartner, Savable, Exportable {

  /**
   * Reconstructs a persisted EBICS customer.
   * @param bank the bank
   * @param ois the stream object
   * @throws IOException
   */
  public Partner(ObjectInputStream ois) throws IOException {
    this.partnerId = ois.readUTF();
    this.hostId = ois.readUTF();
    this.orderId = ois.readInt();
  }

  /**
   * First time constructor.
   * @param bank the bank
   * @param partnerId the partner ID
   */
  public Partner(String partnerId, String hostId) {
    this.partnerId = partnerId;
    this.hostId = hostId;
  }
  
  public Partner(PartnerParams params) {
    this.partnerId = params.Id;
    this.hostId = params.HostId;
  }

  
  /**
   * Returns the next order available ID
   * @return the next order ID
   */
  public Integer getNextOrderId() {
    return new Integer(orderId);
  }

  /**
   * Sets the order ID
   * @param orderId the order ID
   */
  public void setOrderId(Integer orderId) {
    this.orderId = orderId.intValue();
  }

  @Override
  public void save(ObjectOutputStream oos) throws IOException {
    oos.writeUTF(partnerId);
    oos.writeUTF(hostId);
    oos.writeInt(orderId);
    oos.flush();
    oos.close();
  }

  @Override
  public Params export() {
	  return new PartnerParams(this.partnerId, this.hostId);
  }
  

  @Override
  public String getPartnerId() {
    return partnerId;
  }

  /**
   * In EBICS XSD schema - ebics_types.xsd, The order ID pattern
   * is defined as following: <b>pattern value="[A-Z][A-Z0-9]{3}"</b>.
   * <p>This means that the order ID should start with a letter
   * followed by three alphanumeric characters.
   *
   *<p> The <code>nextOrderId()</code> aims to generate orders from
   *<b>A000</b> to <b>ZZZZ</b>. The sequence cycle is performed infinitely.
   *
   *<p> The order index {@link Partner#orderId} is saved whenever it
   * changes.
   */
  @Override
  public String nextOrderId() {
    char[]      chars = new char[4];


    orderId = this.randomWithRange(MIN_ORDER_ID, MAX_ORDER_ID);

    chars[3] = ALPHA_NUM_CHARS.charAt(orderId % 36);
    chars[2] = ALPHA_NUM_CHARS.charAt((orderId / 36) % 36);
    chars[1] = ALPHA_NUM_CHARS.charAt((orderId / 36 / 36) % 36);
    chars[0] = ALPHA_NUM_CHARS.charAt(orderId / 36 / 36 / 36);

    return new String(chars);
  }

  @Override
  public String getSaveName() {
    return "partner-" + partnerId + ".cer";
  }

  
  private int randomWithRange(int min, int max)
  {
     int range = (max - min) + 1;     
     return (int)(Math.random() * range) + min;
  }
  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private String			hostId;
  private int				orderId = MIN_ORDER_ID;
  private String			partnerId;

  private static final String		ALPHA_NUM_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final int 			MIN_ORDER_ID	= 10*36*36*36;
  private static final int 			MAX_ORDER_ID	= 36*36*36*36;
}
