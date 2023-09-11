package Ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_02 {

    public static void criarEscreverFicheiro(String mensagem) throws FileNotFoundException {

        File file = new File("ficheiros/exercicio_02.txt");
        PrintWriter pw = new PrintWriter(file);

        pw.println(mensagem);

        pw.close();

    }

    public static void main(String[] args) throws FileNotFoundException {
        criarEscreverFicheiro("Nova mensagem, teste numero 2");

    }
}
