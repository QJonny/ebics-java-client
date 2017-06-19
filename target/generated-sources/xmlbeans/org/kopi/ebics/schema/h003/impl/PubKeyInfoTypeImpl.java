/*
 * XML Type:  PubKeyInfoType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.PubKeyInfoType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML PubKeyInfoType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class PubKeyInfoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.PubKeyInfoType
{
    private static final long serialVersionUID = 1L;
    
    public PubKeyInfoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName X509DATA$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "X509Data");
    private static final javax.xml.namespace.QName PUBKEYVALUE$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "PubKeyValue");
    
    
    /**
     * Gets the "X509Data" element
     */
    public org.kopi.ebics.schema.xmldsig.X509DataType getX509Data()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.X509DataType target = null;
            target = (org.kopi.ebics.schema.xmldsig.X509DataType)get_store().find_element_user(X509DATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "X509Data" element
     */
    public boolean isSetX509Data()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(X509DATA$0) != 0;
        }
    }
    
    /**
     * Sets the "X509Data" element
     */
    public void setX509Data(org.kopi.ebics.schema.xmldsig.X509DataType x509Data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.X509DataType target = null;
            target = (org.kopi.ebics.schema.xmldsig.X509DataType)get_store().find_element_user(X509DATA$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.xmldsig.X509DataType)get_store().add_element_user(X509DATA$0);
            }
            target.set(x509Data);
        }
    }
    
    /**
     * Appends and returns a new empty "X509Data" element
     */
    public org.kopi.ebics.schema.xmldsig.X509DataType addNewX509Data()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.X509DataType target = null;
            target = (org.kopi.ebics.schema.xmldsig.X509DataType)get_store().add_element_user(X509DATA$0);
            return target;
        }
    }
    
    /**
     * Unsets the "X509Data" element
     */
    public void unsetX509Data()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(X509DATA$0, 0);
        }
    }
    
    /**
     * Gets the "PubKeyValue" element
     */
    public org.kopi.ebics.schema.h003.PubKeyValueType getPubKeyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.PubKeyValueType target = null;
            target = (org.kopi.ebics.schema.h003.PubKeyValueType)get_store().find_element_user(PUBKEYVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PubKeyValue" element
     */
    public void setPubKeyValue(org.kopi.ebics.schema.h003.PubKeyValueType pubKeyValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.PubKeyValueType target = null;
            target = (org.kopi.ebics.schema.h003.PubKeyValueType)get_store().find_element_user(PUBKEYVALUE$2, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.PubKeyValueType)get_store().add_element_user(PUBKEYVALUE$2);
            }
            target.set(pubKeyValue);
        }
    }
    
    /**
     * Appends and returns a new empty "PubKeyValue" element
     */
    public org.kopi.ebics.schema.h003.PubKeyValueType addNewPubKeyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.PubKeyValueType target = null;
            target = (org.kopi.ebics.schema.h003.PubKeyValueType)get_store().add_element_user(PUBKEYVALUE$2);
            return target;
        }
    }
}
