package Ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_10 {

    public static double calcularTotal(String path) throws FileNotFoundException {

        // Instanciar ficheiro
        File file = new File(path);

        // Instanciar Scanner
        Scanner sc = new Scanner(file);

        // Declarar variáveis
        String linha;
        double total=0, precoLinha=0;

        sc.nextLine();

        while (sc.hasNextLine()){
            linha= sc.nextLine();
            String[] linhaSeparada = linha.split(",");

            precoLinha=Double.parseDouble(linhaSeparada[2])*Double.parseDouble(linhaSeparada[3]);
            total+=precoLinha;

        }

        sc.close();

        return total;
    }

    public static void main(String[] args) throws FileNotFoundException {


        System.out.println("Total de Vendas: "+ calcularTotal("ficheiros/exercicio_10.csv"));
    }
}
