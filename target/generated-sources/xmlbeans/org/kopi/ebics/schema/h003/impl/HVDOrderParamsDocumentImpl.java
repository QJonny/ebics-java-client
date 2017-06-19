/*
 * An XML document type.
 * Localname: HVDOrderParams
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVDOrderParamsDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one HVDOrderParams(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HVDOrderParamsDocumentImpl extends org.kopi.ebics.schema.h003.impl.OrderParamsDocumentImpl implements org.kopi.ebics.schema.h003.HVDOrderParamsDocument
{
    private static final long serialVersionUID = 1L;
    
    public HVDOrderParamsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HVDORDERPARAMS$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HVDOrderParams");
    
    
    /**
     * Gets the "HVDOrderParams" element
     */
    public org.kopi.ebics.schema.h003.HVDOrderParamsType getHVDOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVDOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HVDOrderParamsType)get_store().find_element_user(HVDORDERPARAMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HVDOrderParams" element
     */
    public void setHVDOrderParams(org.kopi.ebics.schema.h003.HVDOrderParamsType hvdOrderParams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVDOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HVDOrderParamsType)get_store().find_element_user(HVDORDERPARAMS$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HVDOrderParamsType)get_store().add_element_user(HVDORDERPARAMS$0);
            }
            target.set(hvdOrderParams);
        }
    }
    
    /**
     * Appends and returns a new empty "HVDOrderParams" element
     */
    public org.kopi.ebics.schema.h003.HVDOrderParamsType addNewHVDOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVDOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HVDOrderParamsType)get_store().add_element_user(HVDORDERPARAMS$0);
            return target;
        }
    }
}
