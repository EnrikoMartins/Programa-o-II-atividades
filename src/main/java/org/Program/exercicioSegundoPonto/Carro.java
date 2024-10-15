package org.Program.exercicioSegundoPonto;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String placa, String marca, double preco, int numPortas) {
        super(placa, marca, preco);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Número de Portas: " + getNumPortas());
    }

    public void mostrarDados(boolean visualizarNumPortas) {
        super.mostrarDados();

        if (visualizarNumPortas) {
            System.out.println("Numeros de Portas: " + getNumPortas());
        }

    }
}
