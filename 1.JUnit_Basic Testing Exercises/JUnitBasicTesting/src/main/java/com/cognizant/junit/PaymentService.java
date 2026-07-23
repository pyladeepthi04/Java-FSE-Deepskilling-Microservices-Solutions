package com.cognizant.junit;

public class PaymentService {

    private PaymentGateway gateway;

    public PaymentService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void makePayment() {

        gateway.connect();

        gateway.processPayment();

        gateway.disconnect();
    }
}