//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.20 at 03:17:06 PM IST 
//


package com.rssoftware.upiint.schema;

import java.math.BigInteger;









/**
 * <p>Java class for ListKeysResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListKeysResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="txnId" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="waitingTime" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="listKeysXml" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class ListKeysResponse {

    
    
    
    protected String txnId;
    
    protected BigInteger waitingTime;
    
    protected String listKeysXml;

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
     * Gets the value of the waitingTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWaitingTime() {
        return waitingTime;
    }

    /**
     * Sets the value of the waitingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWaitingTime(BigInteger value) {
        this.waitingTime = value;
    }

    /**
     * Gets the value of the listKeysXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListKeysXml() {
        return listKeysXml;
    }

    /**
     * Sets the value of the listKeysXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListKeysXml(String value) {
        this.listKeysXml = value;
    }

}
