package org.exercicios.LAB07.ex3;

public class Livro extends Produto {
    private String autor;
    private String isbn;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Livro(String nome, double preco, String codigoBarras, String autor, String isbn) {
        super(nome, preco, codigoBarras);
        this.autor = autor;
        this.isbn = isbn;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.isbn);
    }
}
