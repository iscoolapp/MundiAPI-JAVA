/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateCustomerRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5229675480007086388L;
    private String name;
    private String email;
    private String document;
    private String type;
    private CreateAddressRequest address;
    private LinkedHashMap<String, String> metadata;
    private CreatePhonesRequest phones;
    private String code;
    private String gender;
    /** GETTER
     * Name
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Name
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * Email
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * Email
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * Document number. Only numbers, no special characters.
     */
    @JsonGetter("document")
    public String getDocument ( ) { 
        return this.document;
    }
    
    /** SETTER
     * Document number. Only numbers, no special characters.
     */
    @JsonSetter("document")
    public void setDocument (String value) { 
        this.document = value;
    }
 
    /** GETTER
     * Person type. Can be either 'individual' or 'company'
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Person type. Can be either 'individual' or 'company'
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * The customer's address
     */
    @JsonGetter("address")
    public CreateAddressRequest getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * The customer's address
     */
    @JsonSetter("address")
    public void setAddress (CreateAddressRequest value) { 
        this.address = value;
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
     * TODO: Write general description for this method
     */
    @JsonGetter("phones")
    public CreatePhonesRequest getPhones ( ) { 
        return this.phones;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("phones")
    public void setPhones (CreatePhonesRequest value) { 
        this.phones = value;
    }
 
    /** GETTER
     * Customer code
     */
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * Customer code
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * Customer Gender
     */
    @JsonGetter("gender")
    public String getGender ( ) { 
        return this.gender;
    }
    
    /** SETTER
     * Customer Gender
     */
    @JsonSetter("gender")
    public void setGender (String value) { 
        this.gender = value;
    }
 
}
 