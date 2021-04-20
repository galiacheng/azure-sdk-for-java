// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devtestlabs.fluent.GalleryImagesClient;
import com.azure.resourcemanager.devtestlabs.fluent.models.GalleryImageInner;
import com.azure.resourcemanager.devtestlabs.models.GalleryImage;
import com.azure.resourcemanager.devtestlabs.models.GalleryImages;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class GalleryImagesImpl implements GalleryImages {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryImagesImpl.class);

    private final GalleryImagesClient innerClient;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    public GalleryImagesImpl(
        GalleryImagesClient innerClient, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<GalleryImage> list(String resourceGroupName, String labName) {
        PagedIterable<GalleryImageInner> inner = this.serviceClient().list(resourceGroupName, labName);
        return Utils.mapPage(inner, inner1 -> new GalleryImageImpl(inner1, this.manager()));
    }

    public PagedIterable<GalleryImage> list(
        String resourceGroupName,
        String labName,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context) {
        PagedIterable<GalleryImageInner> inner =
            this.serviceClient().list(resourceGroupName, labName, expand, filter, top, orderby, context);
        return Utils.mapPage(inner, inner1 -> new GalleryImageImpl(inner1, this.manager()));
    }

    private GalleryImagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }
}