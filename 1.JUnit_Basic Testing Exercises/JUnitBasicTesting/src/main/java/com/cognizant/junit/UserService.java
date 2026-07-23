package com.cognizant.junit;

public class UserService {

    private ApiClient apiClient;

    public UserService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public String fetchUser() {
        return apiClient.getUser();
    }
}