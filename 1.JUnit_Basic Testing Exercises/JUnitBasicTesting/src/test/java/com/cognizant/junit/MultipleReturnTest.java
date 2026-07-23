package com.cognizant.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MultipleReturnTest {

    @Test
    public void testMultipleReturns() {

        Repository mockRepository = mock(Repository.class);

        when(mockRepository.getData())
                .thenReturn("First Call")
                .thenReturn("Second Call")
                .thenReturn("Third Call");

        Service service = new Service(mockRepository);

        assertEquals("First Call", service.fetchData());
        assertEquals("Second Call", service.fetchData());
        assertEquals("Third Call", service.fetchData());

        verify(mockRepository, times(3)).getData();
    }
}