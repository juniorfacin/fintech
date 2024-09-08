package br.com.moneyiteasy.model.transaction;

public abstract class Transaction {
    private String category;
    private String timestamp;
    private String method;
    private double value;
    private boolean type;

    public Transaction() {}

    public Transaction(String category, double value, String timestamp, String method, boolean type) {
        this.category = category;
        setValue(value);
        this.timestamp = timestamp;
        this.method = method;
        this.type = type;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getCategory() {
        return category;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
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

    public String isType() {
        //#######################CONFIRMAR SE É ISTYPE OU GETTYPE ###################
        if (type) {
            return "";
        } else {
            return "-";
        }
    }

    public void setType(boolean type) {
        this.type = type;
    }
}