/*
 * An XML document type.
 * Localname: ebicsUnsignedRequest
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one ebicsUnsignedRequest(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class EbicsUnsignedRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public EbicsUnsignedRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EBICSUNSIGNEDREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "ebicsUnsignedRequest");
    
    
    /**
     * Gets the "ebicsUnsignedRequest" element
     */
    public org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest getEbicsUnsignedRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest target = null;
            target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest)get_store().find_element_user(EBICSUNSIGNEDREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ebicsUnsignedRequest" element
     */
    public void setEbicsUnsignedRequest(org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest ebicsUnsignedRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest target = null;
            target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest)get_store().find_element_user(EBICSUNSIGNEDREQUEST$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest)get_store().add_element_user(EBICSUNSIGNEDREQUEST$0);
            }
            target.set(ebicsUnsignedRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ebicsUnsignedRequest" element
     */
    public org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest addNewEbicsUnsignedRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest target = null;
            target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest)get_store().add_element_user(EBICSUNSIGNEDREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ebicsUnsignedRequest(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public static class EbicsUnsignedRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest
    {
        private static final long serialVersionUID = 1L;
        
        public EbicsUnsignedRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADER$0 = 
            new javax.xml.namespace.QName("http://www.ebics.org/H003", "header");
        private static final javax.xml.namespace.QName BODY$2 = 
            new javax.xml.namespace.QName("http://www.ebics.org/H003", "body");
        private static final javax.xml.namespace.QName VERSION$4 = 
            new javax.xml.namespace.QName("", "Version");
        private static final javax.xml.namespace.QName REVISION$6 = 
            new javax.xml.namespace.QName("", "Revision");
        
        
        /**
         * Gets the "header" element
         */
        public org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Header getHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Header target = null;
                target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Header)get_store().find_element_user(HEADER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "header" element
         */
        public void setHeader(org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Header header)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Header target = null;
                target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Header)get_store().find_element_user(HEADER$0, 0);
                if (target == null)
                {
                    target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Header)get_store().add_element_user(HEADER$0);
                }
                target.set(header);
            }
        }
        
        /**
         * Appends and returns a new empty "header" element
         */
        public org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Header addNewHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Header target = null;
                target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Header)get_store().add_element_user(HEADER$0);
                return target;
            }
        }
        
        /**
         * Gets the "body" element
         */
        public org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body getBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body target = null;
                target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body)get_store().find_element_user(BODY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "body" element
         */
        public void setBody(org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body body)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body target = null;
                target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body)get_store().find_element_user(BODY$2, 0);
                if (target == null)
                {
                    target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body)get_store().add_element_user(BODY$2);
                }
                target.set(body);
            }
        }
        
        /**
         * Appends and returns a new empty "body" element
         */
        public org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body addNewBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body target = null;
                target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body)get_store().add_element_user(BODY$2);
                return target;
            }
        }
        
        /**
         * Gets the "Version" attribute
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Version" attribute
         */
        public org.kopi.ebics.schema.h003.ProtocolVersionType xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.ProtocolVersionType target = null;
                target = (org.kopi.ebics.schema.h003.ProtocolVersionType)get_store().find_attribute_user(VERSION$4);
                return target;
            }
        }
        
        /**
         * Sets the "Version" attribute
         */
        public void setVersion(java.lang.String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$4);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "Version" attribute
         */
        public void xsetVersion(org.kopi.ebics.schema.h003.ProtocolVersionType version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.ProtocolVersionType target = null;
                target = (org.kopi.ebics.schema.h003.ProtocolVersionType)get_store().find_attribute_user(VERSION$4);
                if (target == null)
                {
                    target = (org.kopi.ebics.schema.h003.ProtocolVersionType)get_store().add_attribute_user(VERSION$4);
                }
                target.set(version);
            }
        }
        
        /**
         * Gets the "Revision" attribute
         */
        public int getRevision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REVISION$6);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Revision" attribute
         */
        public org.kopi.ebics.schema.h003.ProtocolRevisionType xgetRevision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.ProtocolRevisionType target = null;
                target = (org.kopi.ebics.schema.h003.ProtocolRevisionType)get_store().find_attribute_user(REVISION$6);
                return target;
            }
        }
        
        /**
         * True if has "Revision" attribute
         */
        public boolean isSetRevision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REVISION$6) != null;
            }
        }
        
        /**
         * Sets the "Revision" attribute
         */
        public void setRevision(int revision)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REVISION$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REVISION$6);
                }
                target.setIntValue(revision);
            }
        }
        
        /**
         * Sets (as xml) the "Revision" attribute
         */
        public void xsetRevision(org.kopi.ebics.schema.h003.ProtocolRevisionType revision)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.ProtocolRevisionType target = null;
                target = (org.kopi.ebics.schema.h003.ProtocolRevisionType)get_store().find_attribute_user(REVISION$6);
                if (target == null)
                {
                    target = (org.kopi.ebics.schema.h003.ProtocolRevisionType)get_store().add_attribute_user(REVISION$6);
                }
                target.set(revision);
            }
        }
        
        /**
         * Unsets the "Revision" attribute
         */
        public void unsetRevision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REVISION$6);
            }
        }
        /**
         * An XML header(@http://www.ebics.org/H003).
         *
         * This is a complex type.
         */
        public static class HeaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Header
        {
            private static final long serialVersionUID = 1L;
            
            public HeaderImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName STATIC$0 = 
                new javax.xml.namespace.QName("http://www.ebics.org/H003", "static");
            private static final javax.xml.namespace.QName MUTABLE$2 = 
                new javax.xml.namespace.QName("http://www.ebics.org/H003", "mutable");
            private static final javax.xml.namespace.QName AUTHENTICATE$4 = 
                new javax.xml.namespace.QName("", "authenticate");
            
            
            /**
             * Gets the "static" element
             */
            public org.kopi.ebics.schema.h003.UnsignedRequestStaticHeaderType getStatic()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.UnsignedRequestStaticHeaderType target = null;
                    target = (org.kopi.ebics.schema.h003.UnsignedRequestStaticHeaderType)get_store().find_element_user(STATIC$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "static" element
             */
            public void setStatic(org.kopi.ebics.schema.h003.UnsignedRequestStaticHeaderType xstatic)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.UnsignedRequestStaticHeaderType target = null;
                    target = (org.kopi.ebics.schema.h003.UnsignedRequestStaticHeaderType)get_store().find_element_user(STATIC$0, 0);
                    if (target == null)
                    {
                      target = (org.kopi.ebics.schema.h003.UnsignedRequestStaticHeaderType)get_store().add_element_user(STATIC$0);
                    }
                    target.set(xstatic);
                }
            }
            
            /**
             * Appends and returns a new empty "static" element
             */
            public org.kopi.ebics.schema.h003.UnsignedRequestStaticHeaderType addNewStatic()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.UnsignedRequestStaticHeaderType target = null;
                    target = (org.kopi.ebics.schema.h003.UnsignedRequestStaticHeaderType)get_store().add_element_user(STATIC$0);
                    return target;
                }
            }
            
            /**
             * Gets the "mutable" element
             */
            public org.kopi.ebics.schema.h003.EmptyMutableHeaderType getMutable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.EmptyMutableHeaderType target = null;
                    target = (org.kopi.ebics.schema.h003.EmptyMutableHeaderType)get_store().find_element_user(MUTABLE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "mutable" element
             */
            public void setMutable(org.kopi.ebics.schema.h003.EmptyMutableHeaderType mutable)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.EmptyMutableHeaderType target = null;
                    target = (org.kopi.ebics.schema.h003.EmptyMutableHeaderType)get_store().find_element_user(MUTABLE$2, 0);
                    if (target == null)
                    {
                      target = (org.kopi.ebics.schema.h003.EmptyMutableHeaderType)get_store().add_element_user(MUTABLE$2);
                    }
                    target.set(mutable);
                }
            }
            
            /**
             * Appends and returns a new empty "mutable" element
             */
            public org.kopi.ebics.schema.h003.EmptyMutableHeaderType addNewMutable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.EmptyMutableHeaderType target = null;
                    target = (org.kopi.ebics.schema.h003.EmptyMutableHeaderType)get_store().add_element_user(MUTABLE$2);
                    return target;
                }
            }
            
            /**
             * Gets the "authenticate" attribute
             */
            public boolean getAuthenticate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHENTICATE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTHENTICATE$4);
                    }
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "authenticate" attribute
             */
            public org.apache.xmlbeans.XmlBoolean xgetAuthenticate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTHENTICATE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTHENTICATE$4);
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "authenticate" attribute
             */
            public void setAuthenticate(boolean authenticate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHENTICATE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTHENTICATE$4);
                    }
                    target.setBooleanValue(authenticate);
                }
            }
            
            /**
             * Sets (as xml) the "authenticate" attribute
             */
            public void xsetAuthenticate(org.apache.xmlbeans.XmlBoolean authenticate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTHENTICATE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTHENTICATE$4);
                    }
                    target.set(authenticate);
                }
            }
        }
        /**
         * An XML body(@http://www.ebics.org/H003).
         *
         * This is a complex type.
         */
        public static class BodyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body
        {
            private static final long serialVersionUID = 1L;
            
            public BodyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DATATRANSFER$0 = 
                new javax.xml.namespace.QName("http://www.ebics.org/H003", "DataTransfer");
            
            
            /**
             * Gets the "DataTransfer" element
             */
            public org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer getDataTransfer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer target = null;
                    target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer)get_store().find_element_user(DATATRANSFER$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "DataTransfer" element
             */
            public void setDataTransfer(org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer dataTransfer)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer target = null;
                    target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer)get_store().find_element_user(DATATRANSFER$0, 0);
                    if (target == null)
                    {
                      target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer)get_store().add_element_user(DATATRANSFER$0);
                    }
                    target.set(dataTransfer);
                }
            }
            
            /**
             * Appends and returns a new empty "DataTransfer" element
             */
            public org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer addNewDataTransfer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer target = null;
                    target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer)get_store().add_element_user(DATATRANSFER$0);
                    return target;
                }
            }
            /**
             * An XML DataTransfer(@http://www.ebics.org/H003).
             *
             * This is a complex type.
             */
            public static class DataTransferImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer
            {
                private static final long serialVersionUID = 1L;
                
                public DataTransferImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName SIGNATUREDATA$0 = 
                    new javax.xml.namespace.QName("http://www.ebics.org/H003", "SignatureData");
                private static final javax.xml.namespace.QName ORDERDATA$2 = 
                    new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderData");
                
                
                /**
                 * Gets the "SignatureData" element
                 */
                public org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.SignatureData getSignatureData()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.SignatureData target = null;
                      target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.SignatureData)get_store().find_element_user(SIGNATUREDATA$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "SignatureData" element
                 */
                public void setSignatureData(org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.SignatureData signatureData)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.SignatureData target = null;
                      target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.SignatureData)get_store().find_element_user(SIGNATUREDATA$0, 0);
                      if (target == null)
                      {
                        target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.SignatureData)get_store().add_element_user(SIGNATUREDATA$0);
                      }
                      target.set(signatureData);
                    }
                }
                
                /**
                 * Appends and returns a new empty "SignatureData" element
                 */
                public org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.SignatureData addNewSignatureData()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.SignatureData target = null;
                      target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.SignatureData)get_store().add_element_user(SIGNATUREDATA$0);
                      return target;
                    }
                }
                
                /**
                 * Gets the "OrderData" element
                 */
                public org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.OrderData getOrderData()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.OrderData target = null;
                      target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.OrderData)get_store().find_element_user(ORDERDATA$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "OrderData" element
                 */
                public void setOrderData(org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.OrderData orderData)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.OrderData target = null;
                      target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.OrderData)get_store().find_element_user(ORDERDATA$2, 0);
                      if (target == null)
                      {
                        target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.OrderData)get_store().add_element_user(ORDERDATA$2);
                      }
                      target.set(orderData);
                    }
                }
                
                /**
                 * Appends and returns a new empty "OrderData" element
                 */
                public org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.OrderData addNewOrderData()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.OrderData target = null;
                      target = (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.OrderData)get_store().add_element_user(ORDERDATA$2);
                      return target;
                    }
                }
                /**
                 * An XML SignatureData(@http://www.ebics.org/H003).
                 *
                 * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument$EbicsUnsignedRequest$Body$DataTransfer$SignatureData.
                 */
                public static class SignatureDataImpl extends org.apache.xmlbeans.impl.values.JavaBase64HolderEx implements org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.SignatureData
                {
                    private static final long serialVersionUID = 1L;
                    
                    public SignatureDataImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, true);
                    }
                    
                    protected SignatureDataImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                    
                    private static final javax.xml.namespace.QName AUTHENTICATE$0 = 
                      new javax.xml.namespace.QName("", "authenticate");
                    
                    
                    /**
                     * Gets the "authenticate" attribute
                     */
                    public boolean getAuthenticate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHENTICATE$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTHENTICATE$0);
                        }
                        if (target == null)
                        {
                          return false;
                        }
                        return target.getBooleanValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "authenticate" attribute
                     */
                    public org.apache.xmlbeans.XmlBoolean xgetAuthenticate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlBoolean target = null;
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTHENTICATE$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTHENTICATE$0);
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "authenticate" attribute
                     */
                    public void setAuthenticate(boolean authenticate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHENTICATE$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTHENTICATE$0);
                        }
                        target.setBooleanValue(authenticate);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "authenticate" attribute
                     */
                    public void xsetAuthenticate(org.apache.xmlbeans.XmlBoolean authenticate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlBoolean target = null;
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTHENTICATE$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTHENTICATE$0);
                        }
                        target.set(authenticate);
                      }
                    }
                }
                /**
                 * An XML OrderData(@http://www.ebics.org/H003).
                 *
                 * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument$EbicsUnsignedRequest$Body$DataTransfer$OrderData.
                 */
                public static class OrderDataImpl extends org.apache.xmlbeans.impl.values.JavaBase64HolderEx implements org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.OrderData
                {
                    private static final long serialVersionUID = 1L;
                    
                    public OrderDataImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, true);
                    }
                    
                    protected OrderDataImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                    
                    
                }
            }
        }
    }
}
