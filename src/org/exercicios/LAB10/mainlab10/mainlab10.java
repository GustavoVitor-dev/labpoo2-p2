package org.exercicios.LAB10.mainlab10;

import org.exercicios.LAB10.ex1.*;
import org.exercicios.LAB10.ex2.*;
import org.exercicios.LAB10.ex3.*;
import org.exercicios.LAB10.ex4.*;


public class mainlab10 {
    public static void main(String[] args) {

        // Exercício 1: Sistema de Pagamento Online
        System.out.println("--- Pagamento Online ---");
        MetodoPagamento cartao = new CartaoCredito("1111-2222-3333-4444", 1000.0);
        MetodoPagamento paypal = new PayPal("usuario@servidor.com");
        MetodoPagamento boleto = new Boleto();

        LojaVirtual.processarCompra(500.0, cartao);
        System.out.println("---");
        LojaVirtual.processarCompra(700.0, cartao); // Tenta estourar o limite
        System.out.println("---");
        LojaVirtual.processarCompra(150.0, paypal);
        System.out.println("---");
        LojaVirtual.processarCompra(300.0, boleto);

        System.out.println("\n=====================================\n");

        // Exercício 2: Gerenciamento de Dispositivos Conectáveis
        System.out.println("--- Dispositivos Conectáveis ---");
        DispositivoConectavel tec = new Teclado();
        DispositivoConectavel mou = new Mouse();
        DispositivoConectavel imp = new Impressora();

        Computador.conectarDispositivo(tec);
        Computador.conectarDispositivo(mou);
        Computador.conectarDispositivo(imp);
        System.out.println("---");
        Computador.desconectarDispositivo(mou);

        System.out.println("\n=====================================\n");

        // Exercício 3: Sistema de Notificações
        System.out.println("--- Sistema de Notificações ---");
        Notificavel canalEmail = new EmailNotificacao("admin@sistema.com");
        Notificavel canalSMS = new SMSNotificacao("+556299999999");
        Notificavel canalPush = new PushNotificacao("TokenApp123xyz");

        GerenciadorNotificacoes.enviar(canalEmail, "Sua fatura fechou.");
        GerenciadorNotificacoes.enviar(canalSMS, "Seu código de verificação é 45678.");
        GerenciadorNotificacoes.enviar(canalPush, "Você recebeu uma nova mensagem.");

        System.out.println("\n=====================================\n");

        // Exercício 4: Leitor de Arquivos Genérico
        System.out.println("--- Leitor de Arquivos ---");
        LeitorArquivo leitorTxt = new LeitorTXT();
        LeitorArquivo leitorCsv = new LeitorCSV();
        LeitorArquivo leitorJson = new LeitorJSON();

        ProcessadorArquivos.processar(leitorTxt, "/docs/meuarquivo.txt");
        System.out.println("---");
        ProcessadorArquivos.processar(leitorCsv, "/data/relatorio.csv");
        System.out.println("---");
        ProcessadorArquivos.processar(leitorJson, "/config/settings.json");
    }
}
