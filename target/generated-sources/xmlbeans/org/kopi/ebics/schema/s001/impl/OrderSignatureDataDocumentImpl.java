/*
 * An XML document type.
 * Localname: OrderSignatureData
 * Namespace: http://www.ebics.org/S001
 * Java type: org.kopi.ebics.schema.s001.OrderSignatureDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.s001.impl;
/**
 * A document containing one OrderSignatureData(@http://www.ebics.org/S001) element.
 *
 * This is a complex type.
 */
public class OrderSignatureDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.s001.OrderSignatureDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderSignatureDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERSIGNATUREDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/S001", "OrderSignatureData");
    
    
    /**
     * Gets the "OrderSignatureData" element
     */
    public org.kopi.ebics.schema.s001.OrderSignatureDataType getOrderSignatureData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.s001.OrderSignatureDataType target = null;
            target = (org.kopi.ebics.schema.s001.OrderSignatureDataType)get_store().find_element_user(ORDERSIGNATUREDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrderSignatureData" element
     */
    public void setOrderSignatureData(org.kopi.ebics.schema.s001.OrderSignatureDataType orderSignatureData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.s001.OrderSignatureDataType target = null;
            target = (org.kopi.ebics.schema.s001.OrderSignatureDataType)get_store().find_element_user(ORDERSIGNATUREDATA$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.s001.OrderSignatureDataType)get_store().add_element_user(ORDERSIGNATUREDATA$0);
            }
            target.set(orderSignatureData);
        }
    }
    
    /**
     * Appends and returns a new empty "OrderSignatureData" element
     */
    public org.kopi.ebics.schema.s001.OrderSignatureDataType addNewOrderSignatureData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.s001.OrderSignatureDataType target = null;
            target = (org.kopi.ebics.schema.s001.OrderSignatureDataType)get_store().add_element_user(ORDERSIGNATUREDATA$0);
            return target;
        }
    }
}
