//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.20 at 03:17:06 PM IST 
//


package com.rssoftware.upiint.schema;








/**
 * <p>Java class for ConfigParm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigParm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parmType" type="{http://rssoftware.com/upiint/schema/}ConfigParmType"/>
 *         &lt;element name="configVal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class ConfigParm {

    
    
    protected ConfigParmType parmType;
    
    protected String configVal;

    /**
     * Gets the value of the parmType property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigParmType }
     *     
     */
    public ConfigParmType getParmType() {
        return parmType;
    }

    /**
     * Sets the value of the parmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigParmType }
     *     
     */
    public void setParmType(ConfigParmType value) {
        this.parmType = value;
    }

    /**
     * Gets the value of the configVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigVal() {
        return configVal;
    }

    /**
     * Sets the value of the configVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigVal(String value) {
        this.configVal = value;
    }

}
