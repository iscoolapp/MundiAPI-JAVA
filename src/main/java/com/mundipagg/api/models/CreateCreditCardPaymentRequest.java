/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateCreditCardPaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5634778611192379462L;
    private int installments = 1;
    private String statementDescriptor;
    private CreateCardRequest card;
    private int retries;
    private boolean updateSubscriptionCard;
    private String cardId;
    private String cardToken;
    private boolean recurrence;
    private Boolean capture = true;
    /** GETTER
     * Number of installments
     */
    @JsonGetter("installments")
    public int getInstallments ( ) { 
        return this.installments;
    }
    
    /** SETTER
     * Number of installments
     */
    @JsonSetter("installments")
    public void setInstallments (int value) { 
        this.installments = value;
    }
 
    /** GETTER
     * The text that will be shown on the credit card's statement
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor ( ) { 
        return this.statementDescriptor;
    }
    
    /** SETTER
     * The text that will be shown on the credit card's statement
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor (String value) { 
        this.statementDescriptor = value;
    }
 
    /** GETTER
     * Credit card data
     */
    @JsonGetter("card")
    public CreateCardRequest getCard ( ) { 
        return this.card;
    }
    
    /** SETTER
     * Credit card data
     */
    @JsonSetter("card")
    public void setCard (CreateCardRequest value) { 
        this.card = value;
    }
 
    /** GETTER
     * Number of retries
     */
    @JsonGetter("retries")
    public int getRetries ( ) { 
        return this.retries;
    }
    
    /** SETTER
     * Number of retries
     */
    @JsonSetter("retries")
    public void setRetries (int value) { 
        this.retries = value;
    }
 
    /** GETTER
     * Indicates if the card from the subscription must be updated
     */
    @JsonGetter("update_subscription_card")
    public boolean getUpdateSubscriptionCard ( ) { 
        return this.updateSubscriptionCard;
    }
    
    /** SETTER
     * Indicates if the card from the subscription must be updated
     */
    @JsonSetter("update_subscription_card")
    public void setUpdateSubscriptionCard (boolean value) { 
        this.updateSubscriptionCard = value;
    }
 
    /** GETTER
     * The credit card id
     */
    @JsonGetter("card_id")
    public String getCardId ( ) { 
        return this.cardId;
    }
    
    /** SETTER
     * The credit card id
     */
    @JsonSetter("card_id")
    public void setCardId (String value) { 
        this.cardId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("card_token")
    public String getCardToken ( ) { 
        return this.cardToken;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("card_token")
    public void setCardToken (String value) { 
        this.cardToken = value;
    }
 
    /** GETTER
     * Indicates a recurrence
     */
    @JsonGetter("recurrence")
    public boolean getRecurrence ( ) { 
        return this.recurrence;
    }
    
    /** SETTER
     * Indicates a recurrence
     */
    @JsonSetter("recurrence")
    public void setRecurrence (boolean value) { 
        this.recurrence = value;
    }
 
    /** GETTER
     * Indicates if the operation should be only authorization or auth and capture.
     */
    @JsonGetter("capture")
    public Boolean getCapture ( ) { 
        return this.capture;
    }
    
    /** SETTER
     * Indicates if the operation should be only authorization or auth and capture.
     */
    @JsonSetter("capture")
    public void setCapture (Boolean value) { 
        this.capture = value;
    }
 
}
 