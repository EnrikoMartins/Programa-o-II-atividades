package org.Program.Herança;

public class Paciente extends Pessoa{

    private String doenca;

    public Paciente(String nome, int idade, String doenca) {
        super(nome, idade);
        this.doenca = doenca;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    @Override
    public void mostraDado() {
        super.mostraDado();
        System.out.println("Doença: " + getDoenca());
    }
}
