/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
          use = JsonTypeInfo.Id.NAME,
          include = JsonTypeInfo.As.PROPERTY,
          property = "transaction_type",
          defaultImpl = GetTransactionResponse.class)
        @JsonSubTypes({
         @Type(value = GetBoletoTransactionResponse.class, name = "boleto"),
         @Type(value = GetBankTransferTransactionResponse.class, name = "bank_transfer"),
         @Type(value = GetSafetyPayTransactionResponse.class, name = "safetypay"),
         @Type(value = GetCreditCardTransactionResponse.class, name = "credit_card"),
         @Type(value = GetVoucherTransactionResponse.class, name = "voucher")
        })
public class GetTransactionResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4808690383032645789L;
    private String gatewayId;
    private int amount;
    private String status;
    private boolean success;
    private Date createdAt;
    private Date updatedAt;
    private int attemptCount;
    private int maxAttempts;
    private Date nextAttempt;
    private String transactionType;
    /** GETTER
     * Gateway transaction id
     */
    @JsonGetter("gateway_id")
    public String getGatewayId ( ) { 
        return this.gatewayId;
    }
    
    /** SETTER
     * Gateway transaction id
     */
    @JsonSetter("gateway_id")
    public void setGatewayId (String value) { 
        this.gatewayId = value;
    }
 
    /** GETTER
     * Amount in cents
     */
    @JsonGetter("amount")
    public int getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * Amount in cents
     */
    @JsonSetter("amount")
    public void setAmount (int value) { 
        this.amount = value;
    }
 
    /** GETTER
     * Transaction status
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Transaction status
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * Indicates if the transaction ocurred successfuly
     */
    @JsonGetter("success")
    public boolean getSuccess ( ) { 
        return this.success;
    }
    
    /** SETTER
     * Indicates if the transaction ocurred successfuly
     */
    @JsonSetter("success")
    public void setSuccess (boolean value) { 
        this.success = value;
    }
 
    /** GETTER
     * Creation date
     */
    @JsonGetter("created_at")
    public Date getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * Creation date
     */
    @JsonSetter("created_at")
    public void setCreatedAt (Date value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * Last update date
     */
    @JsonGetter("updated_at")
    public Date getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * Last update date
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt (Date value) { 
        this.updatedAt = value;
    }
 
    /** GETTER
     * Number of attempts tried
     */
    @JsonGetter("attempt_count")
    public int getAttemptCount ( ) { 
        return this.attemptCount;
    }
    
    /** SETTER
     * Number of attempts tried
     */
    @JsonSetter("attempt_count")
    public void setAttemptCount (int value) { 
        this.attemptCount = value;
    }
 
    /** GETTER
     * Max attempts
     */
    @JsonGetter("max_attempts")
    public int getMaxAttempts ( ) { 
        return this.maxAttempts;
    }
    
    /** SETTER
     * Max attempts
     */
    @JsonSetter("max_attempts")
    public void setMaxAttempts (int value) { 
        this.maxAttempts = value;
    }
 
    /** GETTER
     * Date and time of the next attempt
     */
    @JsonGetter("next_attempt")
    public Date getNextAttempt ( ) { 
        return this.nextAttempt;
    }
    
    /** SETTER
     * Date and time of the next attempt
     */
    @JsonSetter("next_attempt")
    public void setNextAttempt (Date value) { 
        this.nextAttempt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("transaction_type")
    public String getTransactionType ( ) { 
        return this.transactionType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("transaction_type")
    public void setTransactionType (String value) { 
        this.transactionType = value;
    }
 
}
 