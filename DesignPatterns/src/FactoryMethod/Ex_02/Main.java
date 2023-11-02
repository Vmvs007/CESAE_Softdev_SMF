package FactoryMethod.Ex_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String escolhaTaco;

            System.out.print("Tipo de Taco Pretendido [Carne de Vaca][Carne de Frango][Vegetariano]: ");
            escolhaTaco = input.nextLine();

            Taco tacoUtilizador = FactoryMethod.createTaco(escolhaTaco);

            tacoUtilizador.prepare();
            tacoUtilizador.bake();
            tacoUtilizador.box();

    }
}
