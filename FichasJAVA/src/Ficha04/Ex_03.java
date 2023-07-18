package Ficha04;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero_secreto, tentativa, contador_tentativas=0;

        do {
            // Ler numero secreto (jogador 1)
            System.out.print("(Jogador 1) Insira o numero secreto (0-100): ");
            numero_secreto = input.nextInt();
        }while(numero_secreto<0 || numero_secreto>100);

        do {

            // Ler adivinha do jogador 2
            System.out.print("(Jogador 2) Tentativa: ");
            tentativa = input.nextInt();
            contador_tentativas++;

            // Caso seja mais alta
            if (tentativa > numero_secreto) {
                System.out.println("Demasiado alto! O número secreto é mais baixo que " + tentativa);
            }

            // Caso seja mais baixa
            if (tentativa < numero_secreto) {
                System.out.println("Demasiado baixo! O número secreto é mais alto que " + tentativa);
            }

        }while (tentativa!=numero_secreto);

        // Caso acerte
        System.out.println("\nParabéns! Acertou no número secreto: "+numero_secreto);
        System.out.println("Tentaste "+contador_tentativas+" vezes!");

        // Mostrar numero de tentativas
    }
}
