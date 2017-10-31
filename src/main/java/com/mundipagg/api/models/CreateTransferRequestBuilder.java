/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreateTransferRequestBuilder {
    //the instance to build
    private CreateTransferRequest createTransferRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateTransferRequestBuilder() {
        createTransferRequest = new CreateTransferRequest();
    }

    /**
     * Transfer amount
     */
    public CreateTransferRequestBuilder amount(int amount) {
        createTransferRequest.setAmount(amount);
        return this;
    }

    /**
     * Metadata
     */
    public CreateTransferRequestBuilder metadata(LinkedHashMap<String, String> metadata) {
        createTransferRequest.setMetadata(metadata);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateTransferRequest build() {
        return createTransferRequest;
    }
}