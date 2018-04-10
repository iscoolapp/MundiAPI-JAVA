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

public class UpdateSubscriptionBillingDateRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5005513124067353229L;
    private DateTime nextBillingAt;
    /** GETTER
     * The date when the next subscription billing must occur
     */
    @JsonGetter("next_billing_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getNextBillingAt ( ) { 
        return this.nextBillingAt;
    }
    
    /** SETTER
     * The date when the next subscription billing must occur
     */
    @JsonSetter("next_billing_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setNextBillingAt (DateTime value) { 
        this.nextBillingAt = value;
    }
 
}
 