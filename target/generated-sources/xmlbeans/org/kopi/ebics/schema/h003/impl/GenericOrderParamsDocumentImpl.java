/*
 * An XML document type.
 * Localname: GenericOrderParams
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.GenericOrderParamsDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one GenericOrderParams(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class GenericOrderParamsDocumentImpl extends org.kopi.ebics.schema.h003.impl.OrderParamsDocumentImpl implements org.kopi.ebics.schema.h003.GenericOrderParamsDocument
{
    private static final long serialVersionUID = 1L;
    
    public GenericOrderParamsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERICORDERPARAMS$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "GenericOrderParams");
    
    
    /**
     * Gets the "GenericOrderParams" element
     */
    public org.kopi.ebics.schema.h003.GenericOrderParamsType getGenericOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.GenericOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.GenericOrderParamsType)get_store().find_element_user(GENERICORDERPARAMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GenericOrderParams" element
     */
    public void setGenericOrderParams(org.kopi.ebics.schema.h003.GenericOrderParamsType genericOrderParams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.GenericOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.GenericOrderParamsType)get_store().find_element_user(GENERICORDERPARAMS$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.GenericOrderParamsType)get_store().add_element_user(GENERICORDERPARAMS$0);
            }
            target.set(genericOrderParams);
        }
    }
    
    /**
     * Appends and returns a new empty "GenericOrderParams" element
     */
    public org.kopi.ebics.schema.h003.GenericOrderParamsType addNewGenericOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.GenericOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.GenericOrderParamsType)get_store().add_element_user(GENERICORDERPARAMS$0);
            return target;
        }
    }
}
