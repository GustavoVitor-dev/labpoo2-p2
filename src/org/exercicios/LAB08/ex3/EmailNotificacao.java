package org.exercicios.LAB08.ex3;

public class EmailNotificacao implements Notificacao {
    private String enderecoEmail;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public EmailNotificacao(String enderecoEmail) {
        this.enderecoEmail = enderecoEmail;
    }

    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail para " + this.enderecoEmail + ": " + mensagem);
    }
}
