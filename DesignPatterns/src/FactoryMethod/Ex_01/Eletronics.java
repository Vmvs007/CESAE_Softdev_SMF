package FactoryMethod.Ex_01;

public class Eletronics extends Product{

    private String categoria;
    private String marca;
    private double consumoWatts;

    public Eletronics(String product_name, double product_price, String categoria, String marca, double consumoWatts) {
        super(product_name, product_price);
        this.categoria = categoria;
        this.marca = marca;
        this.consumoWatts = consumoWatts;
    }

    /**
     *
     */
    @Override
    public void display() {
        System.out.println("***** Eletronics *****");
        System.out.println("Nome: "+super.getProduct_name());
        System.out.println("Preço: "+super.getProduct_price());
        System.out.println("Categoria: "+this.categoria);
    }
}
