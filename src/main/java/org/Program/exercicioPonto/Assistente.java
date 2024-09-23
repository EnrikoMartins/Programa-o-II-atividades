package org.Program.exercicioPonto;

public class Assistente {
    private double salario;

    public Assistente(double salario) {
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
