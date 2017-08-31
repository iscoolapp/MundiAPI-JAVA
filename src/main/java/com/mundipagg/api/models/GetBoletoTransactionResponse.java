/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetBoletoTransactionResponse 
        extends GetTransactionResponse {
    private static final long serialVersionUID = 5483397628619236962L;
    private String url;
    private String barCode;
    private String nossoNumero;
    private String bank;
    private String documentNumber;
    private String instructions;
    private GetBillingAddressResponse billingAddress;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("bar_code")
    public String getBarCode ( ) { 
        return this.barCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("bar_code")
    public void setBarCode (String value) { 
        this.barCode = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("nosso_numero")
    public String getNossoNumero ( ) { 
        return this.nossoNumero;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("nosso_numero")
    public void setNossoNumero (String value) { 
        this.nossoNumero = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("bank")
    public String getBank ( ) { 
        return this.bank;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("bank")
    public void setBank (String value) { 
        this.bank = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("document_number")
    public String getDocumentNumber ( ) { 
        return this.documentNumber;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("document_number")
    public void setDocumentNumber (String value) { 
        this.documentNumber = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("instructions")
    public String getInstructions ( ) { 
        return this.instructions;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("instructions")
    public void setInstructions (String value) { 
        this.instructions = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("billing_address")
    public GetBillingAddressResponse getBillingAddress ( ) { 
        return this.billingAddress;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("billing_address")
    public void setBillingAddress (GetBillingAddressResponse value) { 
        this.billingAddress = value;
    }
 
}
 