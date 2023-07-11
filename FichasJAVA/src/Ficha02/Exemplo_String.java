package Ficha02;

import java.util.Scanner;

public class Exemplo_String {
    public static void main(String[] args) {
        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        String letra;

        System.out.print("Escolha a letra: ");
        letra = input.next();

        if(letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
            System.out.println("Vogal");
        }else{
            System.out.println("Consoante");
        }
    }
}
