/*
 * An XML document type.
 * Localname: DigestMethod
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.DigestMethodDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * A document containing one DigestMethod(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class DigestMethodDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.DigestMethodDocument
{
    private static final long serialVersionUID = 1L;
    
    public DigestMethodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIGESTMETHOD$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "DigestMethod");
    
    
    /**
     * Gets the "DigestMethod" element
     */
    public org.kopi.ebics.schema.xmldsig.DigestMethodType getDigestMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.DigestMethodType target = null;
            target = (org.kopi.ebics.schema.xmldsig.DigestMethodType)get_store().find_element_user(DIGESTMETHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DigestMethod" element
     */
    public void setDigestMethod(org.kopi.ebics.schema.xmldsig.DigestMethodType digestMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.DigestMethodType target = null;
            target = (org.kopi.ebics.schema.xmldsig.DigestMethodType)get_store().find_element_user(DIGESTMETHOD$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.xmldsig.DigestMethodType)get_store().add_element_user(DIGESTMETHOD$0);
            }
            target.set(digestMethod);
        }
    }
    
    /**
     * Appends and returns a new empty "DigestMethod" element
     */
    public org.kopi.ebics.schema.xmldsig.DigestMethodType addNewDigestMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.DigestMethodType target = null;
            target = (org.kopi.ebics.schema.xmldsig.DigestMethodType)get_store().add_element_user(DIGESTMETHOD$0);
            return target;
        }
    }
}
