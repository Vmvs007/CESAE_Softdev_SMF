package Ficha01;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercício 5 *****");

        // Declarar variáveis
        double nota1, nota2, nota3, media;

        // Ler input do utilizador
        System.out.print("Insira a Nota 1: ");
        nota1 = input.nextDouble();

        System.out.print("Insira a Nota 2: ");
        nota2 = input.nextDouble();

        System.out.print("Insira a Nota 3: ");
        nota3 = input.nextDouble();

        // Calcular media aritmetica
        media= (nota1+nota2+nota3)/3;
        System.out.println("Média Aritmética: " + media);

        // Calcular a média ponderada
        media = (nota1*0.2)+(nota2*0.3)+(nota3*0.5);
        System.out.println("Media Ponderada: "+ media);


    }
}
