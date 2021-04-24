// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The OperationMetaPropertyInfo model. */
@Fluent
public final class OperationMetaPropertyInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationMetaPropertyInfo.class);

    /*
     * The operations OperationMetaServiceSpecification.
     */
    @JsonProperty(value = "serviceSpecification")
    private OperationMetaServiceSpecification serviceSpecification;

    /**
     * Get the serviceSpecification property: The operations OperationMetaServiceSpecification.
     *
     * @return the serviceSpecification value.
     */
    public OperationMetaServiceSpecification serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Set the serviceSpecification property: The operations OperationMetaServiceSpecification.
     *
     * @param serviceSpecification the serviceSpecification value to set.
     * @return the OperationMetaPropertyInfo object itself.
     */
    public OperationMetaPropertyInfo withServiceSpecification(OperationMetaServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceSpecification() != null) {
            serviceSpecification().validate();
        }
    }
}