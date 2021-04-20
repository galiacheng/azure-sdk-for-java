// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mariadb.fluent.models.DatabaseInner;
import com.azure.resourcemanager.mariadb.models.Database;

public final class DatabaseImpl implements Database, Database.Definition, Database.Update {
    private DatabaseInner innerObject;

    private final com.azure.resourcemanager.mariadb.MariaDBManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String charset() {
        return this.innerModel().charset();
    }

    public String collation() {
        return this.innerModel().collation();
    }

    public DatabaseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mariadb.MariaDBManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String databaseName;

    public DatabaseImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public Database create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .createOrUpdate(resourceGroupName, serverName, databaseName, this.innerModel(), Context.NONE);
        return this;
    }

    public Database create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .createOrUpdate(resourceGroupName, serverName, databaseName, this.innerModel(), context);
        return this;
    }

    DatabaseImpl(String name, com.azure.resourcemanager.mariadb.MariaDBManager serviceManager) {
        this.innerObject = new DatabaseInner();
        this.serviceManager = serviceManager;
        this.databaseName = name;
    }

    public DatabaseImpl update() {
        return this;
    }

    public Database apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .createOrUpdate(resourceGroupName, serverName, databaseName, this.innerModel(), Context.NONE);
        return this;
    }

    public Database apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .createOrUpdate(resourceGroupName, serverName, databaseName, this.innerModel(), context);
        return this;
    }

    DatabaseImpl(DatabaseInner innerObject, com.azure.resourcemanager.mariadb.MariaDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
    }

    public Database refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .getWithResponse(resourceGroupName, serverName, databaseName, Context.NONE)
                .getValue();
        return this;
    }

    public Database refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .getWithResponse(resourceGroupName, serverName, databaseName, context)
                .getValue();
        return this;
    }

    public DatabaseImpl withCharset(String charset) {
        this.innerModel().withCharset(charset);
        return this;
    }

    public DatabaseImpl withCollation(String collation) {
        this.innerModel().withCollation(collation);
        return this;
    }
}