/*
 * An XML document type.
 * Localname: Signature
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.SignatureDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * A document containing one Signature(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class SignatureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.SignatureDocument
{
    private static final long serialVersionUID = 1L;
    
    public SignatureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGNATURE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
    
    
    /**
     * Gets the "Signature" element
     */
    public org.kopi.ebics.schema.xmldsig.SignatureType getSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.SignatureType target = null;
            target = (org.kopi.ebics.schema.xmldsig.SignatureType)get_store().find_element_user(SIGNATURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Signature" element
     */
    public void setSignature(org.kopi.ebics.schema.xmldsig.SignatureType signature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.SignatureType target = null;
            target = (org.kopi.ebics.schema.xmldsig.SignatureType)get_store().find_element_user(SIGNATURE$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.xmldsig.SignatureType)get_store().add_element_user(SIGNATURE$0);
            }
            target.set(signature);
        }
    }
    
    /**
     * Appends and returns a new empty "Signature" element
     */
    public org.kopi.ebics.schema.xmldsig.SignatureType addNewSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.SignatureType target = null;
            target = (org.kopi.ebics.schema.xmldsig.SignatureType)get_store().add_element_user(SIGNATURE$0);
            return target;
        }
    }
}
