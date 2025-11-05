package org.exercicios.LAB07.ex4;

public class Retangulo extends FiguraGeometrica {
    private double largura;
    private double altura;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return this.largura * this.altura;
    }

    public double calcularPerimetro() {
        return 2 * (this.largura + this.altura);
    }
}
