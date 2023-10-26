import Enums.FamiliaPlanta;

public class Planta extends SerVivo{
    private FamiliaPlanta familia;
    private int grauDefesa;

    /**
     * Método Construtor de Planta
     * @param nome Nome da Planta
     * @param especie Espécie
     * @param paisOrigem País de Origem
     * @param idade Idade (anos)
     * @param familia Família da Planta
     * @param grauDefesa Grau de Defesa (1-5)
     * @throws IllegalArgumentException Caso o Grau de Defesa seja inválido
     */
    public Planta(String nome, String especie, String paisOrigem, int idade, FamiliaPlanta familia, int grauDefesa) throws IllegalArgumentException {
        super(nome, especie, paisOrigem, idade);

        if(grauDefesa<0 || grauDefesa>5){
            throw new IllegalArgumentException("Grau de Defesa invalido! Deve ser entre 0 e 5...");
        }
        this.familia = familia;
        this.grauDefesa = grauDefesa;
    }

    public FamiliaPlanta getFamilia() {
        return familia;
    }

    public int getGrauDefesa() {
        return grauDefesa;
    }

    @Override
    public void exibirDetalhes(){
super.exibirDetalhes();
        System.out.print(" | Familia: "+this.familia+" | Grau de Defesa: "+this.grauDefesa);
    }
}
