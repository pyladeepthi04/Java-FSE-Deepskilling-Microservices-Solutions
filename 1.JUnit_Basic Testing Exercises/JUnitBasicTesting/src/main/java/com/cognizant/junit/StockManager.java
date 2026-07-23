package com.cognizant.junit;

public class StockManager {

    private StockService stockService;

    public StockManager(StockService stockService) {
        this.stockService = stockService;
    }

    public int checkStock() {
        return stockService.getStock();
    }
}