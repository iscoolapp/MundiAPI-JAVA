/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class GetTransferResponseBuilder {
    //the instance to build
    private GetTransferResponse getTransferResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetTransferResponseBuilder() {
        getTransferResponse = new GetTransferResponse();
    }

    /**
     * Id
     */
    public GetTransferResponseBuilder id(String id) {
        getTransferResponse.setId(id);
        return this;
    }

    /**
     * Transfer amount
     */
    public GetTransferResponseBuilder amount(int amount) {
        getTransferResponse.setAmount(amount);
        return this;
    }

    /**
     * Transfer status
     */
    public GetTransferResponseBuilder status(String status) {
        getTransferResponse.setStatus(status);
        return this;
    }

    /**
     * Transfer creation date
     */
    public GetTransferResponseBuilder createdAt(DateTime createdAt) {
        getTransferResponse.setCreatedAt(createdAt);
        return this;
    }

    /**
     * Transfer last update date
     */
    public GetTransferResponseBuilder updatedAt(DateTime updatedAt) {
        getTransferResponse.setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * Bank account
     */
    public GetTransferResponseBuilder bankAccount(GetBankAccountResponse bankAccount) {
        getTransferResponse.setBankAccount(bankAccount);
        return this;
    }

    /**
     * Metadata
     */
    public GetTransferResponseBuilder metadata(LinkedHashMap<String, String> metadata) {
        getTransferResponse.setMetadata(metadata);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetTransferResponse build() {
        return getTransferResponse;
    }
}