// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.SqlPoolSecurityAlertPoliciesClient;
import com.azure.resourcemanager.synapse.fluent.models.SqlPoolSecurityAlertPolicyInner;
import com.azure.resourcemanager.synapse.models.SecurityAlertPolicyName;
import com.azure.resourcemanager.synapse.models.SqlPoolSecurityAlertPolicies;
import com.azure.resourcemanager.synapse.models.SqlPoolSecurityAlertPolicy;

public final class SqlPoolSecurityAlertPoliciesImpl implements SqlPoolSecurityAlertPolicies {
    private static final ClientLogger LOGGER = new ClientLogger(SqlPoolSecurityAlertPoliciesImpl.class);

    private final SqlPoolSecurityAlertPoliciesClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public SqlPoolSecurityAlertPoliciesImpl(
        SqlPoolSecurityAlertPoliciesClient innerClient,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SqlPoolSecurityAlertPolicy> list(
        String resourceGroupName, String workspaceName, String sqlPoolName) {
        PagedIterable<SqlPoolSecurityAlertPolicyInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, sqlPoolName);
        return Utils.mapPage(inner, inner1 -> new SqlPoolSecurityAlertPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<SqlPoolSecurityAlertPolicy> list(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context) {
        PagedIterable<SqlPoolSecurityAlertPolicyInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, sqlPoolName, context);
        return Utils.mapPage(inner, inner1 -> new SqlPoolSecurityAlertPolicyImpl(inner1, this.manager()));
    }

    public SqlPoolSecurityAlertPolicy get(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        SecurityAlertPolicyName securityAlertPolicyName) {
        SqlPoolSecurityAlertPolicyInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, sqlPoolName, securityAlertPolicyName);
        if (inner != null) {
            return new SqlPoolSecurityAlertPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SqlPoolSecurityAlertPolicy> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        SecurityAlertPolicyName securityAlertPolicyName,
        Context context) {
        Response<SqlPoolSecurityAlertPolicyInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, workspaceName, sqlPoolName, securityAlertPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SqlPoolSecurityAlertPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SqlPoolSecurityAlertPolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String sqlPoolName = Utils.getValueFromIdByName(id, "sqlPools");
        if (sqlPoolName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sqlPools'.", id)));
        }
        SecurityAlertPolicyName securityAlertPolicyName =
            SecurityAlertPolicyName.fromString(Utils.getValueFromIdByName(id, "securityAlertPolicies"));
        if (securityAlertPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityAlertPolicies'.",
                                id)));
        }
        return this
            .getWithResponse(resourceGroupName, workspaceName, sqlPoolName, securityAlertPolicyName, Context.NONE)
            .getValue();
    }

    public Response<SqlPoolSecurityAlertPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String sqlPoolName = Utils.getValueFromIdByName(id, "sqlPools");
        if (sqlPoolName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sqlPools'.", id)));
        }
        SecurityAlertPolicyName securityAlertPolicyName =
            SecurityAlertPolicyName.fromString(Utils.getValueFromIdByName(id, "securityAlertPolicies"));
        if (securityAlertPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityAlertPolicies'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, sqlPoolName, securityAlertPolicyName, context);
    }

    private SqlPoolSecurityAlertPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }

    public SqlPoolSecurityAlertPolicyImpl define(SecurityAlertPolicyName name) {
        return new SqlPoolSecurityAlertPolicyImpl(name, this.manager());
    }
}
