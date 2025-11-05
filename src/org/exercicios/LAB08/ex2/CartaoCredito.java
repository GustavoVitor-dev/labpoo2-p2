package org.exercicios.LAB08.ex2;

public class CartaoCredito implements MetodoPagamento {
    private String numeroCartao;
    private String nomeTitular;
    private String validade;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public CartaoCredito(String numeroCartao, String nomeTitular, String validade) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.validade = validade;
    }

    public boolean processarPagamento(double valor) {
        if (valor > 0) {
            System.out.println("Pagamento de R$" + valor + " com cartão de crédito (" + this.numeroCartao + ") processado.");
            return true;
        }
        return false;
    }
}
