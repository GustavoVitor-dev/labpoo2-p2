package org.exercicios.LAB09.classesstatic;

public class GerenciadorLog {
    private static String destinoLog = "CONSOLE";
    //--------------------------CONSTRUTORES---------------------------------------------------------------------
    private GerenciadorLog() {

    }

    public static void setDestino(String destino) {
        if (destino.equals("CONSOLE") || destino.equals("ARQUIVO")) {
            destinoLog = destino;
        }
    }

    private static void log(String nivel, String mensagem) {
        String logCompleto = "[" + nivel + "] " + mensagem;
        if (destinoLog.equals("CONSOLE")) {
            System.out.println(logCompleto);
        } else if (destinoLog.equals("ARQUIVO")) {

            System.out.println("(ARQUIVO) " + logCompleto);
        }
    }

    public static void logInfo(String mensagem) {
        log("INFO", mensagem);
    }

    public static void logWarn(String mensagem) {
        log("WARN", mensagem);
    }

    public static void logError(String mensagem) {
        log("ERROR", mensagem);
    }
}
