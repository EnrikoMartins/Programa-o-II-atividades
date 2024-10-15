package org.Program.exercicioSegundoPonto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuarPrograma = true;
        int resposta;
        String placa;
        String marca;
        double preco;

        List <Veiculo> veiculos = new ArrayList<>();

        while (continuarPrograma) {
            System.out.println("- Cadastramento de veiculos -");
            System.out.println("1 - Cadastar carro");
            System.out.println("2 - Cadastar moto");
            System.out.println("3 - Cadastrar caminhão");
            System.out.println("4 - sair e mostar dados cadastrados");
            System.out.println();
            System.out.println("Qual sua opção? ");
            resposta = sc.nextInt();
            sc.nextLine();

            switch (resposta) {
                case 1:
                    System.out.println("Qual a placa do possante vrum vrum? ");
                    placa = sc.nextLine();

                    System.out.println("Qual a marca do CaRrO? ");
                    marca = sc.nextLine();

                    System.out.println("Quanto custou essa caranga? ");
                    preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Esse camaro aí tem quantas portas? ");

                    int numPortas = sc.nextInt();
                    sc.nextLine();

                    Veiculo carro = new Carro(placa, marca, preco, numPortas);
                    veiculos.add(carro);
                    break;

                case 2:
                    System.out.println("Qual a placa da motoca? ");
                    placa = sc.nextLine();

                    System.out.println("Qual a marca da motinha? ");
                    marca = sc.nextLine();

                    System.out.println("Quanto custou essa bicicleta motorizada? ");
                    preco = sc.nextDouble();

                    System.out.println("Quantas cilindradas ela faz? ");
                    int cilindradas = sc.nextInt();
                    sc.nextLine();

                    Veiculo moto = new Moto(placa, marca, preco, cilindradas);
                    veiculos.add(moto);
                    break;
                case 3:
                    System.out.println("Qual a placa desse Carro de boi? ");
                    placa = sc.nextLine();

                    System.out.println("Qual a marca do Caminhinho? ");
                    marca = sc.nextLine();

                    System.out.println("Quanto custou esse caminho? ");
                    preco = sc.nextDouble();

                    System.out.println("Qual a capacidade dele? ");
                    int capacidadeCarga = sc.nextInt();
                    sc.nextLine();

                    Veiculo caminhao = new Caminhao(placa, marca, preco, capacidadeCarga);
                    veiculos.add(caminhao);
                    break;
                default:
                    for (Veiculo veiculo: veiculos) {
                        veiculo.mostrarDados();
                        System.out.println();
                    }
                    continuarPrograma = false;
                    break;
            }
        }
    }
}
