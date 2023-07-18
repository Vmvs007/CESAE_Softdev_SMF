package Ficha04;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num;
        boolean primo=true;

        // Ler numero do utilizador
        System.out.print("Insira um número: ");
        num=input.nextInt();

        // Determinar se é ou não primo
        for(int divisor=2; divisor<num;divisor++){
            if(num%divisor==0){
                primo=false;
            }
        }

        if(primo){
            System.out.println("Primo");
        }else{
            System.out.println("Não Primo");
        }

    }
}
