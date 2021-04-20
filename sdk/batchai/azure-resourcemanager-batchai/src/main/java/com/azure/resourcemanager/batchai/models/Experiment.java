// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.resourcemanager.batchai.fluent.models.ExperimentInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of Experiment. */
public interface Experiment {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the creationTime property: Time when the Experiment was created.
     *
     * @return the creationTime value.
     */
    OffsetDateTime creationTime();

    /**
     * Gets the provisioningState property: The provisioned state of the experiment.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the provisioningStateTransitionTime property: The time at which the experiment entered its current
     * provisioning state.
     *
     * @return the provisioningStateTransitionTime value.
     */
    OffsetDateTime provisioningStateTransitionTime();

    /**
     * Gets the inner com.azure.resourcemanager.batchai.fluent.models.ExperimentInner object.
     *
     * @return the inner object.
     */
    ExperimentInner innerModel();
}