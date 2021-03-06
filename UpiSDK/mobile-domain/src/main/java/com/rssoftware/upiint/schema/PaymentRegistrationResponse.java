//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.20 at 03:17:06 PM IST 
//


package com.rssoftware.upiint.schema;










/**
 * <p>Java class for PaymentRegistrationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentRegistrationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="txnId" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="upiTxnId" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="authRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="credentialMetaData" type="{http://rssoftware.com/upiint/schema/}CredentialMetaData"/>
 *         &lt;element name="npciKeys" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class PaymentRegistrationResponse {

    
    
    
    protected String txnId;
    
    
    
    protected String upiTxnId;
    protected boolean authRequired;
    
    protected CredentialMetaData credentialMetaData;
    
    protected String npciKeys;

    /**
     * Gets the value of the txnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnId() {
        return txnId;
    }

    /**
     * Sets the value of the txnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnId(String value) {
        this.txnId = value;
    }

    /**
     * Gets the value of the upiTxnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpiTxnId() {
        return upiTxnId;
    }

    /**
     * Sets the value of the upiTxnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpiTxnId(String value) {
        this.upiTxnId = value;
    }

    /**
     * Gets the value of the authRequired property.
     * 
     */
    public boolean isAuthRequired() {
        return authRequired;
    }

    /**
     * Sets the value of the authRequired property.
     * 
     */
    public void setAuthRequired(boolean value) {
        this.authRequired = value;
    }

    /**
     * Gets the value of the credentialMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialMetaData }
     *     
     */
    public CredentialMetaData getCredentialMetaData() {
        return credentialMetaData;
    }

    /**
     * Sets the value of the credentialMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialMetaData }
     *     
     */
    public void setCredentialMetaData(CredentialMetaData value) {
        this.credentialMetaData = value;
    }

    /**
     * Gets the value of the npciKeys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNpciKeys() {
        return npciKeys;
    }

    /**
     * Sets the value of the npciKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNpciKeys(String value) {
        this.npciKeys = value;
    }

}
