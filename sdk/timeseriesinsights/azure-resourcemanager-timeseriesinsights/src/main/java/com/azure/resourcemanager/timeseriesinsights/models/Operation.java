// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.resourcemanager.timeseriesinsights.fluent.models.OperationInner;

/** An immutable client-side representation of Operation. */
public interface Operation {
    /**
     * Gets the name property: The name of the operation being performed on this particular object.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the display property: Contains the localized display information for this particular operation / action.
     *
     * @return the display value.
     */
    OperationDisplay display();

    /**
     * Gets the inner com.azure.resourcemanager.timeseriesinsights.fluent.models.OperationInner object.
     *
     * @return the inner object.
     */
    OperationInner innerModel();
}