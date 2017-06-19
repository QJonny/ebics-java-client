/*
 * An XML document type.
 * Localname: StandardOrderParams
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.StandardOrderParamsDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one StandardOrderParams(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class StandardOrderParamsDocumentImpl extends org.kopi.ebics.schema.h003.impl.OrderParamsDocumentImpl implements org.kopi.ebics.schema.h003.StandardOrderParamsDocument
{
    private static final long serialVersionUID = 1L;
    
    public StandardOrderParamsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STANDARDORDERPARAMS$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "StandardOrderParams");
    
    
    /**
     * Gets the "StandardOrderParams" element
     */
    public org.kopi.ebics.schema.h003.StandardOrderParamsType getStandardOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.StandardOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.StandardOrderParamsType)get_store().find_element_user(STANDARDORDERPARAMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StandardOrderParams" element
     */
    public void setStandardOrderParams(org.kopi.ebics.schema.h003.StandardOrderParamsType standardOrderParams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.StandardOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.StandardOrderParamsType)get_store().find_element_user(STANDARDORDERPARAMS$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.StandardOrderParamsType)get_store().add_element_user(STANDARDORDERPARAMS$0);
            }
            target.set(standardOrderParams);
        }
    }
    
    /**
     * Appends and returns a new empty "StandardOrderParams" element
     */
    public org.kopi.ebics.schema.h003.StandardOrderParamsType addNewStandardOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.StandardOrderParamsType target = null;
            target = (org.kopi.ebics.schema.h003.StandardOrderParamsType)get_store().add_element_user(STANDARDORDERPARAMS$0);
            return target;
        }
    }
}
