package Ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07_V3 {

    public static void contarLinhasPalavras(String path) throws FileNotFoundException {

        // Instanciar ficheiro
        File file = new File(path);

        // Instanciar Scanner
        Scanner sc = new Scanner(file);

        // Declarar variáveis
        String linha;
        int nLinhas=0, nPalavras=0;

        while (sc.hasNextLine()){
            linha = sc.nextLine();
            String[] linhaSeparada = linha.split(" ");

            nLinhas++;

            if(linhaSeparada.length==1 && linhaSeparada[0].equals("")){
                // Se isto acontecer, quer dizer que a linha é vazia e não deve incrementar no contador
            }else{
                nPalavras+=linhaSeparada.length;
            }

        }

        System.out.println("Linhas: "+nLinhas);
        System.out.println("Palavras: "+nPalavras);
    }

    public static void main(String[] args) throws FileNotFoundException {
        contarLinhasPalavras("ficheiros/exercicio_07.txt");
    }
}
