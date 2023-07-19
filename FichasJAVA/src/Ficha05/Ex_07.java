package Ficha05;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int maiorPar = 1;
        boolean ininicializado=false;


        // Ciclo para preencher um Array c/ 10 posições
        for(int i=0; i<10; i++){
            System.out.print("Insira um número no Array["+i+"]: ");
            vetor[i]= input.nextInt();
        }

        // Ciclo para perceber qual o maior par
        for(int i=0; i<10; i++){

            // Inicializar a variável "maiorPar", "inicializado" tem de ser false
            if(vetor[i]%2==0 && !ininicializado){ // a mesma coisa: inicializado == false ou inicializado != true
                maiorPar=vetor[i];
                ininicializado=true;
            }

            // Perceber se o número atual é par e maior que "maiorPar"
            if(vetor[i]%2==0 && vetor[i]>maiorPar){
                maiorPar=vetor[i];
            }

        }

        // Enter
        System.out.println("");

        // Imprimir o maior par
        if(maiorPar==1){
            System.out.println("Não tem número pares");
        }else{
            System.out.println("Maior Par: "+maiorPar);
        }


    }
}
