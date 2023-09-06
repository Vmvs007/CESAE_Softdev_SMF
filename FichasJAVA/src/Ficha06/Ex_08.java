package Ficha06;

import java.util.Scanner;

public class Ex_08 {

    /**
     * Método que imprime na consola a soma das duas matrizes
     * @param matriz1 Matriz a Somar
     * @param matriz2 Matriz a Somar
     */
    static void somarMatrizes(int[][] matriz1, int[][] matriz2){
        int soma;

        // Ciclo para iterar as matrizes
        for(int linha =0; linha<matriz1.length;linha++){
            for(int coluna =0; coluna<matriz1[0].length;coluna++) {
                soma = matriz1[linha][coluna]+matriz2[linha][coluna];
                System.out.print(soma +"\t");
            }
            System.out.println();
        }

}

static int somatorioMatrizes(int[][] matriz1, int[][] matriz2){

        int somatorio=0;

    // Ciclo para iterar as matrizes
    for(int linha =0; linha<matriz1.length;linha++){
        for(int coluna =0; coluna<matriz1[0].length;coluna++) {
            somatorio = somatorio + matriz1[linha][coluna];
            somatorio += matriz2[linha][coluna];
        }
        }

    return somatorio;
}

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[ ][ ] matriz1 = new int[3][3];
        int[ ][ ] matriz2 = new int[3][3];
        int somatorio;

        // Inicializar a matriz1
        System.out.println("**** Matriz 1 ****");
        for(int linha =0; linha<matriz1.length;linha++){
            for(int coluna =0; coluna<matriz1[0].length;coluna++){
                System.out.print("Insira na matriz1["+linha+"]["+coluna+"]: ");
                matriz1[linha][coluna]= input.nextInt();
            }
        }
        System.out.println("\n**** Matriz 2 ****");
        // Inicializar a matriz2
        for(int linha =0; linha<matriz2.length;linha++){
            for(int coluna =0; coluna<matriz2[0].length;coluna++){
                System.out.print("Insira na matriz2["+linha+"]["+coluna+"]: ");
                matriz2[linha][coluna]= input.nextInt();
            }
        }

        System.out.println("\n**** Soma Matrizes ****");
        somarMatrizes(matriz1,matriz2);

        System.out.println("\n**** Somatorio Matrizes *****");
        somatorio = somatorioMatrizes(matriz1,matriz2);
        System.out.println(somatorio);
    }
}
