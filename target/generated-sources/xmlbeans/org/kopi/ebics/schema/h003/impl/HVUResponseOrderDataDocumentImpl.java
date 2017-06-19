/*
 * An XML document type.
 * Localname: HVUResponseOrderData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVUResponseOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one HVUResponseOrderData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HVUResponseOrderDataDocumentImpl extends org.kopi.ebics.schema.h003.impl.EBICSOrderDataDocumentImpl implements org.kopi.ebics.schema.h003.HVUResponseOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public HVUResponseOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HVURESPONSEORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HVUResponseOrderData");
    
    
    /**
     * Gets the "HVUResponseOrderData" element
     */
    public org.kopi.ebics.schema.h003.HVUResponseOrderDataType getHVUResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVUResponseOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HVUResponseOrderDataType)get_store().find_element_user(HVURESPONSEORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HVUResponseOrderData" element
     */
    public void setHVUResponseOrderData(org.kopi.ebics.schema.h003.HVUResponseOrderDataType hvuResponseOrderData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVUResponseOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HVUResponseOrderDataType)get_store().find_element_user(HVURESPONSEORDERDATA$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HVUResponseOrderDataType)get_store().add_element_user(HVURESPONSEORDERDATA$0);
            }
            target.set(hvuResponseOrderData);
        }
    }
    
    /**
     * Appends and returns a new empty "HVUResponseOrderData" element
     */
    public org.kopi.ebics.schema.h003.HVUResponseOrderDataType addNewHVUResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVUResponseOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HVUResponseOrderDataType)get_store().add_element_user(HVURESPONSEORDERDATA$0);
            return target;
        }
    }
}
