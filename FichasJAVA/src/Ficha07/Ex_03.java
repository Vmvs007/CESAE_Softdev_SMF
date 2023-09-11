package Ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_03 {

    /**
     * Método para copiar o conteudo de um ficheiro para outro novo ficheiro
     * @param caminhoFonte Caminho do ficheiro a ser copiado (ficheiro fonte)
     * @throws FileNotFoundException Caso não encontre o ficheiro fonte
     */
    public static void copiarFicheiro(String caminhoFonte) throws FileNotFoundException {

        // Instanciar os dois ficheiros
        File ficheiroFonte = new File(caminhoFonte);
        File ficheiroNovo = new File("ficheiros/exercicio_03_Copia.txt");

        // Instanciar um Scanner do Ficheiro Fonte
        Scanner sc = new Scanner(ficheiroFonte);

        // Instanciar o PrintWriter do Novo Ficheiro
        PrintWriter pw = new PrintWriter(ficheiroNovo);

        // Declarar variáveis
        String linha;

        // Ciclo que vai executar para cada linha do Ficheiro Fonte
        while(sc.hasNextLine()){
            // Lê a linha do ficheiro fonte para a variável "linha"
            linha = sc.nextLine();
            // Escreve no Novo Ficheiro a variável "linha"
            pw.println(linha);
        }

        // Encerramos o Scanner e PrintWriter
        sc.close();
        pw.close();

    }

    public static void main(String[] args) throws FileNotFoundException {

        copiarFicheiro("ficheiros/exercicio_03_Alternativa01.txt");

    }
}
