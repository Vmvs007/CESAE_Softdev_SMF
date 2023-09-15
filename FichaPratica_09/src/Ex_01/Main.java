package Ex_01;

public class Main {
    public static void main(String[] args) {

        // Instanciar pessoa1 e pesso2
        Pessoa pessoa1 = new Pessoa("Vitor",24,1.70);
        Pessoa pessoa2 = new Pessoa("Quim",40,1.50);

        // Mostrar informações da Pessoa 1
        System.out.println("***** Pessoa 1 *****");
        System.out.println("Nome: "+pessoa1.getNome());
        System.out.println("Idade: "+pessoa1.getIdade()+" anos");
        System.out.println("Altura: "+pessoa1.getAltura()+" m.");

        // Mostrar informações da Pessoa 2
        System.out.println("***** Pessoa 2 *****");
        System.out.println("Nome: "+pessoa2.getNome());
        System.out.println("Idade: "+pessoa2.getIdade()+" anos");
        System.out.println("Altura: "+pessoa2.getAltura()+" m.");

    }
}
