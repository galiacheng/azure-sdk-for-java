// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datalakestore.fluent.models.VirtualNetworkRuleInner;

/** An immutable client-side representation of VirtualNetworkRule. */
public interface VirtualNetworkRule {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the subnetId property: The resource identifier for the subnet.
     *
     * @return the subnetId value.
     */
    String subnetId();

    /**
     * Gets the name property: The resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the inner com.azure.resourcemanager.datalakestore.fluent.models.VirtualNetworkRuleInner object.
     *
     * @return the inner object.
     */
    VirtualNetworkRuleInner innerModel();

    /** The entirety of the VirtualNetworkRule definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithSubnetId,
            DefinitionStages.WithCreate {
    }
    /** The VirtualNetworkRule definition stages. */
    interface DefinitionStages {
        /** The first stage of the VirtualNetworkRule definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the VirtualNetworkRule definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the Azure resource group.
             * @param accountName The name of the Data Lake Store account.
             * @return the next definition stage.
             */
            WithSubnetId withExistingAccount(String resourceGroupName, String accountName);
        }
        /** The stage of the VirtualNetworkRule definition allowing to specify subnetId. */
        interface WithSubnetId {
            /**
             * Specifies the subnetId property: The resource identifier for the subnet..
             *
             * @param subnetId The resource identifier for the subnet.
             * @return the next definition stage.
             */
            WithCreate withSubnetId(String subnetId);
        }
        /**
         * The stage of the VirtualNetworkRule definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            VirtualNetworkRule create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VirtualNetworkRule create(Context context);
        }
    }
    /**
     * Begins update for the VirtualNetworkRule resource.
     *
     * @return the stage of resource update.
     */
    VirtualNetworkRule.Update update();

    /** The template for VirtualNetworkRule update. */
    interface Update extends UpdateStages.WithSubnetId {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        VirtualNetworkRule apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VirtualNetworkRule apply(Context context);
    }
    /** The VirtualNetworkRule update stages. */
    interface UpdateStages {
        /** The stage of the VirtualNetworkRule update allowing to specify subnetId. */
        interface WithSubnetId {
            /**
             * Specifies the subnetId property: The resource identifier for the subnet..
             *
             * @param subnetId The resource identifier for the subnet.
             * @return the next definition stage.
             */
            Update withSubnetId(String subnetId);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    VirtualNetworkRule refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VirtualNetworkRule refresh(Context context);
}