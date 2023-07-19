package Ficha05;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        boolean crescente = true;

        // Ciclo para preencher um Array c/ 10 posições
        for(int i=0; i<10; i++){
            System.out.print("Insira um número no Array["+i+"]: ");
            vetor[i]= input.nextInt();
        }

        // Ciclo para perceber se o array é crescente
        for(int i=1; i<10 ; i++){
            if(vetor[i]<=vetor[i-1]){
                crescente=false;
            }
        }

        // Enter
        System.out.println("");

        // Imprimir na consola de acordo com a variável "crescente"
        if(crescente){
            System.out.println("Array Crescente");
        }else{
            System.out.println("Array Não Crescente");
        }


    }

}
