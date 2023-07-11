package Ficha02;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2;

        // Ler input do utilizador
        System.out.println("Insira um número: ");
        num1 = input.nextInt();

        System.out.println("Insira outro número: ");
        num2 = input.nextInt();

        // Perceber qual dos dois é o maior
        if(num1>num2){
            System.out.println(num2+" "+num1);
        }else{
            System.out.println(num1+" "+num2);
        }

    }
}
