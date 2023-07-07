package Ficha01;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        // Linha obrigatória porque o formador disse que sim
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercício 4 *****");

        // Declarar variáveis
        double raio,area;

        // Declarar constantes
        final double PI = 3.1415926;

        // Ler input do utilizador
        System.out.print("Insira o raio: ");
        raio = input.nextDouble();

        // Calcular a área da circuferência - pi*(raio*raio)
        area= PI*(raio*raio);

        // Apresentar a área
        System.out.println("Área da circuferência: "+area);
    }


}
