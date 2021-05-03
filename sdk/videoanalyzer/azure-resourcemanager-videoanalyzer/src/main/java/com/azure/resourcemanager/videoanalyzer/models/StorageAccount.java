// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The details about the associated storage account. */
@Fluent
public final class StorageAccount {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageAccount.class);

    /*
     * The ID of the storage account resource. Video Analyzer relies on tables,
     * queues, and blobs. The primary storage account must be a Standard
     * Storage account (either Microsoft.ClassicStorage or Microsoft.Storage).
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * A managed identity that Video Analyzer will use to access the storage
     * account.
     */
    @JsonProperty(value = "identity")
    private ResourceIdentity identity;

    /*
     * The current status of the storage account mapping.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Get the id property: The ID of the storage account resource. Video Analyzer relies on tables, queues, and blobs.
     * The primary storage account must be a Standard Storage account (either Microsoft.ClassicStorage or
     * Microsoft.Storage).
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the storage account resource. Video Analyzer relies on tables, queues, and blobs.
     * The primary storage account must be a Standard Storage account (either Microsoft.ClassicStorage or
     * Microsoft.Storage).
     *
     * @param id the id value to set.
     * @return the StorageAccount object itself.
     */
    public StorageAccount withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the identity property: A managed identity that Video Analyzer will use to access the storage account.
     *
     * @return the identity value.
     */
    public ResourceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: A managed identity that Video Analyzer will use to access the storage account.
     *
     * @param identity the identity value to set.
     * @return the StorageAccount object itself.
     */
    public StorageAccount withIdentity(ResourceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the status property: The current status of the storage account mapping.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
    }
}