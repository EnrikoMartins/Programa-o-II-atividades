package org.Program.exercicioPonto;

import java.util.Scanner;

public class Gerente {
    double salario;
    double valorVendas;

    public Gerente(double salario) {
        this.salario = salario;
    }

    public Gerente(double salario, double valorVendas) {
        this.salario = salario;
        this.valorVendas = valorVendas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double exibirSalario() {
        if (verificador() == true) {
            return getSalario() + (0.2 * getSalario());
        } else {
            return getSalario();
        }
    }

    public boolean verificador() {
        Scanner sc = new Scanner(System.in);

        char resposta;

        System.out.println("a loja bateu a quantidade de vendas do mês [S / N]?");
        resposta = sc.next().charAt(0);

        if (resposta == 's') {
            System.out.println("Valor de vendas: ");
            return true;
        } else {
            return false;
        }
    }
}