/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreatePlanRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5384440829328198189L;
    private String name;
    private String description;
    private String statementDescriptor;
    private List<CreatePlanItemRequest> items;
    private boolean shippable;
    private List<String> paymentMethods;
    private List<Integer> installments;
    private String currency;
    private String interval;
    private int intervalCount;
    private List<Integer> billingDays;
    private String billingType;
    private CreatePricingSchemeRequest pricingScheme;
    private LinkedHashMap<String, String> metadata;
    private Integer minimumPrice;
    private Integer cycles;
    private Integer quantity;
    private Integer trialPeriodDays;
    /** GETTER
     * Plan's name
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Plan's name
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * Description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Text that will be printed on the credit card's statement
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor ( ) { 
        return this.statementDescriptor;
    }
    
    /** SETTER
     * Text that will be printed on the credit card's statement
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor (String value) { 
        this.statementDescriptor = value;
    }
 
    /** GETTER
     * Plan items
     */
    @JsonGetter("items")
    public List<CreatePlanItemRequest> getItems ( ) { 
        return this.items;
    }
    
    /** SETTER
     * Plan items
     */
    @JsonSetter("items")
    public void setItems (List<CreatePlanItemRequest> value) { 
        this.items = value;
    }
 
    /** GETTER
     * Indicates if the plan is shippable
     */
    @JsonGetter("shippable")
    public boolean getShippable ( ) { 
        return this.shippable;
    }
    
    /** SETTER
     * Indicates if the plan is shippable
     */
    @JsonSetter("shippable")
    public void setShippable (boolean value) { 
        this.shippable = value;
    }
 
    /** GETTER
     * Allowed payment methods for the plan
     */
    @JsonGetter("payment_methods")
    public List<String> getPaymentMethods ( ) { 
        return this.paymentMethods;
    }
    
    /** SETTER
     * Allowed payment methods for the plan
     */
    @JsonSetter("payment_methods")
    public void setPaymentMethods (List<String> value) { 
        this.paymentMethods = value;
    }
 
    /** GETTER
     * Number of installments
     */
    @JsonGetter("installments")
    public List<Integer> getInstallments ( ) { 
        return this.installments;
    }
    
    /** SETTER
     * Number of installments
     */
    @JsonSetter("installments")
    public void setInstallments (List<Integer> value) { 
        this.installments = value;
    }
 
    /** GETTER
     * Currency
     */
    @JsonGetter("currency")
    public String getCurrency ( ) { 
        return this.currency;
    }
    
    /** SETTER
     * Currency
     */
    @JsonSetter("currency")
    public void setCurrency (String value) { 
        this.currency = value;
    }
 
    /** GETTER
     * Interval
     */
    @JsonGetter("interval")
    public String getInterval ( ) { 
        return this.interval;
    }
    
    /** SETTER
     * Interval
     */
    @JsonSetter("interval")
    public void setInterval (String value) { 
        this.interval = value;
    }
 
    /** GETTER
     * Interval counts between two charges. For instance, if the interval is 'month' and count is 2, the customer will be charged once every two months.
     */
    @JsonGetter("interval_count")
    public int getIntervalCount ( ) { 
        return this.intervalCount;
    }
    
    /** SETTER
     * Interval counts between two charges. For instance, if the interval is 'month' and count is 2, the customer will be charged once every two months.
     */
    @JsonSetter("interval_count")
    public void setIntervalCount (int value) { 
        this.intervalCount = value;
    }
 
    /** GETTER
     * Allowed billings days for the subscription, in case the plan type is 'exact_day'
     */
    @JsonGetter("billing_days")
    public List<Integer> getBillingDays ( ) { 
        return this.billingDays;
    }
    
    /** SETTER
     * Allowed billings days for the subscription, in case the plan type is 'exact_day'
     */
    @JsonSetter("billing_days")
    public void setBillingDays (List<Integer> value) { 
        this.billingDays = value;
    }
 
    /** GETTER
     * Billing type
     */
    @JsonGetter("billing_type")
    public String getBillingType ( ) { 
        return this.billingType;
    }
    
    /** SETTER
     * Billing type
     */
    @JsonSetter("billing_type")
    public void setBillingType (String value) { 
        this.billingType = value;
    }
 
    /** GETTER
     * Plan's pricing scheme
     */
    @JsonGetter("pricing_scheme")
    public CreatePricingSchemeRequest getPricingScheme ( ) { 
        return this.pricingScheme;
    }
    
    /** SETTER
     * Plan's pricing scheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme (CreatePricingSchemeRequest value) { 
        this.pricingScheme = value;
    }
 
    /** GETTER
     * Metadata
     */
    @JsonGetter("metadata")
    public LinkedHashMap<String, String> getMetadata ( ) { 
        return this.metadata;
    }
    
    /** SETTER
     * Metadata
     */
    @JsonSetter("metadata")
    public void setMetadata (LinkedHashMap<String, String> value) { 
        this.metadata = value;
    }
 
    /** GETTER
     * Minimum price that will be charged
     */
    @JsonGetter("minimum_price")
    public Integer getMinimumPrice ( ) { 
        return this.minimumPrice;
    }
    
    /** SETTER
     * Minimum price that will be charged
     */
    @JsonSetter("minimum_price")
    public void setMinimumPrice (Integer value) { 
        this.minimumPrice = value;
    }
 
    /** GETTER
     * Number of cycles
     */
    @JsonGetter("cycles")
    public Integer getCycles ( ) { 
        return this.cycles;
    }
    
    /** SETTER
     * Number of cycles
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
 
    /** GETTER
     * Trial period, where the customer will not be charged.
     */
    @JsonGetter("trial_period_days")
    public Integer getTrialPeriodDays ( ) { 
        return this.trialPeriodDays;
    }
    
    /** SETTER
     * Trial period, where the customer will not be charged.
     */
    @JsonSetter("trial_period_days")
    public void setTrialPeriodDays (Integer value) { 
        this.trialPeriodDays = value;
    }
 
}
 