package Ex_02;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta("12345", "Vitor S.");

        conta1.depositar(1000);
        conta1.mostrarSaldo();

        System.out.println();

        conta1.pedirEmprestimo(2000);
        conta1.mostrarSaldo();

        System.out.println();

        conta1.pedirEmprestimo(500);
        conta1.mostrarSaldo();

        conta1.pedirEmprestimo(100);
        conta1.mostrarSaldo();

    }
}
