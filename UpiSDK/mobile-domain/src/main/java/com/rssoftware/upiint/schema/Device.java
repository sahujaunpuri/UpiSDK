//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.20 at 03:17:06 PM IST 
//


package com.rssoftware.upiint.schema;










/**
 * <p>Java class for Device complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Device">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="deviceFingerprint" type="{http://rssoftware.com/upiint/schema/}DeviceFingerprint"/>
 *         &lt;element name="deviceDetails" type="{http://rssoftware.com/upiint/schema/}DeviceDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class Device {

    
    protected String userId;
    
    
    
    protected String deviceId;
    
    protected DeviceFingerprint deviceFingerprint;
    
    protected DeviceDetails deviceDetails;

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
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the deviceFingerprint property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceFingerprint }
     *     
     */
    public DeviceFingerprint getDeviceFingerprint() {
        return deviceFingerprint;
    }

    /**
     * Sets the value of the deviceFingerprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceFingerprint }
     *     
     */
    public void setDeviceFingerprint(DeviceFingerprint value) {
        this.deviceFingerprint = value;
    }

    /**
     * Gets the value of the deviceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDetails }
     *     
     */
    public DeviceDetails getDeviceDetails() {
        return deviceDetails;
    }

    /**
     * Sets the value of the deviceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDetails }
     *     
     */
    public void setDeviceDetails(DeviceDetails value) {
        this.deviceDetails = value;
    }

}
