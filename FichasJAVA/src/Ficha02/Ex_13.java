package Ficha02;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int horas, minutos;

        // Ler input do utilizador
        System.out.print("Insira as horas: ");
        horas = input.nextInt();

        System.out.print("Insira os minutos: ");
        minutos = input.nextInt();

        // Perceber se é manhã (AM) ou tarde (PM)
        if(horas>12){ // Tarde
            System.out.println((horas-12)+":"+minutos+"PM");
        }else{ // Manhã
            System.out.println(horas+":"+minutos+"AM");
        }
    }
}
