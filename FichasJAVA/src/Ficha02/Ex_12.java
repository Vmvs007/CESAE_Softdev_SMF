package Ficha02;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int opcao;

        // Apresentar as opções
        System.out.println("1 - Criar");
        System.out.println("2 - Atualizar");
        System.out.println("3 - Eliminar");
        System.out.println("4 - Sair");

        // Ler input do utilizador
        System.out.print("\nEscolha uma opção: ");
        opcao= input.nextInt();

        // Imprimir a opção do utilizador
        switch (opcao){
            case 1:
                System.out.println("Escolheu Criar");
                break;

            case 2:
                System.out.println("Escolheu Atualizar");
                break;

            case 3:
                System.out.println("Escolheu Eliminar");
                break;

            case 4:
                break;

            default:
                System.out.println("Opção Inválida");
                break;

        }
    }
}
