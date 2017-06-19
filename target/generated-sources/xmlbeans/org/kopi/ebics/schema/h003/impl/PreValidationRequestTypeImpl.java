/*
 * XML Type:  PreValidationRequestType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.PreValidationRequestType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML PreValidationRequestType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class PreValidationRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.PreValidationRequestType
{
    private static final long serialVersionUID = 1L;
    
    public PreValidationRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATADIGEST$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "DataDigest");
    private static final javax.xml.namespace.QName ACCOUNTAUTHORISATION$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "AccountAuthorisation");
    
    
    /**
     * Gets array of all "DataDigest" elements
     */
    public org.kopi.ebics.schema.h003.DataDigestType[] getDataDigestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATADIGEST$0, targetList);
            org.kopi.ebics.schema.h003.DataDigestType[] result = new org.kopi.ebics.schema.h003.DataDigestType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataDigest" element
     */
    public org.kopi.ebics.schema.h003.DataDigestType getDataDigestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.DataDigestType target = null;
            target = (org.kopi.ebics.schema.h003.DataDigestType)get_store().find_element_user(DATADIGEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataDigest" element
     */
    public int sizeOfDataDigestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATADIGEST$0);
        }
    }
    
    /**
     * Sets array of all "DataDigest" element
     */
    public void setDataDigestArray(org.kopi.ebics.schema.h003.DataDigestType[] dataDigestArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataDigestArray, DATADIGEST$0);
        }
    }
    
    /**
     * Sets ith "DataDigest" element
     */
    public void setDataDigestArray(int i, org.kopi.ebics.schema.h003.DataDigestType dataDigest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.DataDigestType target = null;
            target = (org.kopi.ebics.schema.h003.DataDigestType)get_store().find_element_user(DATADIGEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataDigest);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataDigest" element
     */
    public org.kopi.ebics.schema.h003.DataDigestType insertNewDataDigest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.DataDigestType target = null;
            target = (org.kopi.ebics.schema.h003.DataDigestType)get_store().insert_element_user(DATADIGEST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataDigest" element
     */
    public org.kopi.ebics.schema.h003.DataDigestType addNewDataDigest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.DataDigestType target = null;
            target = (org.kopi.ebics.schema.h003.DataDigestType)get_store().add_element_user(DATADIGEST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataDigest" element
     */
    public void removeDataDigest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATADIGEST$0, i);
        }
    }
    
    /**
     * Gets array of all "AccountAuthorisation" elements
     */
    public org.kopi.ebics.schema.h003.PreValidationAccountAuthType[] getAccountAuthorisationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACCOUNTAUTHORISATION$2, targetList);
            org.kopi.ebics.schema.h003.PreValidationAccountAuthType[] result = new org.kopi.ebics.schema.h003.PreValidationAccountAuthType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AccountAuthorisation" element
     */
    public org.kopi.ebics.schema.h003.PreValidationAccountAuthType getAccountAuthorisationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.PreValidationAccountAuthType target = null;
            target = (org.kopi.ebics.schema.h003.PreValidationAccountAuthType)get_store().find_element_user(ACCOUNTAUTHORISATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AccountAuthorisation" element
     */
    public int sizeOfAccountAuthorisationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOUNTAUTHORISATION$2);
        }
    }
    
    /**
     * Sets array of all "AccountAuthorisation" element
     */
    public void setAccountAuthorisationArray(org.kopi.ebics.schema.h003.PreValidationAccountAuthType[] accountAuthorisationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(accountAuthorisationArray, ACCOUNTAUTHORISATION$2);
        }
    }
    
    /**
     * Sets ith "AccountAuthorisation" element
     */
    public void setAccountAuthorisationArray(int i, org.kopi.ebics.schema.h003.PreValidationAccountAuthType accountAuthorisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.PreValidationAccountAuthType target = null;
            target = (org.kopi.ebics.schema.h003.PreValidationAccountAuthType)get_store().find_element_user(ACCOUNTAUTHORISATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(accountAuthorisation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AccountAuthorisation" element
     */
    public org.kopi.ebics.schema.h003.PreValidationAccountAuthType insertNewAccountAuthorisation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.PreValidationAccountAuthType target = null;
            target = (org.kopi.ebics.schema.h003.PreValidationAccountAuthType)get_store().insert_element_user(ACCOUNTAUTHORISATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AccountAuthorisation" element
     */
    public org.kopi.ebics.schema.h003.PreValidationAccountAuthType addNewAccountAuthorisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.PreValidationAccountAuthType target = null;
            target = (org.kopi.ebics.schema.h003.PreValidationAccountAuthType)get_store().add_element_user(ACCOUNTAUTHORISATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "AccountAuthorisation" element
     */
    public void removeAccountAuthorisation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOUNTAUTHORISATION$2, i);
        }
    }
}
