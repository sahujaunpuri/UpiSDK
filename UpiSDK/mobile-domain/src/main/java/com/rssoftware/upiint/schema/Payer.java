//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.20 at 03:17:06 PM IST 
//


package com.rssoftware.upiint.schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;









/**
 * <p>Java class for Payer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="txnPayerID" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="payerUserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payerAcVpa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payerAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="payerAmtCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payerAcNickName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankAcNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankAcType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ifsc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Aadhaar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AadhaarIin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mmid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creds" type="{http://rssoftware.com/upiint/schema/}Cred" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="newcreds" type="{http://rssoftware.com/upiint/schema/}NewCred" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="payerStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payerErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cbsApprovalNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reversalTxnRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reversalTxnAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="cbsReversalApprovalNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="interchangeFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class Payer {

    
    
    
    protected String txnPayerID;
    
    protected String payerUserId;
    
    protected String name;
    
    protected String payerAcVpa;
    
    protected BigDecimal payerAmt;
    
    protected String payerAmtCurrency;
    
    protected String payerAcNickName;
    
    protected String bankAcNumber;
    
    protected String bankAcType;
    
    protected String ifsc;
    
    protected String aadhaar;
    
    protected String aadhaarIin;
    
    protected String mobile;
    
    protected String mmid;
    protected List<Cred> creds;
    protected List<NewCred> newcreds;
    
    protected String payerStatus;
    
    protected String payerErrorCode;
    
    protected String cbsApprovalNum;
    
    protected String reversalTxnRef;
    
    protected BigDecimal reversalTxnAmt;
    
    protected String cbsReversalApprovalNum;
    
    protected BigDecimal interchangeFee;

    /**
     * Gets the value of the txnPayerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnPayerID() {
        return txnPayerID;
    }

    /**
     * Sets the value of the txnPayerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnPayerID(String value) {
        this.txnPayerID = value;
    }

    /**
     * Gets the value of the payerUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerUserId() {
        return payerUserId;
    }

    /**
     * Sets the value of the payerUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerUserId(String value) {
        this.payerUserId = value;
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
     * Gets the value of the payerAcVpa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAcVpa() {
        return payerAcVpa;
    }

    /**
     * Sets the value of the payerAcVpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAcVpa(String value) {
        this.payerAcVpa = value;
    }

    /**
     * Gets the value of the payerAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayerAmt() {
        return payerAmt;
    }

    /**
     * Sets the value of the payerAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayerAmt(BigDecimal value) {
        this.payerAmt = value;
    }

    /**
     * Gets the value of the payerAmtCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAmtCurrency() {
        return payerAmtCurrency;
    }

    /**
     * Sets the value of the payerAmtCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAmtCurrency(String value) {
        this.payerAmtCurrency = value;
    }

    /**
     * Gets the value of the payerAcNickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAcNickName() {
        return payerAcNickName;
    }

    /**
     * Sets the value of the payerAcNickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAcNickName(String value) {
        this.payerAcNickName = value;
    }

    /**
     * Gets the value of the bankAcNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcNumber() {
        return bankAcNumber;
    }

    /**
     * Sets the value of the bankAcNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcNumber(String value) {
        this.bankAcNumber = value;
    }

    /**
     * Gets the value of the bankAcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcType() {
        return bankAcType;
    }

    /**
     * Sets the value of the bankAcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcType(String value) {
        this.bankAcType = value;
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
     * Gets the value of the aadhaar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAadhaar() {
        return aadhaar;
    }

    /**
     * Sets the value of the aadhaar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAadhaar(String value) {
        this.aadhaar = value;
    }

    /**
     * Gets the value of the aadhaarIin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAadhaarIin() {
        return aadhaarIin;
    }

    /**
     * Sets the value of the aadhaarIin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAadhaarIin(String value) {
        this.aadhaarIin = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
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
     * Gets the value of the creds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cred }
     * 
     * 
     */
    public List<Cred> getCreds() {
        if (creds == null) {
            creds = new ArrayList<Cred>();
        }
        return this.creds;
    }

    /**
     * Gets the value of the newcreds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newcreds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewcreds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewCred }
     * 
     * 
     */
    public List<NewCred> getNewcreds() {
        if (newcreds == null) {
            newcreds = new ArrayList<NewCred>();
        }
        return this.newcreds;
    }

    /**
     * Gets the value of the payerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerStatus() {
        return payerStatus;
    }

    /**
     * Sets the value of the payerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerStatus(String value) {
        this.payerStatus = value;
    }

    /**
     * Gets the value of the payerErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerErrorCode() {
        return payerErrorCode;
    }

    /**
     * Sets the value of the payerErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerErrorCode(String value) {
        this.payerErrorCode = value;
    }

    /**
     * Gets the value of the cbsApprovalNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbsApprovalNum() {
        return cbsApprovalNum;
    }

    /**
     * Sets the value of the cbsApprovalNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbsApprovalNum(String value) {
        this.cbsApprovalNum = value;
    }

    /**
     * Gets the value of the reversalTxnRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversalTxnRef() {
        return reversalTxnRef;
    }

    /**
     * Sets the value of the reversalTxnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversalTxnRef(String value) {
        this.reversalTxnRef = value;
    }

    /**
     * Gets the value of the reversalTxnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReversalTxnAmt() {
        return reversalTxnAmt;
    }

    /**
     * Sets the value of the reversalTxnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReversalTxnAmt(BigDecimal value) {
        this.reversalTxnAmt = value;
    }

    /**
     * Gets the value of the cbsReversalApprovalNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbsReversalApprovalNum() {
        return cbsReversalApprovalNum;
    }

    /**
     * Sets the value of the cbsReversalApprovalNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbsReversalApprovalNum(String value) {
        this.cbsReversalApprovalNum = value;
    }

    /**
     * Gets the value of the interchangeFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterchangeFee() {
        return interchangeFee;
    }

    /**
     * Sets the value of the interchangeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterchangeFee(BigDecimal value) {
        this.interchangeFee = value;
    }

}
