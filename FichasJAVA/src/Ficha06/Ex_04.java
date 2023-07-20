package Ficha06;

import java.util.Scanner;

import static Ficha06.Ex_03.*;

public class Ex_04 {
    public static void main(String[] args) {
        System.out.println("***** Análise de um Número *****");
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao, numero;

        // Ler numero
        System.out.print("Introduza um número: ");
        numero= input.nextInt();

        // Menu
        do {
            System.out.println("_______________________________________________________________________________");
            System.out.println("_______________________________________________________________________________");
            System.out.println("\n***** Número a analisar: "+numero+" *****");
            System.out.println("1 - Par ou Ímpar");
            System.out.println("2 - Positivo ou Negativo");
            System.out.println("3 - Primo ou Não Primo");
            System.out.println("4 - Perfeito ou Não Perfeito");
            System.out.println("5 - Triangular ou Não Triangular");
            System.out.println("6 - Trocar de Número");
            System.out.println("0 - Sair");

            System.out.print("\nSelecione uma opção: ");
            opcao=input.nextInt();

            switch (opcao){
                case 1: // Par ou Impar

                    System.out.println("Par: "+par(numero));

                    break;

                case 2: // Positivo ou Negativo

                    if(positivo(numero)){
                        System.out.println("Positivo");
                    }else{
                        System.out.println("Negativo");
                    }

                    break;

                case 3: // Primo ou Não Primo
                    break;

                case 4: // Perfeito ou Não Perfeito
                    break;

                case 5: // Triangular ou Não Triangular
                    break;

                case 6: // Trocar de Número
                    System.out.print("\nIntroduza um novo número: ");
                    numero= input.nextInt();
                    break;

                case 0: // Sair
                    break;

                default: // Inválido
                    System.out.println("\n***** Opção Inválida *****");
                    break;
            }

        }while (opcao!=0);
    }
}
