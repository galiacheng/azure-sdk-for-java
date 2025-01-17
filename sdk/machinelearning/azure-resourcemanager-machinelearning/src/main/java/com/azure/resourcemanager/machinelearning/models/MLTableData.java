// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** MLTable data definition. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "dataType")
@JsonTypeName("MLTable")
@Fluent
public final class MLTableData extends DataVersionBaseDetails {
    /*
     * Uris referenced in the MLTable definition (required for lineage)
     */
    @JsonProperty(value = "referencedUris")
    private List<String> referencedUris;

    /**
     * Get the referencedUris property: Uris referenced in the MLTable definition (required for lineage).
     *
     * @return the referencedUris value.
     */
    public List<String> referencedUris() {
        return this.referencedUris;
    }

    /**
     * Set the referencedUris property: Uris referenced in the MLTable definition (required for lineage).
     *
     * @param referencedUris the referencedUris value to set.
     * @return the MLTableData object itself.
     */
    public MLTableData withReferencedUris(List<String> referencedUris) {
        this.referencedUris = referencedUris;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MLTableData withDataUri(String dataUri) {
        super.withDataUri(dataUri);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MLTableData withIsAnonymous(Boolean isAnonymous) {
        super.withIsAnonymous(isAnonymous);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MLTableData withIsArchived(Boolean isArchived) {
        super.withIsArchived(isArchived);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MLTableData withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MLTableData withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MLTableData withTags(Map<String, String> tags) {
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
    }
}
