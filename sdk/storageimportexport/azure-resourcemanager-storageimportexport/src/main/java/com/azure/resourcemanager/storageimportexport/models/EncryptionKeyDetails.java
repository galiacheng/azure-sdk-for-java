// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the encryption key properties. */
@Fluent
public final class EncryptionKeyDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EncryptionKeyDetails.class);

    /*
     * The type of kek encryption key
     */
    @JsonProperty(value = "kekType")
    private EncryptionKekType kekType;

    /*
     * Specifies the url for kek encryption key.
     */
    @JsonProperty(value = "kekUrl")
    private String kekUrl;

    /*
     * Specifies the keyvault resource id for kek encryption key.
     */
    @JsonProperty(value = "kekVaultResourceID")
    private String kekVaultResourceId;

    /**
     * Get the kekType property: The type of kek encryption key.
     *
     * @return the kekType value.
     */
    public EncryptionKekType kekType() {
        return this.kekType;
    }

    /**
     * Set the kekType property: The type of kek encryption key.
     *
     * @param kekType the kekType value to set.
     * @return the EncryptionKeyDetails object itself.
     */
    public EncryptionKeyDetails withKekType(EncryptionKekType kekType) {
        this.kekType = kekType;
        return this;
    }

    /**
     * Get the kekUrl property: Specifies the url for kek encryption key.
     *
     * @return the kekUrl value.
     */
    public String kekUrl() {
        return this.kekUrl;
    }

    /**
     * Set the kekUrl property: Specifies the url for kek encryption key.
     *
     * @param kekUrl the kekUrl value to set.
     * @return the EncryptionKeyDetails object itself.
     */
    public EncryptionKeyDetails withKekUrl(String kekUrl) {
        this.kekUrl = kekUrl;
        return this;
    }

    /**
     * Get the kekVaultResourceId property: Specifies the keyvault resource id for kek encryption key.
     *
     * @return the kekVaultResourceId value.
     */
    public String kekVaultResourceId() {
        return this.kekVaultResourceId;
    }

    /**
     * Set the kekVaultResourceId property: Specifies the keyvault resource id for kek encryption key.
     *
     * @param kekVaultResourceId the kekVaultResourceId value to set.
     * @return the EncryptionKeyDetails object itself.
     */
    public EncryptionKeyDetails withKekVaultResourceId(String kekVaultResourceId) {
        this.kekVaultResourceId = kekVaultResourceId;
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