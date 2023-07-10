package Ficha02;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int lugar;

        // Ler input do utilizador
        lugar= input.nextInt();

       switch (lugar){
           case 1: // lugar == 1
               System.out.println("Ganhou 10 pontos");
               break;

           case 2: // lugar == 2
               System.out.println("Ganhou 8 pontos");
               break;

           case 3: // lugar == 3
               System.out.println("Ganhou 6 pontos");
               break;

       }


    }
}
