/*
 * XML Type:  HPDVersionType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HPDVersionType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML HPDVersionType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class HPDVersionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.HPDVersionType
{
    private static final long serialVersionUID = 1L;
    
    public HPDVersionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROTOCOL$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Protocol");
    private static final javax.xml.namespace.QName AUTHENTICATION$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Authentication");
    private static final javax.xml.namespace.QName ENCRYPTION$4 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Encryption");
    private static final javax.xml.namespace.QName SIGNATURE$6 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Signature");
    
    
    /**
     * Gets the "Protocol" element
     */
    public java.util.List getProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROTOCOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "Protocol" element
     */
    public org.kopi.ebics.schema.h003.HPDVersionType.Protocol xgetProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPDVersionType.Protocol target = null;
            target = (org.kopi.ebics.schema.h003.HPDVersionType.Protocol)get_store().find_element_user(PROTOCOL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Protocol" element
     */
    public void setProtocol(java.util.List protocol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROTOCOL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROTOCOL$0);
            }
            target.setListValue(protocol);
        }
    }
    
    /**
     * Sets (as xml) the "Protocol" element
     */
    public void xsetProtocol(org.kopi.ebics.schema.h003.HPDVersionType.Protocol protocol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPDVersionType.Protocol target = null;
            target = (org.kopi.ebics.schema.h003.HPDVersionType.Protocol)get_store().find_element_user(PROTOCOL$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HPDVersionType.Protocol)get_store().add_element_user(PROTOCOL$0);
            }
            target.set(protocol);
        }
    }
    
    /**
     * Gets the "Authentication" element
     */
    public java.util.List getAuthentication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHENTICATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "Authentication" element
     */
    public org.kopi.ebics.schema.h003.HPDVersionType.Authentication xgetAuthentication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPDVersionType.Authentication target = null;
            target = (org.kopi.ebics.schema.h003.HPDVersionType.Authentication)get_store().find_element_user(AUTHENTICATION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Authentication" element
     */
    public void setAuthentication(java.util.List authentication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHENTICATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHENTICATION$2);
            }
            target.setListValue(authentication);
        }
    }
    
    /**
     * Sets (as xml) the "Authentication" element
     */
    public void xsetAuthentication(org.kopi.ebics.schema.h003.HPDVersionType.Authentication authentication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPDVersionType.Authentication target = null;
            target = (org.kopi.ebics.schema.h003.HPDVersionType.Authentication)get_store().find_element_user(AUTHENTICATION$2, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HPDVersionType.Authentication)get_store().add_element_user(AUTHENTICATION$2);
            }
            target.set(authentication);
        }
    }
    
    /**
     * Gets the "Encryption" element
     */
    public java.util.List getEncryption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCRYPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "Encryption" element
     */
    public org.kopi.ebics.schema.h003.HPDVersionType.Encryption xgetEncryption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPDVersionType.Encryption target = null;
            target = (org.kopi.ebics.schema.h003.HPDVersionType.Encryption)get_store().find_element_user(ENCRYPTION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Encryption" element
     */
    public void setEncryption(java.util.List encryption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCRYPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENCRYPTION$4);
            }
            target.setListValue(encryption);
        }
    }
    
    /**
     * Sets (as xml) the "Encryption" element
     */
    public void xsetEncryption(org.kopi.ebics.schema.h003.HPDVersionType.Encryption encryption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPDVersionType.Encryption target = null;
            target = (org.kopi.ebics.schema.h003.HPDVersionType.Encryption)get_store().find_element_user(ENCRYPTION$4, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HPDVersionType.Encryption)get_store().add_element_user(ENCRYPTION$4);
            }
            target.set(encryption);
        }
    }
    
    /**
     * Gets the "Signature" element
     */
    public java.util.List getSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATURE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "Signature" element
     */
    public org.kopi.ebics.schema.h003.HPDVersionType.Signature xgetSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPDVersionType.Signature target = null;
            target = (org.kopi.ebics.schema.h003.HPDVersionType.Signature)get_store().find_element_user(SIGNATURE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Signature" element
     */
    public void setSignature(java.util.List signature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATURE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGNATURE$6);
            }
            target.setListValue(signature);
        }
    }
    
    /**
     * Sets (as xml) the "Signature" element
     */
    public void xsetSignature(org.kopi.ebics.schema.h003.HPDVersionType.Signature signature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HPDVersionType.Signature target = null;
            target = (org.kopi.ebics.schema.h003.HPDVersionType.Signature)get_store().find_element_user(SIGNATURE$6, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HPDVersionType.Signature)get_store().add_element_user(SIGNATURE$6);
            }
            target.set(signature);
        }
    }
    /**
     * An XML Protocol(@http://www.ebics.org/H003).
     *
     * This is a list type whose items are org.kopi.ebics.schema.h003.ProtocolVersionType.
     */
    public static class ProtocolImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.kopi.ebics.schema.h003.HPDVersionType.Protocol
    {
        private static final long serialVersionUID = 1L;
        
        public ProtocolImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ProtocolImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML Authentication(@http://www.ebics.org/H003).
     *
     * This is a list type whose items are org.kopi.ebics.schema.h003.AuthenticationVersionType.
     */
    public static class AuthenticationImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.kopi.ebics.schema.h003.HPDVersionType.Authentication
    {
        private static final long serialVersionUID = 1L;
        
        public AuthenticationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AuthenticationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML Encryption(@http://www.ebics.org/H003).
     *
     * This is a list type whose items are org.kopi.ebics.schema.h003.EncryptionVersionType.
     */
    public static class EncryptionImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.kopi.ebics.schema.h003.HPDVersionType.Encryption
    {
        private static final long serialVersionUID = 1L;
        
        public EncryptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected EncryptionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML Signature(@http://www.ebics.org/H003).
     *
     * This is a list type whose items are org.kopi.ebics.schema.s001.SignatureVersionType.
     */
    public static class SignatureImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.kopi.ebics.schema.h003.HPDVersionType.Signature
    {
        private static final long serialVersionUID = 1L;
        
        public SignatureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SignatureImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
