package Ficha03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numInicial, numFinal;

        // Ler input do utilizador
        System.out.print("Insira um número inicial: ");
        numInicial= input.nextInt();

        System.out.print("Insira um número final: ");
        numFinal= input.nextInt();

        while (numInicial<=numFinal){
            System.out.println(numInicial);
            numInicial=numInicial+1;
        }


    }
}
