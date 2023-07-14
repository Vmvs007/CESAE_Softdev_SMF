package Ficha03;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numUtilizador, antecessor, sucessor;

        // Ler input do utilizador
        System.out.print("Insira um número: ");
        numUtilizador = input.nextInt();

        antecessor= numUtilizador-5;
        sucessor = numUtilizador+5;

        // Imprimir antecessores e sucessores
        while (antecessor<=sucessor){

            if(antecessor!=numUtilizador){
                System.out.println(antecessor);
            }

            antecessor++; // antecessor = antecessor +1 || antecessor += 1
        }

    }
}
