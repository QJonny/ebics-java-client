/*
 * XML Type:  PreValidationAccountAuthType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.PreValidationAccountAuthType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML PreValidationAccountAuthType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class PreValidationAccountAuthTypeImpl extends org.kopi.ebics.schema.h003.impl.AccountTypeImpl implements org.kopi.ebics.schema.h003.PreValidationAccountAuthType
{
    private static final long serialVersionUID = 1L;
    
    public PreValidationAccountAuthTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AMOUNT$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Amount");
    
    
    /**
     * Gets the "Amount" element
     */
    public org.kopi.ebics.schema.h003.AmountType getAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.AmountType target = null;
            target = (org.kopi.ebics.schema.h003.AmountType)get_store().find_element_user(AMOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Amount" element
     */
    public boolean isSetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AMOUNT$0) != 0;
        }
    }
    
    /**
     * Sets the "Amount" element
     */
    public void setAmount(org.kopi.ebics.schema.h003.AmountType amount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.AmountType target = null;
            target = (org.kopi.ebics.schema.h003.AmountType)get_store().find_element_user(AMOUNT$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.AmountType)get_store().add_element_user(AMOUNT$0);
            }
            target.set(amount);
        }
    }
    
    /**
     * Appends and returns a new empty "Amount" element
     */
    public org.kopi.ebics.schema.h003.AmountType addNewAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.AmountType target = null;
            target = (org.kopi.ebics.schema.h003.AmountType)get_store().add_element_user(AMOUNT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Amount" element
     */
    public void unsetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AMOUNT$0, 0);
        }
    }
}
