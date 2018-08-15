/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateCancelChargeRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -3574134554035954985L;
    private Integer amount;
    private List<CreateCancelChargeSplitRulesRequest> splitRules;
    /** GETTER
     * The amount that will be canceled.
     */
    @JsonGetter("amount")
    public Integer getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * The amount that will be canceled.
     */
    @JsonSetter("amount")
    public void setAmount (Integer value) { 
        this.amount = value;
    }
 
    /** GETTER
     * The split rules request
     */
    @JsonGetter("split_rules")
    public List<CreateCancelChargeSplitRulesRequest> getSplitRules ( ) { 
        return this.splitRules;
    }
    
    /** SETTER
     * The split rules request
     */
    @JsonSetter("split_rules")
    public void setSplitRules (List<CreateCancelChargeSplitRulesRequest> value) { 
        this.splitRules = value;
    }
 
}
 