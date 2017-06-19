/*
 * An XML document type.
 * Localname: DSAKeyValue
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.DSAKeyValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * A document containing one DSAKeyValue(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class DSAKeyValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.DSAKeyValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public DSAKeyValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DSAKEYVALUE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "DSAKeyValue");
    
    
    /**
     * Gets the "DSAKeyValue" element
     */
    public org.kopi.ebics.schema.xmldsig.DSAKeyValueType getDSAKeyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.DSAKeyValueType target = null;
            target = (org.kopi.ebics.schema.xmldsig.DSAKeyValueType)get_store().find_element_user(DSAKEYVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DSAKeyValue" element
     */
    public void setDSAKeyValue(org.kopi.ebics.schema.xmldsig.DSAKeyValueType dsaKeyValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.DSAKeyValueType target = null;
            target = (org.kopi.ebics.schema.xmldsig.DSAKeyValueType)get_store().find_element_user(DSAKEYVALUE$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.xmldsig.DSAKeyValueType)get_store().add_element_user(DSAKEYVALUE$0);
            }
            target.set(dsaKeyValue);
        }
    }
    
    /**
     * Appends and returns a new empty "DSAKeyValue" element
     */
    public org.kopi.ebics.schema.xmldsig.DSAKeyValueType addNewDSAKeyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.DSAKeyValueType target = null;
            target = (org.kopi.ebics.schema.xmldsig.DSAKeyValueType)get_store().add_element_user(DSAKEYVALUE$0);
            return target;
        }
    }
}
