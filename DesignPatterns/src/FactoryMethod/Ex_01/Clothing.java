package FactoryMethod.Ex_01;

public class Clothing extends Product{

    private String tamanho;
    private String marca;


    public Clothing(String product_name, double product_price, String tamanho, String marca) {
        super(product_name, product_price);
        this.tamanho = tamanho;
        this.marca = marca;
    }

    @Override
    public void display() {
        System.out.println("***** Clothing *****");
        System.out.println("Nome: "+super.getProduct_name());
        System.out.println("Preço: "+super.getProduct_price());
        System.out.println("Tamanho: "+this.tamanho);
        System.out.println("Marca: "+this.marca);
    }
}
