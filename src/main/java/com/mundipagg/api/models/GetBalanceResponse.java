/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetBalanceResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4754848162821984095L;
    private String currency;
    private int availableAmount;
    private GetRecipientResponse recipient;
    /** GETTER
     * Currency
     */
    @JsonGetter("currency")
    public String getCurrency ( ) { 
        return this.currency;
    }
    
    /** SETTER
     * Currency
     */
    @JsonSetter("currency")
    public void setCurrency (String value) { 
        this.currency = value;
    }
 
    /** GETTER
     * Amount available for transferring
     */
    @JsonGetter("available_amount")
    public int getAvailableAmount ( ) { 
        return this.availableAmount;
    }
    
    /** SETTER
     * Amount available for transferring
     */
    @JsonSetter("available_amount")
    public void setAvailableAmount (int value) { 
        this.availableAmount = value;
    }
 
    /** GETTER
     * Recipient
     */
    @JsonGetter("recipient")
    public GetRecipientResponse getRecipient ( ) { 
        return this.recipient;
    }
    
    /** SETTER
     * Recipient
     */
    @JsonSetter("recipient")
    public void setRecipient (GetRecipientResponse value) { 
        this.recipient = value;
    }
 
}
 