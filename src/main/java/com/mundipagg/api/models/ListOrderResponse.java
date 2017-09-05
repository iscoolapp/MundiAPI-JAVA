/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListOrderResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5080826196957865196L;
    private List<GetOrderResponse> data;
    private PagingResponse paging;
    /** GETTER
     * The order object
     */
    @JsonGetter("data")
    public List<GetOrderResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The order object
     */
    @JsonSetter("data")
    public void setData (List<GetOrderResponse> value) { 
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
 