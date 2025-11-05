package org.exercicios.LAB04.matrizes;

    public class MatrizNumerica {
        private String nomeMatriz;
        private int[][] matrizNumeros;
//-------------------------- Construtores ------------------------------------------------------------------



        public MatrizNumerica() {
            this.nomeMatriz = "Matriz Desconhecida";
            this.matrizNumeros = new int[3][3];
        }

        public MatrizNumerica(String nomeMatriz, int[][] numeros) {
            this.nomeMatriz = nomeMatriz;
            this.matrizNumeros = numeros;
        }

//-------------------------------------------------------------------------------------------------------------


        public void imprimirMatriz() {
            System.out.println("Nome: " + this.nomeMatriz);
            System.out.println("--- Valores ---");

            for (int i = 0; i < this.matrizNumeros.length; i++) {

                for (int j = 0; j < this.matrizNumeros[i].length; j++) {

                    System.out.print(this.matrizNumeros[i][j] + "\t");
                }
                System.out.println();
            }
        }

        public boolean verificarDiagonal(int valorMinimo) {

            for (int i = 0; i < this.matrizNumeros.length; i++) {

                if (this.matrizNumeros[i][i] <= valorMinimo) {
                    return false;
                }
            }

            return true;
        }
    }

