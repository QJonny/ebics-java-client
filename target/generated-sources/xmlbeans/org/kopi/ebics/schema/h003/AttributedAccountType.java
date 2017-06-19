/*
 * XML Type:  AttributedAccountType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.AttributedAccountType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003;


/**
 * An XML AttributedAccountType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public interface AttributedAccountType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AttributedAccountType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("attributedaccounttype2ac7type");
    
    /**
     * Gets array of all "AccountNumber" elements
     */
    org.kopi.ebics.schema.h003.AttributedAccountType.AccountNumber[] getAccountNumberArray();
    
    /**
     * Gets ith "AccountNumber" element
     */
    org.kopi.ebics.schema.h003.AttributedAccountType.AccountNumber getAccountNumberArray(int i);
    
    /**
     * Returns number of "AccountNumber" element
     */
    int sizeOfAccountNumberArray();
    
    /**
     * Sets array of all "AccountNumber" element
     */
    void setAccountNumberArray(org.kopi.ebics.schema.h003.AttributedAccountType.AccountNumber[] accountNumberArray);
    
    /**
     * Sets ith "AccountNumber" element
     */
    void setAccountNumberArray(int i, org.kopi.ebics.schema.h003.AttributedAccountType.AccountNumber accountNumber);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AccountNumber" element
     */
    org.kopi.ebics.schema.h003.AttributedAccountType.AccountNumber insertNewAccountNumber(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AccountNumber" element
     */
    org.kopi.ebics.schema.h003.AttributedAccountType.AccountNumber addNewAccountNumber();
    
    /**
     * Removes the ith "AccountNumber" element
     */
    void removeAccountNumber(int i);
    
    /**
     * Gets array of all "NationalAccountNumber" elements
     */
    org.kopi.ebics.schema.h003.AttributedAccountType.NationalAccountNumber[] getNationalAccountNumberArray();
    
    /**
     * Gets ith "NationalAccountNumber" element
     */
    org.kopi.ebics.schema.h003.AttributedAccountType.NationalAccountNumber getNationalAccountNumberArray(int i);
    
    /**
     * Returns number of "NationalAccountNumber" element
     */
    int sizeOfNationalAccountNumberArray();
    
    /**
     * Sets array of all "NationalAccountNumber" element
     */
    void setNationalAccountNumberArray(org.kopi.ebics.schema.h003.AttributedAccountType.NationalAccountNumber[] nationalAccountNumberArray);
    
    /**
     * Sets ith "NationalAccountNumber" element
     */
    void setNationalAccountNumberArray(int i, org.kopi.ebics.schema.h003.AttributedAccountType.NationalAccountNumber nationalAccountNumber);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NationalAccountNumber" element
     */
    org.kopi.ebics.schema.h003.AttributedAccountType.NationalAccountNumber insertNewNationalAccountNumber(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NationalAccountNumber" element
     */
    org.kopi.ebics.schema.h003.AttributedAccountType.NationalAccountNumber addNewNationalAccountNumber();
    
    /**
     * Removes the ith "NationalAccountNumber" element
     */
    void removeNationalAccountNumber(int i);
    
    /**
     * Gets array of all "BankCode" elements
     */
    org.kopi.ebics.schema.h003.AttributedAccountType.BankCode[] getBankCodeArray();
    
    /**
     * Gets ith "BankCode" element
     */
    org.kopi.ebics.schema.h003.AttributedAccountType.BankCode getBankCodeArray(int i);
    
    /**
     * Returns number of "BankCode" element
     */
    int sizeOfBankCodeArray();
    
    /**
     * Sets array of all "BankCode" element
     */
    void setBankCodeArray(org.kopi.ebics.schema.h003.AttributedAccountType.BankCode[] bankCodeArray);
    
    /**
     * Sets ith "BankCode" element
     */
    void setBankCodeArray(int i, org.kopi.ebics.schema.h003.AttributedAccountType.BankCode bankCode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BankCode" element
     */
    org.kopi.ebics.schema.h003.AttributedAccountType.BankCode insertNewBankCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BankCode" element
     */
    org.kopi.ebics.schema.h003.AttributedAccountType.BankCode addNewBankCode();
    
    /**
     * Removes the ith "BankCode" element
     */
    void removeBankCode(int i);
    
    /**
     * Gets array of all "NationalBankCode" elements
     */
    org.kopi.ebics.schema.h003.AttributedAccountType.NationalBankCode[] getNationalBankCodeArray();
    
    /**
     * Gets ith "NationalBankCode" element
     */
    org.kopi.ebics.schema.h003.AttributedAccountType.NationalBankCode getNationalBankCodeArray(int i);
    
    /**
     * Returns number of "NationalBankCode" element
     */
    int sizeOfNationalBankCodeArray();
    
    /**
     * Sets array of all "NationalBankCode" element
     */
    void setNationalBankCodeArray(org.kopi.ebics.schema.h003.AttributedAccountType.NationalBankCode[] nationalBankCodeArray);
    
    /**
     * Sets ith "NationalBankCode" element
     */
    void setNationalBankCodeArray(int i, org.kopi.ebics.schema.h003.AttributedAccountType.NationalBankCode nationalBankCode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NationalBankCode" element
     */
    org.kopi.ebics.schema.h003.AttributedAccountType.NationalBankCode insertNewNationalBankCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NationalBankCode" element
     */
    org.kopi.ebics.schema.h003.AttributedAccountType.NationalBankCode addNewNationalBankCode();
    
    /**
     * Removes the ith "NationalBankCode" element
     */
    void removeNationalBankCode(int i);
    
    /**
     * Gets the "AccountHolder" element
     */
    org.kopi.ebics.schema.h003.AttributedAccountType.AccountHolder getAccountHolder();
    
    /**
     * True if has "AccountHolder" element
     */
    boolean isSetAccountHolder();
    
    /**
     * Sets the "AccountHolder" element
     */
    void setAccountHolder(org.kopi.ebics.schema.h003.AttributedAccountType.AccountHolder accountHolder);
    
    /**
     * Appends and returns a new empty "AccountHolder" element
     */
    org.kopi.ebics.schema.h003.AttributedAccountType.AccountHolder addNewAccountHolder();
    
    /**
     * Unsets the "AccountHolder" element
     */
    void unsetAccountHolder();
    
    /**
     * Gets the "Currency" attribute
     */
    java.lang.String getCurrency();
    
    /**
     * Gets (as xml) the "Currency" attribute
     */
    org.kopi.ebics.schema.h003.CurrencyBaseType xgetCurrency();
    
    /**
     * True if has "Currency" attribute
     */
    boolean isSetCurrency();
    
    /**
     * Sets the "Currency" attribute
     */
    void setCurrency(java.lang.String currency);
    
    /**
     * Sets (as xml) the "Currency" attribute
     */
    void xsetCurrency(org.kopi.ebics.schema.h003.CurrencyBaseType currency);
    
    /**
     * Unsets the "Currency" attribute
     */
    void unsetCurrency();
    
    /**
     * Gets the "Description" attribute
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "Description" attribute
     */
    org.kopi.ebics.schema.h003.AccountDescriptionType xgetDescription();
    
    /**
     * True if has "Description" attribute
     */
    boolean isSetDescription();
    
    /**
     * Sets the "Description" attribute
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "Description" attribute
     */
    void xsetDescription(org.kopi.ebics.schema.h003.AccountDescriptionType description);
    
    /**
     * Unsets the "Description" attribute
     */
    void unsetDescription();
    
    /**
     * An XML AccountNumber(@http://www.ebics.org/H003).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.AttributedAccountType$AccountNumber.
     */
    public interface AccountNumber extends org.kopi.ebics.schema.h003.AccountNumberType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AccountNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("accountnumberb869elemtype");
        
        /**
         * Gets the "Role" attribute
         */
        org.kopi.ebics.schema.h003.AccountNumberRoleType.Enum getRole();
        
        /**
         * Gets (as xml) the "Role" attribute
         */
        org.kopi.ebics.schema.h003.AccountNumberRoleType xgetRole();
        
        /**
         * Sets the "Role" attribute
         */
        void setRole(org.kopi.ebics.schema.h003.AccountNumberRoleType.Enum role);
        
        /**
         * Sets (as xml) the "Role" attribute
         */
        void xsetRole(org.kopi.ebics.schema.h003.AccountNumberRoleType role);
        
        /**
         * Gets the "Description" attribute
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "Description" attribute
         */
        org.apache.xmlbeans.XmlNormalizedString xgetDescription();
        
        /**
         * True if has "Description" attribute
         */
        boolean isSetDescription();
        
        /**
         * Sets the "Description" attribute
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "Description" attribute
         */
        void xsetDescription(org.apache.xmlbeans.XmlNormalizedString description);
        
        /**
         * Unsets the "Description" attribute
         */
        void unsetDescription();
        
        /**
         * Gets the "international" attribute
         */
        boolean getInternational();
        
        /**
         * Gets (as xml) the "international" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetInternational();
        
        /**
         * True if has "international" attribute
         */
        boolean isSetInternational();
        
        /**
         * Sets the "international" attribute
         */
        void setInternational(boolean international);
        
        /**
         * Sets (as xml) the "international" attribute
         */
        void xsetInternational(org.apache.xmlbeans.XmlBoolean international);
        
        /**
         * Unsets the "international" attribute
         */
        void unsetInternational();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.kopi.ebics.schema.h003.AttributedAccountType.AccountNumber newInstance() {
              return (org.kopi.ebics.schema.h003.AttributedAccountType.AccountNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.kopi.ebics.schema.h003.AttributedAccountType.AccountNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.kopi.ebics.schema.h003.AttributedAccountType.AccountNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML NationalAccountNumber(@http://www.ebics.org/H003).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.AttributedAccountType$NationalAccountNumber.
     */
    public interface NationalAccountNumber extends org.kopi.ebics.schema.h003.NationalAccountNumberType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NationalAccountNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("nationalaccountnumberd457elemtype");
        
        /**
         * Gets the "Role" attribute
         */
        org.kopi.ebics.schema.h003.AccountNumberRoleType.Enum getRole();
        
        /**
         * Gets (as xml) the "Role" attribute
         */
        org.kopi.ebics.schema.h003.AccountNumberRoleType xgetRole();
        
        /**
         * Sets the "Role" attribute
         */
        void setRole(org.kopi.ebics.schema.h003.AccountNumberRoleType.Enum role);
        
        /**
         * Sets (as xml) the "Role" attribute
         */
        void xsetRole(org.kopi.ebics.schema.h003.AccountNumberRoleType role);
        
        /**
         * Gets the "Description" attribute
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "Description" attribute
         */
        org.apache.xmlbeans.XmlNormalizedString xgetDescription();
        
        /**
         * True if has "Description" attribute
         */
        boolean isSetDescription();
        
        /**
         * Sets the "Description" attribute
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "Description" attribute
         */
        void xsetDescription(org.apache.xmlbeans.XmlNormalizedString description);
        
        /**
         * Unsets the "Description" attribute
         */
        void unsetDescription();
        
        /**
         * Gets the "format" attribute
         */
        java.lang.String getFormat();
        
        /**
         * Gets (as xml) the "format" attribute
         */
        org.apache.xmlbeans.XmlToken xgetFormat();
        
        /**
         * Sets the "format" attribute
         */
        void setFormat(java.lang.String format);
        
        /**
         * Sets (as xml) the "format" attribute
         */
        void xsetFormat(org.apache.xmlbeans.XmlToken format);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.kopi.ebics.schema.h003.AttributedAccountType.NationalAccountNumber newInstance() {
              return (org.kopi.ebics.schema.h003.AttributedAccountType.NationalAccountNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.kopi.ebics.schema.h003.AttributedAccountType.NationalAccountNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.kopi.ebics.schema.h003.AttributedAccountType.NationalAccountNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML BankCode(@http://www.ebics.org/H003).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.AttributedAccountType$BankCode.
     */
    public interface BankCode extends org.kopi.ebics.schema.h003.BankCodeType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BankCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("bankcodefe8celemtype");
        
        /**
         * Gets the "Role" attribute
         */
        org.kopi.ebics.schema.h003.BankCodeRoleType.Enum getRole();
        
        /**
         * Gets (as xml) the "Role" attribute
         */
        org.kopi.ebics.schema.h003.BankCodeRoleType xgetRole();
        
        /**
         * Sets the "Role" attribute
         */
        void setRole(org.kopi.ebics.schema.h003.BankCodeRoleType.Enum role);
        
        /**
         * Sets (as xml) the "Role" attribute
         */
        void xsetRole(org.kopi.ebics.schema.h003.BankCodeRoleType role);
        
        /**
         * Gets the "Description" attribute
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "Description" attribute
         */
        org.apache.xmlbeans.XmlNormalizedString xgetDescription();
        
        /**
         * True if has "Description" attribute
         */
        boolean isSetDescription();
        
        /**
         * Sets the "Description" attribute
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "Description" attribute
         */
        void xsetDescription(org.apache.xmlbeans.XmlNormalizedString description);
        
        /**
         * Unsets the "Description" attribute
         */
        void unsetDescription();
        
        /**
         * Gets the "international" attribute
         */
        boolean getInternational();
        
        /**
         * Gets (as xml) the "international" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetInternational();
        
        /**
         * True if has "international" attribute
         */
        boolean isSetInternational();
        
        /**
         * Sets the "international" attribute
         */
        void setInternational(boolean international);
        
        /**
         * Sets (as xml) the "international" attribute
         */
        void xsetInternational(org.apache.xmlbeans.XmlBoolean international);
        
        /**
         * Unsets the "international" attribute
         */
        void unsetInternational();
        
        /**
         * Gets the "Prefix" attribute
         */
        java.lang.String getPrefix();
        
        /**
         * Gets (as xml) the "Prefix" attribute
         */
        org.kopi.ebics.schema.h003.BankCodePrefixType xgetPrefix();
        
        /**
         * True if has "Prefix" attribute
         */
        boolean isSetPrefix();
        
        /**
         * Sets the "Prefix" attribute
         */
        void setPrefix(java.lang.String prefix);
        
        /**
         * Sets (as xml) the "Prefix" attribute
         */
        void xsetPrefix(org.kopi.ebics.schema.h003.BankCodePrefixType prefix);
        
        /**
         * Unsets the "Prefix" attribute
         */
        void unsetPrefix();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.kopi.ebics.schema.h003.AttributedAccountType.BankCode newInstance() {
              return (org.kopi.ebics.schema.h003.AttributedAccountType.BankCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.kopi.ebics.schema.h003.AttributedAccountType.BankCode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.kopi.ebics.schema.h003.AttributedAccountType.BankCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML NationalBankCode(@http://www.ebics.org/H003).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.AttributedAccountType$NationalBankCode.
     */
    public interface NationalBankCode extends org.kopi.ebics.schema.h003.NationalBankCodeType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NationalBankCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("nationalbankcodea5deelemtype");
        
        /**
         * Gets the "Role" attribute
         */
        org.kopi.ebics.schema.h003.BankCodeRoleType.Enum getRole();
        
        /**
         * Gets (as xml) the "Role" attribute
         */
        org.kopi.ebics.schema.h003.BankCodeRoleType xgetRole();
        
        /**
         * Sets the "Role" attribute
         */
        void setRole(org.kopi.ebics.schema.h003.BankCodeRoleType.Enum role);
        
        /**
         * Sets (as xml) the "Role" attribute
         */
        void xsetRole(org.kopi.ebics.schema.h003.BankCodeRoleType role);
        
        /**
         * Gets the "Description" attribute
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "Description" attribute
         */
        org.apache.xmlbeans.XmlNormalizedString xgetDescription();
        
        /**
         * True if has "Description" attribute
         */
        boolean isSetDescription();
        
        /**
         * Sets the "Description" attribute
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "Description" attribute
         */
        void xsetDescription(org.apache.xmlbeans.XmlNormalizedString description);
        
        /**
         * Unsets the "Description" attribute
         */
        void unsetDescription();
        
        /**
         * Gets the "format" attribute
         */
        java.lang.String getFormat();
        
        /**
         * Gets (as xml) the "format" attribute
         */
        org.apache.xmlbeans.XmlToken xgetFormat();
        
        /**
         * Sets the "format" attribute
         */
        void setFormat(java.lang.String format);
        
        /**
         * Sets (as xml) the "format" attribute
         */
        void xsetFormat(org.apache.xmlbeans.XmlToken format);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.kopi.ebics.schema.h003.AttributedAccountType.NationalBankCode newInstance() {
              return (org.kopi.ebics.schema.h003.AttributedAccountType.NationalBankCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.kopi.ebics.schema.h003.AttributedAccountType.NationalBankCode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.kopi.ebics.schema.h003.AttributedAccountType.NationalBankCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML AccountHolder(@http://www.ebics.org/H003).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.AttributedAccountType$AccountHolder.
     */
    public interface AccountHolder extends org.kopi.ebics.schema.h003.AccountHolderType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AccountHolder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("accountholderac0celemtype");
        
        /**
         * Gets the "Role" attribute
         */
        org.kopi.ebics.schema.h003.AccountHolderRoleType.Enum getRole();
        
        /**
         * Gets (as xml) the "Role" attribute
         */
        org.kopi.ebics.schema.h003.AccountHolderRoleType xgetRole();
        
        /**
         * Sets the "Role" attribute
         */
        void setRole(org.kopi.ebics.schema.h003.AccountHolderRoleType.Enum role);
        
        /**
         * Sets (as xml) the "Role" attribute
         */
        void xsetRole(org.kopi.ebics.schema.h003.AccountHolderRoleType role);
        
        /**
         * Gets the "Description" attribute
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "Description" attribute
         */
        org.apache.xmlbeans.XmlNormalizedString xgetDescription();
        
        /**
         * True if has "Description" attribute
         */
        boolean isSetDescription();
        
        /**
         * Sets the "Description" attribute
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "Description" attribute
         */
        void xsetDescription(org.apache.xmlbeans.XmlNormalizedString description);
        
        /**
         * Unsets the "Description" attribute
         */
        void unsetDescription();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.kopi.ebics.schema.h003.AttributedAccountType.AccountHolder newInstance() {
              return (org.kopi.ebics.schema.h003.AttributedAccountType.AccountHolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.kopi.ebics.schema.h003.AttributedAccountType.AccountHolder newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.kopi.ebics.schema.h003.AttributedAccountType.AccountHolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.kopi.ebics.schema.h003.AttributedAccountType newInstance() {
          return (org.kopi.ebics.schema.h003.AttributedAccountType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.kopi.ebics.schema.h003.AttributedAccountType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.h003.AttributedAccountType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.h003.AttributedAccountType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.AttributedAccountType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.h003.AttributedAccountType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.AttributedAccountType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.h003.AttributedAccountType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.AttributedAccountType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.h003.AttributedAccountType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.AttributedAccountType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.h003.AttributedAccountType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.AttributedAccountType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.h003.AttributedAccountType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.AttributedAccountType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.h003.AttributedAccountType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.AttributedAccountType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.h003.AttributedAccountType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.AttributedAccountType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.h003.AttributedAccountType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.AttributedAccountType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.h003.AttributedAccountType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.AttributedAccountType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.h003.AttributedAccountType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.AttributedAccountType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.h003.AttributedAccountType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.AttributedAccountType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.h003.AttributedAccountType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.AttributedAccountType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.h003.AttributedAccountType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.AttributedAccountType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.AttributedAccountType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.AttributedAccountType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.AttributedAccountType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.AttributedAccountType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
