package org.exercicios.LAB07.ex1;

public class Gerente extends Funcionario {
    private String departamento;
    private double bonificacaoPercentual;
//--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Gerente(String nome, String cpf, double salarioBase, String departamento, double bonificacaoPercentual) {
        super(nome, cpf, salarioBase);
        this.departamento = departamento;
        this.bonificacaoPercentual = bonificacaoPercentual;
    }

    public double calcularSalarioTotal() {
        double bonificacao = this.salarioBase * (this.bonificacaoPercentual / 100.0);
        return this.salarioBase + bonificacao;
    }
}