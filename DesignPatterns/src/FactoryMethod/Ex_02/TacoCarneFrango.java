package FactoryMethod.Ex_02;

public class TacoCarneFrango extends Taco{
    @Override
    public void prepare() {
        System.out.println("A preparar um taco de carne de frango!");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar um taco de carne de frango!");
    }

    @Override
    public void box() {
        System.out.println("A embalar um taco de carne de frango!");
    }
}
