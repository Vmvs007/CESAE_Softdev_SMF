package Ficha01;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercício 8 *****");

        // Declarar variáveis
        int minutos, segundos, totalSegundos=0, horasAlbum, minutosAlbum, segundosAlbum;

        // Ler input do utilizador para Música 1
        System.out.print("Insira minutos da Musica 1: ");
        minutos = input.nextInt();

        System.out.print("Insira segundos da Musica 1: ");
        segundos = input.nextInt();

        totalSegundos = totalSegundos + segundos + (minutos*60);


        // Ler input do utilizador para Música 2
        System.out.print("Insira minutos da Musica 2: ");
        minutos = input.nextInt();

        System.out.print("Insira segundos da Musica 2: ");
        segundos = input.nextInt();

        totalSegundos = totalSegundos + segundos + (minutos*60);


        // Ler input do utilizador para Música 3
        System.out.print("Insira minutos da Musica 3: ");
        minutos = input.nextInt();

        System.out.print("Insira segundos da Musica 3: ");
        segundos = input.nextInt();

        totalSegundos = totalSegundos + segundos + (minutos*60);


        // Ler input do utilizador para Música 4
        System.out.print("Insira minutos da Musica 4: ");
        minutos = input.nextInt();

        System.out.print("Insira segundos da Musica 4: ");
        segundos = input.nextInt();

        totalSegundos = totalSegundos + segundos + (minutos*60);


        // Ler input do utilizador para Música 5
        System.out.print("Insira minutos da Musica 5: ");
        minutos = input.nextInt();

        System.out.print("Insira segundos da Musica 5: ");
        segundos = input.nextInt();

        totalSegundos = totalSegundos + segundos + (minutos*60);


        // Apresentar o total do album em segundos
        System.out.println("Total do Album: "+totalSegundos+" segundos.");

        // Calcular duração do album
        horasAlbum = (totalSegundos/3600);
        minutosAlbum = (totalSegundos/60)-(horasAlbum*60);
        segundosAlbum= (totalSegundos)-(horasAlbum*3600)-(minutosAlbum*60);

        // Aprensentar a duração do album
        System.out.println("\nHoras do Album: "+horasAlbum);
        System.out.println("\nMinutos do Album: "+minutosAlbum);
        System.out.println("\nSegundos do Album: "+segundosAlbum);

        System.out.println(horasAlbum+":"+minutosAlbum+":"+segundosAlbum);
    }
}
