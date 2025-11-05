package org.exercicios.LAB08.ex1;

public class Quadrado extends Forma {
    private double lado;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return this.lado * this.lado;
    }

    public void desenhar() {
        System.out.println("Desenhando Quadrado...");
    }
}
