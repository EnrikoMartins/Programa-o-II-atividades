package org.Program.exercicio5;

public class Pedido {
    private Produto produto;
    private int quantidade;

    public Pedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularPreco() {
        return quantidade * produto.getPreco();
    }

    public void exibirDados() {
        System.out.println("----------- RECIBO -----------");
        System.out.println("NOME: " + produto.getNome());
        System.out.println("DESCRIÇÃO: " + produto.getDescricao());
        System.out.println("QUANTIDADE: " + this.quantidade);
        System.out.println("PRECO POR UNIDADE: " + produto.getPreco());
        System.out.println("------------------------------");
        System.out.println("TOTAL: $" + this.calcularPreco());
    }
}
