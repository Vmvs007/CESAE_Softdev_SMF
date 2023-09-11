package Ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07_V2 {

    /**
     * Método para imprimir na consola o número de linhas e palavras de um ficheiro de texto
     * @param path Caminho do Ficheiro
     * @throws FileNotFoundException Caso o Ficheiro não seja encontrado
     */
    public static void contarLinhasPalavras(String path) throws FileNotFoundException {

        // Instanciar ficheiro
        File file = new File(path);

        // Instanciar Scanner para contar Linhas
        Scanner sc_Linhas = new Scanner(file);

        // Instanciar Scanner para contar Palavras
        Scanner sc_Palavras = new Scanner(file);

        // Declarar variáveis
        int nLinhas=0, nPalavras=0;

        // Ciclo para contar as Linhas
        while (sc_Linhas.hasNextLine()){
            nLinhas++;
            sc_Linhas.nextLine();
        }

        // Ciclo para contar as palavras
        while ( sc_Palavras.hasNext()){
            nPalavras++;
            sc_Palavras.next();
        }

        // Fechar Scanners
        sc_Linhas.close();
        sc_Palavras.close();

        System.out.println("Linhas: "+nLinhas);
        System.out.println("Palavras: "+nPalavras);
    }


    public static void main(String[] args) throws FileNotFoundException {

        contarLinhasPalavras("ficheiros/exercicio_07.txt");
    }
}
