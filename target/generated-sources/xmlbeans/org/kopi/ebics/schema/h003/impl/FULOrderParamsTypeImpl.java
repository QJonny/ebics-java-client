/*
 * XML Type:  FULOrderParamsType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.FULOrderParamsType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML FULOrderParamsType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class FULOrderParamsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.FULOrderParamsType
{
    private static final long serialVersionUID = 1L;
    
    public FULOrderParamsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Parameter");
    private static final javax.xml.namespace.QName FILEFORMAT$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "FileFormat");
    
    
    /**
     * Gets array of all "Parameter" elements
     */
    public org.kopi.ebics.schema.h003.ParameterDocument.Parameter[] getParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETER$0, targetList);
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter[] result = new org.kopi.ebics.schema.h003.ParameterDocument.Parameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Parameter" element
     */
    public org.kopi.ebics.schema.h003.ParameterDocument.Parameter getParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter target = null;
            target = (org.kopi.ebics.schema.h003.ParameterDocument.Parameter)get_store().find_element_user(PARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Parameter" element
     */
    public int sizeOfParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETER$0);
        }
    }
    
    /**
     * Sets array of all "Parameter" element
     */
    public void setParameterArray(org.kopi.ebics.schema.h003.ParameterDocument.Parameter[] parameterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parameterArray, PARAMETER$0);
        }
    }
    
    /**
     * Sets ith "Parameter" element
     */
    public void setParameterArray(int i, org.kopi.ebics.schema.h003.ParameterDocument.Parameter parameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter target = null;
            target = (org.kopi.ebics.schema.h003.ParameterDocument.Parameter)get_store().find_element_user(PARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Parameter" element
     */
    public org.kopi.ebics.schema.h003.ParameterDocument.Parameter insertNewParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter target = null;
            target = (org.kopi.ebics.schema.h003.ParameterDocument.Parameter)get_store().insert_element_user(PARAMETER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Parameter" element
     */
    public org.kopi.ebics.schema.h003.ParameterDocument.Parameter addNewParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter target = null;
            target = (org.kopi.ebics.schema.h003.ParameterDocument.Parameter)get_store().add_element_user(PARAMETER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Parameter" element
     */
    public void removeParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETER$0, i);
        }
    }
    
    /**
     * Gets the "FileFormat" element
     */
    public org.kopi.ebics.schema.h003.FileFormatType getFileFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.FileFormatType target = null;
            target = (org.kopi.ebics.schema.h003.FileFormatType)get_store().find_element_user(FILEFORMAT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FileFormat" element
     */
    public void setFileFormat(org.kopi.ebics.schema.h003.FileFormatType fileFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.FileFormatType target = null;
            target = (org.kopi.ebics.schema.h003.FileFormatType)get_store().find_element_user(FILEFORMAT$2, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.FileFormatType)get_store().add_element_user(FILEFORMAT$2);
            }
            target.set(fileFormat);
        }
    }
    
    /**
     * Appends and returns a new empty "FileFormat" element
     */
    public org.kopi.ebics.schema.h003.FileFormatType addNewFileFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.FileFormatType target = null;
            target = (org.kopi.ebics.schema.h003.FileFormatType)get_store().add_element_user(FILEFORMAT$2);
            return target;
        }
    }
}
