/*
 * An XML document type.
 * Localname: SignatureMethod
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.SignatureMethodDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * A document containing one SignatureMethod(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class SignatureMethodDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.SignatureMethodDocument
{
    private static final long serialVersionUID = 1L;
    
    public SignatureMethodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGNATUREMETHOD$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureMethod");
    
    
    /**
     * Gets the "SignatureMethod" element
     */
    public org.kopi.ebics.schema.xmldsig.SignatureMethodType getSignatureMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.SignatureMethodType target = null;
            target = (org.kopi.ebics.schema.xmldsig.SignatureMethodType)get_store().find_element_user(SIGNATUREMETHOD$0, 0);
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
            target = (org.kopi.ebics.schema.xmldsig.SignatureMethodType)get_store().find_element_user(SIGNATUREMETHOD$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.xmldsig.SignatureMethodType)get_store().add_element_user(SIGNATUREMETHOD$0);
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
            target = (org.kopi.ebics.schema.xmldsig.SignatureMethodType)get_store().add_element_user(SIGNATUREMETHOD$0);
            return target;
        }
    }
}
