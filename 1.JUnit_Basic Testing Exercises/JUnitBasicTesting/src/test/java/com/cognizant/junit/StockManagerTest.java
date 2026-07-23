package com.cognizant.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StockManagerTest {

    @Test
    void testMultipleReturns() {

        StockService mockStock = mock(StockService.class);

        when(mockStock.getStock())
                .thenReturn(100)
                .thenReturn(80)
                .thenReturn(50);

        StockManager manager = new StockManager(mockStock);

        assertEquals(100, manager.checkStock());
        assertEquals(80, manager.checkStock());
        assertEquals(50, manager.checkStock());
    }
}