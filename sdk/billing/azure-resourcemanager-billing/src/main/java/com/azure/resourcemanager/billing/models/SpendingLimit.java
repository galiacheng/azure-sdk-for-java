// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SpendingLimit. */
public final class SpendingLimit extends ExpandableStringEnum<SpendingLimit> {
    /** Static value Off for SpendingLimit. */
    public static final SpendingLimit OFF = fromString("Off");

    /** Static value On for SpendingLimit. */
    public static final SpendingLimit ON = fromString("On");

    /**
     * Creates or finds a SpendingLimit from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SpendingLimit.
     */
    @JsonCreator
    public static SpendingLimit fromString(String name) {
        return fromString(name, SpendingLimit.class);
    }

    /** @return known SpendingLimit values. */
    public static Collection<SpendingLimit> values() {
        return values(SpendingLimit.class);
    }
}