/*
 * An XML document type.
 * Localname: HCARequestOrderData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HCARequestOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one HCARequestOrderData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HCARequestOrderDataDocumentImpl extends org.kopi.ebics.schema.h003.impl.EBICSOrderDataDocumentImpl implements org.kopi.ebics.schema.h003.HCARequestOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public HCARequestOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HCAREQUESTORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HCARequestOrderData");
    
    
    /**
     * Gets the "HCARequestOrderData" element
     */
    public org.kopi.ebics.schema.h003.HCARequestOrderDataType getHCARequestOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HCARequestOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HCARequestOrderDataType)get_store().find_element_user(HCAREQUESTORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HCARequestOrderData" element
     */
    public void setHCARequestOrderData(org.kopi.ebics.schema.h003.HCARequestOrderDataType hcaRequestOrderData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HCARequestOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HCARequestOrderDataType)get_store().find_element_user(HCAREQUESTORDERDATA$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HCARequestOrderDataType)get_store().add_element_user(HCAREQUESTORDERDATA$0);
            }
            target.set(hcaRequestOrderData);
        }
    }
    
    /**
     * Appends and returns a new empty "HCARequestOrderData" element
     */
    public org.kopi.ebics.schema.h003.HCARequestOrderDataType addNewHCARequestOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HCARequestOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HCARequestOrderDataType)get_store().add_element_user(HCAREQUESTORDERDATA$0);
            return target;
        }
    }
}
