package org.Program.exercicioHerança;

public class Vestuario extends Produto{
    private String tamanho;
    private String cor;

    public Vestuario(String codigo, String nome, double preco, String tamanho, String cor) {
        super(codigo, nome, preco);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tamanho: " + getTamanho());
        System.out.println("Cor: " + getCor());
    }

    public void mostrarDados(boolean informacaoCor) {
        super.mostrarDados();
        System.out.println("Tamanho: " + getTamanho());

        if (informacaoCor) {
            System.out.println("Cor: " + getCor());
        }


    }
}
