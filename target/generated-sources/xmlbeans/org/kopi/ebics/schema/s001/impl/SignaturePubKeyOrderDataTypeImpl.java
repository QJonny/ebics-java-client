/*
 * XML Type:  SignaturePubKeyOrderDataType
 * Namespace: http://www.ebics.org/S001
 * Java type: org.kopi.ebics.schema.s001.SignaturePubKeyOrderDataType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.s001.impl;
/**
 * An XML SignaturePubKeyOrderDataType(@http://www.ebics.org/S001).
 *
 * This is a complex type.
 */
public class SignaturePubKeyOrderDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.s001.SignaturePubKeyOrderDataType
{
    private static final long serialVersionUID = 1L;
    
    public SignaturePubKeyOrderDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGNATUREPUBKEYINFO$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/S001", "SignaturePubKeyInfo");
    private static final javax.xml.namespace.QName PARTNERID$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/S001", "PartnerID");
    private static final javax.xml.namespace.QName USERID$4 = 
        new javax.xml.namespace.QName("http://www.ebics.org/S001", "UserID");
    
    
    /**
     * Gets the "SignaturePubKeyInfo" element
     */
    public org.kopi.ebics.schema.s001.SignaturePubKeyInfoType getSignaturePubKeyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.s001.SignaturePubKeyInfoType target = null;
            target = (org.kopi.ebics.schema.s001.SignaturePubKeyInfoType)get_store().find_element_user(SIGNATUREPUBKEYINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SignaturePubKeyInfo" element
     */
    public void setSignaturePubKeyInfo(org.kopi.ebics.schema.s001.SignaturePubKeyInfoType signaturePubKeyInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.s001.SignaturePubKeyInfoType target = null;
            target = (org.kopi.ebics.schema.s001.SignaturePubKeyInfoType)get_store().find_element_user(SIGNATUREPUBKEYINFO$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.s001.SignaturePubKeyInfoType)get_store().add_element_user(SIGNATUREPUBKEYINFO$0);
            }
            target.set(signaturePubKeyInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "SignaturePubKeyInfo" element
     */
    public org.kopi.ebics.schema.s001.SignaturePubKeyInfoType addNewSignaturePubKeyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.s001.SignaturePubKeyInfoType target = null;
            target = (org.kopi.ebics.schema.s001.SignaturePubKeyInfoType)get_store().add_element_user(SIGNATUREPUBKEYINFO$0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERID$2, 0);
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
    public org.kopi.ebics.schema.s001.PartnerIDType xgetPartnerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.s001.PartnerIDType target = null;
            target = (org.kopi.ebics.schema.s001.PartnerIDType)get_store().find_element_user(PARTNERID$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNERID$2);
            }
            target.setStringValue(partnerID);
        }
    }
    
    /**
     * Sets (as xml) the "PartnerID" element
     */
    public void xsetPartnerID(org.kopi.ebics.schema.s001.PartnerIDType partnerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.s001.PartnerIDType target = null;
            target = (org.kopi.ebics.schema.s001.PartnerIDType)get_store().find_element_user(PARTNERID$2, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.s001.PartnerIDType)get_store().add_element_user(PARTNERID$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$4, 0);
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
    public org.kopi.ebics.schema.s001.UserIDType xgetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.s001.UserIDType target = null;
            target = (org.kopi.ebics.schema.s001.UserIDType)get_store().find_element_user(USERID$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$4);
            }
            target.setStringValue(userID);
        }
    }
    
    /**
     * Sets (as xml) the "UserID" element
     */
    public void xsetUserID(org.kopi.ebics.schema.s001.UserIDType userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.s001.UserIDType target = null;
            target = (org.kopi.ebics.schema.s001.UserIDType)get_store().find_element_user(USERID$4, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.s001.UserIDType)get_store().add_element_user(USERID$4);
            }
            target.set(userID);
        }
    }
}
