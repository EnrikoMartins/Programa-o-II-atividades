package org.Program.exercicio5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do produto? ");
        String nome = sc.nextLine();

        System.out.println("Qual a descrição do produto? ");
        String descricao = sc.nextLine();

        System.out.println("Quanto o " + nome + " custa? $");
        Double preco = sc.nextDouble();

        System.out.println("Quantos você irá comprar? ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, descricao, preco);
        Pedido pedido = new Pedido(produto, quantidade);

        pedido.exibirDados();
    }
}
