public class SerVivo {
    private String nome, especie, paisOrigem;
    private int idade;

    /**
     * Método Construtor de Ser Vivo
     * @param nome Nome do Ser
     * @param especie Espécie
     * @param paisOrigem País de Origem
     * @param idade Idade (anos)
     */
    public SerVivo(String nome, String especie, String paisOrigem, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public int getIdade() {
        return idade;
    }

    /**
     * Método para imprimir detalhes de um Ser Vivo
     */
    public void exibirDetalhes(){
        System.out.print("Nome: "+this.nome+ " | Especie: "+this.especie+" | País Origem: "+this.paisOrigem+" | Idade: "+this.idade);
    }
}
