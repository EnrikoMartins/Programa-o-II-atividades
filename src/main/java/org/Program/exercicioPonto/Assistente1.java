package org.Program.exercicioPonto;

public class Assistente1 {
    private double salario;

    public Assistente1(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;

}
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double exibirSalario() {
        return getSalario();
    }
}
