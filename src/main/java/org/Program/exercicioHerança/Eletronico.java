package org.Program.exercicioHerança;


public class Eletronico extends Produto{
    private int garantia;

    public Eletronico(String codigo, String nome, double preco, int garantia) {
        super(codigo, nome, preco);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Garantia: " + getGarantia() + "meses");
    }

    public void mostrarDados(boolean garantiaAnos) {
        super.mostrarDados();
        if (garantiaAnos) {
            System.out.println("Garantia: " + (getGarantia() / 12) + "anos");
        }

    }
}
