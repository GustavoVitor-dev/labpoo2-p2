package org.exercicios.LAB08.ex4;

public class Estagiario extends Funcionario {
    private double bolsaAuxilio;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Estagiario(String nome, String matricula, double bolsaAuxilio) {
        super(nome, matricula);
        this.bolsaAuxilio = bolsaAuxilio;
    }

    public double calcularSalario() {
        return this.bolsaAuxilio;
    }

    public void realizarTarefa() {
        System.out.println("Estagiário " + this.nome + " está aprendendo e auxiliando.");
    }
}
