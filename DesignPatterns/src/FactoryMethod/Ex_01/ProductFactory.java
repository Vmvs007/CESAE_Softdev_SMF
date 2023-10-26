package FactoryMethod.Ex_01;

import java.util.Locale;

public class ProductFactory {
    public static Product createProduct(String type, String product_name, double product_price, String atributo){
        switch (type){
            case "book":
                return new Book(product_name,product_price,atributo);


            case "eletronics":
                return new Eletronics(product_name,product_price,atributo);


            case "clothing":
                return new Clothing(product_name,product_price,atributo);

            default: throw new IllegalArgumentException("Tipo de Produto Inválido: "+type);
        }
    }
}
