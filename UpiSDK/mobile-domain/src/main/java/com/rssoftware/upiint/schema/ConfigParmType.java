//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.20 at 03:17:06 PM IST 
//


package com.rssoftware.upiint.schema;





/**
 * <p>Java class for ConfigParmType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfigParmType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BANK_PSP"/>
 *     &lt;enumeration value="BANK_IFSC"/>
 *     &lt;enumeration value="BANK_MOBILE"/>
 *     &lt;enumeration value="BANK_MAX_TRAN_LIMIT"/>
 *     &lt;enumeration value="BANK_CODE"/>
 *     &lt;enumeration value="PUBLIC_KEY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */


public enum ConfigParmType {

    BANK_PSP,
    BANK_IFSC,
    BANK_MOBILE,
    BANK_MAX_TRAN_LIMIT,
    BANK_CODE,
    PUBLIC_KEY;

    public String value() {
        return name();
    }

    public static ConfigParmType fromValue(String v) {
        return valueOf(v);
    }

}
