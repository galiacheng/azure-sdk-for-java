// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a network interface. */
@Fluent
public final class NetworkInterfaceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkInterfaceProperties.class);

    /*
     * The resource ID of the virtual network.
     */
    @JsonProperty(value = "virtualNetworkId")
    private String virtualNetworkId;

    /*
     * The resource ID of the sub net.
     */
    @JsonProperty(value = "subnetId")
    private String subnetId;

    /*
     * The resource ID of the public IP address.
     */
    @JsonProperty(value = "publicIpAddressId")
    private String publicIpAddressId;

    /*
     * The public IP address.
     */
    @JsonProperty(value = "publicIpAddress")
    private String publicIpAddress;

    /*
     * The private IP address.
     */
    @JsonProperty(value = "privateIpAddress")
    private String privateIpAddress;

    /*
     * The DNS name.
     */
    @JsonProperty(value = "dnsName")
    private String dnsName;

    /*
     * The RdpAuthority property is a server DNS host name or IP address
     * followed by the service port number for RDP (Remote Desktop Protocol).
     */
    @JsonProperty(value = "rdpAuthority")
    private String rdpAuthority;

    /*
     * The SshAuthority property is a server DNS host name or IP address
     * followed by the service port number for SSH.
     */
    @JsonProperty(value = "sshAuthority")
    private String sshAuthority;

    /*
     * The configuration for sharing a public IP address across multiple
     * virtual machines.
     */
    @JsonProperty(value = "sharedPublicIpAddressConfiguration")
    private SharedPublicIpAddressConfiguration sharedPublicIpAddressConfiguration;

    /**
     * Get the virtualNetworkId property: The resource ID of the virtual network.
     *
     * @return the virtualNetworkId value.
     */
    public String virtualNetworkId() {
        return this.virtualNetworkId;
    }

    /**
     * Set the virtualNetworkId property: The resource ID of the virtual network.
     *
     * @param virtualNetworkId the virtualNetworkId value to set.
     * @return the NetworkInterfaceProperties object itself.
     */
    public NetworkInterfaceProperties withVirtualNetworkId(String virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
        return this;
    }

    /**
     * Get the subnetId property: The resource ID of the sub net.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The resource ID of the sub net.
     *
     * @param subnetId the subnetId value to set.
     * @return the NetworkInterfaceProperties object itself.
     */
    public NetworkInterfaceProperties withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the publicIpAddressId property: The resource ID of the public IP address.
     *
     * @return the publicIpAddressId value.
     */
    public String publicIpAddressId() {
        return this.publicIpAddressId;
    }

    /**
     * Set the publicIpAddressId property: The resource ID of the public IP address.
     *
     * @param publicIpAddressId the publicIpAddressId value to set.
     * @return the NetworkInterfaceProperties object itself.
     */
    public NetworkInterfaceProperties withPublicIpAddressId(String publicIpAddressId) {
        this.publicIpAddressId = publicIpAddressId;
        return this;
    }

    /**
     * Get the publicIpAddress property: The public IP address.
     *
     * @return the publicIpAddress value.
     */
    public String publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Set the publicIpAddress property: The public IP address.
     *
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the NetworkInterfaceProperties object itself.
     */
    public NetworkInterfaceProperties withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * Get the privateIpAddress property: The private IP address.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: The private IP address.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the NetworkInterfaceProperties object itself.
     */
    public NetworkInterfaceProperties withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Get the dnsName property: The DNS name.
     *
     * @return the dnsName value.
     */
    public String dnsName() {
        return this.dnsName;
    }

    /**
     * Set the dnsName property: The DNS name.
     *
     * @param dnsName the dnsName value to set.
     * @return the NetworkInterfaceProperties object itself.
     */
    public NetworkInterfaceProperties withDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }

    /**
     * Get the rdpAuthority property: The RdpAuthority property is a server DNS host name or IP address followed by the
     * service port number for RDP (Remote Desktop Protocol).
     *
     * @return the rdpAuthority value.
     */
    public String rdpAuthority() {
        return this.rdpAuthority;
    }

    /**
     * Set the rdpAuthority property: The RdpAuthority property is a server DNS host name or IP address followed by the
     * service port number for RDP (Remote Desktop Protocol).
     *
     * @param rdpAuthority the rdpAuthority value to set.
     * @return the NetworkInterfaceProperties object itself.
     */
    public NetworkInterfaceProperties withRdpAuthority(String rdpAuthority) {
        this.rdpAuthority = rdpAuthority;
        return this;
    }

    /**
     * Get the sshAuthority property: The SshAuthority property is a server DNS host name or IP address followed by the
     * service port number for SSH.
     *
     * @return the sshAuthority value.
     */
    public String sshAuthority() {
        return this.sshAuthority;
    }

    /**
     * Set the sshAuthority property: The SshAuthority property is a server DNS host name or IP address followed by the
     * service port number for SSH.
     *
     * @param sshAuthority the sshAuthority value to set.
     * @return the NetworkInterfaceProperties object itself.
     */
    public NetworkInterfaceProperties withSshAuthority(String sshAuthority) {
        this.sshAuthority = sshAuthority;
        return this;
    }

    /**
     * Get the sharedPublicIpAddressConfiguration property: The configuration for sharing a public IP address across
     * multiple virtual machines.
     *
     * @return the sharedPublicIpAddressConfiguration value.
     */
    public SharedPublicIpAddressConfiguration sharedPublicIpAddressConfiguration() {
        return this.sharedPublicIpAddressConfiguration;
    }

    /**
     * Set the sharedPublicIpAddressConfiguration property: The configuration for sharing a public IP address across
     * multiple virtual machines.
     *
     * @param sharedPublicIpAddressConfiguration the sharedPublicIpAddressConfiguration value to set.
     * @return the NetworkInterfaceProperties object itself.
     */
    public NetworkInterfaceProperties withSharedPublicIpAddressConfiguration(
        SharedPublicIpAddressConfiguration sharedPublicIpAddressConfiguration) {
        this.sharedPublicIpAddressConfiguration = sharedPublicIpAddressConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sharedPublicIpAddressConfiguration() != null) {
            sharedPublicIpAddressConfiguration().validate();
        }
    }
}