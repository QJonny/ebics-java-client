/*
 * An XML document type.
 * Localname: HSARequestOrderData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HSARequestOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one HSARequestOrderData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HSARequestOrderDataDocumentImpl extends org.kopi.ebics.schema.h003.impl.EBICSOrderDataDocumentImpl implements org.kopi.ebics.schema.h003.HSARequestOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public HSARequestOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HSAREQUESTORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HSARequestOrderData");
    
    
    /**
     * Gets the "HSARequestOrderData" element
     */
    public org.kopi.ebics.schema.h003.HSARequestOrderDataType getHSARequestOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HSARequestOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HSARequestOrderDataType)get_store().find_element_user(HSAREQUESTORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HSARequestOrderData" element
     */
    public void setHSARequestOrderData(org.kopi.ebics.schema.h003.HSARequestOrderDataType hsaRequestOrderData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HSARequestOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HSARequestOrderDataType)get_store().find_element_user(HSAREQUESTORDERDATA$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HSARequestOrderDataType)get_store().add_element_user(HSAREQUESTORDERDATA$0);
            }
            target.set(hsaRequestOrderData);
        }
    }
    
    /**
     * Appends and returns a new empty "HSARequestOrderData" element
     */
    public org.kopi.ebics.schema.h003.HSARequestOrderDataType addNewHSARequestOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HSARequestOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HSARequestOrderDataType)get_store().add_element_user(HSAREQUESTORDERDATA$0);
            return target;
        }
    }
}
