/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateVoucherPaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5496494972719393164L;
    private boolean capture;
    private String statementDescriptor;
    private String cardId;
    private String cardToken;
    private CreateCardRequest card;
    /** GETTER
     * Indicates if the operation should be only authorization or auth and capture.
     */
    @JsonGetter("capture")
    public boolean getCapture ( ) { 
        return this.capture;
    }
    
    /** SETTER
     * Indicates if the operation should be only authorization or auth and capture.
     */
    @JsonSetter("capture")
    public void setCapture (boolean value) { 
        this.capture = value;
    }
 
    /** GETTER
     * The text that will be shown on the voucher's statement
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor ( ) { 
        return this.statementDescriptor;
    }
    
    /** SETTER
     * The text that will be shown on the voucher's statement
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor (String value) { 
        this.statementDescriptor = value;
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
     * Card token
     */
    @JsonGetter("card_token")
    public String getCardToken ( ) { 
        return this.cardToken;
    }
    
    /** SETTER
     * Card token
     */
    @JsonSetter("card_token")
    public void setCardToken (String value) { 
        this.cardToken = value;
    }
 
    /** GETTER
     * Card info
     */
    @JsonGetter("Card")
    public CreateCardRequest getCard ( ) { 
        return this.card;
    }
    
    /** SETTER
     * Card info
     */
    @JsonSetter("Card")
    public void setCard (CreateCardRequest value) { 
        this.card = value;
    }
 
}
 