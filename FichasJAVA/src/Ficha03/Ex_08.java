package Ficha03;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num = 0, somatorio = 0, contador = 0, media;

        while (num != -1) {

            // Ler input do utilizador
            System.out.print("Insira um número: ");
            num = input.nextDouble();

            if(num!=-1){
                contador++;
                somatorio = somatorio + num;

            }
            System.out.println("Contador: " + contador);
            System.out.println("Somatório: " + somatorio);
        }

        media = somatorio / contador;
        System.out.println("Média: " + media);

    }
}
