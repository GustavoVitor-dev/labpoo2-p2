package org.exercicios.LAB10.ex2;

public class Teclado implements DispositivoConectavel {
    //--------------------------CONSTRUTORES---------------------------------------------------------------------
    public Teclado() {}

    public void conectar() {
        System.out.println("Teclado: Conectado via USB. Drivers instalados.");
    }

    public void desconectar() {
        System.out.println("Teclado: Desconectado com segurança.");
    }

    public String getTipo() {
        return "Teclado";
    }
}