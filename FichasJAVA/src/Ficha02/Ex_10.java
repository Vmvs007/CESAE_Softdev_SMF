package Ficha02;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num1,num2, resultado;
        String operacao;

        // Ler input do utilizador
        System.out.print("Insira um numero: ");
        num1 = input.nextDouble();

        System.out.print("Insira outro numero: ");
        num2 = input.nextDouble();

        System.out.print("Escolha a operação (+ - * /): ");
        operacao = input.next();

        // Fazer a operação de acordo com o escolhido
        switch (operacao){
            case "+": // Soma
                resultado= num1 + num2;
                System.out.println("Soma: "+ resultado);
                break;

            case "-": // Subtração
                resultado= num1 - num2;
                System.out.println("Subtração: "+ resultado);
                break;

            case "*": // Multiplicação
                resultado= num1 * num2;
                System.out.println("Multiplicação: "+ resultado);
                break;

            case "/": // Divisão
                resultado= num1 / num2;
                System.out.println("Divisão: "+ resultado);
                break;

            default:
                System.out.println("Operação Inválida!");
                break;
        }

    }
}
