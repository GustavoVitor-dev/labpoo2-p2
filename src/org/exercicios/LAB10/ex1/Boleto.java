package org.exercicios.LAB10.ex1;

public class Boleto implements MetodoPagamento {
    private String codigoBarras;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Boleto() {
        // Gerador simulado
        this.codigoBarras = "34191.79001 01024.350008 01010.106322 1 936500000" + (int)(Math.random() * 1000);
    }

    public boolean pagar(double valor) {
        System.out.println("Boleto gerado no valor de R$" + valor);
        System.out.println("Código: " + this.codigoBarras);
        System.out.println("Pagamento pendente de processamento.");
        return true;
    }

    public String getNome() {
        return "Boleto";
    }
}
