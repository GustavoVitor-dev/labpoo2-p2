package org.exercicios.LAB10.ex4;

public class LeitorCSV implements LeitorArquivo {
    //--------------------------CONSTRUTORES---------------------------------------------------------------------
    public LeitorCSV() {}

    public void lerArquivo(String caminhoArquivo) {
        System.out.println("Lendo arquivo CSV: " + caminhoArquivo);
        System.out.println("Linha 1: [coluna1, coluna2, coluna3]");
        System.out.println("Linha 2: [dadoA, dadoB, dadoC]");
    }

    public String getFormato() {
        return "CSV";
    }
}
