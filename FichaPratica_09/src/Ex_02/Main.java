package Ex_02;

public class Main {
    public static void main(String[] args) {

        Cao bobby = new Cao("Bobby","Salcicha");

        Cao max = new Cao("Max","Pastor Alemão");
        Cao bolinhas = new Cao("Bolinhas", "Pincher");

        bobby.ladrar();
        max.ladrar();
        bolinhas.ladrar();

        bobby.setLatido("Woooof!");

        System.out.println("__________________");

        bobby.ladrar();
        max.ladrar();
        bolinhas.ladrar();

        bolinhas.setLatido("ai ai ai");

        System.out.println("__________________");

        bobby.ladrar();
        max.ladrar();
        bolinhas.ladrar();

    }
}
