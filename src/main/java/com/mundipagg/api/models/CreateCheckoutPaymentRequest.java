/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateCheckoutPaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5511524815036063896L;
    private List<String> acceptedPaymentMethods;
    private List<Object> acceptedMultiPaymentMethods;
    private String successUrl;
    private boolean skipCheckoutSuccessPage;
    private boolean billingAddressEditable;
    private CreateAddressRequest billingAddress;
    private String defaultPaymentMethod;
    private String gatewayAffiliationId;
    private CreateCheckoutCardPaymentRequest creditCard;
    private CreateCheckoutBoletoPaymentRequest boleto;
    private Boolean customerEditable;
    private Integer expiresIn;
    /** GETTER
     * Accepted Payment Methods
     */
    @JsonGetter("accepted_payment_methods")
    public List<String> getAcceptedPaymentMethods ( ) { 
        return this.acceptedPaymentMethods;
    }
    
    /** SETTER
     * Accepted Payment Methods
     */
    @JsonSetter("accepted_payment_methods")
    public void setAcceptedPaymentMethods (List<String> value) { 
        this.acceptedPaymentMethods = value;
    }
 
    /** GETTER
     * Accepted Multi Payment Methods
     */
    @JsonGetter("accepted_multi_payment_methods")
    public List<Object> getAcceptedMultiPaymentMethods ( ) { 
        return this.acceptedMultiPaymentMethods;
    }
    
    /** SETTER
     * Accepted Multi Payment Methods
     */
    @JsonSetter("accepted_multi_payment_methods")
    public void setAcceptedMultiPaymentMethods (List<Object> value) { 
        this.acceptedMultiPaymentMethods = value;
    }
 
    /** GETTER
     * Success url
     */
    @JsonGetter("success_url")
    public String getSuccessUrl ( ) { 
        return this.successUrl;
    }
    
    /** SETTER
     * Success url
     */
    @JsonSetter("success_url")
    public void setSuccessUrl (String value) { 
        this.successUrl = value;
    }
 
    /** GETTER
     * Pular tela de sucesso pós-pagamento?
     */
    @JsonGetter("skip_checkout_success_page")
    public boolean getSkipCheckoutSuccessPage ( ) { 
        return this.skipCheckoutSuccessPage;
    }
    
    /** SETTER
     * Pular tela de sucesso pós-pagamento?
     */
    @JsonSetter("skip_checkout_success_page")
    public void setSkipCheckoutSuccessPage (boolean value) { 
        this.skipCheckoutSuccessPage = value;
    }
 
    /** GETTER
     * Torna o objeto billing address editável
     */
    @JsonGetter("billing_address_editable")
    public boolean getBillingAddressEditable ( ) { 
        return this.billingAddressEditable;
    }
    
    /** SETTER
     * Torna o objeto billing address editável
     */
    @JsonSetter("billing_address_editable")
    public void setBillingAddressEditable (boolean value) { 
        this.billingAddressEditable = value;
    }
 
    /** GETTER
     * Endereço de cobrança
     */
    @JsonGetter("billing_address")
    public CreateAddressRequest getBillingAddress ( ) { 
        return this.billingAddress;
    }
    
    /** SETTER
     * Endereço de cobrança
     */
    @JsonSetter("billing_address")
    public void setBillingAddress (CreateAddressRequest value) { 
        this.billingAddress = value;
    }
 
    /** GETTER
     * Default payment method
     */
    @JsonGetter("default_payment_method")
    public String getDefaultPaymentMethod ( ) { 
        return this.defaultPaymentMethod;
    }
    
    /** SETTER
     * Default payment method
     */
    @JsonSetter("default_payment_method")
    public void setDefaultPaymentMethod (String value) { 
        this.defaultPaymentMethod = value;
    }
 
    /** GETTER
     * Gateway Affiliation Id
     */
    @JsonGetter("gateway_affiliation_id")
    public String getGatewayAffiliationId ( ) { 
        return this.gatewayAffiliationId;
    }
    
    /** SETTER
     * Gateway Affiliation Id
     */
    @JsonSetter("gateway_affiliation_id")
    public void setGatewayAffiliationId (String value) { 
        this.gatewayAffiliationId = value;
    }
 
    /** GETTER
     * Card payment request
     */
    @JsonGetter("credit_card")
    public CreateCheckoutCardPaymentRequest getCreditCard ( ) { 
        return this.creditCard;
    }
    
    /** SETTER
     * Card payment request
     */
    @JsonSetter("credit_card")
    public void setCreditCard (CreateCheckoutCardPaymentRequest value) { 
        this.creditCard = value;
    }
 
    /** GETTER
     * Boleto payment request
     */
    @JsonGetter("boleto")
    public CreateCheckoutBoletoPaymentRequest getBoleto ( ) { 
        return this.boleto;
    }
    
    /** SETTER
     * Boleto payment request
     */
    @JsonSetter("boleto")
    public void setBoleto (CreateCheckoutBoletoPaymentRequest value) { 
        this.boleto = value;
    }
 
    /** GETTER
     * Torna o objeto editável
     */
    @JsonGetter("customer_editable")
    public Boolean getCustomerEditable ( ) { 
        return this.customerEditable;
    }
    
    /** SETTER
     * Torna o objeto editável
     */
    @JsonSetter("customer_editable")
    public void setCustomerEditable (Boolean value) { 
        this.customerEditable = value;
    }
 
    /** GETTER
     * Tempo em minutos para a expiração
     */
    @JsonGetter("expires_in")
    public Integer getExpiresIn ( ) { 
        return this.expiresIn;
    }
    
    /** SETTER
     * Tempo em minutos para a expiração
     */
    @JsonSetter("expires_in")
    public void setExpiresIn (Integer value) { 
        this.expiresIn = value;
    }
 
}
 