/*
 * An XML document type.
 * Localname: HVEOrderParams
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVEOrderParamsDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one HVEOrderParams(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HVEOrderParamsDocumentImpl extends org.kopi.ebics.schema.h003.impl.OrderParamsDocumentImpl implements org.kopi.ebics.schema.h003.HVEOrderParamsDocument
{
    private static final long serialVersionUID = 1L;
    
    public HVEOrderParamsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HVEORDERPARAMS$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HVEOrderParams");
    
    
    /**
     * Gets the "HVEOrderParams" element
     */
    public org.kopi.ebics.schema.h003.HVEOrderParamsType getHVEOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVEOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HVEOrderParamsType)get_store().find_element_user(HVEORDERPARAMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HVEOrderParams" element
     */
    public void setHVEOrderParams(org.kopi.ebics.schema.h003.HVEOrderParamsType hveOrderParams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVEOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HVEOrderParamsType)get_store().find_element_user(HVEORDERPARAMS$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HVEOrderParamsType)get_store().add_element_user(HVEORDERPARAMS$0);
            }
            target.set(hveOrderParams);
        }
    }
    
    /**
     * Appends and returns a new empty "HVEOrderParams" element
     */
    public org.kopi.ebics.schema.h003.HVEOrderParamsType addNewHVEOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVEOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HVEOrderParamsType)get_store().add_element_user(HVEORDERPARAMS$0);
            return target;
        }
    }
}
