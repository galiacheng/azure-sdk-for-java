// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.ExpressRouteConnectionInner;
import com.azure.resourcemanager.network.fluent.models.ExpressRouteConnectionListInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ExpressRouteConnectionsClient. */
public interface ExpressRouteConnectionsClient {
    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters Parameters required in an ExpressRouteConnection PUT operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteConnection resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String expressRouteGatewayName,
        String connectionName,
        ExpressRouteConnectionInner putExpressRouteConnectionParameters);

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters Parameters required in an ExpressRouteConnection PUT operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of expressRouteConnection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ExpressRouteConnectionInner>, ExpressRouteConnectionInner> beginCreateOrUpdateAsync(
        String resourceGroupName,
        String expressRouteGatewayName,
        String connectionName,
        ExpressRouteConnectionInner putExpressRouteConnectionParameters);

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters Parameters required in an ExpressRouteConnection PUT operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of expressRouteConnection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteConnectionInner>, ExpressRouteConnectionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        String connectionName,
        ExpressRouteConnectionInner putExpressRouteConnectionParameters);

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters Parameters required in an ExpressRouteConnection PUT operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of expressRouteConnection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteConnectionInner>, ExpressRouteConnectionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        String connectionName,
        ExpressRouteConnectionInner putExpressRouteConnectionParameters,
        Context context);

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters Parameters required in an ExpressRouteConnection PUT operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteConnection resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ExpressRouteConnectionInner> createOrUpdateAsync(
        String resourceGroupName,
        String expressRouteGatewayName,
        String connectionName,
        ExpressRouteConnectionInner putExpressRouteConnectionParameters);

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters Parameters required in an ExpressRouteConnection PUT operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteConnection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteConnectionInner createOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        String connectionName,
        ExpressRouteConnectionInner putExpressRouteConnectionParameters);

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters Parameters required in an ExpressRouteConnection PUT operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteConnection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteConnectionInner createOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        String connectionName,
        ExpressRouteConnectionInner putExpressRouteConnectionParameters,
        Context context);

    /**
     * Gets the specified ExpressRouteConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the ExpressRoute connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ExpressRouteConnection along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ExpressRouteConnectionInner>> getWithResponseAsync(
        String resourceGroupName, String expressRouteGatewayName, String connectionName);

    /**
     * Gets the specified ExpressRouteConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the ExpressRoute connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ExpressRouteConnection on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ExpressRouteConnectionInner> getAsync(
        String resourceGroupName, String expressRouteGatewayName, String connectionName);

    /**
     * Gets the specified ExpressRouteConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the ExpressRoute connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ExpressRouteConnection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteConnectionInner get(String resourceGroupName, String expressRouteGatewayName, String connectionName);

    /**
     * Gets the specified ExpressRouteConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the ExpressRoute connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ExpressRouteConnection along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteConnectionInner> getWithResponse(
        String resourceGroupName, String expressRouteGatewayName, String connectionName, Context context);

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String expressRouteGatewayName, String connectionName);

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String expressRouteGatewayName, String connectionName);

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String expressRouteGatewayName, String connectionName);

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String expressRouteGatewayName, String connectionName, Context context);

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName);

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String expressRouteGatewayName, String connectionName);

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String expressRouteGatewayName, String connectionName, Context context);

    /**
     * Lists ExpressRouteConnections.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteConnection list along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ExpressRouteConnectionListInner>> listWithResponseAsync(
        String resourceGroupName, String expressRouteGatewayName);

    /**
     * Lists ExpressRouteConnections.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteConnection list on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ExpressRouteConnectionListInner> listAsync(String resourceGroupName, String expressRouteGatewayName);

    /**
     * Lists ExpressRouteConnections.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteConnection list.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteConnectionListInner list(String resourceGroupName, String expressRouteGatewayName);

    /**
     * Lists ExpressRouteConnections.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteConnection list along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteConnectionListInner> listWithResponse(
        String resourceGroupName, String expressRouteGatewayName, Context context);
}
