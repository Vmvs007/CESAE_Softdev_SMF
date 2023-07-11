package Ficha02;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int a, b, c;

        // Ler input do utilizador
        System.out.print("Insira um número: ");
        a = input.nextInt();

        System.out.print("Insira um número: ");
        b = input.nextInt();

        System.out.print("Insira um número: ");
        c = input.nextInt();

        // Caso o menor seja A
        if( a < b && a < c){
            System.out.println("Menor: "+a);
        }

        // Caso o menor seja B
        if( b< a && b<c){
            System.out.println("Menor: "+b);
        }

        // Caso o menor seja C
        if( c<a && c<b){
            System.out.println("Menor: "+c);
        }

    }
}
