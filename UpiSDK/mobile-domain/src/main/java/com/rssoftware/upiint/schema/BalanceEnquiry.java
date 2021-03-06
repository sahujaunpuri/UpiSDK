//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.20 at 03:17:06 PM IST 
//


package com.rssoftware.upiint.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;









/**
 * <p>Java class for BalanceEnquiry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceEnquiry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ownerId" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="nickname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="responseCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="txnId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vpa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userType" type="{http://rssoftware.com/upiint/schema/}UserType"/>
 *         &lt;element name="creds" type="{http://rssoftware.com/upiint/schema/}Cred" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BalanceEnquiry {

    
    
    
    protected String ownerId;
    
    protected String nickname;
    protected boolean responseCall;
    
    protected String txnId;
    
    protected String vpa;
    
    protected String notes;

    protected String bankAcNumber;

    protected String accType;

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }




    protected String mobileNumber;

    protected IStateListener iStateListener;

    public BigInteger getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(BigInteger waitingTime) {
        this.waitingTime = waitingTime;
    }

    protected BigInteger waitingTime;

    private String bank_name="";

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public IStateListener getiStateListener() {
        return iStateListener;
    }

    public void setiStateListener(IStateListener iStateListener) {
        this.iStateListener = iStateListener;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }



    public String getBankAcNumber() {
        return bankAcNumber;
    }

    public void setBankAcNumber(String bankAcNumber) {
        this.bankAcNumber = bankAcNumber;
    }

    protected CredAllowed credAllowed;

    public CredAllowed getCredAllowed() {
        return credAllowed;
    }

    public void setCredAllowed(CredAllowed credAllowed) {
        this.credAllowed = credAllowed;
    }





    protected UserType userType;
    protected List<Cred> creds;

    /**
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerId(String value) {
        this.ownerId = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the responseCall property.
     * 
     */
    public boolean isResponseCall() {
        return responseCall;
    }

    /**
     * Sets the value of the responseCall property.
     * 
     */
    public void setResponseCall(boolean value) {
        this.responseCall = value;
    }

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
     * Gets the value of the vpa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpa() {
        return vpa;
    }

    /**
     * Sets the value of the vpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpa(String value) {
        this.vpa = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUserType(UserType value) {
        this.userType = value;
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
