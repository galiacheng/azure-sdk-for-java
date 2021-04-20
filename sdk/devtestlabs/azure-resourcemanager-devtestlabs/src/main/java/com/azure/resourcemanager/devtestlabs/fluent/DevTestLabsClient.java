// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for DevTestLabsClient class. */
public interface DevTestLabsClient {
    /**
     * Gets The subscription ID.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the ProviderOperationsClient object to access its operations.
     *
     * @return the ProviderOperationsClient object.
     */
    ProviderOperationsClient getProviderOperations();

    /**
     * Gets the LabsClient object to access its operations.
     *
     * @return the LabsClient object.
     */
    LabsClient getLabs();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the GlobalSchedulesClient object to access its operations.
     *
     * @return the GlobalSchedulesClient object.
     */
    GlobalSchedulesClient getGlobalSchedules();

    /**
     * Gets the ArtifactSourcesClient object to access its operations.
     *
     * @return the ArtifactSourcesClient object.
     */
    ArtifactSourcesClient getArtifactSources();

    /**
     * Gets the ArmTemplatesClient object to access its operations.
     *
     * @return the ArmTemplatesClient object.
     */
    ArmTemplatesClient getArmTemplates();

    /**
     * Gets the ArtifactsClient object to access its operations.
     *
     * @return the ArtifactsClient object.
     */
    ArtifactsClient getArtifacts();

    /**
     * Gets the CostsClient object to access its operations.
     *
     * @return the CostsClient object.
     */
    CostsClient getCosts();

    /**
     * Gets the CustomImagesClient object to access its operations.
     *
     * @return the CustomImagesClient object.
     */
    CustomImagesClient getCustomImages();

    /**
     * Gets the FormulasClient object to access its operations.
     *
     * @return the FormulasClient object.
     */
    FormulasClient getFormulas();

    /**
     * Gets the GalleryImagesClient object to access its operations.
     *
     * @return the GalleryImagesClient object.
     */
    GalleryImagesClient getGalleryImages();

    /**
     * Gets the NotificationChannelsClient object to access its operations.
     *
     * @return the NotificationChannelsClient object.
     */
    NotificationChannelsClient getNotificationChannels();

    /**
     * Gets the PolicySetsClient object to access its operations.
     *
     * @return the PolicySetsClient object.
     */
    PolicySetsClient getPolicySets();

    /**
     * Gets the PoliciesClient object to access its operations.
     *
     * @return the PoliciesClient object.
     */
    PoliciesClient getPolicies();

    /**
     * Gets the SchedulesClient object to access its operations.
     *
     * @return the SchedulesClient object.
     */
    SchedulesClient getSchedules();

    /**
     * Gets the ServiceRunnersClient object to access its operations.
     *
     * @return the ServiceRunnersClient object.
     */
    ServiceRunnersClient getServiceRunners();

    /**
     * Gets the UsersClient object to access its operations.
     *
     * @return the UsersClient object.
     */
    UsersClient getUsers();

    /**
     * Gets the DisksClient object to access its operations.
     *
     * @return the DisksClient object.
     */
    DisksClient getDisks();

    /**
     * Gets the EnvironmentsClient object to access its operations.
     *
     * @return the EnvironmentsClient object.
     */
    EnvironmentsClient getEnvironments();

    /**
     * Gets the SecretsClient object to access its operations.
     *
     * @return the SecretsClient object.
     */
    SecretsClient getSecrets();

    /**
     * Gets the ServiceFabricsClient object to access its operations.
     *
     * @return the ServiceFabricsClient object.
     */
    ServiceFabricsClient getServiceFabrics();

    /**
     * Gets the ServiceFabricSchedulesClient object to access its operations.
     *
     * @return the ServiceFabricSchedulesClient object.
     */
    ServiceFabricSchedulesClient getServiceFabricSchedules();

    /**
     * Gets the VirtualMachinesClient object to access its operations.
     *
     * @return the VirtualMachinesClient object.
     */
    VirtualMachinesClient getVirtualMachines();

    /**
     * Gets the VirtualMachineSchedulesClient object to access its operations.
     *
     * @return the VirtualMachineSchedulesClient object.
     */
    VirtualMachineSchedulesClient getVirtualMachineSchedules();

    /**
     * Gets the VirtualNetworksClient object to access its operations.
     *
     * @return the VirtualNetworksClient object.
     */
    VirtualNetworksClient getVirtualNetworks();
}