package org.Program.exercicio2;

public class App {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = "Como desenhar";
        livro.autor = "Eu mesmo";
        livro.quantPag = 1;

        livro.exibirInformacoes();

        System.out.println();

        livro.emprestar();

        livro.exibirInformacoes();

        System.out.println();

        livro.devolver();

        livro.exibirInformacoes();
    }
}
