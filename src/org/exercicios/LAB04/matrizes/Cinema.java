package org.exercicios.LAB04.matrizes;

public class Cinema {
    private String nomeCinema;
    private boolean[][] assentos;
//--------------------------CONSTRUTORES---------------------------------------------------------------------


    public Cinema() {
        this.nomeCinema = "Cinema Desconhecido";
        this.assentos = new boolean[5][5];
    }

    public Cinema(String nomedoCinema, boolean[][] mapaassentos) {
        this.nomeCinema = nomedoCinema;
        this.assentos = mapaassentos;
    }

    public void imprimirAssentos(){
        System.out.println("Cinema: " + this.nomeCinema);
        System.out.println("-- Mapa de Assentos --");

        for (int i = 0; i < assentos.length; i++){
            System.out.println("Fileira " + (i) + ": ");

            for (int j = 0; j < assentos[i].length; j++){

                if (assentos[i][j] == true){
                    System.out.println(" [X] ");
                } else{
                    System.out.println(" [L] ");
                }
            }
            System.out.println();
        }

    }

    public boolean verificarLotacaoFileira(int numeroFileira, int limiteOcupacao){

        int assentosOcupados = 0;

        for (int j = 0; j < assentos[numeroFileira].length; j++) {
            if (assentos[numeroFileira][j] == true){
                assentosOcupados++;
            }
        }
        if (assentosOcupados > limiteOcupacao){
            return true;
        } else {
            return false;
        }
    }
}
