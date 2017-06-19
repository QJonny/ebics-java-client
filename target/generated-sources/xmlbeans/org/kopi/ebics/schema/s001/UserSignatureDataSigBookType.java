/*
 * XML Type:  UserSignatureDataSigBookType
 * Namespace: http://www.ebics.org/S001
 * Java type: org.kopi.ebics.schema.s001.UserSignatureDataSigBookType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.s001;


/**
 * An XML UserSignatureDataSigBookType(@http://www.ebics.org/S001).
 *
 * This is a complex type.
 */
public interface UserSignatureDataSigBookType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UserSignatureDataSigBookType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("usersignaturedatasigbooktypeaeeatype");
    
    /**
     * Gets array of all "OrderSignature" elements
     */
    org.kopi.ebics.schema.s001.UserSignatureDataSigBookType.OrderSignature[] getOrderSignatureArray();
    
    /**
     * Gets ith "OrderSignature" element
     */
    org.kopi.ebics.schema.s001.UserSignatureDataSigBookType.OrderSignature getOrderSignatureArray(int i);
    
    /**
     * Returns number of "OrderSignature" element
     */
    int sizeOfOrderSignatureArray();
    
    /**
     * Sets array of all "OrderSignature" element
     */
    void setOrderSignatureArray(org.kopi.ebics.schema.s001.UserSignatureDataSigBookType.OrderSignature[] orderSignatureArray);
    
    /**
     * Sets ith "OrderSignature" element
     */
    void setOrderSignatureArray(int i, org.kopi.ebics.schema.s001.UserSignatureDataSigBookType.OrderSignature orderSignature);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrderSignature" element
     */
    org.kopi.ebics.schema.s001.UserSignatureDataSigBookType.OrderSignature insertNewOrderSignature(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrderSignature" element
     */
    org.kopi.ebics.schema.s001.UserSignatureDataSigBookType.OrderSignature addNewOrderSignature();
    
    /**
     * Removes the ith "OrderSignature" element
     */
    void removeOrderSignature(int i);
    
    /**
     * Gets array of all "OrderSignatureData" elements
     */
    org.kopi.ebics.schema.s001.OrderSignatureDataType[] getOrderSignatureDataArray();
    
    /**
     * Gets ith "OrderSignatureData" element
     */
    org.kopi.ebics.schema.s001.OrderSignatureDataType getOrderSignatureDataArray(int i);
    
    /**
     * Returns number of "OrderSignatureData" element
     */
    int sizeOfOrderSignatureDataArray();
    
    /**
     * Sets array of all "OrderSignatureData" element
     */
    void setOrderSignatureDataArray(org.kopi.ebics.schema.s001.OrderSignatureDataType[] orderSignatureDataArray);
    
    /**
     * Sets ith "OrderSignatureData" element
     */
    void setOrderSignatureDataArray(int i, org.kopi.ebics.schema.s001.OrderSignatureDataType orderSignatureData);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrderSignatureData" element
     */
    org.kopi.ebics.schema.s001.OrderSignatureDataType insertNewOrderSignatureData(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrderSignatureData" element
     */
    org.kopi.ebics.schema.s001.OrderSignatureDataType addNewOrderSignatureData();
    
    /**
     * Removes the ith "OrderSignatureData" element
     */
    void removeOrderSignatureData(int i);
    
    /**
     * An XML OrderSignature(@http://www.ebics.org/S001).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.s001.UserSignatureDataSigBookType$OrderSignature.
     */
    public interface OrderSignature extends org.kopi.ebics.schema.s001.OrderSignatureType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrderSignature.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("ordersignature7de4elemtype");
        
        /**
         * Gets the "PartnerID" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType getPartnerID();
        
        /**
         * Sets the "PartnerID" attribute
         */
        void setPartnerID(org.apache.xmlbeans.XmlAnySimpleType partnerID);
        
        /**
         * Appends and returns a new empty "PartnerID" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType addNewPartnerID();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType.OrderSignature newInstance() {
              return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType.OrderSignature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType.OrderSignature newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType.OrderSignature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType newInstance() {
          return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.s001.UserSignatureDataSigBookType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.s001.UserSignatureDataSigBookType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
