package org.exercicios.LAB08.ex1;

public class Circulo extends Forma {
    private double raio;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * this.raio * this.raio;
    }

    public void desenhar() {
        System.out.println("Desenhando Círculo...");
    }
}
