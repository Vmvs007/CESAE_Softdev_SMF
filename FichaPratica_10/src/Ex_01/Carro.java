package Ex_01;

public class Carro {
    private String marca, modelo;
    private int anoFabrico, potencia, cilindrada;
    private double consumo;
    private TipoCombustivel tipoCombustivel;

    /**
     * Método Construtor
     * @param marca Marca do Carro
     * @param modelo Modelo do Carro
     * @param anoFabrico Ano de Fabrico
     * @param potencia Potencia em Cavalos (Cv)
     * @param cilindrada Cilindrada (CC)
     * @param consumo Consumo L/100Km.
     * @param tipoCombustivel Tipo de Combustivel
     */
    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, double consumo, TipoCombustivel tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.consumo = consumo;
        this.tipoCombustivel = tipoCombustivel;
    }


    /**
     * Método para ligar o Carro
     */
    public void ligar(){

        int idade = 2023-this.anoFabrico;

        if(idade>30){ // Carro tem mais de 30 anos

            if(this.tipoCombustivel.equals(TipoCombustivel.DIESEL)){
                // Carro a Diesel
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }else{
                // Carro sem ser a Diesel
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }

        }else{ // Carro tem 30 ou menos anos
            if(this.potencia<250){
                // Carro tem menos de 250 cavalos
                System.out.println("O carro está ligado!");
                System.out.println("Vruummmmmmmmmmmm");
            }else{
                // Carro tem 250 ou mais cavalos
                System.out.println("O carro está ligado!");
                System.out.println("VRUUMMMMMMMMM");
            }
        }
    }


    public Carro corrida(Carro adversario){

        System.out.println(this.marca+" "+this.modelo+" vair competir com "+adversario.marca+" "+adversario.modelo);

     if(this.potencia>adversario.potencia){
        // Ganha o meu Carro
         return this;
        }else{
         if(this.potencia< adversario.potencia){
             // Ganha o adversario
             return adversario;
         }else{
             // Empate de potencia
             if(this.cilindrada>adversario.cilindrada){
                 // Ganha o meu Carro
                 return this;
             }else {
                 if(this.cilindrada< adversario.cilindrada){
                     // Ganha o adversario
                     return adversario;
                 }else {
                     // Empate de cilindrada
                     if(this.anoFabrico>adversario.anoFabrico){
                         // Ganha o meu Carro
                         return this;
                     }else{
                         if(this.anoFabrico<adversario.anoFabrico){
                             // Ganha o adversario
                             return adversario;
                         }else{
                             // Empate
                             return null;
                         }
                     }
                 }
             }
         }
     }
    }



    /**
     * Método para exibir detalhes
     */
    public void exibirDetalhes(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano: "+this.anoFabrico);
        System.out.println("Potencia: "+this.potencia+" cv.");
        System.out.println("Cilindrada: "+this.cilindrada+" cc.");
        System.out.println("Combustivel: "+this.tipoCombustivel);
    }
}