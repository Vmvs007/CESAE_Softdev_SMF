package Ficha06;

import java.util.Scanner;

public class Ex_01_V2 {


    static void fazerBarulho(String animal) {
        animal=animal.toUpperCase();
        switch (animal){
            case "CAO":
                System.out.println("Au au au ");
                break;

            case "GATO":
                System.out.println("Miau");
                break;

            case "PEIXE":
                System.out.println("Glub Glub");
                break;

            case "VACA":
                System.out.println("Muuuu");
                break;

            case "PORCO":
                System.out.println("Oinc Oinc");
                break;

            default:
                System.out.println("Barulho Estranho...");
                break;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        String animal;

        // Perguntar ao utilizador qual o animal
        System.out.print("Introduza um animal: ");
        animal = input.next();

        fazerBarulho(animal);

        System.out.println("\n\nFIM");
    }
}
