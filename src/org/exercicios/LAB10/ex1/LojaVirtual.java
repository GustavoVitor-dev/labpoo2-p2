package org.exercicios.LAB10.ex1;

public class LojaVirtual {
    //--------------------------CONSTRUTORES---------------------------------------------------------------------


    private LojaVirtual() {}

    public static void processarCompra(double valor, MetodoPagamento metodo) {
        System.out.println("Processando compra de R$" + valor + " com " + metodo.getNome() + "...");
        boolean sucesso = metodo.pagar(valor);

        if (sucesso) {
            System.out.println("Compra processada com sucesso!");
        } else {
            System.out.println("Falha ao processar a compra.");
        }
    }
}
