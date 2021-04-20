// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.resourcemanager.machinelearningservices.fluent.models.NotebookResourceInfoInner;

/** An immutable client-side representation of NotebookResourceInfo. */
public interface NotebookResourceInfo {
    /**
     * Gets the fqdn property: The fqdn property.
     *
     * @return the fqdn value.
     */
    String fqdn();

    /**
     * Gets the resourceId property: the data plane resourceId that used to initialize notebook component.
     *
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * Gets the notebookPreparationError property: The error that occurs when preparing notebook.
     *
     * @return the notebookPreparationError value.
     */
    NotebookPreparationError notebookPreparationError();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearningservices.fluent.models.NotebookResourceInfoInner object.
     *
     * @return the inner object.
     */
    NotebookResourceInfoInner innerModel();
}