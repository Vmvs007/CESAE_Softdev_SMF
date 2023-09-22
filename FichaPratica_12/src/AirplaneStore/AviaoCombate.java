package AirplaneStore;

import AirplaneStore.Enums.Arma;

import java.util.ArrayList;

public class AviaoCombate extends Aviao {
    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Arma> arsenal;

    /**
     * Método Construtor de <b>Avião</b>
     * @param serial Número de série
     * @param anoFabrico Ano de Fabrico
     * @param n_motores Número de Motores
     * @param modelo Modelo
     * @param peso Peso (Kg.)
     * @param cmp_fuselagem Comprimento da Fuselagem (m.)
     * @param env_asas Envergadura das Asas (m.)
     * @param alt_cauda Altura da Cauda (m.)
     * @param autonomia Autonomia (L.)
     * @param velocidade_max Velocidade máxima (Kt.)
     * @param preco Preco (€)
     * @param paisOrigem País de Origem
     * @param camuflagem Se tem ou não camuflagem
     */
    public AviaoCombate(int serial, int anoFabrico, int n_motores, String modelo, double peso, double cmp_fuselagem, double env_asas, double alt_cauda, double autonomia, double velocidade_max, double preco, String paisOrigem, boolean camuflagem) {
        super(serial, anoFabrico, n_motores, modelo, peso, cmp_fuselagem, env_asas, alt_cauda, autonomia, velocidade_max, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.arsenal=new ArrayList<Arma>();
    }

    /**
     * Método para adicionar uma nova arma ao arsenal
     * @param armaNova Arma a adicionar ao arsenal
     */
    public void addArma(Arma armaNova){
        if(this.arsenal.size()!=3){
            this.arsenal.add(armaNova);
        }else{
            System.out.println("Arsenal cheio! Não é possível adicionar novas armas a "+ super.getModelo());
        }
    }

    /**
     * Método que remove uma Arma
     * @param index Indíce da Arma a Remover
     */
    public void removeArma(int index){
        this.arsenal.remove(index);
    }

    /**
     * Método para exibir detalhes do <b>Avião de Combate</b>
     */
    public void exibirDetalhesCombate(){
        System.out.println("\nAvião de Combate");
        super.exibirDetalhes();
        System.out.println("Pais de Origem: "+this.paisOrigem);
        System.out.println("Camuflagem: "+this.camuflagem);
        System.out.print("Arsenal: ");
        for(Arma armaAtual : this.arsenal){
            System.out.print(armaAtual+" | ");
        }
        System.out.println("\n");
    }
}
