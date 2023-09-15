package Ex_11;

public class Conta {
    private String numConta, titular;
    private double saldo=0;

    /**
     * Método Construtor
     * @param numConta Numéro da Conta (IBAN)
     * @param titular Nome do Titular da Conta
     */
    public Conta(String numConta, String titular) {
        this.numConta = numConta;
        this.titular = titular;
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
        this.saldo+=valor;
    }

    /**
     * Método para levantar dinheiro da conta (diminuir saldo)
     * @param valor Valor do levantamento
     */
    public void levantar(double valor){
        if(this.saldo>=valor){
            // Caso o levantamento seja válido
            System.out.println("Levantamento de "+valor+" efetuado!");
            this.saldo-=valor;
        }else{
            // Caso o levantamento seja inválido
            System.out.println("Levantamento de "+valor+" recusado! Saldo insuficiente!");
        }
    }

    public void transferencia(double valor, Conta contaDestino){
        if(this.saldo>=valor){
            // Caso a transferencia seja válido
            System.out.println("Transferencia de "+valor+" efetuada!");
            this.saldo-=valor;
            contaDestino.saldo+=valor;
        }else{
            // Caso a transferencia seja inválido
            System.out.println("Transferencia de "+valor+" recusada! Saldo insuficiente!");
        }
    }

}
