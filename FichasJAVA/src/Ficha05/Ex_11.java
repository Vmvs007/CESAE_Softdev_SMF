package Ficha05;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][3];
        int menor, maior;

        // Ler input do utilizador
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Insira um número na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
            System.out.println("");
        }

        // Inicializar menor e maior
        menor = matriz[0][0];
        maior = matriz[0][0];

        // Ciclo para iterar a matriz
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {

                // Perceber qual o menor
                if (matriz[linha][coluna] < menor) {
                    menor = matriz[linha][coluna];
                }

                // Perceber qual o maior
                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                }

            }
        }

        // Enter
        System.out.println("");

        // Imprimir a matriz
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("\t" + matriz[linha][coluna]);
            }
            System.out.println("");
        }

        // Imprimir o maior e o menor
        System.out.println("\nMenor: "+menor);
        System.out.println("Maior: "+maior);
    }
}
