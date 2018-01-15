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
          defaultImpl = GetBankTransferTransactionResponse.class,
          visible = true)
@JsonInclude(Include.ALWAYS)
public class GetBankTransferTransactionResponse 
        extends GetTransactionResponse {
    private static final long serialVersionUID = 5234504247472767092L;
    private String url;
    private String bankTid;
    private String bank;
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
     * Transaction identifier for the bank
     */
    @JsonGetter("bank_tid")
    public String getBankTid ( ) { 
        return this.bankTid;
    }
    
    /** SETTER
     * Transaction identifier for the bank
     */
    @JsonSetter("bank_tid")
    public void setBankTid (String value) { 
        this.bankTid = value;
    }
 
    /** GETTER
     * Bank
     */
    @JsonGetter("bank")
    public String getBank ( ) { 
        return this.bank;
    }
    
    /** SETTER
     * Bank
     */
    @JsonSetter("bank")
    public void setBank (String value) { 
        this.bank = value;
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
 