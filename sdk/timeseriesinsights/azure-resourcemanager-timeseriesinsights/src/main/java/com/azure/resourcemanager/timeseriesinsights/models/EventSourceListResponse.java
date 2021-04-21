// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.resourcemanager.timeseriesinsights.fluent.models.EventSourceListResponseInner;
import java.util.List;

/** An immutable client-side representation of EventSourceListResponse. */
public interface EventSourceListResponse {
    /**
     * Gets the value property: Result of the List EventSources operation.
     *
     * @return the value value.
     */
    List<EventSourceResource> value();

    /**
     * Gets the inner com.azure.resourcemanager.timeseriesinsights.fluent.models.EventSourceListResponseInner object.
     *
     * @return the inner object.
     */
    EventSourceListResponseInner innerModel();
}