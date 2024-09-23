package org.Program.exercicio3;

public class ContaDoBanco {

    private String nome;
    private int numeroDaConta;
    private double saldo;

    public ContaDoBanco() {
    }

    public ContaDoBanco(String nome, int numeroDaConta, double saldo) {
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
