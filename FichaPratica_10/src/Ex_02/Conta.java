package Ex_02;

public class Conta {
    private String numConta, titular;
    private int anoAbertura = 2023;
    private double saldo=0, margemEmprestimo, valorDivida;

    /**
     * Método Construtor
     * @param numConta Numéro da Conta (IBAN)
     * @param titular Nome do Titular da Conta
     */
    public Conta(String numConta, String titular) {
        this.numConta = numConta;
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        this.margemEmprestimo=this.saldo*0.9;
    }

    public void mostrarSaldo(){
        System.out.println("Saldo Atual da Conta "+this.numConta+ ": "+this.saldo);
    }

    /**
     * Método para depositar dinheiro na conta (aumentar o saldo)
     * @param valor Valor do Depósito
     */
    public void depositar(double valor){
        System.out.println("Depósito de "+valor+" efetuado!");
        this.setSaldo(this.saldo+valor);
    }

    /**
     * Método para levantar dinheiro da conta (diminuir saldo)
     * @param valor Valor do levantamento
     */
    public void levantar(double valor){
        if(this.saldo>=valor){
            // Caso o levantamento seja válido
            System.out.println("Levantamento de "+valor+" efetuado!");
            this.setSaldo(this.saldo-valor);
        }else{
            // Caso o levantamento seja inválido
            System.out.println("Levantamento de "+valor+" recusado! Saldo insuficiente!");
        }
    }

    /**
     * Método para Transferir dinheiro de uma conta para a outra
     * @param valor Valor a transferir
     * @param contaDestino Conta destinatário
     */
    public void transferencia(double valor, Conta contaDestino){
        if(this.saldo>=valor){
            // Caso a transferencia seja válido
            System.out.println("Transferencia de "+valor+" efetuada!");
            this.setSaldo(this.saldo-valor);

            contaDestino.setSaldo(contaDestino.saldo+valor);
        }else{
            // Caso a transferencia seja inválido
            System.out.println("Transferencia de "+valor+" recusada! Saldo insuficiente!");
        }
    }

    /**
     * Método para pedir um empréstimo
     * @param valorPedido Valor a pedir
     * @return True se pedido se aceite | False se pedido recusado
     */
    public boolean pedirEmprestimo(double valorPedido){

        if(this.valorDivida==0 && this.margemEmprestimo>=valorPedido){
            // Caso o empréstimo seja válido
            this.setSaldo(this.saldo+valorPedido);
            this.valorDivida=valorPedido;

            System.out.println("Pedido de Empréstimo Aceite...");
            return true;
        }else{
            System.out.println("Pedido de Empréstimo Recusado...");
            return false;
        }


    }

}
