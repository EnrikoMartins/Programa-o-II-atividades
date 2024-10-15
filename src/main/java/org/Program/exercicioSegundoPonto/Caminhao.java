package org.Program.exercicioSegundoPonto;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao() {
    }

    public Caminhao(String placa, String marca, double preco, double capacidadeCarga) {
        super(placa, marca, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Capacidade de carga(T): " + getCapacidadeCarga() + " T");
    }

    public void mostrarDados(boolean capacidadeKg) {
        super.mostrarDados();
        if (capacidadeKg) {
            System.out.println("Capacidade de carga(Kg): " + (getCapacidadeCarga() * 1000) + " Kg");
        }
    }
}
