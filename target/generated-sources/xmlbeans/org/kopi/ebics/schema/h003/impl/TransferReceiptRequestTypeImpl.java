/*
 * XML Type:  TransferReceiptRequestType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.TransferReceiptRequestType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML TransferReceiptRequestType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class TransferReceiptRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.TransferReceiptRequestType
{
    private static final long serialVersionUID = 1L;
    
    public TransferReceiptRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECEIPTCODE$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "ReceiptCode");
    
    
    /**
     * Gets the "ReceiptCode" element
     */
    public int getReceiptCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIPTCODE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReceiptCode" element
     */
    public org.kopi.ebics.schema.h003.ReceiptCodeType xgetReceiptCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ReceiptCodeType target = null;
            target = (org.kopi.ebics.schema.h003.ReceiptCodeType)get_store().find_element_user(RECEIPTCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ReceiptCode" element
     */
    public void setReceiptCode(int receiptCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIPTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECEIPTCODE$0);
            }
            target.setIntValue(receiptCode);
        }
    }
    
    /**
     * Sets (as xml) the "ReceiptCode" element
     */
    public void xsetReceiptCode(org.kopi.ebics.schema.h003.ReceiptCodeType receiptCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ReceiptCodeType target = null;
            target = (org.kopi.ebics.schema.h003.ReceiptCodeType)get_store().find_element_user(RECEIPTCODE$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.ReceiptCodeType)get_store().add_element_user(RECEIPTCODE$0);
            }
            target.set(receiptCode);
        }
    }
}
