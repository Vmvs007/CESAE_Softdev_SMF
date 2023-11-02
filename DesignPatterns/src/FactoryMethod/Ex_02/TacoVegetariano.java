package FactoryMethod.Ex_02;

public class TacoVegetariano extends Taco{
    @Override
    public void prepare() {
        System.out.println("A preparar um taco vegetariano!");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar um taco vegetariano!");
    }

    @Override
    public void box() {
        System.out.println("A embalar um taco vegetariano!");
    }
}
