/*
 * An XML document type.
 * Localname: FULOrderParams
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.FULOrderParamsDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one FULOrderParams(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class FULOrderParamsDocumentImpl extends org.kopi.ebics.schema.h003.impl.OrderParamsDocumentImpl implements org.kopi.ebics.schema.h003.FULOrderParamsDocument
{
    private static final long serialVersionUID = 1L;
    
    public FULOrderParamsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULORDERPARAMS$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "FULOrderParams");
    
    
    /**
     * Gets the "FULOrderParams" element
     */
    public org.kopi.ebics.schema.h003.FULOrderParamsType getFULOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.FULOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.FULOrderParamsType)get_store().find_element_user(FULORDERPARAMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FULOrderParams" element
     */
    public void setFULOrderParams(org.kopi.ebics.schema.h003.FULOrderParamsType fulOrderParams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.FULOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.FULOrderParamsType)get_store().find_element_user(FULORDERPARAMS$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.FULOrderParamsType)get_store().add_element_user(FULORDERPARAMS$0);
            }
            target.set(fulOrderParams);
        }
    }
    
    /**
     * Appends and returns a new empty "FULOrderParams" element
     */
    public org.kopi.ebics.schema.h003.FULOrderParamsType addNewFULOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.FULOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.FULOrderParamsType)get_store().add_element_user(FULORDERPARAMS$0);
            return target;
        }
    }
}
