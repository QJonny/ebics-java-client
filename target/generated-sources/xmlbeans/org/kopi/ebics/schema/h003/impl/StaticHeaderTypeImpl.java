/*
 * XML Type:  StaticHeaderType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.StaticHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML StaticHeaderType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class StaticHeaderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.StaticHeaderType
{
    private static final long serialVersionUID = 1L;
    
    public StaticHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName BANKPUBKEYDIGESTS$16 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "BankPubKeyDigests");
    private static final javax.xml.namespace.QName SECURITYMEDIUM$18 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "SecurityMedium");
    private static final javax.xml.namespace.QName NUMSEGMENTS$20 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "NumSegments");
    private static final javax.xml.namespace.QName TRANSACTIONID$22 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "TransactionID");
    
    
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
     * True if has "PartnerID" element
     */
    public boolean isSetPartnerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTNERID$6) != 0;
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
     * Unsets the "PartnerID" element
     */
    public void unsetPartnerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTNERID$6, 0);
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
     * True if has "UserID" element
     */
    public boolean isSetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERID$8) != 0;
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
     * Unsets the "UserID" element
     */
    public void unsetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERID$8, 0);
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
    public org.kopi.ebics.schema.h003.StaticHeaderType.Product getProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.StaticHeaderType.Product target = null;
            target = (org.kopi.ebics.schema.h003.StaticHeaderType.Product)get_store().find_element_user(PRODUCT$12, 0);
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
            org.kopi.ebics.schema.h003.StaticHeaderType.Product target = null;
            target = (org.kopi.ebics.schema.h003.StaticHeaderType.Product)get_store().find_element_user(PRODUCT$12, 0);
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
    public void setProduct(org.kopi.ebics.schema.h003.StaticHeaderType.Product product)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.StaticHeaderType.Product target = null;
            target = (org.kopi.ebics.schema.h003.StaticHeaderType.Product)get_store().find_element_user(PRODUCT$12, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.StaticHeaderType.Product)get_store().add_element_user(PRODUCT$12);
            }
            target.set(product);
        }
    }
    
    /**
     * Appends and returns a new empty "Product" element
     */
    public org.kopi.ebics.schema.h003.StaticHeaderType.Product addNewProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.StaticHeaderType.Product target = null;
            target = (org.kopi.ebics.schema.h003.StaticHeaderType.Product)get_store().add_element_user(PRODUCT$12);
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
            org.kopi.ebics.schema.h003.StaticHeaderType.Product target = null;
            target = (org.kopi.ebics.schema.h003.StaticHeaderType.Product)get_store().find_element_user(PRODUCT$12, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.StaticHeaderType.Product)get_store().add_element_user(PRODUCT$12);
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
    public org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType getOrderDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType target = null;
            target = (org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType)get_store().find_element_user(ORDERDETAILS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OrderDetails" element
     */
    public boolean isSetOrderDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERDETAILS$14) != 0;
        }
    }
    
    /**
     * Sets the "OrderDetails" element
     */
    public void setOrderDetails(org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType orderDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType target = null;
            target = (org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType)get_store().find_element_user(ORDERDETAILS$14, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType)get_store().add_element_user(ORDERDETAILS$14);
            }
            target.set(orderDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "OrderDetails" element
     */
    public org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType addNewOrderDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType target = null;
            target = (org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType)get_store().add_element_user(ORDERDETAILS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "OrderDetails" element
     */
    public void unsetOrderDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERDETAILS$14, 0);
        }
    }
    
    /**
     * Gets the "BankPubKeyDigests" element
     */
    public org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests getBankPubKeyDigests()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests target = null;
            target = (org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests)get_store().find_element_user(BANKPUBKEYDIGESTS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BankPubKeyDigests" element
     */
    public boolean isSetBankPubKeyDigests()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BANKPUBKEYDIGESTS$16) != 0;
        }
    }
    
    /**
     * Sets the "BankPubKeyDigests" element
     */
    public void setBankPubKeyDigests(org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests bankPubKeyDigests)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests target = null;
            target = (org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests)get_store().find_element_user(BANKPUBKEYDIGESTS$16, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests)get_store().add_element_user(BANKPUBKEYDIGESTS$16);
            }
            target.set(bankPubKeyDigests);
        }
    }
    
    /**
     * Appends and returns a new empty "BankPubKeyDigests" element
     */
    public org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests addNewBankPubKeyDigests()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests target = null;
            target = (org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests)get_store().add_element_user(BANKPUBKEYDIGESTS$16);
            return target;
        }
    }
    
    /**
     * Unsets the "BankPubKeyDigests" element
     */
    public void unsetBankPubKeyDigests()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BANKPUBKEYDIGESTS$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYMEDIUM$18, 0);
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
            target = (org.kopi.ebics.schema.h003.SecurityMediumType)get_store().find_element_user(SECURITYMEDIUM$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "SecurityMedium" element
     */
    public boolean isSetSecurityMedium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYMEDIUM$18) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYMEDIUM$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECURITYMEDIUM$18);
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
            target = (org.kopi.ebics.schema.h003.SecurityMediumType)get_store().find_element_user(SECURITYMEDIUM$18, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.SecurityMediumType)get_store().add_element_user(SECURITYMEDIUM$18);
            }
            target.set(securityMedium);
        }
    }
    
    /**
     * Unsets the "SecurityMedium" element
     */
    public void unsetSecurityMedium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYMEDIUM$18, 0);
        }
    }
    
    /**
     * Gets the "NumSegments" element
     */
    public long getNumSegments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMSEGMENTS$20, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumSegments" element
     */
    public org.kopi.ebics.schema.h003.NumSegmentsType xgetNumSegments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.NumSegmentsType target = null;
            target = (org.kopi.ebics.schema.h003.NumSegmentsType)get_store().find_element_user(NUMSEGMENTS$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumSegments" element
     */
    public boolean isSetNumSegments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMSEGMENTS$20) != 0;
        }
    }
    
    /**
     * Sets the "NumSegments" element
     */
    public void setNumSegments(long numSegments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMSEGMENTS$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMSEGMENTS$20);
            }
            target.setLongValue(numSegments);
        }
    }
    
    /**
     * Sets (as xml) the "NumSegments" element
     */
    public void xsetNumSegments(org.kopi.ebics.schema.h003.NumSegmentsType numSegments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.NumSegmentsType target = null;
            target = (org.kopi.ebics.schema.h003.NumSegmentsType)get_store().find_element_user(NUMSEGMENTS$20, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.NumSegmentsType)get_store().add_element_user(NUMSEGMENTS$20);
            }
            target.set(numSegments);
        }
    }
    
    /**
     * Unsets the "NumSegments" element
     */
    public void unsetNumSegments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMSEGMENTS$20, 0);
        }
    }
    
    /**
     * Gets the "TransactionID" element
     */
    public byte[] getTransactionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "TransactionID" element
     */
    public org.kopi.ebics.schema.h003.TransactionIDType xgetTransactionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.TransactionIDType target = null;
            target = (org.kopi.ebics.schema.h003.TransactionIDType)get_store().find_element_user(TRANSACTIONID$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "TransactionID" element
     */
    public boolean isSetTransactionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSACTIONID$22) != 0;
        }
    }
    
    /**
     * Sets the "TransactionID" element
     */
    public void setTransactionID(byte[] transactionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONID$22);
            }
            target.setByteArrayValue(transactionID);
        }
    }
    
    /**
     * Sets (as xml) the "TransactionID" element
     */
    public void xsetTransactionID(org.kopi.ebics.schema.h003.TransactionIDType transactionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.TransactionIDType target = null;
            target = (org.kopi.ebics.schema.h003.TransactionIDType)get_store().find_element_user(TRANSACTIONID$22, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.TransactionIDType)get_store().add_element_user(TRANSACTIONID$22);
            }
            target.set(transactionID);
        }
    }
    
    /**
     * Unsets the "TransactionID" element
     */
    public void unsetTransactionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSACTIONID$22, 0);
        }
    }
    /**
     * An XML Product(@http://www.ebics.org/H003).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.StaticHeaderType$Product.
     */
    public static class ProductImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.kopi.ebics.schema.h003.StaticHeaderType.Product
    {
        private static final long serialVersionUID = 1L;
        
        public ProductImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected ProductImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName LANGUAGE$0 = 
            new javax.xml.namespace.QName("", "Language");
        private static final javax.xml.namespace.QName INSTITUTEID$2 = 
            new javax.xml.namespace.QName("", "InstituteID");
        
        
        /**
         * Gets the "Language" attribute
         */
        public java.lang.String getLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Language" attribute
         */
        public org.kopi.ebics.schema.h003.LanguageType xgetLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.LanguageType target = null;
                target = (org.kopi.ebics.schema.h003.LanguageType)get_store().find_attribute_user(LANGUAGE$0);
                return target;
            }
        }
        
        /**
         * Sets the "Language" attribute
         */
        public void setLanguage(java.lang.String language)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGE$0);
                }
                target.setStringValue(language);
            }
        }
        
        /**
         * Sets (as xml) the "Language" attribute
         */
        public void xsetLanguage(org.kopi.ebics.schema.h003.LanguageType language)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.LanguageType target = null;
                target = (org.kopi.ebics.schema.h003.LanguageType)get_store().find_attribute_user(LANGUAGE$0);
                if (target == null)
                {
                    target = (org.kopi.ebics.schema.h003.LanguageType)get_store().add_attribute_user(LANGUAGE$0);
                }
                target.set(language);
            }
        }
        
        /**
         * Gets the "InstituteID" attribute
         */
        public java.lang.String getInstituteID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTITUTEID$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "InstituteID" attribute
         */
        public org.kopi.ebics.schema.h003.InstituteIDType xgetInstituteID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.InstituteIDType target = null;
                target = (org.kopi.ebics.schema.h003.InstituteIDType)get_store().find_attribute_user(INSTITUTEID$2);
                return target;
            }
        }
        
        /**
         * True if has "InstituteID" attribute
         */
        public boolean isSetInstituteID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INSTITUTEID$2) != null;
            }
        }
        
        /**
         * Sets the "InstituteID" attribute
         */
        public void setInstituteID(java.lang.String instituteID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTITUTEID$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSTITUTEID$2);
                }
                target.setStringValue(instituteID);
            }
        }
        
        /**
         * Sets (as xml) the "InstituteID" attribute
         */
        public void xsetInstituteID(org.kopi.ebics.schema.h003.InstituteIDType instituteID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.InstituteIDType target = null;
                target = (org.kopi.ebics.schema.h003.InstituteIDType)get_store().find_attribute_user(INSTITUTEID$2);
                if (target == null)
                {
                    target = (org.kopi.ebics.schema.h003.InstituteIDType)get_store().add_attribute_user(INSTITUTEID$2);
                }
                target.set(instituteID);
            }
        }
        
        /**
         * Unsets the "InstituteID" attribute
         */
        public void unsetInstituteID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INSTITUTEID$2);
            }
        }
    }
    /**
     * An XML BankPubKeyDigests(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public static class BankPubKeyDigestsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests
    {
        private static final long serialVersionUID = 1L;
        
        public BankPubKeyDigestsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AUTHENTICATION$0 = 
            new javax.xml.namespace.QName("http://www.ebics.org/H003", "Authentication");
        private static final javax.xml.namespace.QName ENCRYPTION$2 = 
            new javax.xml.namespace.QName("http://www.ebics.org/H003", "Encryption");
        
        
        /**
         * Gets the "Authentication" element
         */
        public org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication getAuthentication()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication target = null;
                target = (org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication)get_store().find_element_user(AUTHENTICATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Authentication" element
         */
        public void setAuthentication(org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication authentication)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication target = null;
                target = (org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication)get_store().find_element_user(AUTHENTICATION$0, 0);
                if (target == null)
                {
                    target = (org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication)get_store().add_element_user(AUTHENTICATION$0);
                }
                target.set(authentication);
            }
        }
        
        /**
         * Appends and returns a new empty "Authentication" element
         */
        public org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication addNewAuthentication()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication target = null;
                target = (org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication)get_store().add_element_user(AUTHENTICATION$0);
                return target;
            }
        }
        
        /**
         * Gets the "Encryption" element
         */
        public org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption getEncryption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption target = null;
                target = (org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption)get_store().find_element_user(ENCRYPTION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Encryption" element
         */
        public void setEncryption(org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption encryption)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption target = null;
                target = (org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption)get_store().find_element_user(ENCRYPTION$2, 0);
                if (target == null)
                {
                    target = (org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption)get_store().add_element_user(ENCRYPTION$2);
                }
                target.set(encryption);
            }
        }
        
        /**
         * Appends and returns a new empty "Encryption" element
         */
        public org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption addNewEncryption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption target = null;
                target = (org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption)get_store().add_element_user(ENCRYPTION$2);
                return target;
            }
        }
        /**
         * An XML Authentication(@http://www.ebics.org/H003).
         *
         * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.StaticHeaderType$BankPubKeyDigests$Authentication.
         */
        public static class AuthenticationImpl extends org.apache.xmlbeans.impl.values.JavaBase64HolderEx implements org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication
        {
            private static final long serialVersionUID = 1L;
            
            public AuthenticationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected AuthenticationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName ALGORITHM$0 = 
                new javax.xml.namespace.QName("", "Algorithm");
            private static final javax.xml.namespace.QName VERSION$2 = 
                new javax.xml.namespace.QName("", "Version");
            
            
            /**
             * Gets the "Algorithm" attribute
             */
            public java.lang.String getAlgorithm()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITHM$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Algorithm" attribute
             */
            public org.apache.xmlbeans.XmlAnyURI xgetAlgorithm()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ALGORITHM$0);
                    return target;
                }
            }
            
            /**
             * Sets the "Algorithm" attribute
             */
            public void setAlgorithm(java.lang.String algorithm)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITHM$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGORITHM$0);
                    }
                    target.setStringValue(algorithm);
                }
            }
            
            /**
             * Sets (as xml) the "Algorithm" attribute
             */
            public void xsetAlgorithm(org.apache.xmlbeans.XmlAnyURI algorithm)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ALGORITHM$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(ALGORITHM$0);
                    }
                    target.set(algorithm);
                }
            }
            
            /**
             * Gets the "Version" attribute
             */
            public java.lang.String getVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Version" attribute
             */
            public org.kopi.ebics.schema.h003.AuthenticationVersionType xgetVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.AuthenticationVersionType target = null;
                    target = (org.kopi.ebics.schema.h003.AuthenticationVersionType)get_store().find_attribute_user(VERSION$2);
                    return target;
                }
            }
            
            /**
             * Sets the "Version" attribute
             */
            public void setVersion(java.lang.String version)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$2);
                    }
                    target.setStringValue(version);
                }
            }
            
            /**
             * Sets (as xml) the "Version" attribute
             */
            public void xsetVersion(org.kopi.ebics.schema.h003.AuthenticationVersionType version)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.AuthenticationVersionType target = null;
                    target = (org.kopi.ebics.schema.h003.AuthenticationVersionType)get_store().find_attribute_user(VERSION$2);
                    if (target == null)
                    {
                      target = (org.kopi.ebics.schema.h003.AuthenticationVersionType)get_store().add_attribute_user(VERSION$2);
                    }
                    target.set(version);
                }
            }
        }
        /**
         * An XML Encryption(@http://www.ebics.org/H003).
         *
         * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.StaticHeaderType$BankPubKeyDigests$Encryption.
         */
        public static class EncryptionImpl extends org.apache.xmlbeans.impl.values.JavaBase64HolderEx implements org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption
        {
            private static final long serialVersionUID = 1L;
            
            public EncryptionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected EncryptionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName ALGORITHM$0 = 
                new javax.xml.namespace.QName("", "Algorithm");
            private static final javax.xml.namespace.QName VERSION$2 = 
                new javax.xml.namespace.QName("", "Version");
            
            
            /**
             * Gets the "Algorithm" attribute
             */
            public java.lang.String getAlgorithm()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITHM$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Algorithm" attribute
             */
            public org.apache.xmlbeans.XmlAnyURI xgetAlgorithm()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ALGORITHM$0);
                    return target;
                }
            }
            
            /**
             * Sets the "Algorithm" attribute
             */
            public void setAlgorithm(java.lang.String algorithm)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITHM$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGORITHM$0);
                    }
                    target.setStringValue(algorithm);
                }
            }
            
            /**
             * Sets (as xml) the "Algorithm" attribute
             */
            public void xsetAlgorithm(org.apache.xmlbeans.XmlAnyURI algorithm)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ALGORITHM$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(ALGORITHM$0);
                    }
                    target.set(algorithm);
                }
            }
            
            /**
             * Gets the "Version" attribute
             */
            public java.lang.String getVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Version" attribute
             */
            public org.kopi.ebics.schema.h003.EncryptionVersionType xgetVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.EncryptionVersionType target = null;
                    target = (org.kopi.ebics.schema.h003.EncryptionVersionType)get_store().find_attribute_user(VERSION$2);
                    return target;
                }
            }
            
            /**
             * Sets the "Version" attribute
             */
            public void setVersion(java.lang.String version)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$2);
                    }
                    target.setStringValue(version);
                }
            }
            
            /**
             * Sets (as xml) the "Version" attribute
             */
            public void xsetVersion(org.kopi.ebics.schema.h003.EncryptionVersionType version)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.EncryptionVersionType target = null;
                    target = (org.kopi.ebics.schema.h003.EncryptionVersionType)get_store().find_attribute_user(VERSION$2);
                    if (target == null)
                    {
                      target = (org.kopi.ebics.schema.h003.EncryptionVersionType)get_store().add_attribute_user(VERSION$2);
                    }
                    target.set(version);
                }
            }
        }
    }
}
