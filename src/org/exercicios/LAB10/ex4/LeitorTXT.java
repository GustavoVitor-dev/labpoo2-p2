package org.exercicios.LAB10.ex4;

public class LeitorTXT implements LeitorArquivo {
    //--------------------------CONSTRUTORES---------------------------------------------------------------------
    public LeitorTXT() {}

    public void lerArquivo(String caminhoArquivo) {
        System.out.println("Lendo arquivo de texto simples: " + caminhoArquivo);
        System.out.println("Conteúdo: [Linha 1 do TXT... Linha 2 do TXT...]");
    }

    public String getFormato() {
        return "TXT";
    }
}
