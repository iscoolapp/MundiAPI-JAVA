/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetCardTokenResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5660008142629852762L;
    private String lastFourDigits;
    private String holderName;
    private String holderDocument;
    private String expMonth;
    private String expYear;
    private String brand;
    private String type;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("last_four_digits")
    public String getLastFourDigits ( ) { 
        return this.lastFourDigits;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("last_four_digits")
    public void setLastFourDigits (String value) { 
        this.lastFourDigits = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("holder_name")
    public String getHolderName ( ) { 
        return this.holderName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("holder_name")
    public void setHolderName (String value) { 
        this.holderName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("holder_document")
    public String getHolderDocument ( ) { 
        return this.holderDocument;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("holder_document")
    public void setHolderDocument (String value) { 
        this.holderDocument = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("exp_month")
    public String getExpMonth ( ) { 
        return this.expMonth;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("exp_month")
    public void setExpMonth (String value) { 
        this.expMonth = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("exp_year")
    public String getExpYear ( ) { 
        return this.expYear;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("exp_year")
    public void setExpYear (String value) { 
        this.expYear = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("brand")
    public String getBrand ( ) { 
        return this.brand;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("brand")
    public void setBrand (String value) { 
        this.brand = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
}
 