/*
 * An XML document type.
 * Localname: SPKIData
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.SPKIDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * A document containing one SPKIData(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class SPKIDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.SPKIDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public SPKIDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPKIDATA$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SPKIData");
    
    
    /**
     * Gets the "SPKIData" element
     */
    public org.kopi.ebics.schema.xmldsig.SPKIDataType getSPKIData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.SPKIDataType target = null;
            target = (org.kopi.ebics.schema.xmldsig.SPKIDataType)get_store().find_element_user(SPKIDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SPKIData" element
     */
    public void setSPKIData(org.kopi.ebics.schema.xmldsig.SPKIDataType spkiData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.SPKIDataType target = null;
            target = (org.kopi.ebics.schema.xmldsig.SPKIDataType)get_store().find_element_user(SPKIDATA$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.xmldsig.SPKIDataType)get_store().add_element_user(SPKIDATA$0);
            }
            target.set(spkiData);
        }
    }
    
    /**
     * Appends and returns a new empty "SPKIData" element
     */
    public org.kopi.ebics.schema.xmldsig.SPKIDataType addNewSPKIData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.SPKIDataType target = null;
            target = (org.kopi.ebics.schema.xmldsig.SPKIDataType)get_store().add_element_user(SPKIDATA$0);
            return target;
        }
    }
}
