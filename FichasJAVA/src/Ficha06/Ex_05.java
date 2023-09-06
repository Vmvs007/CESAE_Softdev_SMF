package Ficha06;

public class Ex_05 {

    /**
     * Método que retorna o maior elemento de um vetor de inteiros
     * @param vetor Vetor a ser analisado
     * @return Maior elemento do array
     */
    static int maior(int[] vetor){

        // Declarar variáveis locais
        int maiorNumero;

        // Inicializar o maiorNumero com o primeiro elemento do array
        maiorNumero = vetor[0];

        for(int i=0; i< vetor.length; i++){
            if(vetor[i]>maiorNumero){
                maiorNumero=vetor[i];
            }
        }

        return maiorNumero;
    }

}