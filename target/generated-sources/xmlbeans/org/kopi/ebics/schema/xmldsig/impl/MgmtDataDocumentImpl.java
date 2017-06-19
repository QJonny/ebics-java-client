/*
 * An XML document type.
 * Localname: MgmtData
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.MgmtDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * A document containing one MgmtData(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class MgmtDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.MgmtDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public MgmtDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MGMTDATA$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "MgmtData");
    
    
    /**
     * Gets the "MgmtData" element
     */
    public java.lang.String getMgmtData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MGMTDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MgmtData" element
     */
    public org.apache.xmlbeans.XmlString xgetMgmtData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MGMTDATA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MgmtData" element
     */
    public void setMgmtData(java.lang.String mgmtData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MGMTDATA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MGMTDATA$0);
            }
            target.setStringValue(mgmtData);
        }
    }
    
    /**
     * Sets (as xml) the "MgmtData" element
     */
    public void xsetMgmtData(org.apache.xmlbeans.XmlString mgmtData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MGMTDATA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MGMTDATA$0);
            }
            target.set(mgmtData);
        }
    }
}
