package FactoryMethod.Ex_01;

public class Food extends Product{

    private double kcal;

    public Food(String product_name, double product_price, double kcal) {
        super(product_name, product_price);
        this.kcal = kcal;
    }

    @Override
    public void display() {
        System.out.println("***** Food ****");
    }
}
