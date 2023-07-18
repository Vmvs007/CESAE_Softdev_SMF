package Ficha05;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];

        // Ciclo para preencher um Array c/ 10 posições
        for(int i=0; i<10; i++){
            System.out.print("Insira um número no Array["+i+"]: ");
            vetor[i]= input.nextInt();
        }

        // Enter para ficar bonito
        System.out.println("");

        // Ciclo para imprimir um Array c/ 10 posições
        for(int i=0; i<10; i++){
            //System.out.println(vetor[i]);
            System.out.println("Array["+i+"]: "+vetor[i]);
        }


    }
}
