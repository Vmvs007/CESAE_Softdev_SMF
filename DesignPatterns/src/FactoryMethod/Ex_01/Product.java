package FactoryMethod.Ex_01;

public abstract class Product {

    private String product_name;
    private double product_price;

    public Product(String product_name, double product_price) {
        this.product_name = product_name;
        this.product_price = product_price;
    }

    public abstract void display();

    public String getProduct_name() {
        return product_name;
    }

    public double getProduct_price() {
        return product_price;
    }
}
