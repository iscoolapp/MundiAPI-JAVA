/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListAccessTokensResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4904159625850979163L;
    private List<GetAccessTokenResponse> data;
    private PagingResponse paging;
    /** GETTER
     * The access token objects
     */
    @JsonGetter("data")
    public List<GetAccessTokenResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The access token objects
     */
    @JsonSetter("data")
    public void setData (List<GetAccessTokenResponse> value) { 
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
 