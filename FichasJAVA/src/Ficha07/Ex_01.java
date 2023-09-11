package Ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_01 {

    /**
     * Método que imprime o conteudo de um ficheiro na consola
     * @param path Caminho do ficheiro a ler
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static void imprimirFicheiro(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        while(scannerFicheiro.hasNextLine()){
            System.out.println(scannerFicheiro.nextLine());
        }

        scannerFicheiro.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        imprimirFicheiro("ficheiros/exercicio_01_Alternativa02.txt");


    }
}
