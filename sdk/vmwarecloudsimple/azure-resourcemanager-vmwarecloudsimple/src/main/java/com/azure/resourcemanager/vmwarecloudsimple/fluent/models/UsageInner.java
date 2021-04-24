// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.vmwarecloudsimple.models.UsageCount;
import com.azure.resourcemanager.vmwarecloudsimple.models.UsageName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Usage model. */
@Fluent
public final class UsageInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UsageInner.class);

    /*
     * The current usage value
     */
    @JsonProperty(value = "currentValue", required = true)
    private int currentValue;

    /*
     * limit of a given sku in a region for a subscription. The maximum
     * permitted value for the usage quota. If there is no limit, this value
     * will be -1
     */
    @JsonProperty(value = "limit", required = true)
    private int limit;

    /*
     * Usage name value and localized name
     */
    @JsonProperty(value = "name")
    private UsageName name;

    /*
     * The usages' unit
     */
    @JsonProperty(value = "unit")
    private UsageCount unit;

    /**
     * Get the currentValue property: The current usage value.
     *
     * @return the currentValue value.
     */
    public int currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: The current usage value.
     *
     * @param currentValue the currentValue value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withCurrentValue(int currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the limit property: limit of a given sku in a region for a subscription. The maximum permitted value for the
     * usage quota. If there is no limit, this value will be -1.
     *
     * @return the limit value.
     */
    public int limit() {
        return this.limit;
    }

    /**
     * Set the limit property: limit of a given sku in a region for a subscription. The maximum permitted value for the
     * usage quota. If there is no limit, this value will be -1.
     *
     * @param limit the limit value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withLimit(int limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the name property: Usage name value and localized name.
     *
     * @return the name value.
     */
    public UsageName name() {
        return this.name;
    }

    /**
     * Set the name property: Usage name value and localized name.
     *
     * @param name the name value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withName(UsageName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the unit property: The usages' unit.
     *
     * @return the unit value.
     */
    public UsageCount unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The usages' unit.
     *
     * @param unit the unit value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withUnit(UsageCount unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
    }
}