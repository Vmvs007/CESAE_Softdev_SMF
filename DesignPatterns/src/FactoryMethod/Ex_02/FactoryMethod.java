package FactoryMethod.Ex_02;

public class FactoryMethod {

    public static Taco createTaco(String tipoTaco){

        tipoTaco=tipoTaco.toUpperCase();
        tipoTaco=tipoTaco.trim();

        switch (tipoTaco){

            case "CARNE DE VACA": return new TacoCarneVaca();

            case "CARNE DE FRANGO": return new TacoCarneFrango();

            case "VEGETARIANO": return new TacoVegetariano();

            default: throw new IllegalArgumentException("Taco não está na ementa: "+tipoTaco);
        }
    }
}
