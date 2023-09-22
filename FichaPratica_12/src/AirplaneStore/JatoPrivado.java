package AirplaneStore;

import AirplaneStore.Enums.CategoriaJato;
import AirplaneStore.Enums.Instalacao;

import java.util.ArrayList;

public class JatoPrivado extends Aviao{

    private int lotacao;
    private double capacidade_bagagem;
    private CategoriaJato categoria;
    private ArrayList<Instalacao> instalacoes;

    /**
     * Método Construtor de <b>Jato Privado</b>
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
     * @param lotacao Lotação (nº passageiros)
     * @param capacidade_bagagem (cm3)
     * @param categoria Categoria de <b>Jato Privado</b>
     */
    public JatoPrivado(int serial, int anoFabrico, int n_motores, String modelo, double peso, double cmp_fuselagem, double env_asas, double alt_cauda, double autonomia, double velocidade_max, double preco, int lotacao, double capacidade_bagagem, CategoriaJato categoria) {
        super(serial, anoFabrico, n_motores, modelo, peso, cmp_fuselagem, env_asas, alt_cauda, autonomia, velocidade_max, preco);
        this.lotacao = lotacao;
        this.capacidade_bagagem = capacidade_bagagem;
        this.categoria = categoria;
        this.instalacoes = new ArrayList<Instalacao>();
    }

    /**
     * Método para adicionar uma nova Instalação
     * @param instalacaoNova Instalacao a adicionar
     */
    public void addInstalacao(Instalacao instalacaoNova){
        this.instalacoes.add(instalacaoNova);
    }

    /**
     * Método que remove uma Instalação
     * @param index Indíce da Instalação a Remover
     */
    public void removeInstalacao(int index){
        this.instalacoes.remove(index);
    }

    /**
     * Método para exibir detalhes do <b>Jato Privado</b>
     */
    public void exibirDetalhesJato(){
        System.out.println("\nJato Privado");
        super.exibirDetalhes();
        System.out.println("Lotação: "+this.lotacao+" passageiros");
        System.out.println("Capacidade de Bagagem: "+this.lotacao+" cm3");
        System.out.print("Instalações: ");
        for(Instalacao instalacaoAtual : this.instalacoes){
            System.out.print(instalacaoAtual+" | ");
        }
        System.out.println("\n");
    }

}
