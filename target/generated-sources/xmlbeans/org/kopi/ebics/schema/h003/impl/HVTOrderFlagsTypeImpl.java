/*
 * XML Type:  HVTOrderFlagsType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVTOrderFlagsType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML HVTOrderFlagsType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class HVTOrderFlagsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.HVTOrderFlagsType
{
    private static final long serialVersionUID = 1L;
    
    public HVTOrderFlagsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLETEORDERDATA$0 = 
        new javax.xml.namespace.QName("", "completeOrderData");
    private static final javax.xml.namespace.QName FETCHLIMIT$2 = 
        new javax.xml.namespace.QName("", "fetchLimit");
    private static final javax.xml.namespace.QName FETCHOFFSET$4 = 
        new javax.xml.namespace.QName("", "fetchOffset");
    
    
    /**
     * Gets the "completeOrderData" attribute
     */
    public boolean getCompleteOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPLETEORDERDATA$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COMPLETEORDERDATA$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "completeOrderData" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCompleteOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COMPLETEORDERDATA$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COMPLETEORDERDATA$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "completeOrderData" attribute
     */
    public boolean isSetCompleteOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMPLETEORDERDATA$0) != null;
        }
    }
    
    /**
     * Sets the "completeOrderData" attribute
     */
    public void setCompleteOrderData(boolean completeOrderData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPLETEORDERDATA$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPLETEORDERDATA$0);
            }
            target.setBooleanValue(completeOrderData);
        }
    }
    
    /**
     * Sets (as xml) the "completeOrderData" attribute
     */
    public void xsetCompleteOrderData(org.apache.xmlbeans.XmlBoolean completeOrderData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COMPLETEORDERDATA$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COMPLETEORDERDATA$0);
            }
            target.set(completeOrderData);
        }
    }
    
    /**
     * Unsets the "completeOrderData" attribute
     */
    public void unsetCompleteOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMPLETEORDERDATA$0);
        }
    }
    
    /**
     * Gets the "fetchLimit" attribute
     */
    public long getFetchLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FETCHLIMIT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FETCHLIMIT$2);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "fetchLimit" attribute
     */
    public org.kopi.ebics.schema.h003.HVTOrderFlagsType.FetchLimit xgetFetchLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVTOrderFlagsType.FetchLimit target = null;
            target = (org.kopi.ebics.schema.h003.HVTOrderFlagsType.FetchLimit)get_store().find_attribute_user(FETCHLIMIT$2);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HVTOrderFlagsType.FetchLimit)get_default_attribute_value(FETCHLIMIT$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "fetchLimit" attribute
     */
    public boolean isSetFetchLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FETCHLIMIT$2) != null;
        }
    }
    
    /**
     * Sets the "fetchLimit" attribute
     */
    public void setFetchLimit(long fetchLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FETCHLIMIT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FETCHLIMIT$2);
            }
            target.setLongValue(fetchLimit);
        }
    }
    
    /**
     * Sets (as xml) the "fetchLimit" attribute
     */
    public void xsetFetchLimit(org.kopi.ebics.schema.h003.HVTOrderFlagsType.FetchLimit fetchLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVTOrderFlagsType.FetchLimit target = null;
            target = (org.kopi.ebics.schema.h003.HVTOrderFlagsType.FetchLimit)get_store().find_attribute_user(FETCHLIMIT$2);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HVTOrderFlagsType.FetchLimit)get_store().add_attribute_user(FETCHLIMIT$2);
            }
            target.set(fetchLimit);
        }
    }
    
    /**
     * Unsets the "fetchLimit" attribute
     */
    public void unsetFetchLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FETCHLIMIT$2);
        }
    }
    
    /**
     * Gets the "fetchOffset" attribute
     */
    public long getFetchOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FETCHOFFSET$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FETCHOFFSET$4);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "fetchOffset" attribute
     */
    public org.kopi.ebics.schema.h003.HVTOrderFlagsType.FetchOffset xgetFetchOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVTOrderFlagsType.FetchOffset target = null;
            target = (org.kopi.ebics.schema.h003.HVTOrderFlagsType.FetchOffset)get_store().find_attribute_user(FETCHOFFSET$4);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HVTOrderFlagsType.FetchOffset)get_default_attribute_value(FETCHOFFSET$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "fetchOffset" attribute
     */
    public boolean isSetFetchOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FETCHOFFSET$4) != null;
        }
    }
    
    /**
     * Sets the "fetchOffset" attribute
     */
    public void setFetchOffset(long fetchOffset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FETCHOFFSET$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FETCHOFFSET$4);
            }
            target.setLongValue(fetchOffset);
        }
    }
    
    /**
     * Sets (as xml) the "fetchOffset" attribute
     */
    public void xsetFetchOffset(org.kopi.ebics.schema.h003.HVTOrderFlagsType.FetchOffset fetchOffset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVTOrderFlagsType.FetchOffset target = null;
            target = (org.kopi.ebics.schema.h003.HVTOrderFlagsType.FetchOffset)get_store().find_attribute_user(FETCHOFFSET$4);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HVTOrderFlagsType.FetchOffset)get_store().add_attribute_user(FETCHOFFSET$4);
            }
            target.set(fetchOffset);
        }
    }
    
    /**
     * Unsets the "fetchOffset" attribute
     */
    public void unsetFetchOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FETCHOFFSET$4);
        }
    }
    /**
     * An XML fetchLimit(@).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.HVTOrderFlagsType$FetchLimit.
     */
    public static class FetchLimitImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements org.kopi.ebics.schema.h003.HVTOrderFlagsType.FetchLimit
    {
        private static final long serialVersionUID = 1L;
        
        public FetchLimitImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FetchLimitImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML fetchOffset(@).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.HVTOrderFlagsType$FetchOffset.
     */
    public static class FetchOffsetImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements org.kopi.ebics.schema.h003.HVTOrderFlagsType.FetchOffset
    {
        private static final long serialVersionUID = 1L;
        
        public FetchOffsetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FetchOffsetImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
