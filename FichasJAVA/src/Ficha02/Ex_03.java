package Ficha02;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double salario;

        // Ler input do utilizador
        System.out.println("Insira o salário: ");
        salario= input.nextDouble();

        // Perceber a taxa do salário
        if(salario<=15000){ // Salário ser 15.000 ou menos
            System.out.println("Paga taxa de 20%");
            System.out.println("Taxa: " + salario*0.2);
            System.out.println("Salário Liquido: " + salario*0.8);
        }

        if(salario>15000 && salario<=20000){ // Salário maior que 15.000 e menor ou igual que 20.000
            System.out.println("Paga taxa de 30%");
            System.out.println("Taxa: " + salario*0.3);
            System.out.println("Salário Liquido: " + salario*0.7);
        }

        if(salario>20000 && salario<=25000){ // Salário maior que 20.000 e menor ou igual que 25.000
            System.out.println("Paga taxa de 35%");
            System.out.println("Taxa: " + salario*0.35);
            System.out.println("Salário Liquido: " + salario*0.65);
        }

        if (salario > 25000) { // Salário maior que 25.000
            System.out.println("Paga taxa de 40%");
            System.out.println("Taxa: " + salario*0.4);
            System.out.println("Salário Liquido: " + salario*0.6);
        }

    }
}
