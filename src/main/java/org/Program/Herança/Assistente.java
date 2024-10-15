package org.Program.Herança;

public class Assistente extends Pessoa {
    private String salario;

    public Assistente(String nome, int idade, String salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
