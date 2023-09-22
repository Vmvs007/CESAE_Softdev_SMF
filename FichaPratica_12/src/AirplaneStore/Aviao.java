package AirplaneStore;

public class Aviao {

    private int serial, anoFabrico, n_motores;
    private String modelo;
    private double peso, cmp_fuselagem, env_asas, alt_cauda, autonomia, velocidade_max, preco;

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
     * @param autonomia Autonomia (Km.)
     * @param velocidade_max Velocidade máxima (Kt.)
     * @param preco Preco (€)
     */
    public Aviao(int serial, int anoFabrico, int n_motores, String modelo, double peso, double cmp_fuselagem, double env_asas, double alt_cauda, double autonomia, double velocidade_max, double preco) {
        this.serial = serial;
        this.anoFabrico = anoFabrico;
        this.n_motores = n_motores;
        this.modelo = modelo;
        this.peso = peso;
        this.cmp_fuselagem = cmp_fuselagem;
        this.env_asas = env_asas;
        this.alt_cauda = alt_cauda;
        this.autonomia = autonomia;
        this.velocidade_max = velocidade_max;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    /**
     * Método para imprimir detalhes do <b>Avião</b>
     */
    public void exibirDetalhes(){
        System.out.println("\nModelo: "+this.modelo);
        System.out.println("Serial: "+this.serial);
        System.out.println("Ano Fabrico: "+this.anoFabrico);
        System.out.println("Número de Motores: "+this.n_motores);
        System.out.println("Peso: "+this.peso+" Kg.");
        System.out.println("Comprimento da Fuselagem: "+this.cmp_fuselagem+" m.");
        System.out.println("Envergadura das Asas: "+this.env_asas+" m.");
        System.out.println("Altura da Causa: "+this.alt_cauda+" m.");
        System.out.println("Autonomia: "+this.autonomia+" Km.");
        System.out.println("Velocidade Máxima: "+this.velocidade_max+" Kt.");
        System.out.println("Preço: "+this.preco+" €");
    }
}
