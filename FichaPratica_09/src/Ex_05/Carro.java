package Ex_05;

public class Carro {
private String marca, modelo;
private int anoFabrico;

    /**
     * Método Construtor
     * @param marca Marca do Carro
     * @param modelo Modelo do Carro
     * @param anoFabrico Ano de Fabrico do Carro
     */
    public Carro(String marca, String modelo, int anoFabrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
    }

    public void ligar(){
        System.out.println("O carro está ligado");
    }
}
