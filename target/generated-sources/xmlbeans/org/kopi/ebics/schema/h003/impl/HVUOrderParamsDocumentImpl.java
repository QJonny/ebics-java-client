/*
 * An XML document type.
 * Localname: HVUOrderParams
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVUOrderParamsDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one HVUOrderParams(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HVUOrderParamsDocumentImpl extends org.kopi.ebics.schema.h003.impl.OrderParamsDocumentImpl implements org.kopi.ebics.schema.h003.HVUOrderParamsDocument
{
    private static final long serialVersionUID = 1L;
    
    public HVUOrderParamsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HVUORDERPARAMS$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HVUOrderParams");
    
    
    /**
     * Gets the "HVUOrderParams" element
     */
    public org.kopi.ebics.schema.h003.HVUOrderParamsType getHVUOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVUOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HVUOrderParamsType)get_store().find_element_user(HVUORDERPARAMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HVUOrderParams" element
     */
    public void setHVUOrderParams(org.kopi.ebics.schema.h003.HVUOrderParamsType hvuOrderParams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVUOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HVUOrderParamsType)get_store().find_element_user(HVUORDERPARAMS$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HVUOrderParamsType)get_store().add_element_user(HVUORDERPARAMS$0);
            }
            target.set(hvuOrderParams);
        }
    }
    
    /**
     * Appends and returns a new empty "HVUOrderParams" element
     */
    public org.kopi.ebics.schema.h003.HVUOrderParamsType addNewHVUOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVUOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HVUOrderParamsType)get_store().add_element_user(HVUORDERPARAMS$0);
            return target;
        }
    }
}
