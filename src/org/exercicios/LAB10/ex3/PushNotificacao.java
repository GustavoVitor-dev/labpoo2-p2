package org.exercicios.LAB10.ex3;

public class PushNotificacao implements Notificavel {
    private String idDispositivo;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------
    public PushNotificacao(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando Push para " + this.idDispositivo + ": '" + mensagem + "'");
    }
}
