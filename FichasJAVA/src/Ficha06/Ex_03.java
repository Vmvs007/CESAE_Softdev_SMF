package Ficha06;

public class Ex_03 {

    /**
     * Analisa se um número é ou não par
     * @param num - Número a ser analisado
     * @return true - se for par || false - se for impar
     */
    public static boolean par(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Analisa de um número é positivo ou negativo
     * @param num - Número a ser analisado
     * @return true - se for 0 ou positivo || false - se for negativo
     */
    public static boolean positivo(int num) {
        if (num >= 0) {
            return true;
        }else {
            return false;
        }
    }




}
