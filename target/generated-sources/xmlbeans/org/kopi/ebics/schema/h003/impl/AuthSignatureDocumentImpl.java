/*
 * An XML document type.
 * Localname: AuthSignature
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.AuthSignatureDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one AuthSignature(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class AuthSignatureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.AuthSignatureDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuthSignatureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHSIGNATURE$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "AuthSignature");
    
    
    /**
     * Gets the "AuthSignature" element
     */
    public org.kopi.ebics.schema.xmldsig.SignatureType getAuthSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.SignatureType target = null;
            target = (org.kopi.ebics.schema.xmldsig.SignatureType)get_store().find_element_user(AUTHSIGNATURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AuthSignature" element
     */
    public void setAuthSignature(org.kopi.ebics.schema.xmldsig.SignatureType authSignature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.SignatureType target = null;
            target = (org.kopi.ebics.schema.xmldsig.SignatureType)get_store().find_element_user(AUTHSIGNATURE$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.xmldsig.SignatureType)get_store().add_element_user(AUTHSIGNATURE$0);
            }
            target.set(authSignature);
        }
    }
    
    /**
     * Appends and returns a new empty "AuthSignature" element
     */
    public org.kopi.ebics.schema.xmldsig.SignatureType addNewAuthSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.SignatureType target = null;
            target = (org.kopi.ebics.schema.xmldsig.SignatureType)get_store().add_element_user(AUTHSIGNATURE$0);
            return target;
        }
    }
}
