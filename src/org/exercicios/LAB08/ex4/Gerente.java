package org.exercicios.LAB08.ex4;

public class Gerente extends Funcionario {
    private double salarioBase;
    private double bonus;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Gerente(String nome, String matricula, double salarioBase, double bonus) {
        super(nome, matricula);
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    public double calcularSalario() {
        return this.salarioBase + this.bonus;
    }

    public void realizarTarefa() {
        System.out.println("Gerente " + this.nome + " está gerenciando a equipe.");
    }
}
