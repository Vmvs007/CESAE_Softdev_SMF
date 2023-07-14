package Ficha03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 1, fatorial, resultado = 1;

        //Ler input do utilizador
        System.out.print("Introduza um número: ");
        fatorial = input.nextInt();

        //Calcular e imprimir fatorial de um número


        while (fatorial >= num) {

            resultado = resultado * num;
            num = num + 1;

        }
        System.out.println("Fatorial: " + resultado);
    }
}
