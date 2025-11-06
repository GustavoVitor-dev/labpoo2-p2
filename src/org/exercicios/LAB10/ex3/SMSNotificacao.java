package org.exercicios.LAB10.ex3;

public class SMSNotificacao implements Notificavel {
    private String telefone;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------
    public SMSNotificacao(String telefone) {
        this.telefone = telefone;
    }

    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando SMS para " + this.telefone + ": '" + mensagem + "'");
    }
}
