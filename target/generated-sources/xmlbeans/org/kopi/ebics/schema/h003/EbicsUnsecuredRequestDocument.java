/*
 * An XML document type.
 * Localname: ebicsUnsecuredRequest
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003;


/**
 * A document containing one ebicsUnsecuredRequest(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public interface EbicsUnsecuredRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EbicsUnsecuredRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("ebicsunsecuredrequestb60fdoctype");
    
    /**
     * Gets the "ebicsUnsecuredRequest" element
     */
    org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest getEbicsUnsecuredRequest();
    
    /**
     * Sets the "ebicsUnsecuredRequest" element
     */
    void setEbicsUnsecuredRequest(org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest ebicsUnsecuredRequest);
    
    /**
     * Appends and returns a new empty "ebicsUnsecuredRequest" element
     */
    org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest addNewEbicsUnsecuredRequest();
    
    /**
     * An XML ebicsUnsecuredRequest(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public interface EbicsUnsecuredRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EbicsUnsecuredRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("ebicsunsecuredrequestcf92elemtype");
        
        /**
         * Gets the "header" element
         */
        org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Header getHeader();
        
        /**
         * Sets the "header" element
         */
        void setHeader(org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Header header);
        
        /**
         * Appends and returns a new empty "header" element
         */
        org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Header addNewHeader();
        
        /**
         * Gets the "body" element
         */
        org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body getBody();
        
        /**
         * Sets the "body" element
         */
        void setBody(org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body body);
        
        /**
         * Appends and returns a new empty "body" element
         */
        org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body addNewBody();
        
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Header.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("header817belemtype");
            
            /**
             * Gets the "static" element
             */
            org.kopi.ebics.schema.h003.UnsecuredRequestStaticHeaderType getStatic();
            
            /**
             * Sets the "static" element
             */
            void setStatic(org.kopi.ebics.schema.h003.UnsecuredRequestStaticHeaderType xstatic);
            
            /**
             * Appends and returns a new empty "static" element
             */
            org.kopi.ebics.schema.h003.UnsecuredRequestStaticHeaderType addNewStatic();
            
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
                public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Header newInstance() {
                  return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Header) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Header newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Header) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Body.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("bodye050elemtype");
            
            /**
             * Gets the "DataTransfer" element
             */
            org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body.DataTransfer getDataTransfer();
            
            /**
             * Sets the "DataTransfer" element
             */
            void setDataTransfer(org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body.DataTransfer dataTransfer);
            
            /**
             * Appends and returns a new empty "DataTransfer" element
             */
            org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body.DataTransfer addNewDataTransfer();
            
            /**
             * An XML DataTransfer(@http://www.ebics.org/H003).
             *
             * This is a complex type.
             */
            public interface DataTransfer extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataTransfer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("datatransferfdffelemtype");
                
                /**
                 * Gets the "OrderData" element
                 */
                org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body.DataTransfer.OrderData getOrderData();
                
                /**
                 * Sets the "OrderData" element
                 */
                void setOrderData(org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body.DataTransfer.OrderData orderData);
                
                /**
                 * Appends and returns a new empty "OrderData" element
                 */
                org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body.DataTransfer.OrderData addNewOrderData();
                
                /**
                 * An XML OrderData(@http://www.ebics.org/H003).
                 *
                 * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument$EbicsUnsecuredRequest$Body$DataTransfer$OrderData.
                 */
                public interface OrderData extends org.kopi.ebics.schema.h003.OrderDataType
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrderData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("orderdata2463elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body.DataTransfer.OrderData newInstance() {
                        return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body.DataTransfer.OrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body.DataTransfer.OrderData newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body.DataTransfer.OrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body.DataTransfer newInstance() {
                      return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body.DataTransfer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body.DataTransfer newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body.DataTransfer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body newInstance() {
                  return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest newInstance() {
              return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument newInstance() {
          return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.EbicsUnsecuredRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
