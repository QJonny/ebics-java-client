/*
 * XML Type:  HVZOrderDetailsType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVZOrderDetailsType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003;


/**
 * An XML HVZOrderDetailsType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public interface HVZOrderDetailsType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HVZOrderDetailsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("hvzorderdetailstypeede2type");
    
    /**
     * Gets the "OrderType" element
     */
    java.lang.String getOrderType();
    
    /**
     * Gets (as xml) the "OrderType" element
     */
    org.kopi.ebics.schema.h003.OrderTBaseType xgetOrderType();
    
    /**
     * Sets the "OrderType" element
     */
    void setOrderType(java.lang.String orderType);
    
    /**
     * Sets (as xml) the "OrderType" element
     */
    void xsetOrderType(org.kopi.ebics.schema.h003.OrderTBaseType orderType);
    
    /**
     * Gets the "OrderID" element
     */
    java.lang.String getOrderID();
    
    /**
     * Gets (as xml) the "OrderID" element
     */
    org.kopi.ebics.schema.h003.OrderIDType xgetOrderID();
    
    /**
     * Sets the "OrderID" element
     */
    void setOrderID(java.lang.String orderID);
    
    /**
     * Sets (as xml) the "OrderID" element
     */
    void xsetOrderID(org.kopi.ebics.schema.h003.OrderIDType orderID);
    
    /**
     * Gets the "DataDigest" element
     */
    org.kopi.ebics.schema.h003.DataDigestType getDataDigest();
    
    /**
     * Sets the "DataDigest" element
     */
    void setDataDigest(org.kopi.ebics.schema.h003.DataDigestType dataDigest);
    
    /**
     * Appends and returns a new empty "DataDigest" element
     */
    org.kopi.ebics.schema.h003.DataDigestType addNewDataDigest();
    
    /**
     * Gets the "OrderDataAvailable" element
     */
    boolean getOrderDataAvailable();
    
    /**
     * Gets (as xml) the "OrderDataAvailable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetOrderDataAvailable();
    
    /**
     * Sets the "OrderDataAvailable" element
     */
    void setOrderDataAvailable(boolean orderDataAvailable);
    
    /**
     * Sets (as xml) the "OrderDataAvailable" element
     */
    void xsetOrderDataAvailable(org.apache.xmlbeans.XmlBoolean orderDataAvailable);
    
    /**
     * Gets the "OrderDataSize" element
     */
    java.math.BigInteger getOrderDataSize();
    
    /**
     * Gets (as xml) the "OrderDataSize" element
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetOrderDataSize();
    
    /**
     * Sets the "OrderDataSize" element
     */
    void setOrderDataSize(java.math.BigInteger orderDataSize);
    
    /**
     * Sets (as xml) the "OrderDataSize" element
     */
    void xsetOrderDataSize(org.apache.xmlbeans.XmlPositiveInteger orderDataSize);
    
    /**
     * Gets the "OrderDetailsAvailable" element
     */
    boolean getOrderDetailsAvailable();
    
    /**
     * Gets (as xml) the "OrderDetailsAvailable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetOrderDetailsAvailable();
    
    /**
     * Sets the "OrderDetailsAvailable" element
     */
    void setOrderDetailsAvailable(boolean orderDetailsAvailable);
    
    /**
     * Sets (as xml) the "OrderDetailsAvailable" element
     */
    void xsetOrderDetailsAvailable(org.apache.xmlbeans.XmlBoolean orderDetailsAvailable);
    
    /**
     * Gets the "TotalOrders" element
     */
    java.math.BigInteger getTotalOrders();
    
    /**
     * Gets (as xml) the "TotalOrders" element
     */
    org.apache.xmlbeans.XmlNonNegativeInteger xgetTotalOrders();
    
    /**
     * True if has "TotalOrders" element
     */
    boolean isSetTotalOrders();
    
    /**
     * Sets the "TotalOrders" element
     */
    void setTotalOrders(java.math.BigInteger totalOrders);
    
    /**
     * Sets (as xml) the "TotalOrders" element
     */
    void xsetTotalOrders(org.apache.xmlbeans.XmlNonNegativeInteger totalOrders);
    
    /**
     * Unsets the "TotalOrders" element
     */
    void unsetTotalOrders();
    
    /**
     * Gets the "TotalAmount" element
     */
    java.math.BigDecimal getTotalAmount();
    
    /**
     * Gets (as xml) the "TotalAmount" element
     */
    org.kopi.ebics.schema.h003.HVZOrderDetailsType.TotalAmount xgetTotalAmount();
    
    /**
     * True if has "TotalAmount" element
     */
    boolean isSetTotalAmount();
    
    /**
     * Sets the "TotalAmount" element
     */
    void setTotalAmount(java.math.BigDecimal totalAmount);
    
    /**
     * Sets (as xml) the "TotalAmount" element
     */
    void xsetTotalAmount(org.kopi.ebics.schema.h003.HVZOrderDetailsType.TotalAmount totalAmount);
    
    /**
     * Unsets the "TotalAmount" element
     */
    void unsetTotalAmount();
    
    /**
     * Gets the "Currency" element
     */
    java.lang.String getCurrency();
    
    /**
     * Gets (as xml) the "Currency" element
     */
    org.kopi.ebics.schema.h003.CurrencyBaseType xgetCurrency();
    
    /**
     * True if has "Currency" element
     */
    boolean isSetCurrency();
    
    /**
     * Sets the "Currency" element
     */
    void setCurrency(java.lang.String currency);
    
    /**
     * Sets (as xml) the "Currency" element
     */
    void xsetCurrency(org.kopi.ebics.schema.h003.CurrencyBaseType currency);
    
    /**
     * Unsets the "Currency" element
     */
    void unsetCurrency();
    
    /**
     * Gets the "FirstOrderInfo" element
     */
    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo getFirstOrderInfo();
    
    /**
     * True if has "FirstOrderInfo" element
     */
    boolean isSetFirstOrderInfo();
    
    /**
     * Sets the "FirstOrderInfo" element
     */
    void setFirstOrderInfo(org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo firstOrderInfo);
    
    /**
     * Appends and returns a new empty "FirstOrderInfo" element
     */
    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo addNewFirstOrderInfo();
    
    /**
     * Unsets the "FirstOrderInfo" element
     */
    void unsetFirstOrderInfo();
    
    /**
     * Gets the "SigningInfo" element
     */
    org.kopi.ebics.schema.h003.HVUSigningInfoType getSigningInfo();
    
    /**
     * Sets the "SigningInfo" element
     */
    void setSigningInfo(org.kopi.ebics.schema.h003.HVUSigningInfoType signingInfo);
    
    /**
     * Appends and returns a new empty "SigningInfo" element
     */
    org.kopi.ebics.schema.h003.HVUSigningInfoType addNewSigningInfo();
    
    /**
     * Gets array of all "SignerInfo" elements
     */
    org.kopi.ebics.schema.h003.SignerInfoType[] getSignerInfoArray();
    
    /**
     * Gets ith "SignerInfo" element
     */
    org.kopi.ebics.schema.h003.SignerInfoType getSignerInfoArray(int i);
    
    /**
     * Returns number of "SignerInfo" element
     */
    int sizeOfSignerInfoArray();
    
    /**
     * Sets array of all "SignerInfo" element
     */
    void setSignerInfoArray(org.kopi.ebics.schema.h003.SignerInfoType[] signerInfoArray);
    
    /**
     * Sets ith "SignerInfo" element
     */
    void setSignerInfoArray(int i, org.kopi.ebics.schema.h003.SignerInfoType signerInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SignerInfo" element
     */
    org.kopi.ebics.schema.h003.SignerInfoType insertNewSignerInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SignerInfo" element
     */
    org.kopi.ebics.schema.h003.SignerInfoType addNewSignerInfo();
    
    /**
     * Removes the ith "SignerInfo" element
     */
    void removeSignerInfo(int i);
    
    /**
     * Gets the "OriginatorInfo" element
     */
    org.kopi.ebics.schema.h003.HVUOriginatorInfoType getOriginatorInfo();
    
    /**
     * Sets the "OriginatorInfo" element
     */
    void setOriginatorInfo(org.kopi.ebics.schema.h003.HVUOriginatorInfoType originatorInfo);
    
    /**
     * Appends and returns a new empty "OriginatorInfo" element
     */
    org.kopi.ebics.schema.h003.HVUOriginatorInfoType addNewOriginatorInfo();
    
    /**
     * An XML TotalAmount(@http://www.ebics.org/H003).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.HVZOrderDetailsType$TotalAmount.
     */
    public interface TotalAmount extends org.kopi.ebics.schema.h003.AmountValueType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TotalAmount.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("totalamount22eaelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.kopi.ebics.schema.h003.HVZOrderDetailsType.TotalAmount newValue(java.lang.Object obj) {
              return (org.kopi.ebics.schema.h003.HVZOrderDetailsType.TotalAmount) type.newValue( obj ); }
            
            public static org.kopi.ebics.schema.h003.HVZOrderDetailsType.TotalAmount newInstance() {
              return (org.kopi.ebics.schema.h003.HVZOrderDetailsType.TotalAmount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.kopi.ebics.schema.h003.HVZOrderDetailsType.TotalAmount newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.kopi.ebics.schema.h003.HVZOrderDetailsType.TotalAmount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML FirstOrderInfo(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public interface FirstOrderInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FirstOrderInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("firstorderinfo04eaelemtype");
        
        /**
         * Gets the "OrderPartyInfo" element
         */
        java.lang.String getOrderPartyInfo();
        
        /**
         * Gets (as xml) the "OrderPartyInfo" element
         */
        org.apache.xmlbeans.XmlNormalizedString xgetOrderPartyInfo();
        
        /**
         * True if has "OrderPartyInfo" element
         */
        boolean isSetOrderPartyInfo();
        
        /**
         * Sets the "OrderPartyInfo" element
         */
        void setOrderPartyInfo(java.lang.String orderPartyInfo);
        
        /**
         * Sets (as xml) the "OrderPartyInfo" element
         */
        void xsetOrderPartyInfo(org.apache.xmlbeans.XmlNormalizedString orderPartyInfo);
        
        /**
         * Unsets the "OrderPartyInfo" element
         */
        void unsetOrderPartyInfo();
        
        /**
         * Gets the "AccountInfo" element
         */
        org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo getAccountInfo();
        
        /**
         * True if has "AccountInfo" element
         */
        boolean isSetAccountInfo();
        
        /**
         * Sets the "AccountInfo" element
         */
        void setAccountInfo(org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo accountInfo);
        
        /**
         * Appends and returns a new empty "AccountInfo" element
         */
        org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo addNewAccountInfo();
        
        /**
         * Unsets the "AccountInfo" element
         */
        void unsetAccountInfo();
        
        /**
         * An XML AccountInfo(@http://www.ebics.org/H003).
         *
         * This is a complex type.
         */
        public interface AccountInfo extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AccountInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("accountinfo0103elemtype");
            
            /**
             * Gets array of all "AccountNumber" elements
             */
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber[] getAccountNumberArray();
            
            /**
             * Gets ith "AccountNumber" element
             */
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber getAccountNumberArray(int i);
            
            /**
             * Returns number of "AccountNumber" element
             */
            int sizeOfAccountNumberArray();
            
            /**
             * Sets array of all "AccountNumber" element
             */
            void setAccountNumberArray(org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber[] accountNumberArray);
            
            /**
             * Sets ith "AccountNumber" element
             */
            void setAccountNumberArray(int i, org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber accountNumber);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "AccountNumber" element
             */
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber insertNewAccountNumber(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "AccountNumber" element
             */
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber addNewAccountNumber();
            
            /**
             * Removes the ith "AccountNumber" element
             */
            void removeAccountNumber(int i);
            
            /**
             * Gets array of all "NationalAccountNumber" elements
             */
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber[] getNationalAccountNumberArray();
            
            /**
             * Gets ith "NationalAccountNumber" element
             */
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber getNationalAccountNumberArray(int i);
            
            /**
             * Returns number of "NationalAccountNumber" element
             */
            int sizeOfNationalAccountNumberArray();
            
            /**
             * Sets array of all "NationalAccountNumber" element
             */
            void setNationalAccountNumberArray(org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber[] nationalAccountNumberArray);
            
            /**
             * Sets ith "NationalAccountNumber" element
             */
            void setNationalAccountNumberArray(int i, org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber nationalAccountNumber);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "NationalAccountNumber" element
             */
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber insertNewNationalAccountNumber(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "NationalAccountNumber" element
             */
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber addNewNationalAccountNumber();
            
            /**
             * Removes the ith "NationalAccountNumber" element
             */
            void removeNationalAccountNumber(int i);
            
            /**
             * Gets array of all "BankCode" elements
             */
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode[] getBankCodeArray();
            
            /**
             * Gets ith "BankCode" element
             */
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode getBankCodeArray(int i);
            
            /**
             * Returns number of "BankCode" element
             */
            int sizeOfBankCodeArray();
            
            /**
             * Sets array of all "BankCode" element
             */
            void setBankCodeArray(org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode[] bankCodeArray);
            
            /**
             * Sets ith "BankCode" element
             */
            void setBankCodeArray(int i, org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode bankCode);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "BankCode" element
             */
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode insertNewBankCode(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "BankCode" element
             */
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode addNewBankCode();
            
            /**
             * Removes the ith "BankCode" element
             */
            void removeBankCode(int i);
            
            /**
             * Gets array of all "NationalBankCode" elements
             */
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode[] getNationalBankCodeArray();
            
            /**
             * Gets ith "NationalBankCode" element
             */
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode getNationalBankCodeArray(int i);
            
            /**
             * Returns number of "NationalBankCode" element
             */
            int sizeOfNationalBankCodeArray();
            
            /**
             * Sets array of all "NationalBankCode" element
             */
            void setNationalBankCodeArray(org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode[] nationalBankCodeArray);
            
            /**
             * Sets ith "NationalBankCode" element
             */
            void setNationalBankCodeArray(int i, org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode nationalBankCode);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "NationalBankCode" element
             */
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode insertNewNationalBankCode(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "NationalBankCode" element
             */
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode addNewNationalBankCode();
            
            /**
             * Removes the ith "NationalBankCode" element
             */
            void removeNationalBankCode(int i);
            
            /**
             * An XML AccountNumber(@http://www.ebics.org/H003).
             *
             * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.HVZOrderDetailsType$FirstOrderInfo$AccountInfo$AccountNumber.
             */
            public interface AccountNumber extends org.kopi.ebics.schema.h003.AccountNumberType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AccountNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("accountnumber2ea1elemtype");
                
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
                    public static org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber newInstance() {
                      return (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML NationalAccountNumber(@http://www.ebics.org/H003).
             *
             * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.HVZOrderDetailsType$FirstOrderInfo$AccountInfo$NationalAccountNumber.
             */
            public interface NationalAccountNumber extends org.kopi.ebics.schema.h003.NationalAccountNumberType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NationalAccountNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("nationalaccountnumber8173elemtype");
                
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
                    public static org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber newInstance() {
                      return (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML BankCode(@http://www.ebics.org/H003).
             *
             * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.HVZOrderDetailsType$FirstOrderInfo$AccountInfo$BankCode.
             */
            public interface BankCode extends org.kopi.ebics.schema.h003.BankCodeType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BankCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("bankcode1f5eelemtype");
                
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
                    public static org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode newInstance() {
                      return (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML NationalBankCode(@http://www.ebics.org/H003).
             *
             * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.HVZOrderDetailsType$FirstOrderInfo$AccountInfo$NationalBankCode.
             */
            public interface NationalBankCode extends org.kopi.ebics.schema.h003.NationalBankCodeType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NationalBankCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("nationalbankcoded14celemtype");
                
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
                    public static org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode newInstance() {
                      return (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo newInstance() {
                  return (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo newInstance() {
              return (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.kopi.ebics.schema.h003.HVZOrderDetailsType newInstance() {
          return (org.kopi.ebics.schema.h003.HVZOrderDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.kopi.ebics.schema.h003.HVZOrderDetailsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.h003.HVZOrderDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.h003.HVZOrderDetailsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.HVZOrderDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.h003.HVZOrderDetailsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.HVZOrderDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.h003.HVZOrderDetailsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.HVZOrderDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.h003.HVZOrderDetailsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.HVZOrderDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.h003.HVZOrderDetailsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.HVZOrderDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.h003.HVZOrderDetailsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.HVZOrderDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.h003.HVZOrderDetailsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.HVZOrderDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.h003.HVZOrderDetailsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.HVZOrderDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.h003.HVZOrderDetailsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.HVZOrderDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.h003.HVZOrderDetailsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.HVZOrderDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.h003.HVZOrderDetailsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.HVZOrderDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.h003.HVZOrderDetailsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.HVZOrderDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.h003.HVZOrderDetailsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.HVZOrderDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.h003.HVZOrderDetailsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.HVZOrderDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.HVZOrderDetailsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.HVZOrderDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.HVZOrderDetailsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.HVZOrderDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
