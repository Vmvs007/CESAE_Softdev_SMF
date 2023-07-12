package Ficha02;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valor, notas;

        // Ler input do utilizador
        System.out.print("Insira um valor em €: ");
        valor = input.nextInt();

        // Apresentar o valor lido
        System.out.println("\n**** Valor €: "+valor+" *****");

        if(valor%5==0){
            // Apresentar as notas de 200
            notas = valor/200;
            System.out.println("Notas de 200€: "+notas);
            valor = valor%200;

            // Apresentar as notas de 100
            notas = valor/100;
            System.out.println("Notas de 100€: "+notas);
            valor = valor%100;

            // Apresentar as notas de 50
            notas = valor/50;
            System.out.println("Notas de 50€: "+notas);
            valor = valor%50;

            // Apresentar as notas de 20
            notas = valor/20;
            System.out.println("Notas de 20€: "+notas);
            valor = valor%20;

            // Apresentar as notas de 10
            notas = valor/10;
            System.out.println("Notas de 10€: "+notas);
            valor = valor%10;

            // Apresentar as notas de 5
            notas = valor/5;
            System.out.println("Notas de 5€: "+notas);
        }else{
            System.out.println("Valor incorreto!");
        }


    }
}
