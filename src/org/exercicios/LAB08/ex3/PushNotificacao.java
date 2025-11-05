package org.exercicios.LAB08.ex3;

public class PushNotificacao implements Notificacao {
    private String tokenDispositivo;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public PushNotificacao(String tokenDispositivo) {
        this.tokenDispositivo = tokenDispositivo;
    }

    public void enviar(String mensagem) {
        System.out.println("Enviando notificação push para o dispositivo " + this.tokenDispositivo + ": " + mensagem);
    }
}
