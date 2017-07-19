//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.20 at 03:17:06 PM IST 
//


package com.rssoftware.upiint.schema;

import java.math.BigDecimal;
import java.math.BigInteger;






/**
 * <p>Java class for VpaRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VpaRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acctRuleDetailsId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="linkAccId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="acctNickName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ruleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="txnType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="slabMinAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="slabMaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class VpaRule {

    
    protected BigInteger acctRuleDetailsId;
    
    protected BigInteger linkAccId;
    
    protected String acctNickName;
    
    protected String ruleName;
    
    protected String txnType;
    
    protected BigDecimal slabMinAmt;
    
    protected BigDecimal slabMaxAmt;

    /**
     * Gets the value of the acctRuleDetailsId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcctRuleDetailsId() {
        return acctRuleDetailsId;
    }

    /**
     * Sets the value of the acctRuleDetailsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcctRuleDetailsId(BigInteger value) {
        this.acctRuleDetailsId = value;
    }

    /**
     * Gets the value of the linkAccId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLinkAccId() {
        return linkAccId;
    }

    /**
     * Sets the value of the linkAccId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLinkAccId(BigInteger value) {
        this.linkAccId = value;
    }

    /**
     * Gets the value of the acctNickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNickName() {
        return acctNickName;
    }

    /**
     * Sets the value of the acctNickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNickName(String value) {
        this.acctNickName = value;
    }

    /**
     * Gets the value of the ruleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * Sets the value of the ruleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleName(String value) {
        this.ruleName = value;
    }

    /**
     * Gets the value of the txnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnType() {
        return txnType;
    }

    /**
     * Sets the value of the txnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnType(String value) {
        this.txnType = value;
    }

    /**
     * Gets the value of the slabMinAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSlabMinAmt() {
        return slabMinAmt;
    }

    /**
     * Sets the value of the slabMinAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSlabMinAmt(BigDecimal value) {
        this.slabMinAmt = value;
    }

    /**
     * Gets the value of the slabMaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSlabMaxAmt() {
        return slabMaxAmt;
    }

    /**
     * Sets the value of the slabMaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSlabMaxAmt(BigDecimal value) {
        this.slabMaxAmt = value;
    }

}
