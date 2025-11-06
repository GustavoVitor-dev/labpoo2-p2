package org.exercicios.LAB10.ex4;

public class LeitorJSON implements LeitorArquivo {
    //--------------------------CONSTRUTORES---------------------------------------------------------------------
    public LeitorJSON() {}

    public void lerArquivo(String caminhoArquivo) {
        System.out.println("Lendo arquivo JSON: " + caminhoArquivo);
        System.out.println("Parse: { 'chave': 'valor', 'lista': [1, 2, 3] }");
    }

    public String getFormato() {
        return "JSON";
    }
}
