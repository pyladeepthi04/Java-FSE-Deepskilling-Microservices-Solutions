package com.cognizant.junit;

import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class NotificationManagerTest {

    @Test
    void testNotification() {

        NotificationService mockService = mock(NotificationService.class);

        NotificationManager manager = new NotificationManager(mockService);

        manager.notifyUser("Hello Deepthi");

        verify(mockService).sendNotification(anyString());
    }
}