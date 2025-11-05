package org.exercicios.LAB09.mainlab09;

import org.exercicios.LAB09.classesstatic.CalculadoraImpostos;
import org.exercicios.LAB09.classesstatic.ConversorMoeda;
import org.exercicios.LAB09.classesstatic.GerenciadorLog;
import org.exercicios.LAB09.classesstatic.UtilitariosDataHora;

import java.time.LocalDate;

public class MainLab09 {
    public static void main(String[] args) {

        // Exercício 1: Conversor de Moedas
        System.out.println("--- Conversor de Moedas ---");
        double valorReal = 100.0;
        System.out.println("R$" + valorReal + " = $" + ConversorMoeda.realParaDolar(valorReal));
        double valorDolar = 50.0;
        System.out.println("$" + valorDolar + " = €" + ConversorMoeda.dolarParaEuro(valorDolar));

        ConversorMoeda.atualizarTaxas(5.00, 0.90);
        System.out.println("Taxas atualizadas...");
        System.out.println("R$" + valorReal + " = $" + ConversorMoeda.realParaDolar(valorReal));
        System.out.println("$" + valorDolar + " = €" + ConversorMoeda.dolarParaEuro(valorDolar));

        System.out.println("\n=====================================\n");

        // Exercício 2: Calculadora de Impostos
        System.out.println("--- Calculadora de Impostos ---");
        double baseCalculo = 1000.0;
        System.out.println("Base: R$" + baseCalculo);
        System.out.println("IRRF: R$" + CalculadoraImpostos.calcularIRRF(baseCalculo));
        System.out.println("ICMS: R$" + CalculadoraImpostos.calcularICMS(baseCalculo));
        System.out.println("ISS: R$" + CalculadoraImpostos.calcularISS(baseCalculo));

        System.out.println("\n=====================================\n");

        // Exercício 3: Gerenciador de Logs
        System.out.println("--- Gerenciador de Logs (Console) ---");
        GerenciadorLog.logInfo("Aplicação iniciada.");
        GerenciadorLog.logWarn("Conexão com DB lenta.");

        GerenciadorLog.setDestino("ARQUIVO");
        System.out.println("Destino do log alterado para ARQUIVO");
        GerenciadorLog.logError("Falha ao processar pagamento.");

        System.out.println("\n=====================================\n");

        // Exercício 4: Utilitários de Data e Hora
        System.out.println("--- Utilitários de Data e Hora ---");
        LocalDate hoje = LocalDate.now();
        LocalDate natal = LocalDate.of(hoje.getYear(), 12, 25);

        System.out.println("Data de hoje (EUA): " + UtilitariosDataHora.formatarData(hoje, "MM/dd/yyyy"));
        System.out.println("Data de hoje (BRA): " + UtilitariosDataHora.formatarData(hoje, "dd/MM/yyyy"));

        System.out.println("Dias até o Natal: " + UtilitariosDataHora.calcularDiferencaDias(hoje, natal));

        System.out.println("2024 é bissexto? " + UtilitariosDataHora.isAnoBissexto(2024));
        System.out.println("2025 é bissexto? " + UtilitariosDataHora.isAnoBissexto(2025));
    }
}
