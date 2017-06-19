/*
 * XML Type:  UserInfoType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.UserInfoType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML UserInfoType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class UserInfoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.UserInfoType
{
    private static final long serialVersionUID = 1L;
    
    public UserInfoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERID$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "UserID");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Name");
    private static final javax.xml.namespace.QName PERMISSION$4 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Permission");
    
    
    /**
     * Gets the "UserID" element
     */
    public org.kopi.ebics.schema.h003.UserInfoType.UserID getUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserInfoType.UserID target = null;
            target = (org.kopi.ebics.schema.h003.UserInfoType.UserID)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UserID" element
     */
    public void setUserID(org.kopi.ebics.schema.h003.UserInfoType.UserID userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserInfoType.UserID target = null;
            target = (org.kopi.ebics.schema.h003.UserInfoType.UserID)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.UserInfoType.UserID)get_store().add_element_user(USERID$0);
            }
            target.set(userID);
        }
    }
    
    /**
     * Appends and returns a new empty "UserID" element
     */
    public org.kopi.ebics.schema.h003.UserInfoType.UserID addNewUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserInfoType.UserID target = null;
            target = (org.kopi.ebics.schema.h003.UserInfoType.UserID)get_store().add_element_user(USERID$0);
            return target;
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.kopi.ebics.schema.h003.NameType xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.NameType target = null;
            target = (org.kopi.ebics.schema.h003.NameType)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$2) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.kopi.ebics.schema.h003.NameType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.NameType target = null;
            target = (org.kopi.ebics.schema.h003.NameType)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.NameType)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$2, 0);
        }
    }
    
    /**
     * Gets array of all "Permission" elements
     */
    public org.kopi.ebics.schema.h003.UserPermissionType[] getPermissionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERMISSION$4, targetList);
            org.kopi.ebics.schema.h003.UserPermissionType[] result = new org.kopi.ebics.schema.h003.UserPermissionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Permission" element
     */
    public org.kopi.ebics.schema.h003.UserPermissionType getPermissionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserPermissionType target = null;
            target = (org.kopi.ebics.schema.h003.UserPermissionType)get_store().find_element_user(PERMISSION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Permission" element
     */
    public int sizeOfPermissionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERMISSION$4);
        }
    }
    
    /**
     * Sets array of all "Permission" element
     */
    public void setPermissionArray(org.kopi.ebics.schema.h003.UserPermissionType[] permissionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(permissionArray, PERMISSION$4);
        }
    }
    
    /**
     * Sets ith "Permission" element
     */
    public void setPermissionArray(int i, org.kopi.ebics.schema.h003.UserPermissionType permission)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserPermissionType target = null;
            target = (org.kopi.ebics.schema.h003.UserPermissionType)get_store().find_element_user(PERMISSION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(permission);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Permission" element
     */
    public org.kopi.ebics.schema.h003.UserPermissionType insertNewPermission(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserPermissionType target = null;
            target = (org.kopi.ebics.schema.h003.UserPermissionType)get_store().insert_element_user(PERMISSION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Permission" element
     */
    public org.kopi.ebics.schema.h003.UserPermissionType addNewPermission()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserPermissionType target = null;
            target = (org.kopi.ebics.schema.h003.UserPermissionType)get_store().add_element_user(PERMISSION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Permission" element
     */
    public void removePermission(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERMISSION$4, i);
        }
    }
    /**
     * An XML UserID(@http://www.ebics.org/H003).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.UserInfoType$UserID.
     */
    public static class UserIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.kopi.ebics.schema.h003.UserInfoType.UserID
    {
        private static final long serialVersionUID = 1L;
        
        public UserIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected UserIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName STATUS$0 = 
            new javax.xml.namespace.QName("", "Status");
        
        
        /**
         * Gets the "Status" attribute
         */
        public int getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Status" attribute
         */
        public org.kopi.ebics.schema.h003.UserStatusType xgetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.UserStatusType target = null;
                target = (org.kopi.ebics.schema.h003.UserStatusType)get_store().find_attribute_user(STATUS$0);
                return target;
            }
        }
        
        /**
         * Sets the "Status" attribute
         */
        public void setStatus(int status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$0);
                }
                target.setIntValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "Status" attribute
         */
        public void xsetStatus(org.kopi.ebics.schema.h003.UserStatusType status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.UserStatusType target = null;
                target = (org.kopi.ebics.schema.h003.UserStatusType)get_store().find_attribute_user(STATUS$0);
                if (target == null)
                {
                    target = (org.kopi.ebics.schema.h003.UserStatusType)get_store().add_attribute_user(STATUS$0);
                }
                target.set(status);
            }
        }
    }
}
