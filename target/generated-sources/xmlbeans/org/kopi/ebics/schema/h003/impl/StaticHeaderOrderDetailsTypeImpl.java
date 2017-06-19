/*
 * XML Type:  StaticHeaderOrderDetailsType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML StaticHeaderOrderDetailsType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class StaticHeaderOrderDetailsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType
{
    private static final long serialVersionUID = 1L;
    
    public StaticHeaderOrderDetailsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERTYPE$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderType");
    private static final javax.xml.namespace.QName ORDERID$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderID");
    private static final javax.xml.namespace.QName ORDERATTRIBUTE$4 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderAttribute");
    private static final javax.xml.namespace.QName ORDERPARAMS$6 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderParams");
    private static final org.apache.xmlbeans.QNameSet ORDERPARAMS$7 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HVDOrderParams"),
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderParams"),
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HVEOrderParams"),
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "FDLOrderParams"),
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "StandardOrderParams"),
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HVUOrderParams"),
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HVSOrderParams"),
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HVZOrderParams"),
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HVTOrderParams"),
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "GenericOrderParams"),
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "FULOrderParams"),
    });
    
    
    /**
     * Gets the "OrderType" element
     */
    public org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType.OrderType getOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType.OrderType target = null;
            target = (org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType.OrderType)get_store().find_element_user(ORDERTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrderType" element
     */
    public void setOrderType(org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType.OrderType orderType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType.OrderType target = null;
            target = (org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType.OrderType)get_store().find_element_user(ORDERTYPE$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType.OrderType)get_store().add_element_user(ORDERTYPE$0);
            }
            target.set(orderType);
        }
    }
    
    /**
     * Appends and returns a new empty "OrderType" element
     */
    public org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType.OrderType addNewOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType.OrderType target = null;
            target = (org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType.OrderType)get_store().add_element_user(ORDERTYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "OrderID" element
     */
    public java.lang.String getOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERID$2, 0);
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
            target = (org.kopi.ebics.schema.h003.OrderIDType)get_store().find_element_user(ORDERID$2, 0);
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
            return get_store().count_elements(ORDERID$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERID$2);
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
            target = (org.kopi.ebics.schema.h003.OrderIDType)get_store().find_element_user(ORDERID$2, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.OrderIDType)get_store().add_element_user(ORDERID$2);
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
            get_store().remove_element(ORDERID$2, 0);
        }
    }
    
    /**
     * Gets the "OrderAttribute" element
     */
    public org.kopi.ebics.schema.h003.OrderAttributeType.Enum getOrderAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERATTRIBUTE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (org.kopi.ebics.schema.h003.OrderAttributeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderAttribute" element
     */
    public org.kopi.ebics.schema.h003.OrderAttributeType xgetOrderAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderAttributeType target = null;
            target = (org.kopi.ebics.schema.h003.OrderAttributeType)get_store().find_element_user(ORDERATTRIBUTE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrderAttribute" element
     */
    public void setOrderAttribute(org.kopi.ebics.schema.h003.OrderAttributeType.Enum orderAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERATTRIBUTE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERATTRIBUTE$4);
            }
            target.setEnumValue(orderAttribute);
        }
    }
    
    /**
     * Sets (as xml) the "OrderAttribute" element
     */
    public void xsetOrderAttribute(org.kopi.ebics.schema.h003.OrderAttributeType orderAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderAttributeType target = null;
            target = (org.kopi.ebics.schema.h003.OrderAttributeType)get_store().find_element_user(ORDERATTRIBUTE$4, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.OrderAttributeType)get_store().add_element_user(ORDERATTRIBUTE$4);
            }
            target.set(orderAttribute);
        }
    }
    
    /**
     * Gets the "OrderParams" element
     */
    public org.apache.xmlbeans.XmlObject getOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ORDERPARAMS$7, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrderParams" element
     */
    public void setOrderParams(org.apache.xmlbeans.XmlObject orderParams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ORDERPARAMS$7, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ORDERPARAMS$6);
            }
            target.set(orderParams);
        }
    }
    
    /**
     * Appends and returns a new empty "OrderParams" element
     */
    public org.apache.xmlbeans.XmlObject addNewOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ORDERPARAMS$6);
            return target;
        }
    }
    /**
     * An XML OrderType(@http://www.ebics.org/H003).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType$OrderType.
     */
    public static class OrderTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType.OrderType
    {
        private static final long serialVersionUID = 1L;
        
        public OrderTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected OrderTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        
    }
}
