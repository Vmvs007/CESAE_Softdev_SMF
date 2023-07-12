package Ficha02;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double saldoMedio;

        // Ler input do utilizador
        System.out.println("Insira o saldo médio: ");
        saldoMedio= input.nextDouble();

        if(saldoMedio>0 && saldoMedio <= 2000){
            System.out.println("Nenhum crédito");
        }else if(saldoMedio>2000 && saldoMedio <= 4000){
            System.out.println("Crédito concedido: "+(saldoMedio*0.2));
        }else if(saldoMedio>4000 && saldoMedio <= 6000){
            System.out.println("Crédito concedido: "+(saldoMedio*0.3));
        }else if(saldoMedio>6000){
            System.out.println("Crédito concedido: "+(saldoMedio*0.4));
        }else{
            System.out.println("Saldo negativo");
        }


    }
}
