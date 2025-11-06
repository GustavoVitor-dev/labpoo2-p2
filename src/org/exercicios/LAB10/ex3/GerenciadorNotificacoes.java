package org.exercicios.LAB10.ex3;

public class GerenciadorNotificacoes {
    //--------------------------CONSTRUTORES---------------------------------------------------------------------
    private GerenciadorNotificacoes() {}

    public static void enviar(Notificavel canal, String mensagem) {
        canal.enviarNotificacao(mensagem);
    }
}
