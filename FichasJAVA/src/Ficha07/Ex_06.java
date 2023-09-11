package Ficha07;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06 {

    public static void imprimirPessoaMaisVelha(String path) throws FileNotFoundException {

        // Instanciar Ficheiro
        File file = new File(path);

        // Instanciar Scanner
        Scanner sc = new Scanner(file);

        // Declarar variáveis
        String linha, nomeMaiorIdade="";
        int maiorIdade=0;

        // Ciclo que vai executar para cada linha do ficheiro
        while (sc.hasNextLine()){

            // Gravar na variável "linha" a linha atual
            linha = sc.nextLine();

            // Separar a linha atual num array "linhaSeparada"
            // Nota: Este array só tem tamanho 2 (posição 0 e 1)
            String[] linhaSeparada = linha.split(",");

            // Se a idade da pessoa atual for maior que a maior idade encontrada até agora
            if(Integer.parseInt(linhaSeparada[1])>maiorIdade){
                // Alterar o nome da pessoa mais velha
                nomeMaiorIdade= linhaSeparada[0];
                // Alterar a idade da pessoa mais velha
                maiorIdade = Integer.parseInt(linhaSeparada[1]);
            }

        }

        // Imprimir a pessoa mais velha
        System.out.println("Pessoa Mais Velha:");
        System.out.println("Nome: "+nomeMaiorIdade);
        System.out.println("Idade: "+maiorIdade);

        // Fechar Scanner
        sc.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        imprimirPessoaMaisVelha("ficheiros/exercicio_06.txt");
    }
}
