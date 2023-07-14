package Ficha03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num=0, numUtilizador;

        // Ler input do utilizador
        System.out.print("Insira um número: ");
        numUtilizador= input.nextInt();

        while (num<=numUtilizador){
            System.out.println(num);
            num=num+1;
        }
    }
}
