package br.com.moneyiteasy.model.transaction;

public class Expense extends Transaction {
    public Expense (String category, double value, String timestamp,String method, boolean type){
        super(category, value, timestamp,method, type);
        this.setType(false);
    }
}