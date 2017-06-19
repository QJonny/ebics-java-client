/*
 * An XML document type.
 * Localname: SignatureProperties
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.SignaturePropertiesDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * A document containing one SignatureProperties(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class SignaturePropertiesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.SignaturePropertiesDocument
{
    private static final long serialVersionUID = 1L;
    
    public SignaturePropertiesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGNATUREPROPERTIES$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperties");
    
    
    /**
     * Gets the "SignatureProperties" element
     */
    public org.kopi.ebics.schema.xmldsig.SignaturePropertiesType getSignatureProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.SignaturePropertiesType target = null;
            target = (org.kopi.ebics.schema.xmldsig.SignaturePropertiesType)get_store().find_element_user(SIGNATUREPROPERTIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SignatureProperties" element
     */
    public void setSignatureProperties(org.kopi.ebics.schema.xmldsig.SignaturePropertiesType signatureProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.SignaturePropertiesType target = null;
            target = (org.kopi.ebics.schema.xmldsig.SignaturePropertiesType)get_store().find_element_user(SIGNATUREPROPERTIES$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.xmldsig.SignaturePropertiesType)get_store().add_element_user(SIGNATUREPROPERTIES$0);
            }
            target.set(signatureProperties);
        }
    }
    
    /**
     * Appends and returns a new empty "SignatureProperties" element
     */
    public org.kopi.ebics.schema.xmldsig.SignaturePropertiesType addNewSignatureProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.SignaturePropertiesType target = null;
            target = (org.kopi.ebics.schema.xmldsig.SignaturePropertiesType)get_store().add_element_user(SIGNATUREPROPERTIES$0);
            return target;
        }
    }
}
