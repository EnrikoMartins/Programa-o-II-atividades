package org.Program.exercicio1;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Murilo", 543567, 7.0 , 5.0);
        Aluno aluno2 = new Aluno("Gustavo", 213257, 7, 7);
        Aluno aluno3 = new Aluno("David", 6765234, 3, 3);

        System.out.println("Aluno 1");
        aluno1.exibirDados();
        System.out.println();

        System.out.println("Aluno 2");
        aluno2.exibirDados();
        System.out.println();

        System.out.println("Aluno 3");
        aluno3.exibirDados();
        System.out.println();
        }

}
