/*
 * An XML document type.
 * Localname: ebicsUnsignedRequest
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003;


/**
 * A document containing one ebicsUnsignedRequest(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public interface EbicsUnsignedRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EbicsUnsignedRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("ebicsunsignedrequest3528doctype");
    
    /**
     * Gets the "ebicsUnsignedRequest" element
     */
    org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest getEbicsUnsignedRequest();
    
    /**
     * Sets the "ebicsUnsignedRequest" element
     */
    void setEbicsUnsignedRequest(org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest ebicsUnsignedRequest);
    
    /**
     * Appends and returns a new empty "ebicsUnsignedRequest" element
     */
    org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest addNewEbicsUnsignedRequest();
    
    /**
     * An XML ebicsUnsignedRequest(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public interface EbicsUnsignedRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EbicsUnsignedRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("ebicsunsignedrequestf26eelemtype");
        
        /**
         * Gets the "header" element
         */
        org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Header getHeader();
        
        /**
         * Sets the "header" element
         */
        void setHeader(org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Header header);
        
        /**
         * Appends and returns a new empty "header" element
         */
        org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Header addNewHeader();
        
        /**
         * Gets the "body" element
         */
        org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body getBody();
        
        /**
         * Sets the "body" element
         */
        void setBody(org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body body);
        
        /**
         * Appends and returns a new empty "body" element
         */
        org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body addNewBody();
        
        /**
         * Gets the "Version" attribute
         */
        java.lang.String getVersion();
        
        /**
         * Gets (as xml) the "Version" attribute
         */
        org.kopi.ebics.schema.h003.ProtocolVersionType xgetVersion();
        
        /**
         * Sets the "Version" attribute
         */
        void setVersion(java.lang.String version);
        
        /**
         * Sets (as xml) the "Version" attribute
         */
        void xsetVersion(org.kopi.ebics.schema.h003.ProtocolVersionType version);
        
        /**
         * Gets the "Revision" attribute
         */
        int getRevision();
        
        /**
         * Gets (as xml) the "Revision" attribute
         */
        org.kopi.ebics.schema.h003.ProtocolRevisionType xgetRevision();
        
        /**
         * True if has "Revision" attribute
         */
        boolean isSetRevision();
        
        /**
         * Sets the "Revision" attribute
         */
        void setRevision(int revision);
        
        /**
         * Sets (as xml) the "Revision" attribute
         */
        void xsetRevision(org.kopi.ebics.schema.h003.ProtocolRevisionType revision);
        
        /**
         * Unsets the "Revision" attribute
         */
        void unsetRevision();
        
        /**
         * An XML header(@http://www.ebics.org/H003).
         *
         * This is a complex type.
         */
        public interface Header extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Header.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("header0a97elemtype");
            
            /**
             * Gets the "static" element
             */
            org.kopi.ebics.schema.h003.UnsignedRequestStaticHeaderType getStatic();
            
            /**
             * Sets the "static" element
             */
            void setStatic(org.kopi.ebics.schema.h003.UnsignedRequestStaticHeaderType xstatic);
            
            /**
             * Appends and returns a new empty "static" element
             */
            org.kopi.ebics.schema.h003.UnsignedRequestStaticHeaderType addNewStatic();
            
            /**
             * Gets the "mutable" element
             */
            org.kopi.ebics.schema.h003.EmptyMutableHeaderType getMutable();
            
            /**
             * Sets the "mutable" element
             */
            void setMutable(org.kopi.ebics.schema.h003.EmptyMutableHeaderType mutable);
            
            /**
             * Appends and returns a new empty "mutable" element
             */
            org.kopi.ebics.schema.h003.EmptyMutableHeaderType addNewMutable();
            
            /**
             * Gets the "authenticate" attribute
             */
            boolean getAuthenticate();
            
            /**
             * Gets (as xml) the "authenticate" attribute
             */
            org.apache.xmlbeans.XmlBoolean xgetAuthenticate();
            
            /**
             * Sets the "authenticate" attribute
             */
            void setAuthenticate(boolean authenticate);
            
            /**
             * Sets (as xml) the "authenticate" attribute
             */
            void xsetAuthenticate(org.apache.xmlbeans.XmlBoolean authenticate);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Header newInstance() {
                  return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Header) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Header newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Header) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML body(@http://www.ebics.org/H003).
         *
         * This is a complex type.
         */
        public interface Body extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Body.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("body1aacelemtype");
            
            /**
             * Gets the "DataTransfer" element
             */
            org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer getDataTransfer();
            
            /**
             * Sets the "DataTransfer" element
             */
            void setDataTransfer(org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer dataTransfer);
            
            /**
             * Appends and returns a new empty "DataTransfer" element
             */
            org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer addNewDataTransfer();
            
            /**
             * An XML DataTransfer(@http://www.ebics.org/H003).
             *
             * This is a complex type.
             */
            public interface DataTransfer extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataTransfer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("datatransferd81belemtype");
                
                /**
                 * Gets the "SignatureData" element
                 */
                org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.SignatureData getSignatureData();
                
                /**
                 * Sets the "SignatureData" element
                 */
                void setSignatureData(org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.SignatureData signatureData);
                
                /**
                 * Appends and returns a new empty "SignatureData" element
                 */
                org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.SignatureData addNewSignatureData();
                
                /**
                 * Gets the "OrderData" element
                 */
                org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.OrderData getOrderData();
                
                /**
                 * Sets the "OrderData" element
                 */
                void setOrderData(org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.OrderData orderData);
                
                /**
                 * Appends and returns a new empty "OrderData" element
                 */
                org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.OrderData addNewOrderData();
                
                /**
                 * An XML SignatureData(@http://www.ebics.org/H003).
                 *
                 * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument$EbicsUnsignedRequest$Body$DataTransfer$SignatureData.
                 */
                public interface SignatureData extends org.kopi.ebics.schema.h003.SignatureDataType
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SignatureData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("signaturedataca69elemtype");
                    
                    /**
                     * Gets the "authenticate" attribute
                     */
                    boolean getAuthenticate();
                    
                    /**
                     * Gets (as xml) the "authenticate" attribute
                     */
                    org.apache.xmlbeans.XmlBoolean xgetAuthenticate();
                    
                    /**
                     * Sets the "authenticate" attribute
                     */
                    void setAuthenticate(boolean authenticate);
                    
                    /**
                     * Sets (as xml) the "authenticate" attribute
                     */
                    void xsetAuthenticate(org.apache.xmlbeans.XmlBoolean authenticate);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.SignatureData newInstance() {
                        return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.SignatureData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.SignatureData newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.SignatureData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML OrderData(@http://www.ebics.org/H003).
                 *
                 * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument$EbicsUnsignedRequest$Body$DataTransfer$OrderData.
                 */
                public interface OrderData extends org.kopi.ebics.schema.h003.OrderDataType
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrderData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("orderdata477felemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.OrderData newInstance() {
                        return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.OrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.OrderData newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer.OrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer newInstance() {
                      return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body.DataTransfer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body newInstance() {
                  return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest.Body) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest newInstance() {
              return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument.EbicsUnsignedRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument newInstance() {
          return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.EbicsUnsignedRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
