package org.exercicios.LAB10.ex2;

public class Computador {
    //--------------------------CONSTRUTORES---------------------------------------------------------------------
    private Computador() {}

    public static void conectarDispositivo(DispositivoConectavel dispositivo) {
        System.out.println("Tentando conectar " + dispositivo.getTipo() + "...");
        dispositivo.conectar();
    }

    public static void desconectarDispositivo(DispositivoConectavel dispositivo) {
        System.out.println("Tentando desconectar " + dispositivo.getTipo() + "...");
        dispositivo.desconectar();
    }
}
