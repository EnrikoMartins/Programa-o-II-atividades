package org.Program.exercicio4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome da pessoa 1? ");
        String nome = sc.nextLine();

        System.out.println("Qual a idade da pessoa 1? ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Qual a profissão da primeira pessoa? ");
        String profissao = sc.nextLine();

        Pessoa pessoa1 = new Pessoa(nome, idade, profissao);

        System.out.println("Qual o nome da pessoa 1? ");
        nome = sc.nextLine();

        System.out.println("Qual a idade da pessoa 1? ");
        idade = sc.nextInt();

        System.out.println("Qual a profissão da primeira pessoa? ");
        profissao = sc.nextLine();

        Pessoa pessoa2 = new Pessoa(nome, idade, profissao);

        System.out.println("olá " + pessoa1.getNome() + " você tem " + pessoa1.getIdade() + " e é " + pessoa1.getProfissao());
    }
}
