/*
 * An XML document type.
 * Localname: HAAResponseOrderData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HAAResponseOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one HAAResponseOrderData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HAAResponseOrderDataDocumentImpl extends org.kopi.ebics.schema.h003.impl.EBICSOrderDataDocumentImpl implements org.kopi.ebics.schema.h003.HAAResponseOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public HAAResponseOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HAARESPONSEORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HAAResponseOrderData");
    
    
    /**
     * Gets the "HAAResponseOrderData" element
     */
    public org.kopi.ebics.schema.h003.HAAResponseOrderDataType getHAAResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HAAResponseOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HAAResponseOrderDataType)get_store().find_element_user(HAARESPONSEORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HAAResponseOrderData" element
     */
    public void setHAAResponseOrderData(org.kopi.ebics.schema.h003.HAAResponseOrderDataType haaResponseOrderData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HAAResponseOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HAAResponseOrderDataType)get_store().find_element_user(HAARESPONSEORDERDATA$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HAAResponseOrderDataType)get_store().add_element_user(HAARESPONSEORDERDATA$0);
            }
            target.set(haaResponseOrderData);
        }
    }
    
    /**
     * Appends and returns a new empty "HAAResponseOrderData" element
     */
    public org.kopi.ebics.schema.h003.HAAResponseOrderDataType addNewHAAResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HAAResponseOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HAAResponseOrderDataType)get_store().add_element_user(HAARESPONSEORDERDATA$0);
            return target;
        }
    }
}
