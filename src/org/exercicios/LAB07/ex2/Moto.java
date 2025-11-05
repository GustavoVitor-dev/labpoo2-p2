package org.exercicios.LAB07.ex2;

public class Moto extends Veiculo {
    private int cilindrada;
    private String tipoPartida;
//--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Moto(String marca, String modelo, int ano, double precoDiaria, int cilindrada, String tipoPartida) {
        super(marca, modelo, ano, precoDiaria);
        this.cilindrada = cilindrada;
        this.tipoPartida = tipoPartida;
    }
}
