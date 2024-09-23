package org.Program.exercicioPonto;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        String categoriaFuncionario;
        double salario;

        System.out.println("Nome: ");
        nome = sc.nextLine();

        System.out.println("Profissão (gerente / vendedor / assistente): ");
        categoriaFuncionario= sc.nextLine();

        System.out.println("Salario: ");
        salario = sc.nextDouble();

        if (Objects.equals(categoriaFuncionario, "gerente")) {
            Gerente gerente = new Gerente(salario);
            gerente.exibirSalario();
        } else if (Objects.equals(categoriaFuncionario, "vendedor")) {
            System.out.println("Valor total realizado: ");
            double valorRealizado = sc.nextDouble();
            Vendedor vendedor = new Vendedor(salario, valorRealizado);

            System.out.println("Salário Total: " + vendedor.exibirSalario());
        } else if (Objects.equals(categoriaFuncionario, "assistente")) {
            Assistente assistente = new Assistente(salario);

            System.out.println("Salário Total: " + assistente.exibirSalario());
        } else {
            System.out.println("Categoria não encontrada...");
        }


    }
}
