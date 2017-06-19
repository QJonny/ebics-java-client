/*
 * An XML document type.
 * Localname: RSAKeyValue
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.RSAKeyValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * A document containing one RSAKeyValue(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class RSAKeyValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.RSAKeyValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public RSAKeyValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RSAKEYVALUE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "RSAKeyValue");
    
    
    /**
     * Gets the "RSAKeyValue" element
     */
    public org.kopi.ebics.schema.xmldsig.RSAKeyValueType getRSAKeyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.RSAKeyValueType target = null;
            target = (org.kopi.ebics.schema.xmldsig.RSAKeyValueType)get_store().find_element_user(RSAKEYVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RSAKeyValue" element
     */
    public void setRSAKeyValue(org.kopi.ebics.schema.xmldsig.RSAKeyValueType rsaKeyValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.RSAKeyValueType target = null;
            target = (org.kopi.ebics.schema.xmldsig.RSAKeyValueType)get_store().find_element_user(RSAKEYVALUE$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.xmldsig.RSAKeyValueType)get_store().add_element_user(RSAKEYVALUE$0);
            }
            target.set(rsaKeyValue);
        }
    }
    
    /**
     * Appends and returns a new empty "RSAKeyValue" element
     */
    public org.kopi.ebics.schema.xmldsig.RSAKeyValueType addNewRSAKeyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.RSAKeyValueType target = null;
            target = (org.kopi.ebics.schema.xmldsig.RSAKeyValueType)get_store().add_element_user(RSAKEYVALUE$0);
            return target;
        }
    }
}
