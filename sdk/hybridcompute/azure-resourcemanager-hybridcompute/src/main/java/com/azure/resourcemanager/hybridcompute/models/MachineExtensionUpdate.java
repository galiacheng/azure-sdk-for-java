// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Describes a Machine Extension Update. */
@Fluent
public final class MachineExtensionUpdate extends ResourceUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MachineExtensionUpdate.class);

    /*
     * Describes Machine Extension Update Properties.
     */
    @JsonProperty(value = "properties")
    private MachineExtensionUpdateProperties properties;

    /**
     * Get the properties property: Describes Machine Extension Update Properties.
     *
     * @return the properties value.
     */
    public MachineExtensionUpdateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Describes Machine Extension Update Properties.
     *
     * @param properties the properties value to set.
     * @return the MachineExtensionUpdate object itself.
     */
    public MachineExtensionUpdate withProperties(MachineExtensionUpdateProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MachineExtensionUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        if (properties() != null) {
            properties().validate();
        }
    }
}