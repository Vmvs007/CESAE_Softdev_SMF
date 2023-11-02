package FactoryMethod.Ex_01;

import java.util.Map;

public class ProductFactory {
    /**
     *
     * @param type
     * @param name
     * @param price
     * @param attributes
     * @return
     */
    public static Product createProduct(String type, String name, double price, Map<String, String> attributes) {
        switch (type) {
            case "book":
                return new Book(name, price, attributes.get("isbn"));

            case "eletronics":
                return new Eletronics(name, price, attributes.get("categoria"),attributes.get("marca"),Double.parseDouble(attributes.get("consumoWatts")));

            case "clothing":
                return new Clothing(name, price, attributes.get("size"), attributes.get("brand"));

            case "food":
                return new Food(name, price, Double.parseDouble(attributes.get("kcal")));
            default:
                throw new IllegalArgumentException("Tipo de Produto Inválido: " + type);
        }
    }
}
