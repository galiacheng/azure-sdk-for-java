// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.fluent.models.IntegrationAccountPartnerInner;
import com.azure.resourcemanager.logic.fluent.models.WorkflowTriggerCallbackUrlInner;
import com.azure.resourcemanager.logic.models.GetCallbackUrlParameters;

/** An instance of this class provides access to all the operations defined in IntegrationAccountPartnersClient. */
public interface IntegrationAccountPartnersClient {
    /**
     * Gets a list of integration account partners.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration account partners.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IntegrationAccountPartnerInner> list(String resourceGroupName, String integrationAccountName);

    /**
     * Gets a list of integration account partners.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: PartnerType.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration account partners.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IntegrationAccountPartnerInner> list(
        String resourceGroupName, String integrationAccountName, Integer top, String filter, Context context);

    /**
     * Gets an integration account partner.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param partnerName The integration account partner name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration account partner.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IntegrationAccountPartnerInner get(String resourceGroupName, String integrationAccountName, String partnerName);

    /**
     * Gets an integration account partner.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param partnerName The integration account partner name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration account partner.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IntegrationAccountPartnerInner> getWithResponse(
        String resourceGroupName, String integrationAccountName, String partnerName, Context context);

    /**
     * Creates or updates an integration account partner.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param partnerName The integration account partner name.
     * @param partner The integration account partner.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration account partner.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IntegrationAccountPartnerInner createOrUpdate(
        String resourceGroupName,
        String integrationAccountName,
        String partnerName,
        IntegrationAccountPartnerInner partner);

    /**
     * Creates or updates an integration account partner.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param partnerName The integration account partner name.
     * @param partner The integration account partner.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration account partner.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IntegrationAccountPartnerInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String integrationAccountName,
        String partnerName,
        IntegrationAccountPartnerInner partner,
        Context context);

    /**
     * Deletes an integration account partner.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param partnerName The integration account partner name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String integrationAccountName, String partnerName);

    /**
     * Deletes an integration account partner.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param partnerName The integration account partner name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String integrationAccountName, String partnerName, Context context);

    /**
     * Get the content callback url.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param partnerName The integration account partner name.
     * @param listContentCallbackUrl The callback url parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the content callback url.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkflowTriggerCallbackUrlInner listContentCallbackUrl(
        String resourceGroupName,
        String integrationAccountName,
        String partnerName,
        GetCallbackUrlParameters listContentCallbackUrl);

    /**
     * Get the content callback url.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param partnerName The integration account partner name.
     * @param listContentCallbackUrl The callback url parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the content callback url.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkflowTriggerCallbackUrlInner> listContentCallbackUrlWithResponse(
        String resourceGroupName,
        String integrationAccountName,
        String partnerName,
        GetCallbackUrlParameters listContentCallbackUrl,
        Context context);
}