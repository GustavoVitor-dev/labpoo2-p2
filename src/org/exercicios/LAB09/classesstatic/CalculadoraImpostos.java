package org.exercicios.LAB09.classesstatic;

public class CalculadoraImpostos {
    public static final double ALIQUOTA_IRRF = 0.275;
    public static final double ALIQUOTA_ICMS = 0.18;
    public static final double ALIQUOTA_ISS = 0.05;
    //--------------------------CONSTRUTORES---------------------------------------------------------------------
    private CalculadoraImpostos() {

    }

    public static double calcularIRRF(double valorBase) {
        return valorBase * ALIQUOTA_IRRF;
    }

    public static double calcularICMS(double valorBase) {
        return valorBase * ALIQUOTA_ICMS;
    }

    public static double calcularISS(double valorBase) {
        return valorBase * ALIQUOTA_ISS;
    }
}
