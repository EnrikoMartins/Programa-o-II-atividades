package org.Program.exercicioHerança;

public class Alimento extends Produto{
    private String dataValidade;

    public Alimento(String codigo, String nome, double preco, String dataValidade) {
        super(codigo, nome, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Data de validade: " + getDataValidade());
    }

    public void mostrarDados(boolean validadeProxima) {
        super.mostrarDados();
        System.out.println("Ainda da pá comer, mas é melhor se apressar :D");
    }
}
