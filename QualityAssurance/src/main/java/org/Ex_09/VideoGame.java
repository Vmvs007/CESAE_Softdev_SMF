package org.Ex_09;

public class VideoGame {
    private String name;
    private String publisher;
    private double costPrice;
    private double sellingPrice;
    public VideoGame(String name, String publisher, double costPrice, double sellingPrice) {
        this.name = name;
        this.publisher = publisher;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }
    public String getName() {
        return name;
    }
    public String getPublisher() {
        return publisher;
    }
    public double getCostPrice() {
        return costPrice;
    }
    public double getSellingPrice() {
        return sellingPrice;
    }
}