package br.com.moneyiteasy.service.transaction;

import br.com.moneyiteasy.model.transaction.Expense;
import br.com.moneyiteasy.model.transaction.Transaction;

public class ExpenseManager extends TransactionManager {

    @Override
    protected String getTransactionType() {
        return "despesa";
    }

    @Override
    protected Transaction createTransaction(String category, double value, String timestamp, String method) {
        return new Expense(category, value, timestamp, method, false);
    }
}
