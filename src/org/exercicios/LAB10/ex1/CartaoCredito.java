package org.exercicios.LAB10.ex1;

public class CartaoCredito implements MetodoPagamento {
    private String numeroCartao;
    private double limite;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public CartaoCredito(String numeroCartao, double limite) {
        this.numeroCartao = numeroCartao;
        this.limite = limite;
    }

    public boolean pagar(double valor) {
        if (valor <= this.limite) {
            System.out.println("Pagamento com Cartão de Crédito aprovado.");
            this.limite -= valor;
            return true;
        } else {
            System.out.println("Pagamento com Cartão de Crédito negado. Limite insuficiente.");
            return false;
        }
    }

    public String getNome() {
        return "Cartão de Crédito";
    }
}
