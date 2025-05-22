package Ubber.src.com.transporte.historia_5;

import Ubber.src.com.transporte.historia_4.Viaje;

public class ModuloNotificacionesSimulado {
    public void notificarSolicitud(Viaje viaje) {
        System.out.println("Modulo de Notificaciones: Notificando a conductores disponibles sobre la nueva solicitud.");
    }

    public void notificarAsignacion(Viaje viaje) {
        System.out.println("Modulo de Notificaciones: Notificando a " + viaje.getPasajero().getNombre() + " y al conductor sobre la asignación.");
    }

    public void notificarInicio(Viaje viaje) {
        System.out.println("Modulo de Notificaciones: Notificando a " + viaje.getPasajero().getNombre() + " que el viaje ha comenzado.");
    }

    public void notificarCompletado(Viaje viaje) {
        System.out.println("Modulo de Notificaciones: Notificando a " + viaje.getPasajero().getNombre() + " que el viaje ha finalizado.");
    }

    public void notificarCancelacion(Viaje viaje) {
        System.out.println("Modulo de Notificaciones: Notificando a " + viaje.getPasajero().getNombre() + " y al conductor sobre la cancelación.");
    }
}
