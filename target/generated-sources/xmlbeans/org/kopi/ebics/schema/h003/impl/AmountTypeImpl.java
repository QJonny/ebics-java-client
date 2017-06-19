/*
 * XML Type:  AmountType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.AmountType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML AmountType(@http://www.ebics.org/H003).
 *
 * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.AmountType.
 */
public class AmountTypeImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements org.kopi.ebics.schema.h003.AmountType
{
    private static final long serialVersionUID = 1L;
    
    public AmountTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected AmountTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName CURRENCY$0 = 
        new javax.xml.namespace.QName("", "Currency");
    
    
    /**
     * Gets the "Currency" attribute
     */
    public java.lang.String getCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENCY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CURRENCY$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Currency" attribute
     */
    public org.kopi.ebics.schema.h003.CurrencyBaseType xgetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.CurrencyBaseType target = null;
            target = (org.kopi.ebics.schema.h003.CurrencyBaseType)get_store().find_attribute_user(CURRENCY$0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.CurrencyBaseType)get_default_attribute_value(CURRENCY$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "Currency" attribute
     */
    public boolean isSetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CURRENCY$0) != null;
        }
    }
    
    /**
     * Sets the "Currency" attribute
     */
    public void setCurrency(java.lang.String currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENCY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURRENCY$0);
            }
            target.setStringValue(currency);
        }
    }
    
    /**
     * Sets (as xml) the "Currency" attribute
     */
    public void xsetCurrency(org.kopi.ebics.schema.h003.CurrencyBaseType currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.CurrencyBaseType target = null;
            target = (org.kopi.ebics.schema.h003.CurrencyBaseType)get_store().find_attribute_user(CURRENCY$0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.CurrencyBaseType)get_store().add_attribute_user(CURRENCY$0);
            }
            target.set(currency);
        }
    }
    
    /**
     * Unsets the "Currency" attribute
     */
    public void unsetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CURRENCY$0);
        }
    }
}
