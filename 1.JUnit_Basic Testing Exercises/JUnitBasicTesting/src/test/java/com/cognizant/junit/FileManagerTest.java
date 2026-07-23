package com.cognizant.junit;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

public class FileManagerTest {

    @Test
    void testDeleteFileException() {

        FileService mockFileService = mock(FileService.class);

        doThrow(new RuntimeException("File not found"))
                .when(mockFileService)
                .deleteFile("sample.txt");

        FileManager manager = new FileManager(mockFileService);

        assertThrows(RuntimeException.class, () -> {
            manager.removeFile("sample.txt");
        });
    }
}