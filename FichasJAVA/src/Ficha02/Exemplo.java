package Ficha02;

public class Exemplo {
    public static void main(String[] args) {

        int nota1=5, nota2=18;

        if(nota1>=10){
            if(nota2>=10){
                System.out.println("Parabéns");
            }else{
                System.out.println("Passaste a primeira vez, mas a segunda não...");
            }

        }else{
            System.out.println("Não passaste na primeira nota");
        }

    }
}
