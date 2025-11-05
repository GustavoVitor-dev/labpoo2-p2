package org.exercicios.LAB04.matrizes;

public class SalaDeAula {
    private String nomeTurma;
    private int[][] notasAlunos;
//-------------------------------CONSTRUTORES-----------------------------------------------------------------


    public SalaDeAula() {
        this.nomeTurma = "Turma Desconhecida";
        this.notasAlunos = new int[5][3];
    }

    public SalaDeAula(String nomedaTurma, int[][] notasdosAlunos) {
        this.nomeTurma = nomedaTurma;
        this.notasAlunos = notasdosAlunos;
    }
//-----------------------------------------------------------------------------------------------------------


    public void imprimirInformacoes() {
        System.out.println("Nome da Turma:" + this.nomeTurma);
        System.out.println("-- Notas dos Alunos --");

        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println("Aluno" + (i + 1) + ": ");

            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.println(notasAlunos[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public boolean verificarNotasAcima(int notaMinima) {

        for (int i = 0; i < notasAlunos.length; i++){

            for (int j = 0; j < notasAlunos[i].length; j++) {
                if (notasAlunos[i][j] < notaMinima){
                    return false;
                }
            }
        }
        return true;
    }
}
