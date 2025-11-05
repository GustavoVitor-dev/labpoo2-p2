package org.exercicios.LAB08.ex2;

public class Boleto implements MetodoPagamento {
    private String codigoBarra;
    private String dataVencimento;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Boleto(String codigoBarra, String dataVencimento) {
        this.codigoBarra = codigoBarra;
        this.dataVencimento = dataVencimento;
    }

    public boolean processarPagamento(double valor) {
        System.out.println("Boleto de R$" + valor + " gerado. Pague até " + this.dataVencimento);
        return true;
    }
}
