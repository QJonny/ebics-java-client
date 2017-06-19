/*
 * XML Type:  HPDResponseOrderDataType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HPDResponseOrderDataType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML HPDResponseOrderDataType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class HPDResponseOrderDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.HPDResponseOrderDataType
{
    private static final long serialVersionUID = 1L;
    
    public HPDResponseOrderDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCESSPARAMS$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "AccessParams");
    private static final javax.xml.namespace.QName PROTOCOLPARAMS$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "ProtocolParams");
    
    
    /**
     * Gets the "AccessParams" element
     */
    public org.kopi.ebics.schema.h003.HPDAccessParamsType getAccessParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPDAccessParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HPDAccessParamsType)get_store().find_element_user(ACCESSPARAMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AccessParams" element
     */
    public void setAccessParams(org.kopi.ebics.schema.h003.HPDAccessParamsType accessParams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPDAccessParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HPDAccessParamsType)get_store().find_element_user(ACCESSPARAMS$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HPDAccessParamsType)get_store().add_element_user(ACCESSPARAMS$0);
            }
            target.set(accessParams);
        }
    }
    
    /**
     * Appends and returns a new empty "AccessParams" element
     */
    public org.kopi.ebics.schema.h003.HPDAccessParamsType addNewAccessParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPDAccessParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HPDAccessParamsType)get_store().add_element_user(ACCESSPARAMS$0);
            return target;
        }
    }
    
    /**
     * Gets the "ProtocolParams" element
     */
    public org.kopi.ebics.schema.h003.HPDProtocolParamsType getProtocolParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPDProtocolParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HPDProtocolParamsType)get_store().find_element_user(PROTOCOLPARAMS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProtocolParams" element
     */
    public void setProtocolParams(org.kopi.ebics.schema.h003.HPDProtocolParamsType protocolParams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPDProtocolParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HPDProtocolParamsType)get_store().find_element_user(PROTOCOLPARAMS$2, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HPDProtocolParamsType)get_store().add_element_user(PROTOCOLPARAMS$2);
            }
            target.set(protocolParams);
        }
    }
    
    /**
     * Appends and returns a new empty "ProtocolParams" element
     */
    public org.kopi.ebics.schema.h003.HPDProtocolParamsType addNewProtocolParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPDProtocolParamsType target = null;
            target = (org.kopi.ebics.schema.h003.HPDProtocolParamsType)get_store().add_element_user(PROTOCOLPARAMS$2);
            return target;
        }
    }
}
