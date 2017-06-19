/*
 * An XML document type.
 * Localname: HPBResponseOrderData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HPBResponseOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one HPBResponseOrderData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HPBResponseOrderDataDocumentImpl extends org.kopi.ebics.schema.h003.impl.EBICSOrderDataDocumentImpl implements org.kopi.ebics.schema.h003.HPBResponseOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public HPBResponseOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HPBRESPONSEORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HPBResponseOrderData");
    
    
    /**
     * Gets the "HPBResponseOrderData" element
     */
    public org.kopi.ebics.schema.h003.HPBResponseOrderDataType getHPBResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPBResponseOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HPBResponseOrderDataType)get_store().find_element_user(HPBRESPONSEORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HPBResponseOrderData" element
     */
    public void setHPBResponseOrderData(org.kopi.ebics.schema.h003.HPBResponseOrderDataType hpbResponseOrderData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPBResponseOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HPBResponseOrderDataType)get_store().find_element_user(HPBRESPONSEORDERDATA$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HPBResponseOrderDataType)get_store().add_element_user(HPBRESPONSEORDERDATA$0);
            }
            target.set(hpbResponseOrderData);
        }
    }
    
    /**
     * Appends and returns a new empty "HPBResponseOrderData" element
     */
    public org.kopi.ebics.schema.h003.HPBResponseOrderDataType addNewHPBResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPBResponseOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HPBResponseOrderDataType)get_store().add_element_user(HPBRESPONSEORDERDATA$0);
            return target;
        }
    }
}
