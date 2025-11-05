package org.exercicios.LAB08.mainlab08;

import org.exercicios.LAB08.ex1.Circulo;
import org.exercicios.LAB08.ex1.Forma;
import org.exercicios.LAB08.ex1.Quadrado;
import org.exercicios.LAB08.ex1.Triangulo;
import org.exercicios.LAB08.ex2.Boleto;
import org.exercicios.LAB08.ex2.CartaoCredito;
import org.exercicios.LAB08.ex2.MetodoPagamento;
import org.exercicios.LAB08.ex2.Pix;
import org.exercicios.LAB08.ex3.EmailNotificacao;
import org.exercicios.LAB08.ex3.Notificacao;
import org.exercicios.LAB08.ex3.PushNotificacao;
import org.exercicios.LAB08.ex3.SMSNotificacao;
import org.exercicios.LAB08.ex4.Desenvolvedor;
import org.exercicios.LAB08.ex4.Estagiario;
import org.exercicios.LAB08.ex4.Funcionario;
import org.exercicios.LAB08.ex4.Gerente;

import java.util.ArrayList;

public class MainLab08 {

    // Método para o Exercício 2
    public static void realizarPagamento(MetodoPagamento metodo, double valor) {
        metodo.processarPagamento(valor);
    }

    public static void main(String[] args) {

        // Exercício 1: Sistema de Formas Geométricas
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(10.0));
        formas.add(new Quadrado(5.0));
        formas.add(new Triangulo(10.0, 5.0));

        for (Forma forma : formas) {
            forma.desenhar();
            System.out.println("Área: " + forma.calcularArea());
        }

        System.out.println("\n=====================================\n");

        // Exercício 2: Sistema de Pagamento
        MetodoPagamento cartao = new CartaoCredito("1234-5678-9012-3456", "A. B. Silva", "12/28");
        MetodoPagamento boleto = new Boleto("84720000000 0001001 12345 678901 2 3456789000", "20/12/2025");
        MetodoPagamento pix = new Pix("987.654.321-00");

        realizarPagamento(cartao, 150.75);
        realizarPagamento(boleto, 300.00);
        realizarPagamento(pix, 50.20);

        System.out.println("\n=====================================\n");

        // Exercício 3: Sistema de Notificações
        ArrayList<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(new EmailNotificacao("usuario@email.com"));
        notificacoes.add(new SMSNotificacao("+55 (62) 99999-8888"));
        notificacoes.add(new PushNotificacao("aBcDeFgHiJkLmNoPqRsTuVwXyZ123456"));

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviar("Esta é uma mensagem de teste de Black Friday!");
        }

        System.out.println("\n=====================================\n");

        // Exercício 4: Sistema de Funcionários
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Carla", "G100", 8000.0, 1500.0));
        funcionarios.add(new Desenvolvedor("Bruno", "D200", 5000.0, 3, "Python"));
        funcionarios.add(new Estagiario("Maria", "E300", 1200.0));

        for (Funcionario func : funcionarios) {
            System.out.println("--- Funcionário: " + func.getNome() + " ---");
            func.realizarTarefa();
            System.out.println("Salário: R$" + func.calcularSalario());
        }
    }
}
