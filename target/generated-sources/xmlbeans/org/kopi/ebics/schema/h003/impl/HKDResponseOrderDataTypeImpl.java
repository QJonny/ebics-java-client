/*
 * XML Type:  HKDResponseOrderDataType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HKDResponseOrderDataType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML HKDResponseOrderDataType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class HKDResponseOrderDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.HKDResponseOrderDataType
{
    private static final long serialVersionUID = 1L;
    
    public HKDResponseOrderDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
     * Gets array of all "UserInfo" elements
     */
    public org.kopi.ebics.schema.h003.UserInfoType[] getUserInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USERINFO$2, targetList);
            org.kopi.ebics.schema.h003.UserInfoType[] result = new org.kopi.ebics.schema.h003.UserInfoType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "UserInfo" element
     */
    public org.kopi.ebics.schema.h003.UserInfoType getUserInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserInfoType target = null;
            target = (org.kopi.ebics.schema.h003.UserInfoType)get_store().find_element_user(USERINFO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "UserInfo" element
     */
    public int sizeOfUserInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERINFO$2);
        }
    }
    
    /**
     * Sets array of all "UserInfo" element
     */
    public void setUserInfoArray(org.kopi.ebics.schema.h003.UserInfoType[] userInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(userInfoArray, USERINFO$2);
        }
    }
    
    /**
     * Sets ith "UserInfo" element
     */
    public void setUserInfoArray(int i, org.kopi.ebics.schema.h003.UserInfoType userInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserInfoType target = null;
            target = (org.kopi.ebics.schema.h003.UserInfoType)get_store().find_element_user(USERINFO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(userInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UserInfo" element
     */
    public org.kopi.ebics.schema.h003.UserInfoType insertNewUserInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserInfoType target = null;
            target = (org.kopi.ebics.schema.h003.UserInfoType)get_store().insert_element_user(USERINFO$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UserInfo" element
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
    
    /**
     * Removes the ith "UserInfo" element
     */
    public void removeUserInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERINFO$2, i);
        }
    }
}
