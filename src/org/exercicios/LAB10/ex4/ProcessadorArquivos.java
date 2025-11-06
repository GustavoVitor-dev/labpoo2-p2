package org.exercicios.LAB10.ex4;

public class ProcessadorArquivos {
    //--------------------------CONSTRUTORES---------------------------------------------------------------------
    private ProcessadorArquivos() {}

    public static void processar(LeitorArquivo leitor, String caminho) {
        System.out.println("Processando arquivo (" + leitor.getFormato() + ")...");
        leitor.lerArquivo(caminho);
    }
}
