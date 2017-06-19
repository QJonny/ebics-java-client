/*
 * An XML document type.
 * Localname: HVZOrderParams
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVZOrderParamsDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one HVZOrderParams(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HVZOrderParamsDocumentImpl extends org.kopi.ebics.schema.h003.impl.OrderParamsDocumentImpl implements org.kopi.ebics.schema.h003.HVZOrderParamsDocument
{
    private static final long serialVersionUID = 1L;
    
    public HVZOrderParamsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HVZORDERPARAMS$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HVZOrderParams");
    
    
    /**
     * Gets the "HVZOrderParams" element
     */
    public org.kopi.ebics.schema.h003.HVZOrderParamsType getHVZOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVZOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HVZOrderParamsType)get_store().find_element_user(HVZORDERPARAMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HVZOrderParams" element
     */
    public void setHVZOrderParams(org.kopi.ebics.schema.h003.HVZOrderParamsType hvzOrderParams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVZOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HVZOrderParamsType)get_store().find_element_user(HVZORDERPARAMS$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HVZOrderParamsType)get_store().add_element_user(HVZORDERPARAMS$0);
            }
            target.set(hvzOrderParams);
        }
    }
    
    /**
     * Appends and returns a new empty "HVZOrderParams" element
     */
    public org.kopi.ebics.schema.h003.HVZOrderParamsType addNewHVZOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVZOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HVZOrderParamsType)get_store().add_element_user(HVZORDERPARAMS$0);
            return target;
        }
    }
}
