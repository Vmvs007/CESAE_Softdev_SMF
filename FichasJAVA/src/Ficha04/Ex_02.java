package Ficha04;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;

        do {
            // Apresentar as opções do menu
            System.out.println("***** Menu *****");
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");

            // Ler opção do utilizador
            System.out.print("Escolha a sua opção: ");
            opcao = input.nextInt();

            // Executar as opções (até que a 4 seja escolhida)
            switch (opcao) {
                case 1: // Criar
                    System.out.println("\n**** Criar *****\n");
                    break;

                case 2: // Atualizar
                    System.out.println("\n**** Atualizar *****\n");
                    break;

                case 3: // Eliminar
                    System.out.println("\n**** Eliminar *****\n");
                    break;

                case 4: // Sair
                    System.out.println("\n**** Sair *****\n");
                    break;

                default: // Inválido
                    System.out.println("\n!!!!! Opção Inválida !!!!!\n");
                    break;
            }
        } while (opcao != 4);


    }
}
