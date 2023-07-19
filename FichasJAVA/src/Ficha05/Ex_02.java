package Ficha05;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double[] vetor = new double[12];
        double total=0;

        // Ciclo para preencher um Array c/ 12 posições
        for(int i=0; i<12; i++){
            System.out.print("Insira um número no Array["+i+"]: ");
            vetor[i]= input.nextDouble();

            // Adicionar esse número ao somatório (total)
            total=total+vetor[i];
        }

        System.out.println("\nTotal Anual: "+total);

    }
}
