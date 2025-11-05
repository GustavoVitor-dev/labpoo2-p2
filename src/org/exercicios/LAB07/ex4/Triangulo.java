package org.exercicios.LAB07.ex4;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;
    //--------------------------CONSTRUTVORES---------------------------------------------------------------------


    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularArea() {
        return (this.base * this.altura) / 2.0;
    }

    public double calcularPerimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }
}
