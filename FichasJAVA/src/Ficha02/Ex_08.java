package Ficha02;

import java.util.Scanner;

public class Ex_08  {

    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double nota1, nota2, nota3, media;

        // Ler input do utilizador
        System.out.print("Insira a primeira Nota: ");
        nota1 = input.nextDouble();

        System.out.print("Insira a segunda Nota: ");
        nota2 = input.nextDouble();

        System.out.print("Insira a terceira Nota: ");
        nota3 = input.nextDouble();

        // Calcular media ponderada
        media= (nota1*0.25)+(nota2*0.35)+(nota3*0.4);
        System.out.println("Media Ponderada: "+media);

        // Perceber está aprovado ou não (media >= 9.5)
        if(media >= 9.5){ // Está aprovado
            System.out.println("Está aprovado!");
        }else{ // Não está aprovado
            System.out.println("Reprovado!");
        }
    }
}
