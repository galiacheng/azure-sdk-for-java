// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.fluent.WorkflowRunActionScopeRepetitionsClient;
import com.azure.resourcemanager.logic.fluent.models.WorkflowRunActionRepetitionDefinitionInner;
import com.azure.resourcemanager.logic.models.WorkflowRunActionRepetitionDefinitionCollection;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in WorkflowRunActionScopeRepetitionsClient.
 */
public final class WorkflowRunActionScopeRepetitionsClientImpl implements WorkflowRunActionScopeRepetitionsClient {
    private final ClientLogger logger = new ClientLogger(WorkflowRunActionScopeRepetitionsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final WorkflowRunActionScopeRepetitionsService service;

    /** The service client containing this operation class. */
    private final LogicManagementClientImpl client;

    /**
     * Initializes an instance of WorkflowRunActionScopeRepetitionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    WorkflowRunActionScopeRepetitionsClientImpl(LogicManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    WorkflowRunActionScopeRepetitionsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for LogicManagementClientWorkflowRunActionScopeRepetitions to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "LogicManagementClien")
    private interface WorkflowRunActionScopeRepetitionsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows"
                + "/{workflowName}/runs/{runName}/actions/{actionName}/scopeRepetitions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<WorkflowRunActionRepetitionDefinitionCollection>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workflowName") String workflowName,
            @PathParam("runName") String runName,
            @PathParam("actionName") String actionName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows"
                + "/{workflowName}/runs/{runName}/actions/{actionName}/scopeRepetitions/{repetitionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<WorkflowRunActionRepetitionDefinitionInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workflowName") String workflowName,
            @PathParam("runName") String runName,
            @PathParam("actionName") String actionName,
            @PathParam("repetitionName") String repetitionName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * List the workflow run action scoped repetitions.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of workflow run action repetitions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<WorkflowRunActionRepetitionDefinitionInner>> listSinglePageAsync(
        String resourceGroupName, String workflowName, String runName, String actionName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (runName == null) {
            return Mono.error(new IllegalArgumentException("Parameter runName is required and cannot be null."));
        }
        if (actionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter actionName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workflowName,
                            runName,
                            actionName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<WorkflowRunActionRepetitionDefinitionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List the workflow run action scoped repetitions.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of workflow run action repetitions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<WorkflowRunActionRepetitionDefinitionInner>> listSinglePageAsync(
        String resourceGroupName, String workflowName, String runName, String actionName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (runName == null) {
            return Mono.error(new IllegalArgumentException("Parameter runName is required and cannot be null."));
        }
        if (actionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter actionName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                workflowName,
                runName,
                actionName,
                this.client.getApiVersion(),
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * List the workflow run action scoped repetitions.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of workflow run action repetitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<WorkflowRunActionRepetitionDefinitionInner> listAsync(
        String resourceGroupName, String workflowName, String runName, String actionName) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, workflowName, runName, actionName));
    }

    /**
     * List the workflow run action scoped repetitions.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of workflow run action repetitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<WorkflowRunActionRepetitionDefinitionInner> listAsync(
        String resourceGroupName, String workflowName, String runName, String actionName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, workflowName, runName, actionName, context));
    }

    /**
     * List the workflow run action scoped repetitions.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of workflow run action repetitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<WorkflowRunActionRepetitionDefinitionInner> list(
        String resourceGroupName, String workflowName, String runName, String actionName) {
        return new PagedIterable<>(listAsync(resourceGroupName, workflowName, runName, actionName));
    }

    /**
     * List the workflow run action scoped repetitions.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of workflow run action repetitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<WorkflowRunActionRepetitionDefinitionInner> list(
        String resourceGroupName, String workflowName, String runName, String actionName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, workflowName, runName, actionName, context));
    }

    /**
     * Get a workflow run action scoped repetition.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run action scoped repetition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<WorkflowRunActionRepetitionDefinitionInner>> getWithResponseAsync(
        String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (runName == null) {
            return Mono.error(new IllegalArgumentException("Parameter runName is required and cannot be null."));
        }
        if (actionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter actionName is required and cannot be null."));
        }
        if (repetitionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter repetitionName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workflowName,
                            runName,
                            actionName,
                            repetitionName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a workflow run action scoped repetition.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run action scoped repetition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<WorkflowRunActionRepetitionDefinitionInner>> getWithResponseAsync(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (runName == null) {
            return Mono.error(new IllegalArgumentException("Parameter runName is required and cannot be null."));
        }
        if (actionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter actionName is required and cannot be null."));
        }
        if (repetitionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter repetitionName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                workflowName,
                runName,
                actionName,
                repetitionName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Get a workflow run action scoped repetition.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run action scoped repetition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<WorkflowRunActionRepetitionDefinitionInner> getAsync(
        String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName) {
        return getWithResponseAsync(resourceGroupName, workflowName, runName, actionName, repetitionName)
            .flatMap(
                (Response<WorkflowRunActionRepetitionDefinitionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get a workflow run action scoped repetition.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run action scoped repetition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WorkflowRunActionRepetitionDefinitionInner get(
        String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName) {
        return getAsync(resourceGroupName, workflowName, runName, actionName, repetitionName).block();
    }

    /**
     * Get a workflow run action scoped repetition.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run action scoped repetition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<WorkflowRunActionRepetitionDefinitionInner> getWithResponse(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        Context context) {
        return getWithResponseAsync(resourceGroupName, workflowName, runName, actionName, repetitionName, context)
            .block();
    }
}