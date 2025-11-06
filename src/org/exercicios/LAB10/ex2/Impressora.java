package org.exercicios.LAB10.ex2;

public class Impressora implements DispositivoConectavel {
    //--------------------------CONSTRUTORES---------------------------------------------------------------------
    public Impressora() {}

    public void conectar() {
        System.out.println("Impressora: Conectada à rede Wi-Fi. IP: 192.168.1.10.");
    }

    public void desconectar() {
        System.out.println("Impressora: Desligada.");
    }

    public String getTipo() {
        return "Impressora";
    }
}
