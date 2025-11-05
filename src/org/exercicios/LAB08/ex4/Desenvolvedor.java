package org.exercicios.LAB08.ex4;

public class Desenvolvedor extends Funcionario {
    private double salarioBase;
    private int anosExperiencia;
    private String linguagemPreferida;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Desenvolvedor(String nome, String matricula, double salarioBase, int anosExperiencia, String linguagemPreferida) {
        super(nome, matricula);
        this.salarioBase = salarioBase;
        this.anosExperiencia = anosExperiencia;
        this.linguagemPreferida = linguagemPreferida;
    }

    public double calcularSalario() {
        return this.salarioBase + (this.salarioBase * 0.1 * this.anosExperiencia);
    }

    public void realizarTarefa() {
        System.out.println("Desenvolvedor " + this.nome + " está codificando em " + this.linguagemPreferida + ".");
    }
}
