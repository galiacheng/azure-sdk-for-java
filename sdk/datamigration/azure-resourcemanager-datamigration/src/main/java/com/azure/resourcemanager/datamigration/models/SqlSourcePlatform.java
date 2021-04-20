// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SqlSourcePlatform. */
public final class SqlSourcePlatform extends ExpandableStringEnum<SqlSourcePlatform> {
    /** Static value SqlOnPrem for SqlSourcePlatform. */
    public static final SqlSourcePlatform SQL_ON_PREM = fromString("SqlOnPrem");

    /**
     * Creates or finds a SqlSourcePlatform from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SqlSourcePlatform.
     */
    @JsonCreator
    public static SqlSourcePlatform fromString(String name) {
        return fromString(name, SqlSourcePlatform.class);
    }

    /** @return known SqlSourcePlatform values. */
    public static Collection<SqlSourcePlatform> values() {
        return values(SqlSourcePlatform.class);
    }
}