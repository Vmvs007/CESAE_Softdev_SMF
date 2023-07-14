package Ficha03;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int limite, salto, numInicial=0;

        // Ler input do utilizador
        System.out.print("Insira o limite: ");
        limite= input.nextInt();

        System.out.print("Insira o salto: ");
        salto= input.nextInt();

        while(numInicial<=limite){
            System.out.println(numInicial);
            numInicial= numInicial+salto;
        }

    }
}
