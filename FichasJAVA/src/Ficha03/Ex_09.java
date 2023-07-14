package Ficha03;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, itr=2;

        // Ler input do utilizador
        System.out.print("Insira um número: ");
        num = input.nextInt();

        while (itr<= num){
            System.out.println(itr);
            itr=itr+2;
        }
    }
}
