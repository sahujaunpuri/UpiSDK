//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.20 at 03:17:06 PM IST 
//


package com.rssoftware.upiint.schema;





/**
 * <p>Java class for ChannelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChannelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MOBILE"/>
 *     &lt;enumeration value="INTERNET"/>
 *     &lt;enumeration value="BULK"/>
 *     &lt;enumeration value="PARTNER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */


public enum ChannelType {

    MOBILE,
    INTERNET,
    BULK,
    PARTNER,
    MOB;

    public String value() {
        return name();
    }

    public static ChannelType fromValue(String v) {
        return valueOf(v);
    }

}
