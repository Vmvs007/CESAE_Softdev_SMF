package Ficha05;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][5];
        int pesquisa, contador = 0;

        // Ler input do utilizador
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print("Insira um número na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
            System.out.println("");
        }

        // Perguntar qual o número a pesquisar
        System.out.print("\nNúmero a pesquisar: ");
        pesquisa = input.nextInt();

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (matriz[linha][coluna] == pesquisa) {
                    contador++;
                }
            }
        }

        System.out.println("\nO número " + pesquisa + " foi encontrado " + contador + " vezes na matriz.");

    }
}
