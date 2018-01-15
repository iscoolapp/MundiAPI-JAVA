/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateAccessTokenRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5485066865560784024L;
    private Integer expiresIn;
    /** GETTER
     * Minutes to expire the token
     */
    @JsonGetter("expires_in")
    public Integer getExpiresIn ( ) { 
        return this.expiresIn;
    }
    
    /** SETTER
     * Minutes to expire the token
     */
    @JsonSetter("expires_in")
    public void setExpiresIn (Integer value) { 
        this.expiresIn = value;
    }
 
}
 