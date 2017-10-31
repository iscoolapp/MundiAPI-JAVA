/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class GetSubscriptionItemResponseBuilder {
    //the instance to build
    private GetSubscriptionItemResponse getSubscriptionItemResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetSubscriptionItemResponseBuilder() {
        getSubscriptionItemResponse = new GetSubscriptionItemResponse();
    }

    public GetSubscriptionItemResponseBuilder id(String id) {
        getSubscriptionItemResponse.setId(id);
        return this;
    }

    public GetSubscriptionItemResponseBuilder description(String description) {
        getSubscriptionItemResponse.setDescription(description);
        return this;
    }

    public GetSubscriptionItemResponseBuilder status(String status) {
        getSubscriptionItemResponse.setStatus(status);
        return this;
    }

    public GetSubscriptionItemResponseBuilder createdAt(DateTime createdAt) {
        getSubscriptionItemResponse.setCreatedAt(createdAt);
        return this;
    }

    public GetSubscriptionItemResponseBuilder updatedAt(DateTime updatedAt) {
        getSubscriptionItemResponse.setUpdatedAt(updatedAt);
        return this;
    }

    public GetSubscriptionItemResponseBuilder pricingScheme(GetPricingSchemeResponse pricingScheme) {
        getSubscriptionItemResponse.setPricingScheme(pricingScheme);
        return this;
    }

    public GetSubscriptionItemResponseBuilder discounts(List<GetDiscountResponse> discounts) {
        getSubscriptionItemResponse.setDiscounts(discounts);
        return this;
    }

    public GetSubscriptionItemResponseBuilder subscription(GetSubscriptionResponse subscription) {
        getSubscriptionItemResponse.setSubscription(subscription);
        return this;
    }

    public GetSubscriptionItemResponseBuilder quantity(Integer quantity) {
        getSubscriptionItemResponse.setQuantity(quantity);
        return this;
    }

    public GetSubscriptionItemResponseBuilder cycles(Integer cycles) {
        getSubscriptionItemResponse.setCycles(cycles);
        return this;
    }

    public GetSubscriptionItemResponseBuilder deletedAt(DateTime deletedAt) {
        getSubscriptionItemResponse.setDeletedAt(deletedAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetSubscriptionItemResponse build() {
        return getSubscriptionItemResponse;
    }
}