package org.exercicios.LAB07.mainlab07;
import org.exercicios.LAB07.ex1.Desenvolvedor;
import org.exercicios.LAB07.ex1.Funcionario;
import org.exercicios.LAB07.ex1.Gerente;
import org.exercicios.LAB07.ex2.Carro;
import org.exercicios.LAB07.ex2.Moto;
import org.exercicios.LAB07.ex3.Eletronico;
import org.exercicios.LAB07.ex3.Livro;
import org.exercicios.LAB07.ex3.Roupa;
import org.exercicios.LAB07.ex4.Circulo;
import org.exercicios.LAB07.ex4.Retangulo;
import org.exercicios.LAB07.ex4.Triangulo;

public class MainLab07 {
    public static void main(String[] args) {
                // Exercício 1: Sistema de Gerenciamento de Funcionários
                Funcionario func = new Funcionario("Funcionario Base", "111.111.111-11", 2000.00);
                Gerente ger = new Gerente("Gerente", "222.222.222-22", 5000.00, "TI", 10.0);
                Desenvolvedor dev = new Desenvolvedor("Desenvolvedor", "333.333.333-33", 4000.00, "Java", 500.00);

        System.out.println("Salário " + func.getNome() + ": R$" + func.calcularSalarioTotal());
        System.out.println("Salário " + ger.getNome() + ": R$" + ger.calcularSalarioTotal());
        System.out.println("Salário " + dev.getNome() + ": R$" + dev.calcularSalarioTotal());

                System.out.println("\n=====================================\n");

                // Exercício 2: Sistema de Gestão de Veículos
                Carro carro = new Carro("Fiat", "Uno", 2020, 100.00, 4, "Flex");
                Moto moto = new Moto("Honda", "CG 160", 2023, 70.00, 160, "Elétrica");

                System.out.println("Custo locação Carro (5 dias): R$" + carro.calcularCustoLocacao(5));
                System.out.println("Custo locação Moto (3 dias): R$" + moto.calcularCustoLocacao(3));

                System.out.println("\n=====================================\n");

                // Exercício 3: Hierarquia de Produtos em um E-commerce
                Eletronico tv = new Eletronico("Smart TV 50\"", 2500.00, "7890001", "Samsung", 220);
                Livro livro = new Livro("O Senhor dos Anéis", 120.00, "7890002", "J.R.R. Tolkien", "978-3-16-148410-0");
                Roupa camisa = new Roupa("Camisa Polo", 150.00, "7890003", "M", "Algodão");

                tv.exibirDetalhes();
                System.out.println("---");
                livro.exibirDetalhes();
                System.out.println("---");
                camisa.exibirDetalhes();

                System.out.println("\n=====================================\n");

                // Exercício 4: Sistema de Figuras Geométricas
                Circulo circ = new Circulo(10.0);
                Retangulo ret = new Retangulo(10.0, 5.0);
                Triangulo tri = new Triangulo(10.0, 8.0, 10.0, 9.0, 9.0);

                System.out.println("--- Círculo ---");
                System.out.println("Área: " + circ.calcularArea());
                System.out.println("Perímetro: " + circ.calcularPerimetro());

                System.out.println("--- Retângulo ---");
                System.out.println("Área: " + ret.calcularArea());
                System.out.println("Perímetro: " + ret.calcularPerimetro());

                System.out.println("--- Triângulo ---");
                System.out.println("Área: " + tri.calcularArea());
                System.out.println("Perímetro: " + tri.calcularPerimetro());
            }
        }
