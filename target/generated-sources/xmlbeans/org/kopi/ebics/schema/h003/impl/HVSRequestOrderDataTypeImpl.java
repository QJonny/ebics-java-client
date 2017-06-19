/*
 * XML Type:  HVSRequestOrderDataType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVSRequestOrderDataType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML HVSRequestOrderDataType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class HVSRequestOrderDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.HVSRequestOrderDataType
{
    private static final long serialVersionUID = 1L;
    
    public HVSRequestOrderDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANCELLEDDATADIGEST$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "CancelledDataDigest");
    
    
    /**
     * Gets the "CancelledDataDigest" element
     */
    public org.kopi.ebics.schema.h003.DataDigestType getCancelledDataDigest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.DataDigestType target = null;
            target = (org.kopi.ebics.schema.h003.DataDigestType)get_store().find_element_user(CANCELLEDDATADIGEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CancelledDataDigest" element
     */
    public void setCancelledDataDigest(org.kopi.ebics.schema.h003.DataDigestType cancelledDataDigest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.DataDigestType target = null;
            target = (org.kopi.ebics.schema.h003.DataDigestType)get_store().find_element_user(CANCELLEDDATADIGEST$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.DataDigestType)get_store().add_element_user(CANCELLEDDATADIGEST$0);
            }
            target.set(cancelledDataDigest);
        }
    }
    
    /**
     * Appends and returns a new empty "CancelledDataDigest" element
     */
    public org.kopi.ebics.schema.h003.DataDigestType addNewCancelledDataDigest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.DataDigestType target = null;
            target = (org.kopi.ebics.schema.h003.DataDigestType)get_store().add_element_user(CANCELLEDDATADIGEST$0);
            return target;
        }
    }
}
