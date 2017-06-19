/*
 * XML Type:  HVUOrderParamsType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVUOrderParamsType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML HVUOrderParamsType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class HVUOrderParamsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.HVUOrderParamsType
{
    private static final long serialVersionUID = 1L;
    
    public HVUOrderParamsTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
     * True if has "OrderTypes" element
     */
    public boolean isSetOrderTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERTYPES$0) != 0;
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
    
    /**
     * Unsets the "OrderTypes" element
     */
    public void unsetOrderTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERTYPES$0, 0);
        }
    }
}
