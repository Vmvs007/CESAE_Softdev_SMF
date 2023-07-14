package Ficha03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
//Impor Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

//Entrada e declaração de dados:
        int numContador, numEntrada, numFinal,  numInseridoDesejado;
        int numMaior, numMenor;
        numContador = 0;
        numMaior = 0;
        numMenor = 0;

        boolean crescente= true;

//Entrada de dados:
        System.out.print("Para determinar uma sequência introduza a quantidade de numeros desejados: ");
        numInseridoDesejado = input.nextInt();

        System.out.print("Insira o " + (numContador + 1) + "º: ");
        numEntrada = input.nextInt();

        numContador++;

//Resolução com laço while:
        while (numContador < numInseridoDesejado) {
            System.out.print("Insira o " + (numContador + 1) + "º: ");
            numFinal = input.nextInt();
            numContador++;

            System.out.print("Estou a comparar se: "+numEntrada+" < "+numFinal+": ");
            if (numEntrada < numFinal) {
                System.out.println("Verdadeiro");
            }else{
                System.out.println("Falso");
                System.out.println(" A sequencia não é mais crescente");
                crescente=false;
            }

        numEntrada=numFinal;

        }

        if(crescente==true){
            System.out.println("Crescente");
        }else{
            System.out.println("Não crescente");
        }

    }
}
