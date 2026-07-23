package com.cognizant.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class FileProcessorTest {

    @Test
    public void testProcessFile() {

        // Create mock
        FileReader mockReader = mock(FileReader.class);

        // Stub method
        when(mockReader.readFile("data.txt"))
                .thenReturn("File Content");

        // Inject mock
        FileProcessor processor = new FileProcessor(mockReader);

        // Verify result
        assertEquals("File Content", processor.processFile("data.txt"));

        // Verify interaction
        verify(mockReader).readFile("data.txt");
    }
}