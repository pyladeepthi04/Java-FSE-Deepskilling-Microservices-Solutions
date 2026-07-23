package com.cognizant.junit;

public interface PaymentGateway {

    void connect();

    void processPayment();

    void disconnect();
}