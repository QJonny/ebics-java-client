/*
 * XML Type:  SignedInfoType
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.SignedInfoType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * An XML SignedInfoType(@http://www.w3.org/2000/09/xmldsig#).
 *
 * This is a complex type.
 */
public class SignedInfoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.SignedInfoType
{
    private static final long serialVersionUID = 1L;
    
    public SignedInfoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANONICALIZATIONMETHOD$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "CanonicalizationMethod");
    private static final javax.xml.namespace.QName SIGNATUREMETHOD$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureMethod");
    private static final javax.xml.namespace.QName REFERENCE$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Reference");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "Id");
    
    
    /**
     * Gets the "CanonicalizationMethod" element
     */
    public org.kopi.ebics.schema.xmldsig.CanonicalizationMethodType getCanonicalizationMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.CanonicalizationMethodType target = null;
            target = (org.kopi.ebics.schema.xmldsig.CanonicalizationMethodType)get_store().find_element_user(CANONICALIZATIONMETHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CanonicalizationMethod" element
     */
    public void setCanonicalizationMethod(org.kopi.ebics.schema.xmldsig.CanonicalizationMethodType canonicalizationMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.CanonicalizationMethodType target = null;
            target = (org.kopi.ebics.schema.xmldsig.CanonicalizationMethodType)get_store().find_element_user(CANONICALIZATIONMETHOD$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.xmldsig.CanonicalizationMethodType)get_store().add_element_user(CANONICALIZATIONMETHOD$0);
            }
            target.set(canonicalizationMethod);
        }
    }
    
    /**
     * Appends and returns a new empty "CanonicalizationMethod" element
     */
    public org.kopi.ebics.schema.xmldsig.CanonicalizationMethodType addNewCanonicalizationMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.CanonicalizationMethodType target = null;
            target = (org.kopi.ebics.schema.xmldsig.CanonicalizationMethodType)get_store().add_element_user(CANONICALIZATIONMETHOD$0);
            return target;
        }
    }
    
    /**
     * Gets the "SignatureMethod" element
     */
    public org.kopi.ebics.schema.xmldsig.SignatureMethodType getSignatureMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.SignatureMethodType target = null;
            target = (org.kopi.ebics.schema.xmldsig.SignatureMethodType)get_store().find_element_user(SIGNATUREMETHOD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SignatureMethod" element
     */
    public void setSignatureMethod(org.kopi.ebics.schema.xmldsig.SignatureMethodType signatureMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.SignatureMethodType target = null;
            target = (org.kopi.ebics.schema.xmldsig.SignatureMethodType)get_store().find_element_user(SIGNATUREMETHOD$2, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.xmldsig.SignatureMethodType)get_store().add_element_user(SIGNATUREMETHOD$2);
            }
            target.set(signatureMethod);
        }
    }
    
    /**
     * Appends and returns a new empty "SignatureMethod" element
     */
    public org.kopi.ebics.schema.xmldsig.SignatureMethodType addNewSignatureMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.SignatureMethodType target = null;
            target = (org.kopi.ebics.schema.xmldsig.SignatureMethodType)get_store().add_element_user(SIGNATUREMETHOD$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "Reference" elements
     */
    public org.kopi.ebics.schema.xmldsig.ReferenceType[] getReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFERENCE$4, targetList);
            org.kopi.ebics.schema.xmldsig.ReferenceType[] result = new org.kopi.ebics.schema.xmldsig.ReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Reference" element
     */
    public org.kopi.ebics.schema.xmldsig.ReferenceType getReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.ReferenceType target = null;
            target = (org.kopi.ebics.schema.xmldsig.ReferenceType)get_store().find_element_user(REFERENCE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Reference" element
     */
    public int sizeOfReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCE$4);
        }
    }
    
    /**
     * Sets array of all "Reference" element
     */
    public void setReferenceArray(org.kopi.ebics.schema.xmldsig.ReferenceType[] referenceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(referenceArray, REFERENCE$4);
        }
    }
    
    /**
     * Sets ith "Reference" element
     */
    public void setReferenceArray(int i, org.kopi.ebics.schema.xmldsig.ReferenceType reference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.ReferenceType target = null;
            target = (org.kopi.ebics.schema.xmldsig.ReferenceType)get_store().find_element_user(REFERENCE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reference);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Reference" element
     */
    public org.kopi.ebics.schema.xmldsig.ReferenceType insertNewReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.ReferenceType target = null;
            target = (org.kopi.ebics.schema.xmldsig.ReferenceType)get_store().insert_element_user(REFERENCE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Reference" element
     */
    public org.kopi.ebics.schema.xmldsig.ReferenceType addNewReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.ReferenceType target = null;
            target = (org.kopi.ebics.schema.xmldsig.ReferenceType)get_store().add_element_user(REFERENCE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Reference" element
     */
    public void removeReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCE$4, i);
        }
    }
    
    /**
     * Gets the "Id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
            return target;
        }
    }
    
    /**
     * True if has "Id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$6) != null;
        }
    }
    
    /**
     * Sets the "Id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "Id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$6);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "Id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$6);
        }
    }
}
