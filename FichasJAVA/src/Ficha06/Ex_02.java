package Ficha06;

import java.util.Scanner;

public class Ex_02 {

    /**
     * Método para Ler um Numero Inteiro e Positivo
     * @return Numero Inteiro e Positivo
     */
    static int lerInteiroPositivo(){

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Insira um numero inteiro e positivo: ");
            numero = input.nextInt();
        }while(numero<=0);

        return numero;
    }


    static void imprimirAsteriscos(int numeroAsteriscos){
        for(int i=0; i<numeroAsteriscos;i++){
            System.out.print("*");
        }
    }


    public static void main(String[] args) {

        int num;

       num = lerInteiroPositivo();

       imprimirAsteriscos(num);

    }
}
