/*
 * XML Type:  HAAResponseOrderDataType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HAAResponseOrderDataType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML HAAResponseOrderDataType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class HAAResponseOrderDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.HAAResponseOrderDataType
{
    private static final long serialVersionUID = 1L;
    
    public HAAResponseOrderDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERTYPES$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderTypes");
    
    
    /**
     * Gets the "OrderTypes" element
     */
    public java.util.List getOrderTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderTypes" element
     */
    public org.kopi.ebics.schema.h003.OrderTListType xgetOrderTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderTListType target = null;
            target = (org.kopi.ebics.schema.h003.OrderTListType)get_store().find_element_user(ORDERTYPES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrderTypes" element
     */
    public void setOrderTypes(java.util.List orderTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERTYPES$0);
            }
            target.setListValue(orderTypes);
        }
    }
    
    /**
     * Sets (as xml) the "OrderTypes" element
     */
    public void xsetOrderTypes(org.kopi.ebics.schema.h003.OrderTListType orderTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderTListType target = null;
            target = (org.kopi.ebics.schema.h003.OrderTListType)get_store().find_element_user(ORDERTYPES$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.OrderTListType)get_store().add_element_user(ORDERTYPES$0);
            }
            target.set(orderTypes);
        }
    }
}
