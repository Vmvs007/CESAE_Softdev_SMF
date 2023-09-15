package Ex_01;

public class Pessoa {

    private String nome;
    private int idade;

    private double altura;

    /**
     * Método Construtor
     * @param nome Nome da Pessoa
     * @param idade Idade Atual
     * @param altura Altura em metros (m)
     */
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getAltura() {
        return this.altura;
    }
    
}
