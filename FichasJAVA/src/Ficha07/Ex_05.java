package Ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {

    /**
     *
     * Método que soma os números de um ficheiro que contém números inteiros separados por espaço
     * @param path Caminho do ficheiro
     * @return Soma dos Números
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int somarNumerosFicheiro(String path) throws FileNotFoundException {

        // Instanciar o ficheiro
        File file = new File(path);

        // Instanciar o Scanner
        Scanner sc = new Scanner(file);

        // Declarar variáveis
        int numero, somatorio=0;

        while(sc.hasNextInt()){
            numero=sc.nextInt();
            somatorio += numero;
        }

        // Fechar scanner
        sc.close();

        return somatorio;

    }

    public static void main(String[] args) throws FileNotFoundException {

        // Declarar variáveis
        int soma;

        // Invoncar a função somarNumerosFicheiro e a gravar o seu retorno na variável "soma"
        soma = somarNumerosFicheiro("ficheiros/exercicio_05_10.txt");

        // Imprimir a soma
        System.out.println("Soma dos Números: "+ soma);

    }
}
