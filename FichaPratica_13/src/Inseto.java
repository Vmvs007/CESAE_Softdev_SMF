public class Inseto extends SerVivo{
    private boolean venenoso;

    /**
     * Método Construtor de Inseto
     * @param nome Nome do Inseto
     * @param especie Espécie
     * @param paisOrigem País de Origem
     * @param idade Idade (anos)
     * @param venenoso Se é ou não venenoso
     */
    public Inseto(String nome, String especie, String paisOrigem, int idade, boolean venenoso) {
        super(nome, especie, paisOrigem, idade);
        this.venenoso = venenoso;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.print(" | Venenoso: "+this.venenoso);
    }
}
