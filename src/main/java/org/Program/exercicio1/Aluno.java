package org.Program.exercicio1;

public class Aluno {
        String nome;
        int matricula;
        double nota1;
        double nota2;

        public Aluno(String nome, int matricula, double nota1, double nota2) {
                this.nome = nome;
                this.matricula = matricula;
                this.nota1 = nota1;
                this.nota2 = nota2;
        }
        public void calcularMedia() {
                double media = (nota1 + nota2) / 2;

                System.out.println("A média é: " + media);

                if (media >= 7.0) {
                        System.out.println("APROVADO");
                } else if (media < 3) {
                        System.out.println("REPROVADO");
                } else {
                        System.out.println("FINAL");
                }
        }
        public void exibirDados() {
                System.out.printf("O nome do aluno é: %s%n", nome);
                System.out.printf("A matricula é: %d%n", matricula);
                System.out.println("As notas são " + nota1 + " e " + nota2);
                calcularMedia();
        }


}

