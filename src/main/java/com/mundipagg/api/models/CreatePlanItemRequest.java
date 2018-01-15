/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreatePlanItemRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5712834472315983728L;
    private String name;
    private CreatePricingSchemeRequest pricingScheme;
    private String id;
    private String description;
    private Integer cycles;
    private Integer quantity;
    /** GETTER
     * Item name
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Item name
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * Item's pricing scheme
     */
    @JsonGetter("pricing_scheme")
    public CreatePricingSchemeRequest getPricingScheme ( ) { 
        return this.pricingScheme;
    }
    
    /** SETTER
     * Item's pricing scheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme (CreatePricingSchemeRequest value) { 
        this.pricingScheme = value;
    }
 
    /** GETTER
     * Item's id
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * Item's id
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * Item's description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Item's description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Number of cycles where the item will be charged
     */
    @JsonGetter("cycles")
    public Integer getCycles ( ) { 
        return this.cycles;
    }
    
    /** SETTER
     * Number of cycles where the item will be charged
     */
    @JsonSetter("cycles")
    public void setCycles (Integer value) { 
        this.cycles = value;
    }
 
    /** GETTER
     * Quantity
     */
    @JsonGetter("quantity")
    public Integer getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * Quantity
     */
    @JsonSetter("quantity")
    public void setQuantity (Integer value) { 
        this.quantity = value;
    }
 
}
 