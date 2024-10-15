package org.Program.Herança;

import org.Program.exercicioPonto.Assistente1;

public class App {
    public static void main(String[] args) {
        Medico medico = new Medico("Maria", 45, "Cardiologista");

        medico.mostraDado();

        Paciente paciente = new Paciente("Murilo", 21, "PNEUMOULTRAMICROSCOPICOSSILICOVULCANOCONIOSE");

        paciente.mostraDado();

        Assistente assistente = new Assistente("Enriko", 19, "menos que o médico");
    }
}
