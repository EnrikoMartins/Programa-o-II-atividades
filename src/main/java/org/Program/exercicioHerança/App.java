package org.Program.exercicioHerança;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Eletronico eletronico = new Eletronico("E123", "Smartphone", 2500.0, 24);
        Vestuario vestuario = new Vestuario("V456", "Camiseta", 50.0, "M", "Azul");
        Alimento alimento = new Alimento("A789", "Leite", 4.5, "12/10/2024");


        System.out.println("Dados do Eletrônico: ");
        eletronico.mostrarDados();

        System.out.println();
        System.out.println("Dados do Vestuário: ");
        vestuario.mostrarDados();

        System.out.println();
        System.out.println("Dados do Alimento: ");
        alimento.mostrarDados();

        System.out.println();
        System.out.println("Dados do Eletrônico com Garantia em Anos:");
        eletronico.mostrarDados(true);

        System.out.println();
        System.out.println("Dados do Vestuário sem Cor:");
        vestuario.mostrarDados(false);

        System.out.println();
        System.out.println("Dados do Alimento com Alerta de Validade:");
        alimento.mostrarDados(true);
    }
}
