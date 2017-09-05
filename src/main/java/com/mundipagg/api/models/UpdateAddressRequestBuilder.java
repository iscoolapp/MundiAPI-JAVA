/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class UpdateAddressRequestBuilder {
    //the instance to build
    private UpdateAddressRequest updateAddressRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateAddressRequestBuilder() {
        updateAddressRequest = new UpdateAddressRequest();
    }

    /**
     * Number
     */
    public UpdateAddressRequestBuilder number(String number) {
        updateAddressRequest.setNumber(number);
        return this;
    }

    /**
     * Complement
     */
    public UpdateAddressRequestBuilder complement(String complement) {
        updateAddressRequest.setComplement(complement);
        return this;
    }

    /**
     * Metadata
     */
    public UpdateAddressRequestBuilder metadata(LinkedHashMap<String, String> metadata) {
        updateAddressRequest.setMetadata(metadata);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateAddressRequest build() {
        return updateAddressRequest;
    }
}