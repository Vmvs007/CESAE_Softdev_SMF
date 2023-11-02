package FactoryMethod.Ex_01;

import java.awt.color.ProfileDataException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> bibliaAttributes = new HashMap<>();

        bibliaAttributes.put("isbn", "1234567890");
        Product biblia = ProductFactory.createProduct("book", "Biblia", 29.99, bibliaAttributes);

        Map<String, String> laptopAttributes = new HashMap<>();
        laptopAttributes.put("categoria", "laptop");
        laptopAttributes.put("marca","HP");
        laptopAttributes.put("consumoWatts","250.5");

        Product laptopHP = ProductFactory.createProduct("eletronics","Laptop HP 15", 600, laptopAttributes);




    }
}
