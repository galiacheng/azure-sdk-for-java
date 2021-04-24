// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The identity of the Batch pool, if configured. If the pool identity is updated during update an existing pool, only
 * the new vms which are created after the pool shrinks to 0 will have the updated identities.
 */
@Fluent
public class BatchPoolIdentity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BatchPoolIdentity.class);

    /*
     * The type of identity used for the Batch Pool.
     */
    @JsonProperty(value = "type", required = true)
    private PoolIdentityType type;

    /*
     * The list of user identities associated with the Batch pool. The user
     * identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     */
    @JsonProperty(value = "userAssignedIdentities")
    private Map<String, BatchPoolIdentityUserAssignedIdentities> userAssignedIdentities;

    /**
     * Get the type property: The type of identity used for the Batch Pool.
     *
     * @return the type value.
     */
    public PoolIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of identity used for the Batch Pool.
     *
     * @param type the type value to set.
     * @return the BatchPoolIdentity object itself.
     */
    public BatchPoolIdentity withType(PoolIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: The list of user identities associated with the Batch pool. The user
     * identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @return the userAssignedIdentities value.
     */
    public Map<String, BatchPoolIdentityUserAssignedIdentities> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The list of user identities associated with the Batch pool. The user
     * identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the BatchPoolIdentity object itself.
     */
    public BatchPoolIdentity withUserAssignedIdentities(
        Map<String, BatchPoolIdentityUserAssignedIdentities> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model BatchPoolIdentity"));
        }
        if (userAssignedIdentities() != null) {
            userAssignedIdentities()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}