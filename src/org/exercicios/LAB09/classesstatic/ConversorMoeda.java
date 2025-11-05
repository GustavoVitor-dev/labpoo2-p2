package org.exercicios.LAB09.classesstatic;

public class ConversorMoeda {
    private static double taxaRealParaDolar = 5.25;
    private static double taxaDolarParaEuro = 0.95;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------
    private ConversorMoeda() {

    }

    public static void atualizarTaxas(double novaTaxaRealDolar, double novaTaxaDolarEuro) {
        taxaRealParaDolar = novaTaxaRealDolar;
        taxaDolarParaEuro = novaTaxaDolarEuro;
    }

    public static double realParaDolar(double valorReal) {
        return valorReal / taxaRealParaDolar;
    }

    public static double dolarParaReal(double valorDolar) {
        return valorDolar * taxaRealParaDolar;
    }

    public static double dolarParaEuro(double valorDolar) {
        return valorDolar * taxaDolarParaEuro;
    }

    public static double euroParaDolar(double valorEuro) {
        return valorEuro / taxaDolarParaEuro;
    }
}
