package com.anuj.stockexchange.transaction.service.process;

import com.s1gawron.stockexchange.transaction.model.Transaction;

public interface TransactionProcessorStrategy {

    boolean canProcessTransaction(Transaction transaction);

    void processTransaction(Transaction transaction);

}
