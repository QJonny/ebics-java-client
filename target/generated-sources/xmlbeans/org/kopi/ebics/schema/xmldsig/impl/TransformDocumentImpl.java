/*
 * An XML document type.
 * Localname: Transform
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.TransformDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * A document containing one Transform(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class TransformDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.TransformDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransformDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSFORM$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Transform");
    
    
    /**
     * Gets the "Transform" element
     */
    public org.kopi.ebics.schema.xmldsig.TransformType getTransform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.TransformType target = null;
            target = (org.kopi.ebics.schema.xmldsig.TransformType)get_store().find_element_user(TRANSFORM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Transform" element
     */
    public void setTransform(org.kopi.ebics.schema.xmldsig.TransformType transform)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.TransformType target = null;
            target = (org.kopi.ebics.schema.xmldsig.TransformType)get_store().find_element_user(TRANSFORM$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.xmldsig.TransformType)get_store().add_element_user(TRANSFORM$0);
            }
            target.set(transform);
        }
    }
    
    /**
     * Appends and returns a new empty "Transform" element
     */
    public org.kopi.ebics.schema.xmldsig.TransformType addNewTransform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.TransformType target = null;
            target = (org.kopi.ebics.schema.xmldsig.TransformType)get_store().add_element_user(TRANSFORM$0);
            return target;
        }
    }
}
