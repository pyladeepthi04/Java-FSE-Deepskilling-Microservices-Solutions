package com.cognizant.junit;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

public class PaymentServiceTest {

    @Test
    void testInteractionOrder() {

        PaymentGateway mockGateway = mock(PaymentGateway.class);

        PaymentService service = new PaymentService(mockGateway);

        service.makePayment();

        InOrder inOrder = inOrder(mockGateway);

        inOrder.verify(mockGateway).connect();
        inOrder.verify(mockGateway).processPayment();
        inOrder.verify(mockGateway).disconnect();
    }
}