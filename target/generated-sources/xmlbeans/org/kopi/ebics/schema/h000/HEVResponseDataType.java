/*
 * XML Type:  HEVResponseDataType
 * Namespace: http://www.ebics.org/H000
 * Java type: org.kopi.ebics.schema.h000.HEVResponseDataType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h000;


/**
 * An XML HEVResponseDataType(@http://www.ebics.org/H000).
 *
 * This is a complex type.
 */
public interface HEVResponseDataType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HEVResponseDataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("hevresponsedatatypee9c3type");
    
    /**
     * Gets the "SystemReturnCode" element
     */
    org.kopi.ebics.schema.h000.SystemReturnCodeType getSystemReturnCode();
    
    /**
     * Sets the "SystemReturnCode" element
     */
    void setSystemReturnCode(org.kopi.ebics.schema.h000.SystemReturnCodeType systemReturnCode);
    
    /**
     * Appends and returns a new empty "SystemReturnCode" element
     */
    org.kopi.ebics.schema.h000.SystemReturnCodeType addNewSystemReturnCode();
    
    /**
     * Gets array of all "VersionNumber" elements
     */
    org.kopi.ebics.schema.h000.HEVResponseDataType.VersionNumber[] getVersionNumberArray();
    
    /**
     * Gets ith "VersionNumber" element
     */
    org.kopi.ebics.schema.h000.HEVResponseDataType.VersionNumber getVersionNumberArray(int i);
    
    /**
     * Returns number of "VersionNumber" element
     */
    int sizeOfVersionNumberArray();
    
    /**
     * Sets array of all "VersionNumber" element
     */
    void setVersionNumberArray(org.kopi.ebics.schema.h000.HEVResponseDataType.VersionNumber[] versionNumberArray);
    
    /**
     * Sets ith "VersionNumber" element
     */
    void setVersionNumberArray(int i, org.kopi.ebics.schema.h000.HEVResponseDataType.VersionNumber versionNumber);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "VersionNumber" element
     */
    org.kopi.ebics.schema.h000.HEVResponseDataType.VersionNumber insertNewVersionNumber(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "VersionNumber" element
     */
    org.kopi.ebics.schema.h000.HEVResponseDataType.VersionNumber addNewVersionNumber();
    
    /**
     * Removes the ith "VersionNumber" element
     */
    void removeVersionNumber(int i);
    
    /**
     * An XML VersionNumber(@http://www.ebics.org/H000).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.h000.HEVResponseDataType$VersionNumber.
     */
    public interface VersionNumber extends org.kopi.ebics.schema.h000.VersionNumberType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VersionNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("versionnumber7c50elemtype");
        
        /**
         * Gets the "ProtocolVersion" attribute
         */
        java.lang.String getProtocolVersion();
        
        /**
         * Gets (as xml) the "ProtocolVersion" attribute
         */
        org.kopi.ebics.schema.h000.ProtocolVersionType xgetProtocolVersion();
        
        /**
         * Sets the "ProtocolVersion" attribute
         */
        void setProtocolVersion(java.lang.String protocolVersion);
        
        /**
         * Sets (as xml) the "ProtocolVersion" attribute
         */
        void xsetProtocolVersion(org.kopi.ebics.schema.h000.ProtocolVersionType protocolVersion);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.kopi.ebics.schema.h000.HEVResponseDataType.VersionNumber newInstance() {
              return (org.kopi.ebics.schema.h000.HEVResponseDataType.VersionNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.kopi.ebics.schema.h000.HEVResponseDataType.VersionNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.kopi.ebics.schema.h000.HEVResponseDataType.VersionNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.kopi.ebics.schema.h000.HEVResponseDataType newInstance() {
          return (org.kopi.ebics.schema.h000.HEVResponseDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.kopi.ebics.schema.h000.HEVResponseDataType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.h000.HEVResponseDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.h000.HEVResponseDataType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h000.HEVResponseDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.h000.HEVResponseDataType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h000.HEVResponseDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.h000.HEVResponseDataType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h000.HEVResponseDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.h000.HEVResponseDataType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h000.HEVResponseDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.h000.HEVResponseDataType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h000.HEVResponseDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.h000.HEVResponseDataType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h000.HEVResponseDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.h000.HEVResponseDataType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h000.HEVResponseDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.h000.HEVResponseDataType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h000.HEVResponseDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.h000.HEVResponseDataType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h000.HEVResponseDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.h000.HEVResponseDataType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h000.HEVResponseDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.h000.HEVResponseDataType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h000.HEVResponseDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.h000.HEVResponseDataType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h000.HEVResponseDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.h000.HEVResponseDataType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h000.HEVResponseDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.h000.HEVResponseDataType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h000.HEVResponseDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h000.HEVResponseDataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h000.HEVResponseDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h000.HEVResponseDataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h000.HEVResponseDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
