package AirplaneStore;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Aviao> catalogo;

    /**
     * Método construtor de <b>Catalogo</b>
     */
    public Catalogo() {
        this.catalogo= new ArrayList<Aviao>();
    }

    /**
     * Método para adicionar um novo aviao ao catalogo
     * @param aviaoNovo Aviao a adicionar ao catalogo
     */
    public void adquirirAviao(Aviao aviaoNovo){
        this.catalogo.add(aviaoNovo);
    }

    /**
     * Método que remove um aviao do catalogo
     * @param index Indíce do Aviao  a Remover
     */
    public void venderAviao(int index){
        this.catalogo.remove(index);
    }


    /**
     * Método que imprime todos os <b>Aviões</b> do <b>Catalogo</b>
     */
    public void imprimirCatalogo(){
        System.out.println("\n***** Aviões Disponiveis para Venda *****\n");
        for(Aviao aviaoAtual : this.catalogo){
            if(aviaoAtual instanceof JatoPrivado){
                ((JatoPrivado) aviaoAtual).exibirDetalhesJato();
            }

            if(aviaoAtual instanceof AviaoCombate){
                ((AviaoCombate) aviaoAtual).exibirDetalhesCombate();
            }

        }
    }
}
