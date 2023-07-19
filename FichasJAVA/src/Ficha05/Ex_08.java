package Ficha05;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][3];

        // Ler input do utilizador
        for(int linha=0; linha <3 ; linha++){
            for(int coluna=0; coluna<3; coluna++){
                System.out.print("Insira um número na matriz["+linha+"]["+coluna+"]: ");
                matriz[linha][coluna]=input.nextInt();
            }
        }

        for(int i=0; i <3 ; i++){
            for(int j=0; j<3; j++){
                System.out.print("Insira um número na matriz["+i+"]["+j+"]: ");
                matriz[i][i]=input.nextInt();
            }
        }


    }
}
