/*
 * An XML document type.
 * Localname: HKDResponseOrderData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HKDResponseOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one HKDResponseOrderData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HKDResponseOrderDataDocumentImpl extends org.kopi.ebics.schema.h003.impl.EBICSOrderDataDocumentImpl implements org.kopi.ebics.schema.h003.HKDResponseOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public HKDResponseOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HKDRESPONSEORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HKDResponseOrderData");
    
    
    /**
     * Gets the "HKDResponseOrderData" element
     */
    public org.kopi.ebics.schema.h003.HKDResponseOrderDataType getHKDResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HKDResponseOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HKDResponseOrderDataType)get_store().find_element_user(HKDRESPONSEORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HKDResponseOrderData" element
     */
    public void setHKDResponseOrderData(org.kopi.ebics.schema.h003.HKDResponseOrderDataType hkdResponseOrderData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HKDResponseOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HKDResponseOrderDataType)get_store().find_element_user(HKDRESPONSEORDERDATA$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HKDResponseOrderDataType)get_store().add_element_user(HKDRESPONSEORDERDATA$0);
            }
            target.set(hkdResponseOrderData);
        }
    }
    
    /**
     * Appends and returns a new empty "HKDResponseOrderData" element
     */
    public org.kopi.ebics.schema.h003.HKDResponseOrderDataType addNewHKDResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HKDResponseOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HKDResponseOrderDataType)get_store().add_element_user(HKDRESPONSEORDERDATA$0);
            return target;
        }
    }
}
