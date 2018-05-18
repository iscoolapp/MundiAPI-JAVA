/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mundipagg.api.DateTimeHelper;
import org.joda.time.DateTime;

@JsonTypeInfo(
          use = JsonTypeInfo.Id.NAME,
          include = JsonTypeInfo.As.EXISTING_PROPERTY,
          property = "transaction_type",
          defaultImpl = GetSafetyPayTransactionResponse.class,
          visible = true)
@JsonInclude(Include.ALWAYS)
public class GetSafetyPayTransactionResponse 
        extends GetTransactionResponse {
    private static final long serialVersionUID = 5016774102988193853L;
    private String url;
    private String bankTid;
    private DateTime paidAt;
    private Integer paidAmount;
    /** GETTER
     * Payment url
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * Payment url
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
    /** GETTER
     * Transaction identifier on bank
     */
    @JsonGetter("bank_tid")
    public String getBankTid ( ) { 
        return this.bankTid;
    }
    
    /** SETTER
     * Transaction identifier on bank
     */
    @JsonSetter("bank_tid")
    public void setBankTid (String value) { 
        this.bankTid = value;
    }
 
    /** GETTER
     * Payment date
     */
    @JsonGetter("paid_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getPaidAt ( ) { 
        return this.paidAt;
    }
    
    /** SETTER
     * Payment date
     */
    @JsonSetter("paid_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setPaidAt (DateTime value) { 
        this.paidAt = value;
    }
 
    /** GETTER
     * Paid amount
     */
    @JsonGetter("paid_amount")
    public Integer getPaidAmount ( ) { 
        return this.paidAmount;
    }
    
    /** SETTER
     * Paid amount
     */
    @JsonSetter("paid_amount")
    public void setPaidAmount (Integer value) { 
        this.paidAmount = value;
    }
 
}
 