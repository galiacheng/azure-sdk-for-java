// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AvailableBalances. */
public interface AvailableBalances {
    /**
     * The available credit balance for a billing profile. This is the balance that can be used for pay now to settle
     * due or past due invoices. The operation is supported only for billing accounts with agreement type Microsoft
     * Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the latest Azure credit balance.
     */
    AvailableBalance get(String billingAccountName, String billingProfileName);

    /**
     * The available credit balance for a billing profile. This is the balance that can be used for pay now to settle
     * due or past due invoices. The operation is supported only for billing accounts with agreement type Microsoft
     * Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the latest Azure credit balance.
     */
    Response<AvailableBalance> getWithResponse(String billingAccountName, String billingProfileName, Context context);
}