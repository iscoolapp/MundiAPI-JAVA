/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateCardPaymentTokenRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 314650800531564025L;
    private String type;
    private ApplePayRequest applePay;
    /** GETTER
     * The authentication type
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * The authentication type
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * The apple pay authentication request
     */
    @JsonGetter("apple_pay")
    public ApplePayRequest getApplePay ( ) { 
        return this.applePay;
    }
    
    /** SETTER
     * The apple pay authentication request
     */
    @JsonSetter("apple_pay")
    public void setApplePay (ApplePayRequest value) { 
        this.applePay = value;
    }
 
}
 