/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Create3DSAuthentiticationRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5578324211674581456L;
    private String mpi;
    private String cavv;
    private String eci;
    private String transactionId;
    private String successUrl;
    /** GETTER
     * The MPI Vendor (MerchantPlugin)
     */
    @JsonGetter("mpi")
    public String getMpi ( ) { 
        return this.mpi;
    }
    
    /** SETTER
     * The MPI Vendor (MerchantPlugin)
     */
    @JsonSetter("mpi")
    public void setMpi (String value) { 
        this.mpi = value;
    }
 
    /** GETTER
     * The Cardholder Authentication Verification value
     */
    @JsonGetter("cavv")
    public String getCavv ( ) { 
        return this.cavv;
    }
    
    /** SETTER
     * The Cardholder Authentication Verification value
     */
    @JsonSetter("cavv")
    public void setCavv (String value) { 
        this.cavv = value;
    }
 
    /** GETTER
     * The Electronic Commerce Indicator value
     */
    @JsonGetter("eci")
    public String getEci ( ) { 
        return this.eci;
    }
    
    /** SETTER
     * The Electronic Commerce Indicator value
     */
    @JsonSetter("eci")
    public void setEci (String value) { 
        this.eci = value;
    }
 
    /** GETTER
     * The TransactionId value (XID)
     */
    @JsonGetter("transaction_id")
    public String getTransactionId ( ) { 
        return this.transactionId;
    }
    
    /** SETTER
     * The TransactionId value (XID)
     */
    @JsonSetter("transaction_id")
    public void setTransactionId (String value) { 
        this.transactionId = value;
    }
 
    /** GETTER
     * The success URL after the authentication
     */
    @JsonGetter("success_url")
    public String getSuccessUrl ( ) { 
        return this.successUrl;
    }
    
    /** SETTER
     * The success URL after the authentication
     */
    @JsonSetter("success_url")
    public void setSuccessUrl (String value) { 
        this.successUrl = value;
    }
 
}
 