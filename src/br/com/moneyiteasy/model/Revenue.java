package br.com.moneyiteasy.model;

public class Revenue {
    private String category;
    private double value;
    private String timestamp;

    public Revenue() {}

    public Revenue(String category, double value, String timestamp) {
        this.category = category;
        setValue(value);
        this.timestamp = timestamp;
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

    public String getTimestamp() {
        return timestamp;
    }
}