package org.exercicios.LAB07.ex4;

public class Circulo extends FiguraGeometrica {
    private double raio;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * (this.raio * this.raio);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }
}