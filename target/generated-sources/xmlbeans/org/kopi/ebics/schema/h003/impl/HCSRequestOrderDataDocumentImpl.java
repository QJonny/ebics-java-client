/*
 * An XML document type.
 * Localname: HCSRequestOrderData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HCSRequestOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one HCSRequestOrderData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HCSRequestOrderDataDocumentImpl extends org.kopi.ebics.schema.h003.impl.EBICSOrderDataDocumentImpl implements org.kopi.ebics.schema.h003.HCSRequestOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public HCSRequestOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HCSREQUESTORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HCSRequestOrderData");
    
    
    /**
     * Gets the "HCSRequestOrderData" element
     */
    public org.kopi.ebics.schema.h003.HCSRequestOrderDataType getHCSRequestOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HCSRequestOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HCSRequestOrderDataType)get_store().find_element_user(HCSREQUESTORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HCSRequestOrderData" element
     */
    public void setHCSRequestOrderData(org.kopi.ebics.schema.h003.HCSRequestOrderDataType hcsRequestOrderData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HCSRequestOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HCSRequestOrderDataType)get_store().find_element_user(HCSREQUESTORDERDATA$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HCSRequestOrderDataType)get_store().add_element_user(HCSREQUESTORDERDATA$0);
            }
            target.set(hcsRequestOrderData);
        }
    }
    
    /**
     * Appends and returns a new empty "HCSRequestOrderData" element
     */
    public org.kopi.ebics.schema.h003.HCSRequestOrderDataType addNewHCSRequestOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HCSRequestOrderDataType target = null;
            target = (org.kopi.ebics.schema.h003.HCSRequestOrderDataType)get_store().add_element_user(HCSREQUESTORDERDATA$0);
            return target;
        }
    }
}
