/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateSplitRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5662255533645794137L;
    private String type;
    private int amount;
    private String recipientId;
    /** GETTER
     * Split type
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Split type
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * Amount
     */
    @JsonGetter("amount")
    public int getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * Amount
     */
    @JsonSetter("amount")
    public void setAmount (int value) { 
        this.amount = value;
    }
 
    /** GETTER
     * Recipient id
     */
    @JsonGetter("recipient_id")
    public String getRecipientId ( ) { 
        return this.recipientId;
    }
    
    /** SETTER
     * Recipient id
     */
    @JsonSetter("recipient_id")
    public void setRecipientId (String value) { 
        this.recipientId = value;
    }
 
}
 