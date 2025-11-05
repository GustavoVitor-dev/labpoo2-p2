package org.exercicios.LAB08.ex1;

public class Triangulo extends Forma {
    private double base;
    private double altura;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (this.base * this.altura) / 2.0;
    }

    public void desenhar() {
        System.out.println("Desenhando Triângulo...");
    }
}
