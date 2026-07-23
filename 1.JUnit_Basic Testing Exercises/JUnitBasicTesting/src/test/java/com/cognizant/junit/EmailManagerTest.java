package com.cognizant.junit;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

public class EmailManagerTest {

    @Test
    void testSendEmailException() {

        EmailService mockEmailService = mock(EmailService.class);

        doThrow(new RuntimeException("Email sending failed"))
                .when(mockEmailService)
                .sendEmail("deepthi@gmail.com");

        EmailManager manager = new EmailManager(mockEmailService);

        assertThrows(RuntimeException.class, () -> {
            manager.send("deepthi@gmail.com");
        });
    }
}