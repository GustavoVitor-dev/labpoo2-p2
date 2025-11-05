package org.exercicios.LAB07.ex3;

public class Produto {
    protected String nome;
    protected double preco;
    protected String codigoBarras;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Produto(String nome, double preco, String codigoBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Código: " + this.codigoBarras);
    }
}
