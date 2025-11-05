package com.anuj.stockexchange.transaction.exception;

public class StockQuantityLteZeroException extends RuntimeException {

    private StockQuantityLteZeroException(final String message) {
        super(message);
    }

    public static StockQuantityLteZeroException create() {
        return new StockQuantityLteZeroException("Stock quantity cannot be less than or equal to 0!");
    }
}
