/*
 * An XML document type.
 * Localname: Transforms
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.TransformsDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * A document containing one Transforms(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class TransformsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.TransformsDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransformsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSFORMS$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Transforms");
    
    
    /**
     * Gets the "Transforms" element
     */
    public org.kopi.ebics.schema.xmldsig.TransformsType getTransforms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.TransformsType target = null;
            target = (org.kopi.ebics.schema.xmldsig.TransformsType)get_store().find_element_user(TRANSFORMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Transforms" element
     */
    public void setTransforms(org.kopi.ebics.schema.xmldsig.TransformsType transforms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.TransformsType target = null;
            target = (org.kopi.ebics.schema.xmldsig.TransformsType)get_store().find_element_user(TRANSFORMS$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.xmldsig.TransformsType)get_store().add_element_user(TRANSFORMS$0);
            }
            target.set(transforms);
        }
    }
    
    /**
     * Appends and returns a new empty "Transforms" element
     */
    public org.kopi.ebics.schema.xmldsig.TransformsType addNewTransforms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.TransformsType target = null;
            target = (org.kopi.ebics.schema.xmldsig.TransformsType)get_store().add_element_user(TRANSFORMS$0);
            return target;
        }
    }
}
