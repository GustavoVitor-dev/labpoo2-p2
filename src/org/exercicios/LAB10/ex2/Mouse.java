package org.exercicios.LAB10.ex2;

public class Mouse implements DispositivoConectavel {
    //--------------------------CONSTRUTORES---------------------------------------------------------------------
    public Mouse() {}

    public void conectar() {
        System.out.println("Mouse: Conectado via Bluetooth. Bateria: 90%.");
    }

    public void desconectar() {
        System.out.println("Mouse: Bluetooth desconectado.");
    }

    public String getTipo() {
        return "Mouse";
    }
}
