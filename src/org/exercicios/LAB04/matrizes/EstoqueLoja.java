package org.exercicios.LAB04.matrizes;

public class EstoqueLoja {
    private String nomeProduto;
    private int[][] quantidadesPorLote;
//---------------------------CONSTRUTORES-------------------------------------------------------------------


    public EstoqueLoja() {
        this.nomeProduto = "Produto Desconhecido";
        this.quantidadesPorLote = new int[4][2];
    }

    public EstoqueLoja(String nomedoProduto, int[][] quantidadesLote) {
        this.nomeProduto = nomedoProduto;
        this.quantidadesPorLote = quantidadesLote;
    }
//--------------------------------------------------------------------------------------------------------------


public void imprimirEstoque() {
    System.out.println("Produto:" + this.nomeProduto);
    System.out.println("-- Controle de Lotes --");

    for (int i = 0; i < quantidadesPorLote.length; i++){
        int disponivel = quantidadesPorLote [i][0];
        int vendido = quantidadesPorLote[i][1];

        System.out.println("Lote " + (i + 1) + ": Disponível: " + disponivel + " | Vendido: " + vendido);
    }
}

public boolean verificarLoteCritico(int limite) {
    for (int i = 0; i < quantidadesPorLote.length; i++) {
        int quantidadeVendida = quantidadesPorLote[i][1];

        if (quantidadeVendida > limite) {
            return true;
        }
    }

    return false;
}

}





