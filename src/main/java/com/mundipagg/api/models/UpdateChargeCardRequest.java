/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdateChargeCardRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4738252606658024713L;
    private boolean updateSubscription;
    private String cardId;
    private CreateCardRequest card;
    private boolean recurrence;
    /** GETTER
     * Indicates if the subscriptions using this card must also be updated
     */
    @JsonGetter("update_subscription")
    public boolean getUpdateSubscription ( ) { 
        return this.updateSubscription;
    }
    
    /** SETTER
     * Indicates if the subscriptions using this card must also be updated
     */
    @JsonSetter("update_subscription")
    public void setUpdateSubscription (boolean value) { 
        this.updateSubscription = value;
    }
 
    /** GETTER
     * Card id
     */
    @JsonGetter("card_id")
    public String getCardId ( ) { 
        return this.cardId;
    }
    
    /** SETTER
     * Card id
     */
    @JsonSetter("card_id")
    public void setCardId (String value) { 
        this.cardId = value;
    }
 
    /** GETTER
     * Card data
     */
    @JsonGetter("card")
    public CreateCardRequest getCard ( ) { 
        return this.card;
    }
    
    /** SETTER
     * Card data
     */
    @JsonSetter("card")
    public void setCard (CreateCardRequest value) { 
        this.card = value;
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
 
}
 