package org.exercicios.LAB07.ex3;

public class Roupa extends Produto {
    private String tamanho;
    private String material;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Roupa(String nome, double preco, String codigoBarras, String tamanho, String material) {
        super(nome, preco, codigoBarras);
        this.tamanho = tamanho;
        this.material = material;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Material: " + this.material);
    }
}
