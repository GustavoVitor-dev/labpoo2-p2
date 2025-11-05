package org.exercicios.LAB07.ex1;

public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;
    private double bonusPorProjeto;
//--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Desenvolvedor(String nome, String cpf, double salarioBase, String linguagemPrincipal, double bonusPorProjeto) {
        super(nome, cpf, salarioBase);
        this.linguagemPrincipal = linguagemPrincipal;
        this.bonusPorProjeto = bonusPorProjeto;
    }

    public double calcularSalarioTotal() {
        return this.salarioBase + this.bonusPorProjeto;
    }
}
