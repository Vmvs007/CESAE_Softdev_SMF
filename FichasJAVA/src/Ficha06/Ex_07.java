package Ficha06;

import java.util.Scanner;

public class Ex_07 {

    static void desenhar(String caracter, int linhas, int colunas){

        // Imprimir a primeira linha
        for(int i = 0; i<colunas; i++){
            System.out.print(caracter);
        }

        System.out.println();

        for(int i = 0 ; i<linhas-2; i++) {
            // Imprimir as linhas do meio

            // Imprimir primeiro caracter
            System.out.print(caracter);

            // Ciclo para imprimir os espaços
            for (int espacos = 0; espacos < colunas - 2; espacos++) {
                System.out.print(" ");
            }

            // Imprimir o ultimo caracter
            System.out.print(caracter);

            System.out.println();
        }

        // Imprimir a ultima linha
        for(int i = 0; i<colunas; i++){
            System.out.print(caracter);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int linhas, colunas;
        String caracter;

        System.out.print("Linhas: ");
        linhas = input.nextInt();

        System.out.print("Colunas: ");
        colunas = input.nextInt();

        System.out.print("Caracter: ");
        caracter = input.next();

        desenhar(caracter,linhas,colunas);

    }
}
