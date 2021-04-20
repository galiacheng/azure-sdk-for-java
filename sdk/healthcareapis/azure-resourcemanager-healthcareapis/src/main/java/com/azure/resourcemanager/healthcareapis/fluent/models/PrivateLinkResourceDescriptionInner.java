// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.healthcareapis.models.PrivateLinkResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Private Endpoint Connection resource. */
@Immutable
public final class PrivateLinkResourceDescriptionInner extends PrivateLinkResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkResourceDescriptionInner.class);

    /*
     * System metadata for this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the systemData property: System metadata for this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public PrivateLinkResourceDescriptionInner withRequiredZoneNames(List<String> requiredZoneNames) {
        super.withRequiredZoneNames(requiredZoneNames);
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
    }
}