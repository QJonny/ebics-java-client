/*
 * XML Type:  KeyMgmntResponseMutableHeaderType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.KeyMgmntResponseMutableHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML KeyMgmntResponseMutableHeaderType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class KeyMgmntResponseMutableHeaderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.KeyMgmntResponseMutableHeaderType
{
    private static final long serialVersionUID = 1L;
    
    public KeyMgmntResponseMutableHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETURNCODE$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "ReturnCode");
    private static final javax.xml.namespace.QName REPORTTEXT$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "ReportText");
    
    
    /**
     * Gets the "ReturnCode" element
     */
    public java.lang.String getReturnCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURNCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReturnCode" element
     */
    public org.kopi.ebics.schema.h003.ReturnCodeType xgetReturnCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ReturnCodeType target = null;
            target = (org.kopi.ebics.schema.h003.ReturnCodeType)get_store().find_element_user(RETURNCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ReturnCode" element
     */
    public void setReturnCode(java.lang.String returnCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURNCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURNCODE$0);
            }
            target.setStringValue(returnCode);
        }
    }
    
    /**
     * Sets (as xml) the "ReturnCode" element
     */
    public void xsetReturnCode(org.kopi.ebics.schema.h003.ReturnCodeType returnCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ReturnCodeType target = null;
            target = (org.kopi.ebics.schema.h003.ReturnCodeType)get_store().find_element_user(RETURNCODE$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.ReturnCodeType)get_store().add_element_user(RETURNCODE$0);
            }
            target.set(returnCode);
        }
    }
    
    /**
     * Gets the "ReportText" element
     */
    public java.lang.String getReportText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTTEXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReportText" element
     */
    public org.kopi.ebics.schema.h003.ReportTextType xgetReportText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ReportTextType target = null;
            target = (org.kopi.ebics.schema.h003.ReportTextType)get_store().find_element_user(REPORTTEXT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ReportText" element
     */
    public void setReportText(java.lang.String reportText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTTEXT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTTEXT$2);
            }
            target.setStringValue(reportText);
        }
    }
    
    /**
     * Sets (as xml) the "ReportText" element
     */
    public void xsetReportText(org.kopi.ebics.schema.h003.ReportTextType reportText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ReportTextType target = null;
            target = (org.kopi.ebics.schema.h003.ReportTextType)get_store().find_element_user(REPORTTEXT$2, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.ReportTextType)get_store().add_element_user(REPORTTEXT$2);
            }
            target.set(reportText);
        }
    }
}
