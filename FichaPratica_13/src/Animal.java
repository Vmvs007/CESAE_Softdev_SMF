import Enums.AlimentacaoAnimal;

public class Animal extends SerVivo{
    private boolean fome;
    private double peso, inteligencia;
    private String barulho;
    private AlimentacaoAnimal dieta;

    /**
     * Método Construtor de Animal
     * @param nome Nome do Animal
     * @param especie Espécie
     * @param paisOrigem País de Origem
     * @param idade Idade (anos)
     * @param inteligencia Inteligência (0-100)
     * @param barulho Barulho Característico do Animal
     * @param dieta Dieta Alimentar
     * @throws IllegalArgumentException Caso a inteligência seja inválida
     */
    public Animal(String nome, String especie, String paisOrigem, int idade, double peso, double inteligencia, String barulho, AlimentacaoAnimal dieta) throws IllegalArgumentException {
        super(nome, especie, paisOrigem, idade);
        if(inteligencia<0 || inteligencia>100){
            throw new IllegalArgumentException("Inteligencia invalida! Deve ser entre 0 e 100...");
        }
        this.fome = false;
        this.peso = peso;
        this.inteligencia = inteligencia;
        this.barulho = barulho;
        this.dieta = dieta;
    }

    public boolean isFome() {
        return fome;
    }

    public double getPeso() {
        return peso;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public String getBarulho() {
        return barulho;
    }

    public AlimentacaoAnimal getDieta() {
        return dieta;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }



    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.print(" | Fome: "+this.fome+" | Peso: "+this.peso+" Kg. | Inteligencia: "+this.inteligencia+" | Barulho: "+this.barulho+" | Dieta: "+this.dieta);
    }

}
