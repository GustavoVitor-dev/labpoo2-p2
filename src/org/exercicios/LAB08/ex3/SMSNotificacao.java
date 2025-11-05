package org.exercicios.LAB08.ex3;

public class SMSNotificacao implements Notificacao {
    private String numeroTelefone;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public SMSNotificacao(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public void enviar(String mensagem) {
        System.out.println("Enviando SMS para " + this.numeroTelefone + ": " + mensagem);
    }
}
