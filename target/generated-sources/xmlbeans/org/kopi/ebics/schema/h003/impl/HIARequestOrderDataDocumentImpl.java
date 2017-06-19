/*
 * An XML document type.
 * Localname: HIARequestOrderData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HIARequestOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one HIARequestOrderData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HIARequestOrderDataDocumentImpl extends org.kopi.ebics.schema.h003.impl.EBICSOrderDataDocumentImpl implements org.kopi.ebics.schema.h003.HIARequestOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public HIARequestOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HIAREQUESTORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HIARequestOrderData");
    
    
    /**
     * Gets the "HIARequestOrderData" element
     */
    public org.kopi.ebics.schema.h003.HIARequestOrderDataType getHIARequestOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HIARequestOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HIARequestOrderDataType)get_store().find_element_user(HIAREQUESTORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HIARequestOrderData" element
     */
    public void setHIARequestOrderData(org.kopi.ebics.schema.h003.HIARequestOrderDataType hiaRequestOrderData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HIARequestOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HIARequestOrderDataType)get_store().find_element_user(HIAREQUESTORDERDATA$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HIARequestOrderDataType)get_store().add_element_user(HIAREQUESTORDERDATA$0);
            }
            target.set(hiaRequestOrderData);
        }
    }
    
    /**
     * Appends and returns a new empty "HIARequestOrderData" element
     */
    public org.kopi.ebics.schema.h003.HIARequestOrderDataType addNewHIARequestOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HIARequestOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HIARequestOrderDataType)get_store().add_element_user(HIAREQUESTORDERDATA$0);
            return target;
        }
    }
}
