package Ficha05;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[5][5];
        int somatorio=0;

        // Ler input do utilizador
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print("Insira um número na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
                somatorio+=matriz[linha][coluna]; //A mesma coisa: somatorio=somatorio+matriz[linha][coluna];
            }
            System.out.println("");
        }

        System.out.println("\nSomatório: "+somatorio);

    }
}
