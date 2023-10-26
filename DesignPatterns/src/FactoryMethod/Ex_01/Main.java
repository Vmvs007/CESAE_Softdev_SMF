package FactoryMethod.Ex_01;

import java.awt.color.ProfileDataException;

public class Main {
    public static void main(String[] args) {
        Product biblia = ProductFactory.createProduct("book","Biblia", 15,"123456789");
        Product laptop = ProductFactory.createProduct("eletronics","Laptop HP",500,"Computador Portatil");

        biblia.display();
        laptop.display();

    }
}
