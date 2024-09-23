package org.Program.exercicioPonto;

public class Vendedor {
    private double salario;
    private double valorRealizado;

    public Vendedor(double salario, double valorRealizado) {
        this.salario = salario;
        this.valorRealizado = valorRealizado;
    }

    public double getSalario() {
        return salario + 5/100 * getValorRealizado();
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorRealizado() {
        return valorRealizado;
    }

    public void setValorRealizado(double valorRealizado) {
        this.valorRealizado = valorRealizado;
    }
    public double exibirSalario() {
        return getSalario() + (0.05 * getValorRealizado());
    }
}
