//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.20 at 03:17:06 PM IST 
//


package com.rssoftware.upiint.schema;







/**
 * <p>Java class for BankAccountDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankAccountDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accRefNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maskedAccNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ifsc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mmid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aeba" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="meba" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BankAccountDetail {

    
    protected String accRefNo;
    
    protected String maskedAccNo;
    
    protected String ifsc;
    
    protected String mmid;
    
    protected String name;
    protected boolean aeba;
    protected boolean meba;
    
    protected String accountType;

    /**
     * Gets the value of the accRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccRefNo() {
        return accRefNo;
    }

    /**
     * Sets the value of the accRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccRefNo(String value) {
        this.accRefNo = value;
    }

    /**
     * Gets the value of the maskedAccNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedAccNo() {
        return maskedAccNo;
    }

    /**
     * Sets the value of the maskedAccNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedAccNo(String value) {
        this.maskedAccNo = value;
    }

    /**
     * Gets the value of the ifsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfsc() {
        return ifsc;
    }

    /**
     * Sets the value of the ifsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfsc(String value) {
        this.ifsc = value;
    }

    /**
     * Gets the value of the mmid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmid() {
        return mmid;
    }

    /**
     * Sets the value of the mmid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmid(String value) {
        this.mmid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the aeba property.
     * 
     */
    public boolean isAeba() {
        return aeba;
    }

    /**
     * Sets the value of the aeba property.
     * 
     */
    public void setAeba(boolean value) {
        this.aeba = value;
    }

    /**
     * Gets the value of the meba property.
     * 
     */
    public boolean isMeba() {
        return meba;
    }

    /**
     * Sets the value of the meba property.
     * 
     */
    public void setMeba(boolean value) {
        this.meba = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

}
