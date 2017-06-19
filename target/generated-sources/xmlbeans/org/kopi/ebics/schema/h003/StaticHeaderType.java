/*
 * XML Type:  StaticHeaderType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.StaticHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003;


/**
 * An XML StaticHeaderType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public interface StaticHeaderType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StaticHeaderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("staticheadertypeac0ftype");
    
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
     * True if has "PartnerID" element
     */
    boolean isSetPartnerID();
    
    /**
     * Sets the "PartnerID" element
     */
    void setPartnerID(java.lang.String partnerID);
    
    /**
     * Sets (as xml) the "PartnerID" element
     */
    void xsetPartnerID(org.kopi.ebics.schema.h003.PartnerIDType partnerID);
    
    /**
     * Unsets the "PartnerID" element
     */
    void unsetPartnerID();
    
    /**
     * Gets the "UserID" element
     */
    java.lang.String getUserID();
    
    /**
     * Gets (as xml) the "UserID" element
     */
    org.kopi.ebics.schema.h003.UserIDType xgetUserID();
    
    /**
     * True if has "UserID" element
     */
    boolean isSetUserID();
    
    /**
     * Sets the "UserID" element
     */
    void setUserID(java.lang.String userID);
    
    /**
     * Sets (as xml) the "UserID" element
     */
    void xsetUserID(org.kopi.ebics.schema.h003.UserIDType userID);
    
    /**
     * Unsets the "UserID" element
     */
    void unsetUserID();
    
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
    org.kopi.ebics.schema.h003.StaticHeaderType.Product getProduct();
    
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
    void setProduct(org.kopi.ebics.schema.h003.StaticHeaderType.Product product);
    
    /**
     * Appends and returns a new empty "Product" element
     */
    org.kopi.ebics.schema.h003.StaticHeaderType.Product addNewProduct();
    
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
    org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType getOrderDetails();
    
    /**
     * True if has "OrderDetails" element
     */
    boolean isSetOrderDetails();
    
    /**
     * Sets the "OrderDetails" element
     */
    void setOrderDetails(org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType orderDetails);
    
    /**
     * Appends and returns a new empty "OrderDetails" element
     */
    org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType addNewOrderDetails();
    
    /**
     * Unsets the "OrderDetails" element
     */
    void unsetOrderDetails();
    
    /**
     * Gets the "BankPubKeyDigests" element
     */
    org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests getBankPubKeyDigests();
    
    /**
     * True if has "BankPubKeyDigests" element
     */
    boolean isSetBankPubKeyDigests();
    
    /**
     * Sets the "BankPubKeyDigests" element
     */
    void setBankPubKeyDigests(org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests bankPubKeyDigests);
    
    /**
     * Appends and returns a new empty "BankPubKeyDigests" element
     */
    org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests addNewBankPubKeyDigests();
    
    /**
     * Unsets the "BankPubKeyDigests" element
     */
    void unsetBankPubKeyDigests();
    
    /**
     * Gets the "SecurityMedium" element
     */
    java.lang.String getSecurityMedium();
    
    /**
     * Gets (as xml) the "SecurityMedium" element
     */
    org.kopi.ebics.schema.h003.SecurityMediumType xgetSecurityMedium();
    
    /**
     * True if has "SecurityMedium" element
     */
    boolean isSetSecurityMedium();
    
    /**
     * Sets the "SecurityMedium" element
     */
    void setSecurityMedium(java.lang.String securityMedium);
    
    /**
     * Sets (as xml) the "SecurityMedium" element
     */
    void xsetSecurityMedium(org.kopi.ebics.schema.h003.SecurityMediumType securityMedium);
    
    /**
     * Unsets the "SecurityMedium" element
     */
    void unsetSecurityMedium();
    
    /**
     * Gets the "NumSegments" element
     */
    long getNumSegments();
    
    /**
     * Gets (as xml) the "NumSegments" element
     */
    org.kopi.ebics.schema.h003.NumSegmentsType xgetNumSegments();
    
    /**
     * True if has "NumSegments" element
     */
    boolean isSetNumSegments();
    
    /**
     * Sets the "NumSegments" element
     */
    void setNumSegments(long numSegments);
    
    /**
     * Sets (as xml) the "NumSegments" element
     */
    void xsetNumSegments(org.kopi.ebics.schema.h003.NumSegmentsType numSegments);
    
    /**
     * Unsets the "NumSegments" element
     */
    void unsetNumSegments();
    
    /**
     * Gets the "TransactionID" element
     */
    byte[] getTransactionID();
    
    /**
     * Gets (as xml) the "TransactionID" element
     */
    org.kopi.ebics.schema.h003.TransactionIDType xgetTransactionID();
    
    /**
     * True if has "TransactionID" element
     */
    boolean isSetTransactionID();
    
    /**
     * Sets the "TransactionID" element
     */
    void setTransactionID(byte[] transactionID);
    
    /**
     * Sets (as xml) the "TransactionID" element
     */
    void xsetTransactionID(org.kopi.ebics.schema.h003.TransactionIDType transactionID);
    
    /**
     * Unsets the "TransactionID" element
     */
    void unsetTransactionID();
    
    /**
     * An XML Product(@http://www.ebics.org/H003).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.StaticHeaderType$Product.
     */
    public interface Product extends org.kopi.ebics.schema.h003.ProductType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Product.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("producteeb4elemtype");
        
        /**
         * Gets the "Language" attribute
         */
        java.lang.String getLanguage();
        
        /**
         * Gets (as xml) the "Language" attribute
         */
        org.kopi.ebics.schema.h003.LanguageType xgetLanguage();
        
        /**
         * Sets the "Language" attribute
         */
        void setLanguage(java.lang.String language);
        
        /**
         * Sets (as xml) the "Language" attribute
         */
        void xsetLanguage(org.kopi.ebics.schema.h003.LanguageType language);
        
        /**
         * Gets the "InstituteID" attribute
         */
        java.lang.String getInstituteID();
        
        /**
         * Gets (as xml) the "InstituteID" attribute
         */
        org.kopi.ebics.schema.h003.InstituteIDType xgetInstituteID();
        
        /**
         * True if has "InstituteID" attribute
         */
        boolean isSetInstituteID();
        
        /**
         * Sets the "InstituteID" attribute
         */
        void setInstituteID(java.lang.String instituteID);
        
        /**
         * Sets (as xml) the "InstituteID" attribute
         */
        void xsetInstituteID(org.kopi.ebics.schema.h003.InstituteIDType instituteID);
        
        /**
         * Unsets the "InstituteID" attribute
         */
        void unsetInstituteID();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.kopi.ebics.schema.h003.StaticHeaderType.Product newInstance() {
              return (org.kopi.ebics.schema.h003.StaticHeaderType.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.kopi.ebics.schema.h003.StaticHeaderType.Product newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.kopi.ebics.schema.h003.StaticHeaderType.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML BankPubKeyDigests(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public interface BankPubKeyDigests extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BankPubKeyDigests.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("bankpubkeydigests5f12elemtype");
        
        /**
         * Gets the "Authentication" element
         */
        org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication getAuthentication();
        
        /**
         * Sets the "Authentication" element
         */
        void setAuthentication(org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication authentication);
        
        /**
         * Appends and returns a new empty "Authentication" element
         */
        org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication addNewAuthentication();
        
        /**
         * Gets the "Encryption" element
         */
        org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption getEncryption();
        
        /**
         * Sets the "Encryption" element
         */
        void setEncryption(org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption encryption);
        
        /**
         * Appends and returns a new empty "Encryption" element
         */
        org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption addNewEncryption();
        
        /**
         * An XML Authentication(@http://www.ebics.org/H003).
         *
         * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.StaticHeaderType$BankPubKeyDigests$Authentication.
         */
        public interface Authentication extends org.kopi.ebics.schema.h003.PubKeyDigestType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Authentication.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("authenticationd85eelemtype");
            
            /**
             * Gets the "Version" attribute
             */
            java.lang.String getVersion();
            
            /**
             * Gets (as xml) the "Version" attribute
             */
            org.kopi.ebics.schema.h003.AuthenticationVersionType xgetVersion();
            
            /**
             * Sets the "Version" attribute
             */
            void setVersion(java.lang.String version);
            
            /**
             * Sets (as xml) the "Version" attribute
             */
            void xsetVersion(org.kopi.ebics.schema.h003.AuthenticationVersionType version);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication newInstance() {
                  return (org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Encryption(@http://www.ebics.org/H003).
         *
         * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.StaticHeaderType$BankPubKeyDigests$Encryption.
         */
        public interface Encryption extends org.kopi.ebics.schema.h003.PubKeyDigestType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Encryption.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("encryption88b3elemtype");
            
            /**
             * Gets the "Version" attribute
             */
            java.lang.String getVersion();
            
            /**
             * Gets (as xml) the "Version" attribute
             */
            org.kopi.ebics.schema.h003.EncryptionVersionType xgetVersion();
            
            /**
             * Sets the "Version" attribute
             */
            void setVersion(java.lang.String version);
            
            /**
             * Sets (as xml) the "Version" attribute
             */
            void xsetVersion(org.kopi.ebics.schema.h003.EncryptionVersionType version);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption newInstance() {
                  return (org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests newInstance() {
              return (org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.kopi.ebics.schema.h003.StaticHeaderType newInstance() {
          return (org.kopi.ebics.schema.h003.StaticHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.h003.StaticHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.h003.StaticHeaderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.StaticHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.StaticHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.h003.StaticHeaderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.StaticHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.StaticHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.StaticHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.StaticHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.StaticHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.StaticHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.StaticHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.StaticHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.StaticHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.StaticHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.StaticHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.h003.StaticHeaderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.StaticHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.StaticHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.StaticHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.StaticHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.StaticHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
