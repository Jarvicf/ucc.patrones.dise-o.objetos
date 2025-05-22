package Ubber.src.com.transporte.historia_5;

import Ubber.src.com.transporte.historia_4.Viaje;

public class ModuloCalificacionesSimulado {
     public void permitirCalificacion(Viaje viaje) {
        System.out.println("Modulo de Calificaciones: Permitiendo calificación para el viaje.");
    }

    public void registrarCalificacion(Viaje viaje, int calificacion) {
        System.out.println("Modulo de Calificaciones: Calificación registrada - " + calificacion + " estrellas.");
    }
}
