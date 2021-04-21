// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of an event source that reads events from an event broker in Azure. */
@Fluent
public class AzureEventSourceProperties extends EventSourceCommonProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureEventSourceProperties.class);

    /*
     * The resource id of the event source in Azure Resource Manager.
     */
    @JsonProperty(value = "eventSourceResourceId", required = true)
    private String eventSourceResourceId;

    /**
     * Get the eventSourceResourceId property: The resource id of the event source in Azure Resource Manager.
     *
     * @return the eventSourceResourceId value.
     */
    public String eventSourceResourceId() {
        return this.eventSourceResourceId;
    }

    /**
     * Set the eventSourceResourceId property: The resource id of the event source in Azure Resource Manager.
     *
     * @param eventSourceResourceId the eventSourceResourceId value to set.
     * @return the AzureEventSourceProperties object itself.
     */
    public AzureEventSourceProperties withEventSourceResourceId(String eventSourceResourceId) {
        this.eventSourceResourceId = eventSourceResourceId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureEventSourceProperties withTimestampPropertyName(String timestampPropertyName) {
        super.withTimestampPropertyName(timestampPropertyName);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (eventSourceResourceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property eventSourceResourceId in model AzureEventSourceProperties"));
        }
    }
}