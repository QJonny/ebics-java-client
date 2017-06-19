/*
 * XML Type:  NoPubKeyDigestsReqOrderDetailsType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.NoPubKeyDigestsReqOrderDetailsType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML NoPubKeyDigestsReqOrderDetailsType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class NoPubKeyDigestsReqOrderDetailsTypeImpl extends org.kopi.ebics.schema.h003.impl.OrderDetailsTypeImpl implements org.kopi.ebics.schema.h003.NoPubKeyDigestsReqOrderDetailsType
{
    private static final long serialVersionUID = 1L;
    
    public NoPubKeyDigestsReqOrderDetailsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderAttribute");
    
    
    /**
     * Gets the "OrderAttribute" element
     */
    public java.lang.String getOrderAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderAttribute" element
     */
    public org.kopi.ebics.schema.h003.OrderAttributeBaseType xgetOrderAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderAttributeBaseType target = null;
            target = (org.kopi.ebics.schema.h003.OrderAttributeBaseType)get_store().find_element_user(ORDERATTRIBUTE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrderAttribute" element
     */
    public void setOrderAttribute(java.lang.String orderAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERATTRIBUTE$0);
            }
            target.setStringValue(orderAttribute);
        }
    }
    
    /**
     * Sets (as xml) the "OrderAttribute" element
     */
    public void xsetOrderAttribute(org.kopi.ebics.schema.h003.OrderAttributeBaseType orderAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderAttributeBaseType target = null;
            target = (org.kopi.ebics.schema.h003.OrderAttributeBaseType)get_store().find_element_user(ORDERATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.OrderAttributeBaseType)get_store().add_element_user(ORDERATTRIBUTE$0);
            }
            target.set(orderAttribute);
        }
    }
}
