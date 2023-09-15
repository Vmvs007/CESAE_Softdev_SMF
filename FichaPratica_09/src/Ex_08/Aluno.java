package Ex_08;

public class Aluno {
    private String nome, curso;
    private int idade;
    private double media;

    /**
     * Método construtor
     * @param nome Nome do Aluno
     * @param curso Curso do Aluno
     * @param idade Idade
     * @param media Média das Notas
     */
    public Aluno(String nome, String curso, int idade, double media) {
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
        this.media = media;
    }

    /**
     * Método que retorna a situação do aluno
     * @return Situação (Aprovado ou Reprovado)
     */
    public String situacao(){
        if(this.media>=9.5){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }

    public String getNome() {
        return nome;
    }
}
