/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateCardOptionsRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4674393985887864182L;
    private boolean verifyCard;
    /** GETTER
     * Indicates if the card should be verified before creation. If true, executes an authorization before saving the card.
     */
    @JsonGetter("verify_card")
    public boolean getVerifyCard ( ) { 
        return this.verifyCard;
    }
    
    /** SETTER
     * Indicates if the card should be verified before creation. If true, executes an authorization before saving the card.
     */
    @JsonSetter("verify_card")
    public void setVerifyCard (boolean value) { 
        this.verifyCard = value;
    }
 
}
 