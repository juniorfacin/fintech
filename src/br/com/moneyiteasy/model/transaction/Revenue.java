package br.com.moneyiteasy.model.transaction;

public class Revenue extends Transaction {
    private String origin;
    public Revenue (String category, double value, String timestamp, String method, String origin, boolean type){
        super(category, value, timestamp, method, type);
        this.origin = origin;
        this.setType(true);
    }
    public String getOrigin() {return origin;}
    public void setOrigin(String origin) { this.origin = origin; }
}