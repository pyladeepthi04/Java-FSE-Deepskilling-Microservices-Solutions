package com.cognizant.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ServiceTest {

    @Test
    public void testService() {

        // Create Mock Repository
        Repository mockRepository = mock(Repository.class);

        // Stub the Repository
        when(mockRepository.getData()).thenReturn("Mock Data");

        // Inject Mock into Service
        Service service = new Service(mockRepository);

        // Verify Result
        assertEquals("Mock Data", service.fetchData());

        // Verify Interaction
        verify(mockRepository).getData();
    }
}