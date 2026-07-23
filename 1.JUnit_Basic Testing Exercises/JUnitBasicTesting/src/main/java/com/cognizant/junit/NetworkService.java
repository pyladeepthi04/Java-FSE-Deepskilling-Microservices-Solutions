package com.cognizant.junit;

public class NetworkService {

    private NetworkClient networkClient;

    public NetworkService(NetworkClient networkClient) {
        this.networkClient = networkClient;
    }

    public String fetchResponse() {
        return networkClient.sendRequest();
    }
}