package Ex_05;

public class Pessoa {

    private String nome, email, telemovel;

    private int idade;

    /**
     * Método Construtor
     * @param nome Nome Civil
     * @param email Email
     * @param telemovel Telemovel
     * @param idade Idade em 2023
     */
    public Pessoa(String nome, String email, String telemovel, int idade) {
        this.nome = nome;
        this.email = email;
        this.telemovel = telemovel;
        this.idade = idade;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: "+this.nome+" | Email: "+this.email+" | Telemovel: "+this.telemovel+" | Idade: "+this.idade);
    }
}
