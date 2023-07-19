package Ficha05;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
//Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

//Declaração e inicialização de variáveis e matriz:
        int numMatriz[][] = new int[3][3];
        int numIndice, numLinha, numColuna;

//Declaração da matriz:
        for (numLinha = 0; numLinha < numMatriz.length; numLinha++) {
            for (numColuna = 0; numColuna < numMatriz.length; numColuna++) {
                System.out.print("Insira na matriz["+numLinha+"]["+numColuna+"]: ");
                numMatriz[numLinha][numColuna] = input.nextInt();
            }
        }
    }
}