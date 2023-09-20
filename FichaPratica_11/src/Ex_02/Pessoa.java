package Ex_02;

public class Pessoa {
    private String nome, telemovel, email;
    private int idade;

    public Pessoa(String nome, String telemovel, String email, int idade) {
        this.nome = nome;
        this.telemovel = telemovel;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }
}
