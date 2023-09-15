package Ex_06;

public class Main {
    public static void main(String[] args) {

        Calculadora cl = new Calculadora();

        System.out.println("10+5 = "+cl.adicao(10,5));

        System.out.println(cl.subtracao(25,12)) ;

        System.out.println(cl.multiplicacao(10,90));

        System.out.println(cl.divisao(10,2));
    }
}
