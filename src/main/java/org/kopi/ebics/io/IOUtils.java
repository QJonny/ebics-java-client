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

package org.kopi.ebics.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.interfaces.ContentFactory;


/**
 * Some IO utilities for EBICS files management.
 * EBICS server
 *
 * @author hachani
 *
 */
public class IOUtils {

  /**
   * Returns the content of a <code>ContentFactory</code> as a byte array
   * @param content
   * @return
   * @throws EbicsException
   */
    public static byte[] getFactoryContent(ContentFactory content) throws EbicsException {
        try (InputStream in = content.getContent()) {
            return inputStreamToBytes(in);
        } catch (IOException e) {
            throw new EbicsException(e.getMessage());
        }
    }

    private static byte[] inputStreamToBytes(InputStream in) throws IOException {
        int len;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        while ((len = in.read(buffer)) != -1) {
            out.write(buffer, 0, len);
        }
        out.close();
        return out.toByteArray();
    }
}
