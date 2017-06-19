/*
 * An XML document type.
 * Localname: HVSOrderParams
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVSOrderParamsDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one HVSOrderParams(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HVSOrderParamsDocumentImpl extends org.kopi.ebics.schema.h003.impl.OrderParamsDocumentImpl implements org.kopi.ebics.schema.h003.HVSOrderParamsDocument
{
    private static final long serialVersionUID = 1L;
    
    public HVSOrderParamsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HVSORDERPARAMS$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HVSOrderParams");
    
    
    /**
     * Gets the "HVSOrderParams" element
     */
    public org.kopi.ebics.schema.h003.HVSOrderParamsType getHVSOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVSOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HVSOrderParamsType)get_store().find_element_user(HVSORDERPARAMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HVSOrderParams" element
     */
    public void setHVSOrderParams(org.kopi.ebics.schema.h003.HVSOrderParamsType hvsOrderParams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVSOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HVSOrderParamsType)get_store().find_element_user(HVSORDERPARAMS$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HVSOrderParamsType)get_store().add_element_user(HVSORDERPARAMS$0);
            }
            target.set(hvsOrderParams);
        }
    }
    
    /**
     * Appends and returns a new empty "HVSOrderParams" element
     */
    public org.kopi.ebics.schema.h003.HVSOrderParamsType addNewHVSOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVSOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HVSOrderParamsType)get_store().add_element_user(HVSORDERPARAMS$0);
            return target;
        }
    }
}
