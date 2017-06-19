/*
 * XML Type:  HVDOrderParamsType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVDOrderParamsType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML HVDOrderParamsType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class HVDOrderParamsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.HVDOrderParamsType
{
    private static final long serialVersionUID = 1L;
    
    public HVDOrderParamsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTNERID$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "PartnerID");
    private static final javax.xml.namespace.QName ORDERTYPE$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderType");
    private static final javax.xml.namespace.QName ORDERID$4 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderID");
    
    
    /**
     * Gets the "PartnerID" element
     */
    public java.lang.String getPartnerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PartnerID" element
     */
    public org.kopi.ebics.schema.h003.PartnerIDType xgetPartnerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.PartnerIDType target = null;
            target = (org.kopi.ebics.schema.h003.PartnerIDType)get_store().find_element_user(PARTNERID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PartnerID" element
     */
    public void setPartnerID(java.lang.String partnerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNERID$0);
            }
            target.setStringValue(partnerID);
        }
    }
    
    /**
     * Sets (as xml) the "PartnerID" element
     */
    public void xsetPartnerID(org.kopi.ebics.schema.h003.PartnerIDType partnerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.PartnerIDType target = null;
            target = (org.kopi.ebics.schema.h003.PartnerIDType)get_store().find_element_user(PARTNERID$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.PartnerIDType)get_store().add_element_user(PARTNERID$0);
            }
            target.set(partnerID);
        }
    }
    
    /**
     * Gets the "OrderType" element
     */
    public java.lang.String getOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderType" element
     */
    public org.kopi.ebics.schema.h003.OrderTBaseType xgetOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderTBaseType target = null;
            target = (org.kopi.ebics.schema.h003.OrderTBaseType)get_store().find_element_user(ORDERTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrderType" element
     */
    public void setOrderType(java.lang.String orderType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERTYPE$2);
            }
            target.setStringValue(orderType);
        }
    }
    
    /**
     * Sets (as xml) the "OrderType" element
     */
    public void xsetOrderType(org.kopi.ebics.schema.h003.OrderTBaseType orderType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderTBaseType target = null;
            target = (org.kopi.ebics.schema.h003.OrderTBaseType)get_store().find_element_user(ORDERTYPE$2, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.OrderTBaseType)get_store().add_element_user(ORDERTYPE$2);
            }
            target.set(orderType);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERID$4, 0);
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
            target = (org.kopi.ebics.schema.h003.OrderIDType)get_store().find_element_user(ORDERID$4, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERID$4);
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
            target = (org.kopi.ebics.schema.h003.OrderIDType)get_store().find_element_user(ORDERID$4, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.OrderIDType)get_store().add_element_user(ORDERID$4);
            }
            target.set(orderID);
        }
    }
}
