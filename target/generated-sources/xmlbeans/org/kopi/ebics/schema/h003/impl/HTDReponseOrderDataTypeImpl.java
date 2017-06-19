/*
 * XML Type:  HTDReponseOrderDataType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HTDReponseOrderDataType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML HTDReponseOrderDataType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class HTDReponseOrderDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.HTDReponseOrderDataType
{
    private static final long serialVersionUID = 1L;
    
    public HTDReponseOrderDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTNERINFO$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "PartnerInfo");
    private static final javax.xml.namespace.QName USERINFO$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "UserInfo");
    
    
    /**
     * Gets the "PartnerInfo" element
     */
    public org.kopi.ebics.schema.h003.PartnerInfoType getPartnerInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.PartnerInfoType target = null;
            target = (org.kopi.ebics.schema.h003.PartnerInfoType)get_store().find_element_user(PARTNERINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PartnerInfo" element
     */
    public void setPartnerInfo(org.kopi.ebics.schema.h003.PartnerInfoType partnerInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.PartnerInfoType target = null;
            target = (org.kopi.ebics.schema.h003.PartnerInfoType)get_store().find_element_user(PARTNERINFO$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.PartnerInfoType)get_store().add_element_user(PARTNERINFO$0);
            }
            target.set(partnerInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "PartnerInfo" element
     */
    public org.kopi.ebics.schema.h003.PartnerInfoType addNewPartnerInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.PartnerInfoType target = null;
            target = (org.kopi.ebics.schema.h003.PartnerInfoType)get_store().add_element_user(PARTNERINFO$0);
            return target;
        }
    }
    
    /**
     * Gets the "UserInfo" element
     */
    public org.kopi.ebics.schema.h003.UserInfoType getUserInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserInfoType target = null;
            target = (org.kopi.ebics.schema.h003.UserInfoType)get_store().find_element_user(USERINFO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UserInfo" element
     */
    public void setUserInfo(org.kopi.ebics.schema.h003.UserInfoType userInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserInfoType target = null;
            target = (org.kopi.ebics.schema.h003.UserInfoType)get_store().find_element_user(USERINFO$2, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.UserInfoType)get_store().add_element_user(USERINFO$2);
            }
            target.set(userInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "UserInfo" element
     */
    public org.kopi.ebics.schema.h003.UserInfoType addNewUserInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserInfoType target = null;
            target = (org.kopi.ebics.schema.h003.UserInfoType)get_store().add_element_user(USERINFO$2);
            return target;
        }
    }
}
