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



/**
 * Simple implementation of an EBICS bank.
 * This object is serializable to facilitate persisting of the values.
 * Save the the object whenever it needs to be saved.
 *
 * @author Hachani
 *
 */
public class BankParams {

  /**
   * Constructs a new EBICS bank with the data you should have obtained from the bank.
   * @param url the bank URL
   * @param name the bank name
   * @param hostId the bank host ID
   * @param useCertificate does the bank use certificates for exchange ?
   */
  public BankParams(String url, String name, String hostId, boolean useCertificate) {
    this.Url = url;
    this.Name = name;
    this.HostId = hostId;
    this.UseCertificate = useCertificate;
  }


  /**
   * The bank URL
   * @serial
   */
  public String			Url;

  /**
   * The bank host id
   * @serial
   */
  public String		HostId;
  
  /**
   * Does the bank use certificates for signing/crypting ?
   * @serial
   */
  public boolean               UseCertificate;

  /**
   * The bank name
   * @serial
   */
  public String		Name;
}
