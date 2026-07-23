package com.cognizant.junit;

public class Service {

    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public String fetchData() {
        return repository.getData();
    }
}