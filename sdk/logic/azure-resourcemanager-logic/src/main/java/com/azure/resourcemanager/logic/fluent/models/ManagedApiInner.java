// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.models.ApiResourceProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The managed api definition. */
@Fluent
public final class ManagedApiInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedApiInner.class);

    /*
     * The api resource properties.
     */
    @JsonProperty(value = "properties")
    private ApiResourceProperties properties;

    /**
     * Get the properties property: The api resource properties.
     *
     * @return the properties value.
     */
    public ApiResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The api resource properties.
     *
     * @param properties the properties value to set.
     * @return the ManagedApiInner object itself.
     */
    public ManagedApiInner withProperties(ApiResourceProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedApiInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedApiInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}