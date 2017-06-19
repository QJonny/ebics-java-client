/*
 * An XML document type.
 * Localname: HPDResponseOrderData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HPDResponseOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one HPDResponseOrderData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HPDResponseOrderDataDocumentImpl extends org.kopi.ebics.schema.h003.impl.EBICSOrderDataDocumentImpl implements org.kopi.ebics.schema.h003.HPDResponseOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public HPDResponseOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HPDRESPONSEORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HPDResponseOrderData");
    
    
    /**
     * Gets the "HPDResponseOrderData" element
     */
    public org.kopi.ebics.schema.h003.HPDResponseOrderDataType getHPDResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPDResponseOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HPDResponseOrderDataType)get_store().find_element_user(HPDRESPONSEORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HPDResponseOrderData" element
     */
    public void setHPDResponseOrderData(org.kopi.ebics.schema.h003.HPDResponseOrderDataType hpdResponseOrderData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPDResponseOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HPDResponseOrderDataType)get_store().find_element_user(HPDRESPONSEORDERDATA$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HPDResponseOrderDataType)get_store().add_element_user(HPDRESPONSEORDERDATA$0);
            }
            target.set(hpdResponseOrderData);
        }
    }
    
    /**
     * Appends and returns a new empty "HPDResponseOrderData" element
     */
    public org.kopi.ebics.schema.h003.HPDResponseOrderDataType addNewHPDResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPDResponseOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HPDResponseOrderDataType)get_store().add_element_user(HPDRESPONSEORDERDATA$0);
            return target;
        }
    }
}
