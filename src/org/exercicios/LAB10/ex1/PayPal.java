package org.exercicios.LAB10.ex1;

public class PayPal implements MetodoPagamento {
    private String emailUsuario;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public PayPal(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public boolean pagar(double valor) {
        System.out.println("Autenticando PayPal com " + this.emailUsuario + "...");
        System.out.println("Pagamento de R$" + valor + " via PayPal efetuado.");
        return true;
    }

    public String getNome() {
        return "PayPal";
    }
}
