/*
 * XML Type:  HVTOrderParamsType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVTOrderParamsType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML HVTOrderParamsType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class HVTOrderParamsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.HVTOrderParamsType
{
    private static final long serialVersionUID = 1L;
    
    public HVTOrderParamsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTNERID$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "PartnerID");
    private static final javax.xml.namespace.QName ORDERTYPE$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderType");
    private static final javax.xml.namespace.QName ORDERID$4 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderID");
    private static final javax.xml.namespace.QName ORDERFLAGS$6 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderFlags");
    private static final javax.xml.namespace.QName PARAMETER$8 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Parameter");
    
    
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
    
    /**
     * Gets the "OrderFlags" element
     */
    public org.kopi.ebics.schema.h003.HVTOrderParamsType.OrderFlags getOrderFlags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVTOrderParamsType.OrderFlags target = null;
            target = (org.kopi.ebics.schema.h003.HVTOrderParamsType.OrderFlags)get_store().find_element_user(ORDERFLAGS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrderFlags" element
     */
    public void setOrderFlags(org.kopi.ebics.schema.h003.HVTOrderParamsType.OrderFlags orderFlags)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVTOrderParamsType.OrderFlags target = null;
            target = (org.kopi.ebics.schema.h003.HVTOrderParamsType.OrderFlags)get_store().find_element_user(ORDERFLAGS$6, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HVTOrderParamsType.OrderFlags)get_store().add_element_user(ORDERFLAGS$6);
            }
            target.set(orderFlags);
        }
    }
    
    /**
     * Appends and returns a new empty "OrderFlags" element
     */
    public org.kopi.ebics.schema.h003.HVTOrderParamsType.OrderFlags addNewOrderFlags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVTOrderParamsType.OrderFlags target = null;
            target = (org.kopi.ebics.schema.h003.HVTOrderParamsType.OrderFlags)get_store().add_element_user(ORDERFLAGS$6);
            return target;
        }
    }
    
    /**
     * Gets array of all "Parameter" elements
     */
    public org.kopi.ebics.schema.h003.ParameterDocument.Parameter[] getParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETER$8, targetList);
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter[] result = new org.kopi.ebics.schema.h003.ParameterDocument.Parameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Parameter" element
     */
    public org.kopi.ebics.schema.h003.ParameterDocument.Parameter getParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter target = null;
            target = (org.kopi.ebics.schema.h003.ParameterDocument.Parameter)get_store().find_element_user(PARAMETER$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Parameter" element
     */
    public int sizeOfParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETER$8);
        }
    }
    
    /**
     * Sets array of all "Parameter" element
     */
    public void setParameterArray(org.kopi.ebics.schema.h003.ParameterDocument.Parameter[] parameterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parameterArray, PARAMETER$8);
        }
    }
    
    /**
     * Sets ith "Parameter" element
     */
    public void setParameterArray(int i, org.kopi.ebics.schema.h003.ParameterDocument.Parameter parameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter target = null;
            target = (org.kopi.ebics.schema.h003.ParameterDocument.Parameter)get_store().find_element_user(PARAMETER$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Parameter" element
     */
    public org.kopi.ebics.schema.h003.ParameterDocument.Parameter insertNewParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter target = null;
            target = (org.kopi.ebics.schema.h003.ParameterDocument.Parameter)get_store().insert_element_user(PARAMETER$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Parameter" element
     */
    public org.kopi.ebics.schema.h003.ParameterDocument.Parameter addNewParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter target = null;
            target = (org.kopi.ebics.schema.h003.ParameterDocument.Parameter)get_store().add_element_user(PARAMETER$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "Parameter" element
     */
    public void removeParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETER$8, i);
        }
    }
    /**
     * An XML OrderFlags(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public static class OrderFlagsImpl extends org.kopi.ebics.schema.h003.impl.HVTOrderFlagsTypeImpl implements org.kopi.ebics.schema.h003.HVTOrderParamsType.OrderFlags
    {
        private static final long serialVersionUID = 1L;
        
        public OrderFlagsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
