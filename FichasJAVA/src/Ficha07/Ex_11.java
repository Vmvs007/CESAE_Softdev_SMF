package Ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_11 {

    /**
     * Método para contar as linhas de um ficheiro
     * @param path Caminho do Ficheiro
     * @return Numero de Linhas do Ficheiro
     * @throws FileNotFoundException Caso o Ficheiro não seja válido
     */
    public static int contarLinhasFicheiro(String path) throws FileNotFoundException {

        // Instanciar ficheiro
        File file = new File(path);

        // Instanciar Scanner
        Scanner sc = new Scanner(file);

        // Declarar variáveis
        int nLinhas=0;

        // Contar as Linhas do Ficheiro
        while (sc.hasNextLine()){
            nLinhas++;
            sc.nextLine();
        }

        // Encerrar scanner
        sc.close();

        return nLinhas;

    }

    /**
     * Método para ler um Ficheiro Estruturado para uma Matriz
     * @param path Caminho do Ficheiro
     * @return Matriz Preenchida com o Conteudo do Ficheiro
     * @throws FileNotFoundException Caso o Ficheiro não seja válido
     */
    public static String[][] lerFicheiroParaMatriz(String path) throws FileNotFoundException {

        // Instanciar a matriz com 4 colunas e numero de linhas adequado ao ficheiro
        String[][] matriz = new String[contarLinhasFicheiro(path)-1][4];

        // Instanciar ficheiro
        File file = new File(path);

        // Instanciar Scanner
        Scanner sc = new Scanner(file);

        // Declarar variáveis
        String linha;
        int i=0;

        // Avançar a linha do cabeçalho
        sc.nextLine();

        // Preencher a matriz com o conteudo do Ficheiro
        while (sc.hasNextLine()){
            linha = sc.nextLine();
            String[] linhaSeparada = linha.split(",");

            for(int c=0; c < linhaSeparada.length;c++){
                matriz[i][c]= linhaSeparada[c];
            }

            i++;
        }

        // Encerrar scanner
        sc.close();

        return matriz;
    }

    /**
     * Método para imprimir uma matriz na consola
     * @param matriz Matriz a Imprimir
     */
    public static void imprimirMatriz(String[][] matriz){
        for(int linha =0; linha<matriz.length;linha++){
            for(int coluna =0; coluna<matriz[0].length;coluna++){
                System.out.print("\t|"+matriz[linha][coluna]);
            }
            System.out.println();
        }
}

public static void musicarPorGenero(String[][] matriz){

    // Instanciar o Scanner
    Scanner input = new Scanner(System.in);

    // Declarar variáveis
    String generoPretendido;

    // Perguntar ao utilizador o Genero
    System.out.print("Género a Pesquisar: ");
    generoPretendido=input.next();

    System.out.println("***** Músicas de "+generoPretendido+" *****");
    for(int linha =0; linha<matriz.length;linha++){
        if(matriz[linha][2].equals(generoPretendido)){
            System.out.println("\nNome da Música: "+matriz[linha][0]);
            System.out.println("Artista: "+matriz[linha][1]);
            System.out.println("Duracao: "+matriz[linha][3]);
        }
    }


}


    public static void main(String[] args) throws FileNotFoundException {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Inicializar a matriz com o conteudo do ficheiro
        String[][] matriz = lerFicheiroParaMatriz("ficheiros/exercicio_11.csv");
        imprimirMatriz(matriz);

        // Declarar variáveis
        int opcao=0;

        // Menu
        do {
            do {
                System.out.println("\n**** Menu de Análise de Músicas e Albuns *****");
                System.out.println("1 - Pesquisar Musicas por Genero");
                System.out.println("2 - Pesquisar Musicas por Artista");
                System.out.println("3 - Pesquisar Musica com Maior Duracao");
                System.out.println("4 - Pesquisar Musicas com Duracao Acima De...");
                System.out.println("5 - Numero de Musicas");
                System.out.println("0 - Sair");
                System.out.print("\nInsira a opcao: ");
                opcao = input.nextInt();
            } while (opcao < 0 || opcao > 5);

            switch (opcao) {
                case 1: // Pesquisar Musicas por Genero
                    System.out.println("\nPesquisar Musicas por Genero\n");
                    musicarPorGenero(matriz);
                    break;

                case 2: // Pesquisar Musicas por Artista
                    System.out.println("\nPesquisar Musicas por Artista\n");
                    break;

                case 3: // Pesquisar Musica com Maior Duracao
                    System.out.println("\nPesquisar Musica com Maior Duracao\n");
                    break;

                case 4: // Pesquisar Musicas com Duracao Acima De...
                    System.out.println("\nPesquisar Musicas com Duracao Acima De...\n");
                    break;

                case 5: // Numero de Musicas
                    System.out.println("\nNumero de Musicas\n");
                    break;

                default: // Sair
                    System.out.println("\nObrigado e até à próxima!");
                    break;
            }
        }while(opcao!=0);
    }
}
