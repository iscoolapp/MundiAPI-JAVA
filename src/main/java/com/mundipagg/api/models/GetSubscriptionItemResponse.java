/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mundipagg.api.DateTimeHelper;
import org.joda.time.DateTime;

public class GetSubscriptionItemResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4625681391307367970L;
    private String id;
    private String description;
    private String status;
    private DateTime createdAt;
    private DateTime updatedAt;
    private GetPricingSchemeResponse pricingScheme;
    private List<GetDiscountResponse> discounts;
    private GetSubscriptionResponse subscription;
    private String name;
    private Integer quantity;
    private Integer cycles;
    private DateTime deletedAt;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
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
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("created_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt (DateTime value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt (DateTime value) { 
        this.updatedAt = value;
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
    @JsonGetter("discounts")
    public List<GetDiscountResponse> getDiscounts ( ) { 
        return this.discounts;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("discounts")
    public void setDiscounts (List<GetDiscountResponse> value) { 
        this.discounts = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("subscription")
    public GetSubscriptionResponse getSubscription ( ) { 
        return this.subscription;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("subscription")
    public void setSubscription (GetSubscriptionResponse value) { 
        this.subscription = value;
    }
 
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cycles")
    public Integer getCycles ( ) { 
        return this.cycles;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cycles")
    public void setCycles (Integer value) { 
        this.cycles = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("deleted_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getDeletedAt ( ) { 
        return this.deletedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("deleted_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDeletedAt (DateTime value) { 
        this.deletedAt = value;
    }
 
}
 