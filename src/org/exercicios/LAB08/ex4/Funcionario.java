package org.exercicios.LAB08.ex4;

public abstract class Funcionario {
    protected String nome;
    protected String matricula;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public abstract double calcularSalario();
    public abstract void realizarTarefa();
}
