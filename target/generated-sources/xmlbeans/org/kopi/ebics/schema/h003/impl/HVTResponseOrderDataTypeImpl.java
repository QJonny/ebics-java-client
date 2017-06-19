/*
 * XML Type:  HVTResponseOrderDataType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVTResponseOrderDataType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML HVTResponseOrderDataType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class HVTResponseOrderDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.HVTResponseOrderDataType
{
    private static final long serialVersionUID = 1L;
    
    public HVTResponseOrderDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMORDERINFOS$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "NumOrderInfos");
    private static final javax.xml.namespace.QName ORDERINFO$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderInfo");
    
    
    /**
     * Gets the "NumOrderInfos" element
     */
    public long getNumOrderInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMORDERINFOS$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumOrderInfos" element
     */
    public org.kopi.ebics.schema.h003.NumOrderInfosType xgetNumOrderInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.NumOrderInfosType target = null;
            target = (org.kopi.ebics.schema.h003.NumOrderInfosType)get_store().find_element_user(NUMORDERINFOS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NumOrderInfos" element
     */
    public void setNumOrderInfos(long numOrderInfos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMORDERINFOS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMORDERINFOS$0);
            }
            target.setLongValue(numOrderInfos);
        }
    }
    
    /**
     * Sets (as xml) the "NumOrderInfos" element
     */
    public void xsetNumOrderInfos(org.kopi.ebics.schema.h003.NumOrderInfosType numOrderInfos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.NumOrderInfosType target = null;
            target = (org.kopi.ebics.schema.h003.NumOrderInfosType)get_store().find_element_user(NUMORDERINFOS$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.NumOrderInfosType)get_store().add_element_user(NUMORDERINFOS$0);
            }
            target.set(numOrderInfos);
        }
    }
    
    /**
     * Gets array of all "OrderInfo" elements
     */
    public org.kopi.ebics.schema.h003.HVTOrderInfoType[] getOrderInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORDERINFO$2, targetList);
            org.kopi.ebics.schema.h003.HVTOrderInfoType[] result = new org.kopi.ebics.schema.h003.HVTOrderInfoType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrderInfo" element
     */
    public org.kopi.ebics.schema.h003.HVTOrderInfoType getOrderInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVTOrderInfoType target = null;
            target = (org.kopi.ebics.schema.h003.HVTOrderInfoType)get_store().find_element_user(ORDERINFO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "OrderInfo" element
     */
    public int sizeOfOrderInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERINFO$2);
        }
    }
    
    /**
     * Sets array of all "OrderInfo" element
     */
    public void setOrderInfoArray(org.kopi.ebics.schema.h003.HVTOrderInfoType[] orderInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(orderInfoArray, ORDERINFO$2);
        }
    }
    
    /**
     * Sets ith "OrderInfo" element
     */
    public void setOrderInfoArray(int i, org.kopi.ebics.schema.h003.HVTOrderInfoType orderInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVTOrderInfoType target = null;
            target = (org.kopi.ebics.schema.h003.HVTOrderInfoType)get_store().find_element_user(ORDERINFO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(orderInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrderInfo" element
     */
    public org.kopi.ebics.schema.h003.HVTOrderInfoType insertNewOrderInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVTOrderInfoType target = null;
            target = (org.kopi.ebics.schema.h003.HVTOrderInfoType)get_store().insert_element_user(ORDERINFO$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrderInfo" element
     */
    public org.kopi.ebics.schema.h003.HVTOrderInfoType addNewOrderInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVTOrderInfoType target = null;
            target = (org.kopi.ebics.schema.h003.HVTOrderInfoType)get_store().add_element_user(ORDERINFO$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrderInfo" element
     */
    public void removeOrderInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERINFO$2, i);
        }
    }
}
