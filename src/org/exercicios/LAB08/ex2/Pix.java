package org.exercicios.LAB08.ex2;

public class Pix implements MetodoPagamento {
    private String chavePix;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento Pix de R$" + valor + " realizado para a chave: " + this.chavePix);
        return true;
    }
}
