/*
 * XML Type:  StaticHeaderBaseType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.StaticHeaderBaseType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003;


/**
 * An XML StaticHeaderBaseType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public interface StaticHeaderBaseType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StaticHeaderBaseType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("staticheaderbasetype3940type");
    
    /**
     * Gets the "HostID" element
     */
    java.lang.String getHostID();
    
    /**
     * Gets (as xml) the "HostID" element
     */
    org.kopi.ebics.schema.h003.HostIDType xgetHostID();
    
    /**
     * Sets the "HostID" element
     */
    void setHostID(java.lang.String hostID);
    
    /**
     * Sets (as xml) the "HostID" element
     */
    void xsetHostID(org.kopi.ebics.schema.h003.HostIDType hostID);
    
    /**
     * Gets the "Nonce" element
     */
    byte[] getNonce();
    
    /**
     * Gets (as xml) the "Nonce" element
     */
    org.kopi.ebics.schema.h003.NonceType xgetNonce();
    
    /**
     * True if has "Nonce" element
     */
    boolean isSetNonce();
    
    /**
     * Sets the "Nonce" element
     */
    void setNonce(byte[] nonce);
    
    /**
     * Sets (as xml) the "Nonce" element
     */
    void xsetNonce(org.kopi.ebics.schema.h003.NonceType nonce);
    
    /**
     * Unsets the "Nonce" element
     */
    void unsetNonce();
    
    /**
     * Gets the "Timestamp" element
     */
    java.util.Calendar getTimestamp();
    
    /**
     * Gets (as xml) the "Timestamp" element
     */
    org.kopi.ebics.schema.h003.TimestampType xgetTimestamp();
    
    /**
     * True if has "Timestamp" element
     */
    boolean isSetTimestamp();
    
    /**
     * Sets the "Timestamp" element
     */
    void setTimestamp(java.util.Calendar timestamp);
    
    /**
     * Sets (as xml) the "Timestamp" element
     */
    void xsetTimestamp(org.kopi.ebics.schema.h003.TimestampType timestamp);
    
    /**
     * Unsets the "Timestamp" element
     */
    void unsetTimestamp();
    
    /**
     * Gets the "PartnerID" element
     */
    java.lang.String getPartnerID();
    
    /**
     * Gets (as xml) the "PartnerID" element
     */
    org.kopi.ebics.schema.h003.PartnerIDType xgetPartnerID();
    
    /**
     * Sets the "PartnerID" element
     */
    void setPartnerID(java.lang.String partnerID);
    
    /**
     * Sets (as xml) the "PartnerID" element
     */
    void xsetPartnerID(org.kopi.ebics.schema.h003.PartnerIDType partnerID);
    
    /**
     * Gets the "UserID" element
     */
    java.lang.String getUserID();
    
    /**
     * Gets (as xml) the "UserID" element
     */
    org.kopi.ebics.schema.h003.UserIDType xgetUserID();
    
    /**
     * Sets the "UserID" element
     */
    void setUserID(java.lang.String userID);
    
    /**
     * Sets (as xml) the "UserID" element
     */
    void xsetUserID(org.kopi.ebics.schema.h003.UserIDType userID);
    
    /**
     * Gets the "SystemID" element
     */
    java.lang.String getSystemID();
    
    /**
     * Gets (as xml) the "SystemID" element
     */
    org.kopi.ebics.schema.h003.UserIDType xgetSystemID();
    
    /**
     * True if has "SystemID" element
     */
    boolean isSetSystemID();
    
    /**
     * Sets the "SystemID" element
     */
    void setSystemID(java.lang.String systemID);
    
    /**
     * Sets (as xml) the "SystemID" element
     */
    void xsetSystemID(org.kopi.ebics.schema.h003.UserIDType systemID);
    
    /**
     * Unsets the "SystemID" element
     */
    void unsetSystemID();
    
    /**
     * Gets the "Product" element
     */
    org.kopi.ebics.schema.h003.ProductElementType getProduct();
    
    /**
     * Tests for nil "Product" element
     */
    boolean isNilProduct();
    
    /**
     * True if has "Product" element
     */
    boolean isSetProduct();
    
    /**
     * Sets the "Product" element
     */
    void setProduct(org.kopi.ebics.schema.h003.ProductElementType product);
    
    /**
     * Appends and returns a new empty "Product" element
     */
    org.kopi.ebics.schema.h003.ProductElementType addNewProduct();
    
    /**
     * Nils the "Product" element
     */
    void setNilProduct();
    
    /**
     * Unsets the "Product" element
     */
    void unsetProduct();
    
    /**
     * Gets the "OrderDetails" element
     */
    org.kopi.ebics.schema.h003.OrderDetailsType getOrderDetails();
    
    /**
     * Sets the "OrderDetails" element
     */
    void setOrderDetails(org.kopi.ebics.schema.h003.OrderDetailsType orderDetails);
    
    /**
     * Appends and returns a new empty "OrderDetails" element
     */
    org.kopi.ebics.schema.h003.OrderDetailsType addNewOrderDetails();
    
    /**
     * Gets the "SecurityMedium" element
     */
    java.lang.String getSecurityMedium();
    
    /**
     * Gets (as xml) the "SecurityMedium" element
     */
    org.kopi.ebics.schema.h003.SecurityMediumType xgetSecurityMedium();
    
    /**
     * Sets the "SecurityMedium" element
     */
    void setSecurityMedium(java.lang.String securityMedium);
    
    /**
     * Sets (as xml) the "SecurityMedium" element
     */
    void xsetSecurityMedium(org.kopi.ebics.schema.h003.SecurityMediumType securityMedium);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.kopi.ebics.schema.h003.StaticHeaderBaseType newInstance() {
          return (org.kopi.ebics.schema.h003.StaticHeaderBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.kopi.ebics.schema.h003.StaticHeaderBaseType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.h003.StaticHeaderBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.h003.StaticHeaderBaseType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.StaticHeaderBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderBaseType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.StaticHeaderBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.h003.StaticHeaderBaseType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.StaticHeaderBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderBaseType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.StaticHeaderBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderBaseType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.StaticHeaderBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderBaseType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.StaticHeaderBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderBaseType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.StaticHeaderBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderBaseType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.StaticHeaderBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderBaseType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.StaticHeaderBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderBaseType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.StaticHeaderBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderBaseType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.StaticHeaderBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderBaseType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.StaticHeaderBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderBaseType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.StaticHeaderBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderBaseType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.StaticHeaderBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.StaticHeaderBaseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.StaticHeaderBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.StaticHeaderBaseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.StaticHeaderBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
