package Ficha02;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero;

        // Ler input do utilizador
        System.out.print("Insira um número: ");
        numero = input.nextInt();

        // Perceber se o número é par
        if(numero % 2 == 0){
            System.out.println(numero+ " é par");
        }else{
            System.out.println(numero+ " é impar");
        }
    }
}
