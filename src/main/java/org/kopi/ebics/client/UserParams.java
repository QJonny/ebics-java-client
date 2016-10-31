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
 * Simple implementation of an EBICS user.
 * This object is not serializable, but it should be persisted every time it needs to be saved.
 * Persistence is achieved via <code>save(ObjectOutputStream)</code> and the matching constructor.
 *
 * @author Hachani
 *
 */
public class UserParams extends Params {


  /**
   * Reconstructs a an EBICS user by loading its certificate
   * from a given key store.
   * @param partner the customer in whose name we operate.
   * @param userId UserID as obtained from the bank.
   * @param keystorePath the key store path
   * @param passwordCallback a callback-handler that supplies us with the password.
   * @throws GeneralSecurityException
   * @throws IOException
   */
  public UserParams(String userId,
          	  String partnerId,
              String name,
              String dn)
  {
	super (userId);
    this.PartnerId = partnerId;
    this.Name = name;
    this.Dn = dn;
  }

  
  public String				PartnerId;
  public String				Name;
  public String				Dn;
}
