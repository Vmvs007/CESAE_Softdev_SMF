package Ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {

    /**
     * Método para contar o número de linhas de um ficheiro de texto
     * @param path Caminho do Ficheiro
     * @return Número de Linhas do Ficheiro
     * @throws FileNotFoundException Caso o Ficheiro não seja encontrado
     */
    public static int contarLinhas(String path) throws FileNotFoundException {

        // Instanciar ficheiro
        File file = new File(path);

        // Instanciar Scanner
        Scanner sc = new Scanner(file);

        // Declarar variáveis
        int nLinhas=0;

        while (sc.hasNextLine()){
            nLinhas++;
            sc.nextLine();
        }

        sc.close();

        return nLinhas;
    }

    /**
     * Método para contar o número de palavras de um ficheiro de texto
     * @param path Caminho do Ficheiro
     * @return Número de Palavras do Ficheiro
     * @throws FileNotFoundException Caso o Ficheiro não seja encontrado
     */
    public static int contarPalavras(String path) throws FileNotFoundException {

        // Instanciar ficheiro
        File file = new File(path);

        // Instanciar Scanner
        Scanner sc = new Scanner(file);

        // Declarar variáveis
        int nPalavras=0;

while (sc.hasNext()){
    nPalavras++;
    sc.next();
}

sc.close();

        return nPalavras;
    }

    public static void main(String[] args) throws FileNotFoundException {

        String path = "ficheiros/exercicio_07.txt";

        System.out.println("Linhas: "+ contarLinhas(path));
        System.out.println("Palavras: "+ contarPalavras(path));
    }
}
