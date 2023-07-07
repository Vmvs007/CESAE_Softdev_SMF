package Ficha01;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercício 6 *****");

        // Declarar variáveis
        int valor1, valor2;

        // Ler input do utilizador
        System.out.print("Insira o valor1: ");
        valor1=input.nextInt();

        System.out.print("Insira o valor2: ");
        valor2=input.nextInt();

        // Apresentar variáveis iniciais
        System.out.println("\nValor 1: "+valor1);
        System.out.println("Valor 2: "+valor2);

        // Trocar as variáveis
        System.out.println("\nTroca em progresso...");
         valor1=valor1+valor2;
         valor2 = valor1 - valor2;
         valor1=valor1-valor2;


        // Apresentar as variáveis trocadas
        System.out.println("\nValor 1 Trocado: "+valor1);
        System.out.println("Valor 2 Trocado: "+valor2);
    }
}
