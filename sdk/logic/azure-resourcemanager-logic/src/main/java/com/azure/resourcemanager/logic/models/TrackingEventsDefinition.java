// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The tracking events definition. */
@Fluent
public final class TrackingEventsDefinition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TrackingEventsDefinition.class);

    /*
     * The source type.
     */
    @JsonProperty(value = "sourceType", required = true)
    private String sourceType;

    /*
     * The track events options.
     */
    @JsonProperty(value = "trackEventsOptions")
    private TrackEventsOperationOptions trackEventsOptions;

    /*
     * The events.
     */
    @JsonProperty(value = "events", required = true)
    private List<TrackingEvent> events;

    /**
     * Get the sourceType property: The source type.
     *
     * @return the sourceType value.
     */
    public String sourceType() {
        return this.sourceType;
    }

    /**
     * Set the sourceType property: The source type.
     *
     * @param sourceType the sourceType value to set.
     * @return the TrackingEventsDefinition object itself.
     */
    public TrackingEventsDefinition withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get the trackEventsOptions property: The track events options.
     *
     * @return the trackEventsOptions value.
     */
    public TrackEventsOperationOptions trackEventsOptions() {
        return this.trackEventsOptions;
    }

    /**
     * Set the trackEventsOptions property: The track events options.
     *
     * @param trackEventsOptions the trackEventsOptions value to set.
     * @return the TrackingEventsDefinition object itself.
     */
    public TrackingEventsDefinition withTrackEventsOptions(TrackEventsOperationOptions trackEventsOptions) {
        this.trackEventsOptions = trackEventsOptions;
        return this;
    }

    /**
     * Get the events property: The events.
     *
     * @return the events value.
     */
    public List<TrackingEvent> events() {
        return this.events;
    }

    /**
     * Set the events property: The events.
     *
     * @param events the events value to set.
     * @return the TrackingEventsDefinition object itself.
     */
    public TrackingEventsDefinition withEvents(List<TrackingEvent> events) {
        this.events = events;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceType in model TrackingEventsDefinition"));
        }
        if (events() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property events in model TrackingEventsDefinition"));
        } else {
            events().forEach(e -> e.validate());
        }
    }
}