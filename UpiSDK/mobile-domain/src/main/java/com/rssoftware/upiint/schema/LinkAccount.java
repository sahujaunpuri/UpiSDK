//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.20 at 03:17:06 PM IST 
//


package com.rssoftware.upiint.schema;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;









/**
 * <p>Java class for LinkAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="linkAccId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="bankAcnumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ifsc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mmid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aadhaar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aadhaarIIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="branchName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nickName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ownBank" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="accetptedCred" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="credDataType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="credLength" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="schemaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="activity" type="{http://rssoftware.com/upiint/schema/}UserActivity"/>
 *         &lt;element name="creds" type="{http://rssoftware.com/upiint/schema/}Cred" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class LinkAccount {

    
    protected BigInteger linkAccId;
    
    
    
    protected String userId;
    
    protected String bankAcnumber;
    
    protected String ifsc;
    
    protected String mmid;
    
    protected String mobile;
    
    protected String aadhaar;
    
    protected String aadhaarIIN;
    
    protected String accountType;
    
    protected String branchName;
    
    protected String nickName;
    protected boolean ownBank;
    
    protected String accetptedCred;
    
    protected String credDataType;
    
    protected BigInteger credLength;
    
    protected String schemaCode;
    
    protected BigDecimal accountBalance;

    protected BigInteger atmCredLength;
    protected String atmCredDataType;

    protected String otpCredDataType;

    protected int otpCredLength;

    public String getOtpCredDataType() {
        return otpCredDataType;
    }

    public void setOtpCredDataType(String otpCredDataType) {
        this.otpCredDataType = otpCredDataType;
    }

    public int getOtpCredLength() {
        return otpCredLength;
    }

    public void setOtpCredLength(int otpCredLength) {
        this.otpCredLength = otpCredLength;
    }

    public BigInteger getAtmCredLength() {
        return atmCredLength;
    }

    public void setAtmCredLength(BigInteger atmCredLength) {
        this.atmCredLength = atmCredLength;
    }

    public String getAtmCredDataType() {
        return atmCredDataType;
    }

    public void setAtmCredDataType(String atmCredDataType) {
        this.atmCredDataType = atmCredDataType;
    }








    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    protected String accType;

    protected boolean meba;

    public boolean isMeba() {
        return meba;
    }

    public void setMeba(boolean meba) {
        this.meba = meba;
    }




protected UserActivity activity;
    protected List<Cred> creds;

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
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the bankAcnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcnumber() {
        return bankAcnumber;
    }

    /**
     * Sets the value of the bankAcnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcnumber(String value) {
        this.bankAcnumber = value;
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
     * Gets the value of the aadhaarIIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAadhaarIIN() {
        return aadhaarIIN;
    }

    /**
     * Sets the value of the aadhaarIIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAadhaarIIN(String value) {
        this.aadhaarIIN = value;
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

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the ownBank property.
     * 
     */
    public boolean isOwnBank() {
        return ownBank;
    }

    /**
     * Sets the value of the ownBank property.
     * 
     */
    public void setOwnBank(boolean value) {
        this.ownBank = value;
    }

    /**
     * Gets the value of the accetptedCred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccetptedCred() {
        return accetptedCred;
    }

    /**
     * Sets the value of the accetptedCred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccetptedCred(String value) {
        this.accetptedCred = value;
    }

    /**
     * Gets the value of the credDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredDataType() {
        return credDataType;
    }

    /**
     * Sets the value of the credDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredDataType(String value) {
        this.credDataType = value;
    }

    /**
     * Gets the value of the credLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCredLength() {
        return credLength;
    }

    /**
     * Sets the value of the credLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCredLength(BigInteger value) {
        this.credLength = value;
    }

    /**
     * Gets the value of the schemaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaCode() {
        return schemaCode;
    }

    /**
     * Sets the value of the schemaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaCode(String value) {
        this.schemaCode = value;
    }

    /**
     * Gets the value of the accountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the value of the accountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountBalance(BigDecimal value) {
        this.accountBalance = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link UserActivity }
     *     
     */
    public UserActivity getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserActivity }
     *     
     */
    public void setActivity(UserActivity value) {
        this.activity = value;
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

}
