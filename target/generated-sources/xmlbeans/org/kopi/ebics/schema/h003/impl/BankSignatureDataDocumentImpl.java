/*
 * An XML document type.
 * Localname: BankSignatureData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.BankSignatureDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one BankSignatureData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class BankSignatureDataDocumentImpl extends org.kopi.ebics.schema.h003.impl.EBICSSignatureDataDocumentImpl implements org.kopi.ebics.schema.h003.BankSignatureDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public BankSignatureDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BANKSIGNATUREDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "BankSignatureData");
    
    
    /**
     * Gets the "BankSignatureData" element
     */
    public org.kopi.ebics.schema.h003.BankSignatureDataSigBookType getBankSignatureData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.BankSignatureDataSigBookType target = null;
            target = (org.kopi.ebics.schema.h003.BankSignatureDataSigBookType)get_store().find_element_user(BANKSIGNATUREDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BankSignatureData" element
     */
    public void setBankSignatureData(org.kopi.ebics.schema.h003.BankSignatureDataSigBookType bankSignatureData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.BankSignatureDataSigBookType target = null;
            target = (org.kopi.ebics.schema.h003.BankSignatureDataSigBookType)get_store().find_element_user(BANKSIGNATUREDATA$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.BankSignatureDataSigBookType)get_store().add_element_user(BANKSIGNATUREDATA$0);
            }
            target.set(bankSignatureData);
        }
    }
    
    /**
     * Appends and returns a new empty "BankSignatureData" element
     */
    public org.kopi.ebics.schema.h003.BankSignatureDataSigBookType addNewBankSignatureData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.BankSignatureDataSigBookType target = null;
            target = (org.kopi.ebics.schema.h003.BankSignatureDataSigBookType)get_store().add_element_user(BANKSIGNATUREDATA$0);
            return target;
        }
    }
}
