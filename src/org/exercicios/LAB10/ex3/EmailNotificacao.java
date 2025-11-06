package org.exercicios.LAB10.ex3;

public class EmailNotificacao implements Notificavel {
    private String email;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------
    public EmailNotificacao(String email) {
        this.email = email;
    }

    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando e-mail para " + this.email + ": '" + mensagem + "'");
    }
}
