package org.Ex_03;

import java.util.Scanner;

public class Retangulo {

    // Definir os atributos
    private double largura;
    private double altura;


    // Método construtor
    public Retangulo(double largura, double altura) {

        if (largura <= 0 || altura <= 0) {
            throw new IllegalArgumentException();
        }

        this.largura = largura;
        this.altura = altura;

    }

    /**
     * Método que calcula o perimetro do retangulo
     *
     * @return Perimetro do retângulo
     */
    public double calcularPerimetro() {
        // Variável perimetro é redundante pois podemos retornar diretamente o cálculo
        double perimetro = (this.largura * 2) + (this.altura * 2);
        return perimetro;
    }

    /**
     * Método que calcula a área do retangulo
     *
     * @return Área do retângulo
     */
    public double calcularArea() {
        return this.largura * this.altura;
    }

}