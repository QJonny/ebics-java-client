/*
 * XML Type:  EncryptionPubKeyInfoType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.EncryptionPubKeyInfoType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML EncryptionPubKeyInfoType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class EncryptionPubKeyInfoTypeImpl extends org.kopi.ebics.schema.h003.impl.PubKeyInfoTypeImpl implements org.kopi.ebics.schema.h003.EncryptionPubKeyInfoType
{
    private static final long serialVersionUID = 1L;
    
    public EncryptionPubKeyInfoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENCRYPTIONVERSION$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "EncryptionVersion");
    
    
    /**
     * Gets the "EncryptionVersion" element
     */
    public java.lang.String getEncryptionVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCRYPTIONVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EncryptionVersion" element
     */
    public org.kopi.ebics.schema.h003.EncryptionVersionType xgetEncryptionVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.EncryptionVersionType target = null;
            target = (org.kopi.ebics.schema.h003.EncryptionVersionType)get_store().find_element_user(ENCRYPTIONVERSION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EncryptionVersion" element
     */
    public void setEncryptionVersion(java.lang.String encryptionVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCRYPTIONVERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENCRYPTIONVERSION$0);
            }
            target.setStringValue(encryptionVersion);
        }
    }
    
    /**
     * Sets (as xml) the "EncryptionVersion" element
     */
    public void xsetEncryptionVersion(org.kopi.ebics.schema.h003.EncryptionVersionType encryptionVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.EncryptionVersionType target = null;
            target = (org.kopi.ebics.schema.h003.EncryptionVersionType)get_store().find_element_user(ENCRYPTIONVERSION$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.EncryptionVersionType)get_store().add_element_user(ENCRYPTIONVERSION$0);
            }
            target.set(encryptionVersion);
        }
    }
}
