/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class ListInvoicesResponseBuilder {
    //the instance to build
    private ListInvoicesResponse listInvoicesResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ListInvoicesResponseBuilder() {
        listInvoicesResponse = new ListInvoicesResponse();
    }

    /**
     * The Invoice objects
     */
    public ListInvoicesResponseBuilder data(List<GetInvoiceResponse> data) {
        listInvoicesResponse.setData(data);
        return this;
    }

    /**
     * Paging object
     */
    public ListInvoicesResponseBuilder paging(PagingResponse paging) {
        listInvoicesResponse.setPaging(paging);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListInvoicesResponse build() {
        return listInvoicesResponse;
    }
}