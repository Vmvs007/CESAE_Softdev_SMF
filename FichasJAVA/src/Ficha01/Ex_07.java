package Ficha01;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercício 7 *****");

        // Declarar variáveis
        double preco1, preco2, preco3, total;

        // Ler input do utilizador
        System.out.print("Insira o preço 1: ");
        preco1=input.nextDouble();

        System.out.print("Insira o preço 2: ");
        preco2=input.nextDouble();

        System.out.print("Insira o preço 3: ");
        preco3=input.nextDouble();

        // Calcular o total da conta
        total = (preco1+preco2+preco3);
        System.out.println("Total sem desconto: "+total);

        // Aplicar 10% de desconto
        total = total * 0.9;

        // Apresentar o total a pagar
        System.out.println("Total com 10% de desconto: "+total);

    }
}
