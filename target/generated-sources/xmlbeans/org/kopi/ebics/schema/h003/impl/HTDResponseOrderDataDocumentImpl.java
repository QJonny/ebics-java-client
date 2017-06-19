/*
 * An XML document type.
 * Localname: HTDResponseOrderData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HTDResponseOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one HTDResponseOrderData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HTDResponseOrderDataDocumentImpl extends org.kopi.ebics.schema.h003.impl.EBICSOrderDataDocumentImpl implements org.kopi.ebics.schema.h003.HTDResponseOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public HTDResponseOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HTDRESPONSEORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HTDResponseOrderData");
    
    
    /**
     * Gets the "HTDResponseOrderData" element
     */
    public org.kopi.ebics.schema.h003.HTDReponseOrderDataType getHTDResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HTDReponseOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HTDReponseOrderDataType)get_store().find_element_user(HTDRESPONSEORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HTDResponseOrderData" element
     */
    public void setHTDResponseOrderData(org.kopi.ebics.schema.h003.HTDReponseOrderDataType htdResponseOrderData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HTDReponseOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HTDReponseOrderDataType)get_store().find_element_user(HTDRESPONSEORDERDATA$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HTDReponseOrderDataType)get_store().add_element_user(HTDRESPONSEORDERDATA$0);
            }
            target.set(htdResponseOrderData);
        }
    }
    
    /**
     * Appends and returns a new empty "HTDResponseOrderData" element
     */
    public org.kopi.ebics.schema.h003.HTDReponseOrderDataType addNewHTDResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HTDReponseOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HTDReponseOrderDataType)get_store().add_element_user(HTDRESPONSEORDERDATA$0);
            return target;
        }
    }
}
