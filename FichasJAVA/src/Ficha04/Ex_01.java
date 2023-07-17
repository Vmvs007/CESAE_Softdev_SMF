package Ficha04;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num1, num2, resultado;
        String operacao, repetir;

        do {

            // Ler num1
            System.out.print("Insira um numero: ");
            num1 = input.nextDouble();

            // Ler num2
            System.out.print("Insira um numero: ");
            num2 = input.nextDouble();

            // Ler operacao
            System.out.print("Operação (+ - * /): ");
            operacao = input.next();

            // Aplicar a operação correspondente
            switch (operacao) {
                case "+": // Soma
                    resultado = num1 + num2;
                    System.out.println("Soma: " + resultado);
                    break;

                case "-": // Subtração
                    resultado = num1 - num2;
                    System.out.println("Subtração: " + resultado);
                    break;

                case "*": // Multiplicação
                    resultado = num1 * num2;
                    System.out.println("Multiplicação: " + resultado);
                    break;

                case "/": // Divisão
                    resultado = num1 / num2;
                    System.out.println("Divisão: " + resultado);
                    break;

                default:
                    System.out.println("Operação Inválida!");
                    break;
            }

            // Perguntar se quer repetir
            System.out.print("Deseja Repetir? (s/n): ");
            repetir = input.next();

        }while(repetir.equals("s"));

    }
}
