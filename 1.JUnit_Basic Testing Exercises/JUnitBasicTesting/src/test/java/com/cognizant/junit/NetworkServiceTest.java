package com.cognizant.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class NetworkServiceTest {

    @Test
    public void testFetchResponse() {

        // Create mock
        NetworkClient mockClient = mock(NetworkClient.class);

        // Stub method
        when(mockClient.sendRequest()).thenReturn("Network Response");

        // Inject mock
        NetworkService service = new NetworkService(mockClient);

        // Verify result
        assertEquals("Network Response", service.fetchResponse());

        // Verify interaction
        verify(mockClient).sendRequest();
    }
}