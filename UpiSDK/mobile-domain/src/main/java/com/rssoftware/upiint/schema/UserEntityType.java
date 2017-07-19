//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.20 at 03:17:06 PM IST 
//


package com.rssoftware.upiint.schema;





/**
 * <p>Java class for UserEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserEntityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BENEFICIARY"/>
 *     &lt;enumeration value="ACCOUNT"/>
 *     &lt;enumeration value="VPA"/>
 *     &lt;enumeration value="RULE"/>
 *     &lt;enumeration value="VPA_PAYEE"/>
 *     &lt;enumeration value="AUTH_REQ"/>
 *     &lt;enumeration value="TRAN_HIST"/>
 *     &lt;enumeration value="TRAN_HIST_DTLS"/>
 *     &lt;enumeration value="TRAN_BENEFICARY"/>
 *     &lt;enumeration value="BANK_PSP"/>
 *     &lt;enumeration value="SCHEDULE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */


public enum UserEntityType {

    BENEFICIARY,
    ACCOUNT,
    VPA,
    RULE,
    VPA_PAYEE,
    AUTH_REQ,
    TRAN_HIST,
    TRAN_HIST_DTLS,
    TRAN_BENEFICARY,
    BANK_PSP,
    SCHEDULE,
    TRAN_HIST_BY_VPA;

    public String value() {
        return name();
    }

    public static UserEntityType fromValue(String v) {
        return valueOf(v);
    }

}
