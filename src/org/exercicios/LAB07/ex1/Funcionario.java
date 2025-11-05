package org.exercicios.LAB07.ex1;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salarioBase;
//--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioTotal() {
        return this.salarioBase;
    }

    public String getNome() {
        return this.nome;
    }
}