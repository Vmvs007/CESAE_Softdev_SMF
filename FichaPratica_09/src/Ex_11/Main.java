package Ex_11;

public class Main {
    public static void main(String[] args) {

        // Instanciar conta
        Conta conta1 = new Conta("111","Vitor");
        Conta conta2 = new Conta("222","Primo Suiça");

        // Mostrar saldo inicial de ambas as contas
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();

        System.out.println();


        conta1.depositar(1000);
        conta1.mostrarSaldo();

        conta1.levantar(100);
        conta1.mostrarSaldo();

        conta1.levantar(9000);
        conta1.mostrarSaldo();

        System.out.println();

        conta1.transferencia(500,conta2);

        // Mostrar saldo de ambas as contas
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();

        System.out.println();
        conta2.transferencia(5500,conta1);

        // Mostrar saldo de ambas as contas
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
    }
}
