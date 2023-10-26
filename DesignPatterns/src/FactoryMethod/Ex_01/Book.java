package FactoryMethod.Ex_01;

public class Book extends Product{

    private String isbn;

    public Book(String product_name, double product_price, String isbn) {
        super(product_name, product_price);
        this.isbn = isbn;
    }

    @Override
    public void display() {
        System.out.println("***** Book *****");
        System.out.println("Nome: "+super.getProduct_name());
        System.out.println("Preço: "+super.getProduct_price());
        System.out.println("ISBN: "+this.isbn);
    }

}
