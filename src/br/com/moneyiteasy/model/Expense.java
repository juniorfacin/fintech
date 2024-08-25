package br.com.moneyiteasy.model;

public class Expense {
    private String category;
    private double value;

    public Expense() {}

    public Expense(String category, double value) {
        this.category = category;
        setValue(value);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo!");
        }
        this.value = value;
    }
}
