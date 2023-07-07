package Ficha01;


import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Linha obrigatória porque o formador disse que sim
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercício 2 *****");

        // Declarar variáveis
        double num1, num2, resultado;

        // Ler input do utilizador
        System.out.print("Introduz um numero: ");
        num1 = input.nextDouble();

        System.out.print("Introduz um numero: ");
        num2 = input.nextDouble();

        // Apresentar a soma
        resultado = num1 + num2;
        System.out.println("Soma: "+resultado);

        // Apresentar a subtração
        resultado = num1 -num2;
        System.out.println("Subtracao: "+resultado);

        // Apresentação a multiplicação
        resultado = num1 * num2;
        System.out.println("Multiplicacao: "+resultado);

        // Apresentação a divisão
        resultado = num1/num2;
        System.out.println("Divisao: "+resultado);
    }
}