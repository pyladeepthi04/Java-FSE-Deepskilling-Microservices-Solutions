package com.cognizant.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testFetchUser() {

        // Create mock
        ApiClient mockApi = mock(ApiClient.class);

        // Stub method
        when(mockApi.getUser()).thenReturn("Deepthi");

        // Inject mock
        UserService service = new UserService(mockApi);

        // Verify output
        assertEquals("Deepthi", service.fetchUser());

        // Verify interaction
        verify(mockApi).getUser();
    }
}