package org.Program.exercicioSegundoPonto;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto() {
    }

    public Moto (String placa, String marca, double preco, int cilindradas) {
        super(placa, marca, preco);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cilindradas: " + cilindradas + " cilindradas");
    }

    public void mostrarDados(boolean potenciaCavalos) {
        super.mostrarDados();

        if (potenciaCavalos) {
            System.out.println("Cavalos: " + (cilindradas / 15 ) + " vacalos");
        }
    }
}
