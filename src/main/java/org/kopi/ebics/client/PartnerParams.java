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

import org.kopi.ebics.interfaces.EbicsBank;
import org.kopi.ebics.interfaces.EbicsPartner;
import org.kopi.ebics.interfaces.Savable;


/**
 * Simple implementation of an EBICS customer.
 * This object is not serializable, but it should be persisted every time it needs to be saved.
 * Persistence is achieved via <code>save(ObjectOutputStream)</code> and the matching constructor.
 *
 * @author Hachani
 *
 */
public class PartnerParams {

  /**
   * Reconstructs a persisted EBICS customer.
   * @param bank the bank
   * @param ois the stream object
   * @throws IOException
   */
  public PartnerParams(String bankId, String partnerId) {
    this.BankId = bankId;
    this.PartnerId = partnerId;
  }


  public String			BankId;
  public String			PartnerId;
}
