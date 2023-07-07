package Ficha01;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        // Linha obrigatória porque o formador disse que sim
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercício 3 *****");

        // Declarar variáveis
        double comprimento, largura, area, perimetro;

        // Ler inputs do utilizador
        System.out.print("Introduz o comprimento: ");
        comprimento = input.nextDouble();

        System.out.print("Introduz o largura: ");
        largura = input.nextDouble();

        // Calcular a área do retangulo
        area = comprimento * largura;

        // Calcular o perimetro do retangulo
        perimetro = 2*(comprimento+largura);

        // Apresentar resultado
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

    }
}
