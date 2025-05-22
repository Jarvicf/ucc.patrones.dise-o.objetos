package Semana_15_ProyectoFinal.patrones.builder;

import java.util.ArrayList;
import java.util.List;

public class Conductores {
        private static ArrayList<PerfilConductor> conductores = new ArrayList<>();

        public static void agregarConductor(PerfilConductor conductor) {
        conductores.add(conductor);
        System.out.println("Conductor registrado: " + conductor.getNombre());
    }

    public static void listarConductores() {
        System.out.println("\n--- Lista de Conductores Registrados ---");
        for (PerfilConductor c : conductores) {
            System.out.println(c.getResumen());
        }
    }

}
