/*
 * XML Type:  UserPermissionType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.UserPermissionType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003;


/**
 * An XML UserPermissionType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public interface UserPermissionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UserPermissionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("userpermissiontype86eetype");
    
    /**
     * Gets the "OrderTypes" element
     */
    java.util.List getOrderTypes();
    
    /**
     * Gets (as xml) the "OrderTypes" element
     */
    org.kopi.ebics.schema.h003.OrderTListType xgetOrderTypes();
    
    /**
     * Sets the "OrderTypes" element
     */
    void setOrderTypes(java.util.List orderTypes);
    
    /**
     * Sets (as xml) the "OrderTypes" element
     */
    void xsetOrderTypes(org.kopi.ebics.schema.h003.OrderTListType orderTypes);
    
    /**
     * Gets the "AccountID" element
     */
    java.lang.String getAccountID();
    
    /**
     * Gets (as xml) the "AccountID" element
     */
    org.kopi.ebics.schema.h003.AccountIDType xgetAccountID();
    
    /**
     * True if has "AccountID" element
     */
    boolean isSetAccountID();
    
    /**
     * Sets the "AccountID" element
     */
    void setAccountID(java.lang.String accountID);
    
    /**
     * Sets (as xml) the "AccountID" element
     */
    void xsetAccountID(org.kopi.ebics.schema.h003.AccountIDType accountID);
    
    /**
     * Unsets the "AccountID" element
     */
    void unsetAccountID();
    
    /**
     * Gets the "MaxAmount" element
     */
    org.kopi.ebics.schema.h003.AmountType getMaxAmount();
    
    /**
     * True if has "MaxAmount" element
     */
    boolean isSetMaxAmount();
    
    /**
     * Sets the "MaxAmount" element
     */
    void setMaxAmount(org.kopi.ebics.schema.h003.AmountType maxAmount);
    
    /**
     * Appends and returns a new empty "MaxAmount" element
     */
    org.kopi.ebics.schema.h003.AmountType addNewMaxAmount();
    
    /**
     * Unsets the "MaxAmount" element
     */
    void unsetMaxAmount();
    
    /**
     * Gets the "AuthorisationLevel" attribute
     */
    org.kopi.ebics.schema.h003.AuthorisationLevelType.Enum getAuthorisationLevel();
    
    /**
     * Gets (as xml) the "AuthorisationLevel" attribute
     */
    org.kopi.ebics.schema.h003.AuthorisationLevelType xgetAuthorisationLevel();
    
    /**
     * True if has "AuthorisationLevel" attribute
     */
    boolean isSetAuthorisationLevel();
    
    /**
     * Sets the "AuthorisationLevel" attribute
     */
    void setAuthorisationLevel(org.kopi.ebics.schema.h003.AuthorisationLevelType.Enum authorisationLevel);
    
    /**
     * Sets (as xml) the "AuthorisationLevel" attribute
     */
    void xsetAuthorisationLevel(org.kopi.ebics.schema.h003.AuthorisationLevelType authorisationLevel);
    
    /**
     * Unsets the "AuthorisationLevel" attribute
     */
    void unsetAuthorisationLevel();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.kopi.ebics.schema.h003.UserPermissionType newInstance() {
          return (org.kopi.ebics.schema.h003.UserPermissionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.kopi.ebics.schema.h003.UserPermissionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.h003.UserPermissionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.h003.UserPermissionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.UserPermissionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.h003.UserPermissionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.UserPermissionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.h003.UserPermissionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.UserPermissionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.h003.UserPermissionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.UserPermissionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.h003.UserPermissionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.UserPermissionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.h003.UserPermissionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.UserPermissionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.h003.UserPermissionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.UserPermissionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.h003.UserPermissionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.UserPermissionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.h003.UserPermissionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.UserPermissionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.h003.UserPermissionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.UserPermissionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.h003.UserPermissionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.UserPermissionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.h003.UserPermissionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.UserPermissionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.h003.UserPermissionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.UserPermissionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.h003.UserPermissionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.UserPermissionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.UserPermissionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.UserPermissionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.UserPermissionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.UserPermissionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
