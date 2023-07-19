package Ficha05;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int menor;

        // Ciclo para preencher um Array c/ 10 posições
        for(int i=0; i<10; i++){
            System.out.print("Insira um número no Array["+i+"]: ");
            vetor[i]= input.nextInt();
        }

        // Inicializo o menor com a posição 0 do array
        // Nota: Podia inicializar com qualquer poisçõa do array
        menor=vetor[0];

        // Ciclo para descobrir o menor elemento
        for(int i=0; i<10; i++){
            // Descobrir se o elemento é maior
            if(vetor[i]<menor){
                menor=vetor[i];
            }
        }

        System.out.println("Menor: "+menor);

    }
}
