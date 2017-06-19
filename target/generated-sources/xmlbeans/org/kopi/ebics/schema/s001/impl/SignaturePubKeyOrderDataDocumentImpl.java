/*
 * An XML document type.
 * Localname: SignaturePubKeyOrderData
 * Namespace: http://www.ebics.org/S001
 * Java type: org.kopi.ebics.schema.s001.SignaturePubKeyOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.s001.impl;
/**
 * A document containing one SignaturePubKeyOrderData(@http://www.ebics.org/S001) element.
 *
 * This is a complex type.
 */
public class SignaturePubKeyOrderDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.s001.SignaturePubKeyOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public SignaturePubKeyOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGNATUREPUBKEYORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/S001", "SignaturePubKeyOrderData");
    
    
    /**
     * Gets the "SignaturePubKeyOrderData" element
     */
    public org.kopi.ebics.schema.s001.SignaturePubKeyOrderDataType getSignaturePubKeyOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.s001.SignaturePubKeyOrderDataType target = null;
            target = (org.kopi.ebics.schema.s001.SignaturePubKeyOrderDataType)get_store().find_element_user(SIGNATUREPUBKEYORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SignaturePubKeyOrderData" element
     */
    public void setSignaturePubKeyOrderData(org.kopi.ebics.schema.s001.SignaturePubKeyOrderDataType signaturePubKeyOrderData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.s001.SignaturePubKeyOrderDataType target = null;
            target = (org.kopi.ebics.schema.s001.SignaturePubKeyOrderDataType)get_store().find_element_user(SIGNATUREPUBKEYORDERDATA$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.s001.SignaturePubKeyOrderDataType)get_store().add_element_user(SIGNATUREPUBKEYORDERDATA$0);
            }
            target.set(signaturePubKeyOrderData);
        }
    }
    
    /**
     * Appends and returns a new empty "SignaturePubKeyOrderData" element
     */
    public org.kopi.ebics.schema.s001.SignaturePubKeyOrderDataType addNewSignaturePubKeyOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.s001.SignaturePubKeyOrderDataType target = null;
            target = (org.kopi.ebics.schema.s001.SignaturePubKeyOrderDataType)get_store().add_element_user(SIGNATUREPUBKEYORDERDATA$0);
            return target;
        }
    }
}
