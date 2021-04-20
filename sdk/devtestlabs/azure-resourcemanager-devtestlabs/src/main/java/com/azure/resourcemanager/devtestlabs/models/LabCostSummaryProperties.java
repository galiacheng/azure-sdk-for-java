// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of the cost summary. */
@Fluent
public final class LabCostSummaryProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LabCostSummaryProperties.class);

    /*
     * The cost component of the cost item.
     */
    @JsonProperty(value = "estimatedLabCost")
    private Double estimatedLabCost;

    /**
     * Get the estimatedLabCost property: The cost component of the cost item.
     *
     * @return the estimatedLabCost value.
     */
    public Double estimatedLabCost() {
        return this.estimatedLabCost;
    }

    /**
     * Set the estimatedLabCost property: The cost component of the cost item.
     *
     * @param estimatedLabCost the estimatedLabCost value to set.
     * @return the LabCostSummaryProperties object itself.
     */
    public LabCostSummaryProperties withEstimatedLabCost(Double estimatedLabCost) {
        this.estimatedLabCost = estimatedLabCost;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}