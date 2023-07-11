package Ficha02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double salario;

        // Ler input do utilizador
        System.out.println("Insira o salário: ");
        salario= input.nextDouble();

        if(salario<=15000){ // Salário menor ou igual que 15.000
            System.out.println("Paga taxa de 20%: "+(salario*0.2));
        }else{
            System.out.println("Paga taxa de 30%: "+(salario*0.3));
        }

    }
}
