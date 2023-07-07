package Ficha01;


import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Linha obrigatória porque o formador disse que sim
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercício 1 *****");

        // Declarar as variáveis
        int num1, num2, soma;

        // Ler input do utilizador
        System.out.print("Introduz um numero: ");
        num1 = input.nextInt();

        // Ler input do utilizador
        System.out.print("Introduz outro numero: ");
        num2 = input.nextInt();

        // Calcular a soma
        soma = num1+num2;

        // Apresentar a soma
        System.out.println("Soma: " + soma);
    }
}
