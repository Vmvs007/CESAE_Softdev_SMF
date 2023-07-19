package Ficha05;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double[] vetor = new double[10];
        double media, somatorio=0;

        // Ciclo para preencher um Array c/ 10 posições
        for(int i=0; i<10; i++){
            System.out.print("Insira um número no Array["+i+"]: ");
            vetor[i]= input.nextDouble();

            // Calcula o somatório dos elementos
            somatorio = somatorio + vetor[i];
        }

        // Calcular a média
        media = somatorio/10;

        // Apresentar a media
        System.out.println("\nMédia: "+media);

    }
}
