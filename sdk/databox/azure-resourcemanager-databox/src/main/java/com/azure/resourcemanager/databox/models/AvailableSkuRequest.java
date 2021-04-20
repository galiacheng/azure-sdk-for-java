// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The filters for showing the available skus. */
@Fluent
public final class AvailableSkuRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailableSkuRequest.class);

    /*
     * Type of the transfer.
     */
    @JsonProperty(value = "transferType", required = true)
    private TransferType transferType;

    /*
     * ISO country code. Country for hardware shipment. For codes check:
     * https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements
     */
    @JsonProperty(value = "country", required = true)
    private String country;

    /*
     * Location for data transfer. For locations check:
     * https://management.azure.com/subscriptions/SUBSCRIPTIONID/locations?api-version=2018-01-01
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * Sku Names to filter for available skus
     */
    @JsonProperty(value = "skuNames")
    private List<SkuName> skuNames;

    /**
     * Get the transferType property: Type of the transfer.
     *
     * @return the transferType value.
     */
    public TransferType transferType() {
        return this.transferType;
    }

    /**
     * Set the transferType property: Type of the transfer.
     *
     * @param transferType the transferType value to set.
     * @return the AvailableSkuRequest object itself.
     */
    public AvailableSkuRequest withTransferType(TransferType transferType) {
        this.transferType = transferType;
        return this;
    }

    /**
     * Get the country property: ISO country code. Country for hardware shipment. For codes check:
     * https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements.
     *
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country property: ISO country code. Country for hardware shipment. For codes check:
     * https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements.
     *
     * @param country the country value to set.
     * @return the AvailableSkuRequest object itself.
     */
    public AvailableSkuRequest withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the location property: Location for data transfer. For locations check:
     * https://management.azure.com/subscriptions/SUBSCRIPTIONID/locations?api-version=2018-01-01.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location for data transfer. For locations check:
     * https://management.azure.com/subscriptions/SUBSCRIPTIONID/locations?api-version=2018-01-01.
     *
     * @param location the location value to set.
     * @return the AvailableSkuRequest object itself.
     */
    public AvailableSkuRequest withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the skuNames property: Sku Names to filter for available skus.
     *
     * @return the skuNames value.
     */
    public List<SkuName> skuNames() {
        return this.skuNames;
    }

    /**
     * Set the skuNames property: Sku Names to filter for available skus.
     *
     * @param skuNames the skuNames value to set.
     * @return the AvailableSkuRequest object itself.
     */
    public AvailableSkuRequest withSkuNames(List<SkuName> skuNames) {
        this.skuNames = skuNames;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (transferType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property transferType in model AvailableSkuRequest"));
        }
        if (country() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property country in model AvailableSkuRequest"));
        }
        if (location() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property location in model AvailableSkuRequest"));
        }
    }
}