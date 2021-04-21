// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.deploymentmanager.fluent.models.ServiceTopologyResourceInner;
import java.util.List;

/** An instance of this class provides access to all the operations defined in ServiceTopologiesClient. */
public interface ServiceTopologiesClient {
    /**
     * Synchronously creates a new service topology or updates an existing service topology.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceTopologyInfo Source topology object defines the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource representation of a service topology.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServiceTopologyResourceInner createOrUpdate(
        String resourceGroupName, String serviceTopologyName, ServiceTopologyResourceInner serviceTopologyInfo);

    /**
     * Synchronously creates a new service topology or updates an existing service topology.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceTopologyInfo Source topology object defines the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource representation of a service topology.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServiceTopologyResourceInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceTopologyName,
        ServiceTopologyResourceInner serviceTopologyInfo,
        Context context);

    /**
     * Gets the service topology.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the service topology.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServiceTopologyResourceInner getByResourceGroup(String resourceGroupName, String serviceTopologyName);

    /**
     * Gets the service topology.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the service topology.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServiceTopologyResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String serviceTopologyName, Context context);

    /**
     * Deletes the service topology.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceTopologyName);

    /**
     * Deletes the service topology.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String serviceTopologyName, Context context);

    /**
     * Lists the service topologies in the resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of service topologies.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<ServiceTopologyResourceInner> list(String resourceGroupName);

    /**
     * Lists the service topologies in the resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of service topologies.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<ServiceTopologyResourceInner>> listWithResponse(String resourceGroupName, Context context);
}