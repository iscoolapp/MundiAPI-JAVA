/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateDebitCardPaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5222338614644554105L;
    private String statementDescriptor;
    private CreateCardRequest card;
    private String cardId;
    private String cardToken;
    private Boolean recurrence;
    private CreatePaymentAuthentiticationRequest authentication;
    private CreateCardPaymentTokenRequest token;
    /** GETTER
     * The text that will be shown on the debit card's statement
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor ( ) { 
        return this.statementDescriptor;
    }
    
    /** SETTER
     * The text that will be shown on the debit card's statement
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor (String value) { 
        this.statementDescriptor = value;
    }
 
    /** GETTER
     * Debit card data
     */
    @JsonGetter("card")
    public CreateCardRequest getCard ( ) { 
        return this.card;
    }
    
    /** SETTER
     * Debit card data
     */
    @JsonSetter("card")
    public void setCard (CreateCardRequest value) { 
        this.card = value;
    }
 
    /** GETTER
     * The debit card id
     */
    @JsonGetter("card_id")
    public String getCardId ( ) { 
        return this.cardId;
    }
    
    /** SETTER
     * The debit card id
     */
    @JsonSetter("card_id")
    public void setCardId (String value) { 
        this.cardId = value;
    }
 
    /** GETTER
     * The debit card token
     */
    @JsonGetter("card_token")
    public String getCardToken ( ) { 
        return this.cardToken;
    }
    
    /** SETTER
     * The debit card token
     */
    @JsonSetter("card_token")
    public void setCardToken (String value) { 
        this.cardToken = value;
    }
 
    /** GETTER
     * Indicates a recurrence
     */
    @JsonGetter("recurrence")
    public Boolean getRecurrence ( ) { 
        return this.recurrence;
    }
    
    /** SETTER
     * Indicates a recurrence
     */
    @JsonSetter("recurrence")
    public void setRecurrence (Boolean value) { 
        this.recurrence = value;
    }
 
    /** GETTER
     * The payment authentication request
     */
    @JsonGetter("authentication")
    public CreatePaymentAuthentiticationRequest getAuthentication ( ) { 
        return this.authentication;
    }
    
    /** SETTER
     * The payment authentication request
     */
    @JsonSetter("authentication")
    public void setAuthentication (CreatePaymentAuthentiticationRequest value) { 
        this.authentication = value;
    }
 
    /** GETTER
     * The Debit card payment token request
     */
    @JsonGetter("token")
    public CreateCardPaymentTokenRequest getToken ( ) { 
        return this.token;
    }
    
    /** SETTER
     * The Debit card payment token request
     */
    @JsonSetter("token")
    public void setToken (CreateCardPaymentTokenRequest value) { 
        this.token = value;
    }
 
}
 