package org.exercicios.LAB07.ex2;

public class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;
//--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Carro(String marca, String modelo, int ano, double precoDiaria, int numeroPortas, String tipoCombustivel) {
        super(marca, modelo, ano, precoDiaria);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }
}
