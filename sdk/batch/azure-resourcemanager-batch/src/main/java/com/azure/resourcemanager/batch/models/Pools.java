// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Pools. */
public interface Pools {
    /**
     * Lists all of the pools in the specified account.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation.
     */
    PagedIterable<Pool> listByBatchAccount(String resourceGroupName, String accountName);

    /**
     * Lists all of the pools in the specified account.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param maxresults The maximum number of items to return in the response.
     * @param select Comma separated list of properties that should be returned. e.g. "properties/provisioningState".
     *     Only top level properties under properties/ are valid for selection.
     * @param filter OData filter expression. Valid properties for filtering are:
     *     <p>name properties/allocationState properties/allocationStateTransitionTime properties/creationTime
     *     properties/provisioningState properties/provisioningStateTransitionTime properties/lastModified
     *     properties/vmSize properties/interNodeCommunication properties/scaleSettings/autoScale
     *     properties/scaleSettings/fixedScale.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation.
     */
    PagedIterable<Pool> listByBatchAccount(
        String resourceGroupName,
        String accountName,
        Integer maxresults,
        String select,
        String filter,
        Context context);

    /**
     * Deletes the specified pool.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String poolName);

    /**
     * Deletes the specified pool.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String poolName, Context context);

    /**
     * Gets information about the specified pool.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified pool.
     */
    Pool get(String resourceGroupName, String accountName, String poolName);

    /**
     * Gets information about the specified pool.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified pool.
     */
    Response<Pool> getWithResponse(String resourceGroupName, String accountName, String poolName, Context context);

    /**
     * Disables automatic scaling for a pool.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a pool.
     */
    Pool disableAutoScale(String resourceGroupName, String accountName, String poolName);

    /**
     * Disables automatic scaling for a pool.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a pool.
     */
    Response<Pool> disableAutoScaleWithResponse(
        String resourceGroupName, String accountName, String poolName, Context context);

    /**
     * This does not restore the pool to its previous state before the resize operation: it only stops any further
     * changes being made, and the pool maintains its current state. After stopping, the pool stabilizes at the number
     * of nodes it was at when the stop operation was done. During the stop operation, the pool allocation state changes
     * first to stopping and then to steady. A resize operation need not be an explicit resize pool request; this API
     * can also be used to halt the initial sizing of the pool when it is created.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a pool.
     */
    Pool stopResize(String resourceGroupName, String accountName, String poolName);

    /**
     * This does not restore the pool to its previous state before the resize operation: it only stops any further
     * changes being made, and the pool maintains its current state. After stopping, the pool stabilizes at the number
     * of nodes it was at when the stop operation was done. During the stop operation, the pool allocation state changes
     * first to stopping and then to steady. A resize operation need not be an explicit resize pool request; this API
     * can also be used to halt the initial sizing of the pool when it is created.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a pool.
     */
    Response<Pool> stopResizeWithResponse(
        String resourceGroupName, String accountName, String poolName, Context context);

    /**
     * Gets information about the specified pool.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified pool.
     */
    Pool getById(String id);

    /**
     * Gets information about the specified pool.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified pool.
     */
    Response<Pool> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified pool.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified pool.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Pool resource.
     *
     * @param name resource name.
     * @return the first stage of the new Pool definition.
     */
    Pool.DefinitionStages.Blank define(String name);
}