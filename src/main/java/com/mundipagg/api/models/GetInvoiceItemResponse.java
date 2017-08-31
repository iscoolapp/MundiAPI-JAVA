/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetInvoiceItemResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5254384512967324169L;
    private int amount;
    private String description;
    private GetPricingSchemeResponse pricingScheme;
    private GetPriceBracketResponse priceBracket;
    private Integer quantity;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("amount")
    public int getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("amount")
    public void setAmount (int value) { 
        this.amount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("pricing_scheme")
    public GetPricingSchemeResponse getPricingScheme ( ) { 
        return this.pricingScheme;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme (GetPricingSchemeResponse value) { 
        this.pricingScheme = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("price_bracket")
    public GetPriceBracketResponse getPriceBracket ( ) { 
        return this.priceBracket;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("price_bracket")
    public void setPriceBracket (GetPriceBracketResponse value) { 
        this.priceBracket = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("quantity")
    public Integer getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("quantity")
    public void setQuantity (Integer value) { 
        this.quantity = value;
    }
 
}
 