/*
 * XML Type:  StaticHeaderBaseType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.StaticHeaderBaseType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML StaticHeaderBaseType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class StaticHeaderBaseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.StaticHeaderBaseType
{
    private static final long serialVersionUID = 1L;
    
    public StaticHeaderBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOSTID$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HostID");
    private static final javax.xml.namespace.QName NONCE$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Nonce");
    private static final javax.xml.namespace.QName TIMESTAMP$4 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Timestamp");
    private static final javax.xml.namespace.QName PARTNERID$6 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "PartnerID");
    private static final javax.xml.namespace.QName USERID$8 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "UserID");
    private static final javax.xml.namespace.QName SYSTEMID$10 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "SystemID");
    private static final javax.xml.namespace.QName PRODUCT$12 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Product");
    private static final javax.xml.namespace.QName ORDERDETAILS$14 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderDetails");
    private static final javax.xml.namespace.QName SECURITYMEDIUM$16 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "SecurityMedium");
    
    
    /**
     * Gets the "HostID" element
     */
    public java.lang.String getHostID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOSTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HostID" element
     */
    public org.kopi.ebics.schema.h003.HostIDType xgetHostID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HostIDType target = null;
            target = (org.kopi.ebics.schema.h003.HostIDType)get_store().find_element_user(HOSTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HostID" element
     */
    public void setHostID(java.lang.String hostID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOSTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOSTID$0);
            }
            target.setStringValue(hostID);
        }
    }
    
    /**
     * Sets (as xml) the "HostID" element
     */
    public void xsetHostID(org.kopi.ebics.schema.h003.HostIDType hostID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HostIDType target = null;
            target = (org.kopi.ebics.schema.h003.HostIDType)get_store().find_element_user(HOSTID$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HostIDType)get_store().add_element_user(HOSTID$0);
            }
            target.set(hostID);
        }
    }
    
    /**
     * Gets the "Nonce" element
     */
    public byte[] getNonce()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NONCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "Nonce" element
     */
    public org.kopi.ebics.schema.h003.NonceType xgetNonce()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.NonceType target = null;
            target = (org.kopi.ebics.schema.h003.NonceType)get_store().find_element_user(NONCE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Nonce" element
     */
    public boolean isSetNonce()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NONCE$2) != 0;
        }
    }
    
    /**
     * Sets the "Nonce" element
     */
    public void setNonce(byte[] nonce)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NONCE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NONCE$2);
            }
            target.setByteArrayValue(nonce);
        }
    }
    
    /**
     * Sets (as xml) the "Nonce" element
     */
    public void xsetNonce(org.kopi.ebics.schema.h003.NonceType nonce)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.NonceType target = null;
            target = (org.kopi.ebics.schema.h003.NonceType)get_store().find_element_user(NONCE$2, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.NonceType)get_store().add_element_user(NONCE$2);
            }
            target.set(nonce);
        }
    }
    
    /**
     * Unsets the "Nonce" element
     */
    public void unsetNonce()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NONCE$2, 0);
        }
    }
    
    /**
     * Gets the "Timestamp" element
     */
    public java.util.Calendar getTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Timestamp" element
     */
    public org.kopi.ebics.schema.h003.TimestampType xgetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.TimestampType target = null;
            target = (org.kopi.ebics.schema.h003.TimestampType)get_store().find_element_user(TIMESTAMP$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Timestamp" element
     */
    public boolean isSetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMESTAMP$4) != 0;
        }
    }
    
    /**
     * Sets the "Timestamp" element
     */
    public void setTimestamp(java.util.Calendar timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMESTAMP$4);
            }
            target.setCalendarValue(timestamp);
        }
    }
    
    /**
     * Sets (as xml) the "Timestamp" element
     */
    public void xsetTimestamp(org.kopi.ebics.schema.h003.TimestampType timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.TimestampType target = null;
            target = (org.kopi.ebics.schema.h003.TimestampType)get_store().find_element_user(TIMESTAMP$4, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.TimestampType)get_store().add_element_user(TIMESTAMP$4);
            }
            target.set(timestamp);
        }
    }
    
    /**
     * Unsets the "Timestamp" element
     */
    public void unsetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMESTAMP$4, 0);
        }
    }
    
    /**
     * Gets the "PartnerID" element
     */
    public java.lang.String getPartnerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERID$6, 0);
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
            target = (org.kopi.ebics.schema.h003.PartnerIDType)get_store().find_element_user(PARTNERID$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNERID$6);
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
            target = (org.kopi.ebics.schema.h003.PartnerIDType)get_store().find_element_user(PARTNERID$6, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.PartnerIDType)get_store().add_element_user(PARTNERID$6);
            }
            target.set(partnerID);
        }
    }
    
    /**
     * Gets the "UserID" element
     */
    public java.lang.String getUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserID" element
     */
    public org.kopi.ebics.schema.h003.UserIDType xgetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserIDType target = null;
            target = (org.kopi.ebics.schema.h003.UserIDType)get_store().find_element_user(USERID$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UserID" element
     */
    public void setUserID(java.lang.String userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$8);
            }
            target.setStringValue(userID);
        }
    }
    
    /**
     * Sets (as xml) the "UserID" element
     */
    public void xsetUserID(org.kopi.ebics.schema.h003.UserIDType userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserIDType target = null;
            target = (org.kopi.ebics.schema.h003.UserIDType)get_store().find_element_user(USERID$8, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.UserIDType)get_store().add_element_user(USERID$8);
            }
            target.set(userID);
        }
    }
    
    /**
     * Gets the "SystemID" element
     */
    public java.lang.String getSystemID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SystemID" element
     */
    public org.kopi.ebics.schema.h003.UserIDType xgetSystemID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserIDType target = null;
            target = (org.kopi.ebics.schema.h003.UserIDType)get_store().find_element_user(SYSTEMID$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "SystemID" element
     */
    public boolean isSetSystemID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYSTEMID$10) != 0;
        }
    }
    
    /**
     * Sets the "SystemID" element
     */
    public void setSystemID(java.lang.String systemID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSTEMID$10);
            }
            target.setStringValue(systemID);
        }
    }
    
    /**
     * Sets (as xml) the "SystemID" element
     */
    public void xsetSystemID(org.kopi.ebics.schema.h003.UserIDType systemID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserIDType target = null;
            target = (org.kopi.ebics.schema.h003.UserIDType)get_store().find_element_user(SYSTEMID$10, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.UserIDType)get_store().add_element_user(SYSTEMID$10);
            }
            target.set(systemID);
        }
    }
    
    /**
     * Unsets the "SystemID" element
     */
    public void unsetSystemID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYSTEMID$10, 0);
        }
    }
    
    /**
     * Gets the "Product" element
     */
    public org.kopi.ebics.schema.h003.ProductElementType getProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ProductElementType target = null;
            target = (org.kopi.ebics.schema.h003.ProductElementType)get_store().find_element_user(PRODUCT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Product" element
     */
    public boolean isNilProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ProductElementType target = null;
            target = (org.kopi.ebics.schema.h003.ProductElementType)get_store().find_element_user(PRODUCT$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Product" element
     */
    public boolean isSetProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCT$12) != 0;
        }
    }
    
    /**
     * Sets the "Product" element
     */
    public void setProduct(org.kopi.ebics.schema.h003.ProductElementType product)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ProductElementType target = null;
            target = (org.kopi.ebics.schema.h003.ProductElementType)get_store().find_element_user(PRODUCT$12, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.ProductElementType)get_store().add_element_user(PRODUCT$12);
            }
            target.set(product);
        }
    }
    
    /**
     * Appends and returns a new empty "Product" element
     */
    public org.kopi.ebics.schema.h003.ProductElementType addNewProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ProductElementType target = null;
            target = (org.kopi.ebics.schema.h003.ProductElementType)get_store().add_element_user(PRODUCT$12);
            return target;
        }
    }
    
    /**
     * Nils the "Product" element
     */
    public void setNilProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ProductElementType target = null;
            target = (org.kopi.ebics.schema.h003.ProductElementType)get_store().find_element_user(PRODUCT$12, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.ProductElementType)get_store().add_element_user(PRODUCT$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Product" element
     */
    public void unsetProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCT$12, 0);
        }
    }
    
    /**
     * Gets the "OrderDetails" element
     */
    public org.kopi.ebics.schema.h003.OrderDetailsType getOrderDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderDetailsType target = null;
            target = (org.kopi.ebics.schema.h003.OrderDetailsType)get_store().find_element_user(ORDERDETAILS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrderDetails" element
     */
    public void setOrderDetails(org.kopi.ebics.schema.h003.OrderDetailsType orderDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderDetailsType target = null;
            target = (org.kopi.ebics.schema.h003.OrderDetailsType)get_store().find_element_user(ORDERDETAILS$14, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.OrderDetailsType)get_store().add_element_user(ORDERDETAILS$14);
            }
            target.set(orderDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "OrderDetails" element
     */
    public org.kopi.ebics.schema.h003.OrderDetailsType addNewOrderDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderDetailsType target = null;
            target = (org.kopi.ebics.schema.h003.OrderDetailsType)get_store().add_element_user(ORDERDETAILS$14);
            return target;
        }
    }
    
    /**
     * Gets the "SecurityMedium" element
     */
    public java.lang.String getSecurityMedium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYMEDIUM$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SecurityMedium" element
     */
    public org.kopi.ebics.schema.h003.SecurityMediumType xgetSecurityMedium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.SecurityMediumType target = null;
            target = (org.kopi.ebics.schema.h003.SecurityMediumType)get_store().find_element_user(SECURITYMEDIUM$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SecurityMedium" element
     */
    public void setSecurityMedium(java.lang.String securityMedium)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYMEDIUM$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECURITYMEDIUM$16);
            }
            target.setStringValue(securityMedium);
        }
    }
    
    /**
     * Sets (as xml) the "SecurityMedium" element
     */
    public void xsetSecurityMedium(org.kopi.ebics.schema.h003.SecurityMediumType securityMedium)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.SecurityMediumType target = null;
            target = (org.kopi.ebics.schema.h003.SecurityMediumType)get_store().find_element_user(SECURITYMEDIUM$16, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.SecurityMediumType)get_store().add_element_user(SECURITYMEDIUM$16);
            }
            target.set(securityMedium);
        }
    }
}
