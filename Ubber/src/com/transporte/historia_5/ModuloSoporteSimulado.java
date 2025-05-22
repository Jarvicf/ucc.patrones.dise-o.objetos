package Ubber.src.com.transporte.historia_5;

import Ubber.src.com.transporte.historia_4.Viaje;

public class ModuloSoporteSimulado {
    public void registrarSolicitud(Viaje viaje) {
        System.out.println("Modulo de Soporte: Registrando la solicitud de viaje.");
    }

    public void actualizarEstado(Viaje viaje, String estado) {
        System.out.println("Modulo de Soporte: Actualizando el estado del viaje a " + estado + ".");
    }

    public void registrarCancelacion(Viaje viaje) {
        System.out.println("Modulo de Soporte: Registrando la cancelación del viaje.");
    }
}
