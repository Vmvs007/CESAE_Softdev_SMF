package Ficha02;

import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        double saldo, movimento, novoSaldo;

        // Ler input do utilizador
        System.out.print("Insira o saldo: ");
        saldo= input.nextDouble();

        System.out.print("Insira o valor a movimentar: ");
        movimento= input.nextDouble();

        // Novo Saldo será o reflexo de aplicar o movimento ao saldo atual
        novoSaldo=saldo+movimento;

        // Avaliar se o Novo Saldo se mantém positivo (ou 0)
        if(novoSaldo>=0){ // Caso seja válido
            System.out.println("Operação Válida!");
            System.out.println("Novo Saldo: "+novoSaldo);
        }else{ // Caso seja inválido
            System.out.println("Operação Inválida!");
            System.out.println("Saldo não atualizou pois, se atualizasse seria: "+novoSaldo);
        }
    }

}
