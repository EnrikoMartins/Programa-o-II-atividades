package org.Program.exercicioHerança;

public class Produto {
    private String codigo;
    private String nome;
    private double preco;

    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarDados() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + "R$" + getPreco());
    }

    public void mostrarDados(double desconto) {
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + (getPreco() - desconto));
    }
}
