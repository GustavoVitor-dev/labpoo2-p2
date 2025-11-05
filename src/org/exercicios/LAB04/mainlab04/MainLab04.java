package org.exercicios.LAB04.mainlab04;

import org.exercicios.LAB04.matrizes.EstoqueLoja;
import org.exercicios.LAB04.matrizes.Cinema;
import org.exercicios.LAB04.matrizes.MatrizNumerica;
import org.exercicios.LAB04.matrizes.SalaDeAula;

public class MainLab04 {
    public static void main(String[] args) {

                // Exercício 1: SalaDeAula
                int[][] notasESN4 = {
                        { 8, 7, 9 }, // Aluno 1
                        { 10, 8, 8 }, // Aluno 2
                        { 6, 7, 5 }  // Aluno 3
                };
                SalaDeAula turmaA = new SalaDeAula("Turma A - Programação", notasESN4);
                turmaA.imprimirInformacoes();
                System.out.println("Todas as notas acima de 4? " + turmaA.verificarNotasAcima(4));
                System.out.println("Todas as notas acima de 6? " + turmaA.verificarNotasAcima(6));
                System.out.println("\n-----------------------------\n");
                SalaDeAula turmaB = new SalaDeAula();
                turmaB.imprimirInformacoes();
                System.out.println("Todas as notas acima de 0? " + turmaB.verificarNotasAcima(0));

                System.out.println("\n=====================================\n");

                // Exercício 2: EstoqueLoja
                int[][] estoqueArroz = {
                        { 100, 20 },
                        { 50, 45 },
                        { 200, 10 }
                };
                EstoqueLoja arroz = new EstoqueLoja("Arroz Tipo 1", estoqueArroz);
                arroz.imprimirEstoque();
                System.out.println("Algum lote vendeu > 50? " + arroz.verificarLoteCritico(50));
                System.out.println("Algum lote vendeu > 40? " + arroz.verificarLoteCritico(40));
                System.out.println("Algum lote vendeu > 15? " + arroz.verificarLoteCritico(15));

                System.out.println("\n=====================================\n");

                // Exercício 3: Cinema
                boolean[][] mapaSala1 = {
                        { true, true, false, true }, // Fileira 0: 3 ocupados
                        { false, false, false, false }, // Fileira 1: 0 ocupados
                        { true, true, true, true }  // Fileira 2: 4 ocupados
                };
                Cinema sala1 = new Cinema("Cine NEETz", mapaSala1);
                sala1.imprimirAssentos();
                System.out.println("\n--- Verificações ---");
                System.out.println("Fileira 0 tem > 2 ocupados? " + sala1.verificarLotacaoFileira(0, 2));
                System.out.println("Fileira 0 tem > 3 ocupados? " + sala1.verificarLotacaoFileira(0, 3));
                System.out.println("Fileira 1 tem > 0 ocupados? " + sala1.verificarLotacaoFileira(1, 0));
                System.out.println("Fileira 2 tem > 3 ocupados? " + sala1.verificarLotacaoFileira(2, 3));

                System.out.println("\n=====================================\n");

                // Exercício 4: MatrizNumerica
                int[][] meusNumeros = {
                        { 5, 1, 1 },
                        { 8, 9, 8 },
                        { 4, 4, 2 }
                };
                MatrizNumerica matrizA = new MatrizNumerica("Matriz A (Diagonal)", meusNumeros);
                matrizA.imprimirMatriz();
                System.out.println("\n--- Verificações da Diagonal [5, 9, 2] ---");
                System.out.println("Diagonal > 1? " + matrizA.verificarDiagonal(1));
                System.out.println("Diagonal > 2? " + matrizA.verificarDiagonal(2));
                System.out.println("Diagonal > 8? " + matrizA.verificarDiagonal(8));
                System.out.println("Diagonal > 10? " + matrizA.verificarDiagonal(10));
            }
        }
