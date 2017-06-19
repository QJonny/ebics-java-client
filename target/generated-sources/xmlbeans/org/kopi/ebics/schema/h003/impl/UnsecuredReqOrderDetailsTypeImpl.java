/*
 * XML Type:  UnsecuredReqOrderDetailsType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.UnsecuredReqOrderDetailsType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML UnsecuredReqOrderDetailsType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class UnsecuredReqOrderDetailsTypeImpl extends org.kopi.ebics.schema.h003.impl.OrderDetailsTypeImpl implements org.kopi.ebics.schema.h003.UnsecuredReqOrderDetailsType
{
    private static final long serialVersionUID = 1L;
    
    public UnsecuredReqOrderDetailsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERID$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderID");
    private static final javax.xml.namespace.QName ORDERATTRIBUTE$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderAttribute");
    
    
    /**
     * Gets the "OrderID" element
     */
    public java.lang.String getOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderID" element
     */
    public org.kopi.ebics.schema.h003.OrderIDType xgetOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderIDType target = null;
            target = (org.kopi.ebics.schema.h003.OrderIDType)get_store().find_element_user(ORDERID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "OrderID" element
     */
    public boolean isSetOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERID$0) != 0;
        }
    }
    
    /**
     * Sets the "OrderID" element
     */
    public void setOrderID(java.lang.String orderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERID$0);
            }
            target.setStringValue(orderID);
        }
    }
    
    /**
     * Sets (as xml) the "OrderID" element
     */
    public void xsetOrderID(org.kopi.ebics.schema.h003.OrderIDType orderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderIDType target = null;
            target = (org.kopi.ebics.schema.h003.OrderIDType)get_store().find_element_user(ORDERID$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.OrderIDType)get_store().add_element_user(ORDERID$0);
            }
            target.set(orderID);
        }
    }
    
    /**
     * Unsets the "OrderID" element
     */
    public void unsetOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERID$0, 0);
        }
    }
    
    /**
     * Gets the "OrderAttribute" element
     */
    public java.lang.String getOrderAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERATTRIBUTE$2, 0);
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
            target = (org.kopi.ebics.schema.h003.OrderAttributeBaseType)get_store().find_element_user(ORDERATTRIBUTE$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERATTRIBUTE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERATTRIBUTE$2);
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
            target = (org.kopi.ebics.schema.h003.OrderAttributeBaseType)get_store().find_element_user(ORDERATTRIBUTE$2, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.OrderAttributeBaseType)get_store().add_element_user(ORDERATTRIBUTE$2);
            }
            target.set(orderAttribute);
        }
    }
}
