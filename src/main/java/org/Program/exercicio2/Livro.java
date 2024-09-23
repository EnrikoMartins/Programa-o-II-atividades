package org.Program.exercicio2;

public class Livro {
    String titulo;
    String autor;
    int quantPag;
    boolean emprestado;

    public void emprestar() {
        emprestado = true;
    }

    public void devolver() {
        emprestado = false;
    }

    public void exibirInformacoes() {
        System.out.println("Título " + titulo);
        System.out.println(autor);
        System.out.println(quantPag);
        System.out.println(emprestado);
    }
}
