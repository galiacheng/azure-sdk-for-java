// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RoleType. */
public final class RoleType extends ExpandableStringEnum<RoleType> {
    /** Static value AKVBuiltInRole for RoleType. */
    public static final RoleType BUILT_IN_ROLE = fromString("AKVBuiltInRole");

    /** Static value CustomRole for RoleType. */
    public static final RoleType CUSTOM_ROLE = fromString("CustomRole");

    /**
     * Creates or finds a RoleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RoleType.
     */
    @JsonCreator
    public static RoleType fromString(String name) {
        return fromString(name, RoleType.class);
    }

    /** @return known RoleType values. */
    public static Collection<RoleType> values() {
        return values(RoleType.class);
    }
}