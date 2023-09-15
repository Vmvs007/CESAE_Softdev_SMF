package Ex_03;

public class Retangulo {
    private double altura, largura;

    /**
     * Método construtor
     * @param altura Altura do Retângulo (cm.)
     * @param largura Largura do Retângulo (cm.)
     */
    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    /**
     * Método para calcular o perimetro
     * @return perimetro
     */
    public double perimetro(){
    return (this.altura*2)+(this.largura*2);
}

    /**
     * Método para calcular a área
     * @return area
     */
    public double area(){
return this.altura*this.largura;
}

}
