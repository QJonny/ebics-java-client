/*
 * XML Type:  AuthOrderInfoType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.AuthOrderInfoType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML AuthOrderInfoType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class AuthOrderInfoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.AuthOrderInfoType
{
    private static final long serialVersionUID = 1L;
    
    public AuthOrderInfoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERTYPE$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderType");
    private static final javax.xml.namespace.QName TRANSFERTYPE$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "TransferType");
    private static final javax.xml.namespace.QName ORDERFORMAT$4 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderFormat");
    private static final javax.xml.namespace.QName DESCRIPTION$6 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Description");
    private static final javax.xml.namespace.QName NUMSIGREQUIRED$8 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "NumSigRequired");
    
    
    /**
     * Gets the "OrderType" element
     */
    public java.lang.String getOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPE$0, 0);
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
            target = (org.kopi.ebics.schema.h003.OrderTBaseType)get_store().find_element_user(ORDERTYPE$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERTYPE$0);
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
            target = (org.kopi.ebics.schema.h003.OrderTBaseType)get_store().find_element_user(ORDERTYPE$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.OrderTBaseType)get_store().add_element_user(ORDERTYPE$0);
            }
            target.set(orderType);
        }
    }
    
    /**
     * Gets the "TransferType" element
     */
    public org.kopi.ebics.schema.h003.TransferType.Enum getTransferType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFERTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (org.kopi.ebics.schema.h003.TransferType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TransferType" element
     */
    public org.kopi.ebics.schema.h003.TransferType xgetTransferType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.TransferType target = null;
            target = (org.kopi.ebics.schema.h003.TransferType)get_store().find_element_user(TRANSFERTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TransferType" element
     */
    public void setTransferType(org.kopi.ebics.schema.h003.TransferType.Enum transferType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFERTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSFERTYPE$2);
            }
            target.setEnumValue(transferType);
        }
    }
    
    /**
     * Sets (as xml) the "TransferType" element
     */
    public void xsetTransferType(org.kopi.ebics.schema.h003.TransferType transferType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.TransferType target = null;
            target = (org.kopi.ebics.schema.h003.TransferType)get_store().find_element_user(TRANSFERTYPE$2, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.TransferType)get_store().add_element_user(TRANSFERTYPE$2);
            }
            target.set(transferType);
        }
    }
    
    /**
     * Gets the "OrderFormat" element
     */
    public java.lang.String getOrderFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERFORMAT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderFormat" element
     */
    public org.kopi.ebics.schema.h003.OrderFormatType xgetOrderFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderFormatType target = null;
            target = (org.kopi.ebics.schema.h003.OrderFormatType)get_store().find_element_user(ORDERFORMAT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "OrderFormat" element
     */
    public boolean isSetOrderFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERFORMAT$4) != 0;
        }
    }
    
    /**
     * Sets the "OrderFormat" element
     */
    public void setOrderFormat(java.lang.String orderFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERFORMAT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERFORMAT$4);
            }
            target.setStringValue(orderFormat);
        }
    }
    
    /**
     * Sets (as xml) the "OrderFormat" element
     */
    public void xsetOrderFormat(org.kopi.ebics.schema.h003.OrderFormatType orderFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderFormatType target = null;
            target = (org.kopi.ebics.schema.h003.OrderFormatType)get_store().find_element_user(ORDERFORMAT$4, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.OrderFormatType)get_store().add_element_user(ORDERFORMAT$4);
            }
            target.set(orderFormat);
        }
    }
    
    /**
     * Unsets the "OrderFormat" element
     */
    public void unsetOrderFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERFORMAT$4, 0);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.kopi.ebics.schema.h003.OrderDescriptionType xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderDescriptionType target = null;
            target = (org.kopi.ebics.schema.h003.OrderDescriptionType)get_store().find_element_user(DESCRIPTION$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$6);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.kopi.ebics.schema.h003.OrderDescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderDescriptionType target = null;
            target = (org.kopi.ebics.schema.h003.OrderDescriptionType)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.OrderDescriptionType)get_store().add_element_user(DESCRIPTION$6);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "NumSigRequired" element
     */
    public java.math.BigInteger getNumSigRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMSIGREQUIRED$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumSigRequired" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetNumSigRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NUMSIGREQUIRED$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumSigRequired" element
     */
    public boolean isSetNumSigRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMSIGREQUIRED$8) != 0;
        }
    }
    
    /**
     * Sets the "NumSigRequired" element
     */
    public void setNumSigRequired(java.math.BigInteger numSigRequired)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMSIGREQUIRED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMSIGREQUIRED$8);
            }
            target.setBigIntegerValue(numSigRequired);
        }
    }
    
    /**
     * Sets (as xml) the "NumSigRequired" element
     */
    public void xsetNumSigRequired(org.apache.xmlbeans.XmlNonNegativeInteger numSigRequired)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NUMSIGREQUIRED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(NUMSIGREQUIRED$8);
            }
            target.set(numSigRequired);
        }
    }
    
    /**
     * Unsets the "NumSigRequired" element
     */
    public void unsetNumSigRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMSIGREQUIRED$8, 0);
        }
    }
}
