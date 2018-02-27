/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdateSubscriptionCardRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5308048473417131888L;
    private CreateCardRequest card;
    private String cardId;
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
     * Credit card id
     */
    @JsonGetter("card_id")
    public String getCardId ( ) { 
        return this.cardId;
    }
    
    /** SETTER
     * Credit card id
     */
    @JsonSetter("card_id")
    public void setCardId (String value) { 
        this.cardId = value;
    }
 
}
 