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

package org.kopi.ebics.session;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.ResourceBundle;

import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.interfaces.Configuration;
import org.kopi.ebics.interfaces.EbicsLogger;
import org.kopi.ebics.interfaces.EbicsUser;
import org.kopi.ebics.interfaces.LetterManager;
import org.kopi.ebics.interfaces.SerializationManager;
import org.kopi.ebics.interfaces.TraceManager;
import org.kopi.ebics.io.IOUtils;
import org.kopi.ebics.letter.DefaultLetterManager;


/**
 * A simple client application configuration.
 *
 * @author hachani
 *
 */
public class DefaultConfiguration implements Configuration {

  /**
   * Creates a new application configuration.
   * @param rootDir the root directory
   */
  public DefaultConfiguration() {
    bundle = ResourceBundle.getBundle(RESOURCE_DIR);
    properties = new Properties();
    logger = new DefaultEbicsLogger();
    serializationManager = new DefaultSerializationManager();
    traceManager = new DefaultTraceManager();
  }



  /**
   * Returns the corresponding property of the given key
   * @param key the property key
   * @return the property value.
   */
  private String getString(String key) {
    try {
      return bundle.getString(key);
    } catch(MissingResourceException e) {
      return "!!" + key + "!!";
    }
  }

  /**
   * Loads the configuration
   * @throws EbicsException
   */
  public void load(File configFile) throws EbicsException {
    if (isConfigFileLoad) {
        throw new EbicsException("config already loaded");
    }

    try {
      properties.load(new FileInputStream(configFile));
    } catch (IOException e) {
      throw new EbicsException(e.getMessage());
    }

    isConfigFileLoad = true;
  }

  
  @Override
  public void init() {
    ((DefaultEbicsLogger)logger).setLevel(DefaultEbicsLogger.ALL_LEVEL);
    traceManager.setTraceEnabled(isTraceEnabled());
    letterManager = new DefaultLetterManager(getLocale());
  }

  @Override
  public Locale getLocale() {
    return Locale.FRANCE;
  }


  @Override
  public String getProperty(String key) {
    if (!isConfigFileLoad) {
      return null;
    }

    if (key == null) {
      return null;
    }

    return properties.getProperty(key);
  }
/*
  @Override
  public String getSSLTrustedStoreDirectory() {
    return rootDir + File.separator + getString("ssltruststore.dir.name");
  }

  @Override
  public String getSSLKeyStoreDirectory() {
    return rootDir + File.separator + getString("sslkeystore.dir.name");
  }

  @Override
  public String getSSLBankCertificates() {
    return rootDir + File.separator + getString("sslbankcert.dir.name");
  }

*/
  @Override
  public SerializationManager getSerializationManager() {
    return serializationManager;
  }

  @Override
  public TraceManager getTraceManager() {
    return traceManager;
  }

  @Override
  public LetterManager getLetterManager() {
    return letterManager;
  }

  
  @Override
  public EbicsLogger getLogger() {
    return logger;
  }

  @Override
  public String getSignatureVersion() {
    return getString("signature.version");
  }

  @Override
  public String getAuthenticationVersion() {
    return getString("authentication.version");
  }

  @Override
  public String getEncryptionVersion() {
    return getString("encryption.version");
  }

  @Override
  public boolean isTraceEnabled() {
    return true;
  }

  @Override
  public boolean isCompressionEnabled() {
    return true;
  }

  @Override
  public int getRevision() {
    return 1;
  }

  @Override
  public String getVersion() {
    return getString("ebics.version");
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private ResourceBundle			bundle;
  private Properties				properties;
  private EbicsLogger				logger;
  private SerializationManager		serializationManager;
  private TraceManager				traceManager;
  private LetterManager				letterManager;
  private boolean					isConfigFileLoad;

  private static final String			RESOURCE_DIR = "org.kopi.ebics.client.config";
}
