package org.exercicios.LAB07.ex2;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double precoDiaria;
//--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Veiculo(String marca, String modelo, int ano, double precoDiaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precoDiaria = precoDiaria;
    }

    public double calcularCustoLocacao(int dias) {
        return dias * this.precoDiaria;
    }
}
