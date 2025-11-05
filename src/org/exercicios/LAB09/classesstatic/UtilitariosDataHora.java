package org.exercicios.LAB09.classesstatic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class UtilitariosDataHora {
    //--------------------------CONSTRUTORES---------------------------------------------------------------------
    private UtilitariosDataHora() {

    }

    public static String formatarData(LocalDate data, String padrao) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(padrao);
        return data.format(formatter);
    }

    public static long calcularDiferencaDias(LocalDate data1, LocalDate data2) {
        return ChronoUnit.DAYS.between(data1, data2);
    }

    public static boolean isAnoBissexto(int ano) {

        return LocalDate.of(ano, 1, 1).isLeapYear();
    }
}
