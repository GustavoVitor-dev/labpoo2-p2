package org.exercicios.LAB07.ex3;

public class Eletronico extends Produto {
    private String marca;
    private int voltagem;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Eletronico(String nome, double preco, String codigoBarras, String marca, int voltagem) {
        super(nome, preco, codigoBarras);
        this.marca = marca;
        this.voltagem = voltagem;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Marca: " + this.marca);
        System.out.println("Voltagem: " + this.voltagem + "V");
    }
}