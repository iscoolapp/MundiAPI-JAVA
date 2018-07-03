/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListInvoicesResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4859674837168430493L;
    private List<GetInvoiceResponse> data;
    private PagingResponse paging;
    /** GETTER
     * The Invoice objects
     */
    @JsonGetter("data")
    public List<GetInvoiceResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The Invoice objects
     */
    @JsonSetter("data")
    public void setData (List<GetInvoiceResponse> value) { 
        this.data = value;
    }
 
    /** GETTER
     * Paging object
     */
    @JsonGetter("paging")
    public PagingResponse getPaging ( ) { 
        return this.paging;
    }
    
    /** SETTER
     * Paging object
     */
    @JsonSetter("paging")
    public void setPaging (PagingResponse value) { 
        this.paging = value;
    }
 
}
 