package Ficha06;

import java.util.Scanner;

import static Ficha06.Ex_05.*;

public class Ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int tamanhoVetor, opcao;

        System.out.print("Tamanho do vetor: ");
        tamanhoVetor= input.nextInt();

        // Declarar vetor
        int[] vetor = new int[tamanhoVetor];

        // Ciclo para preencher o vetor com numeros do utilizador
        for(int i=0; i<vetor.length; i++){
            System.out.print("Introduza um numero no vetor["+i+"]: ");
            vetor[i]= input.nextInt();
        }


        // Menu
        do {
            System.out.println("_______________________________________________________________________________");
            System.out.println("_______________________________________________________________________________");
            System.out.println("\n***** Analise de um Vetor *****");
            System.out.println("1 - Maior Elemento");
            System.out.println("2 - Menor Elemento");
            System.out.println("3 - Crescente ou Não Crescente");
            System.out.println("0 - Sair");

            System.out.print("\nSelecione uma opção: ");
            opcao=input.nextInt();

            switch (opcao){
                case 1: // Maior Elemento
                    System.out.println("Maior Elemento do Vetor: "+ maior(vetor));
                    break;

                case 2: // Menor Elemento
                    break;

                case 3: // Crescente ou Não Crescente
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
