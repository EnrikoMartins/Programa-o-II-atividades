package org.Program.exercicio3;

public class ContaCorrente extends ContaDoBanco{
    private double emprestimo;
    public ContaCorrente(String nome, int numeroDaConta, double saldo) {
        super(nome, numeroDaConta, saldo);
    }
    public double getEprestimo() {
        return emprestimo;
    }
    public void setEmprestimo(double valor) {
        emprestimo = valor;
    }
}
