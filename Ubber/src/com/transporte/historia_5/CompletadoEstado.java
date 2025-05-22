package Ubber.src.com.transporte.historia_5;

import Ubber.src.com.transporte.historia_1.PerfilConductor;
import Ubber.src.com.transporte.historia_4.Viaje;

public class CompletadoEstado implements EstadoViaje{
     @Override
    public void cancelar(Viaje viaje) {
        System.out.println("Un viaje completado no puede ser cancelado.");
    }

    @Override
    public void asignarConductor(Viaje viaje, PerfilConductor conductor) {
        System.out.println("El viaje ya ha sido completado.");
    }

    @Override
    public void iniciar(Viaje viaje) {
        System.out.println("Un viaje completado no puede ser iniciado de nuevo.");
    }

    @Override
    public void completar(Viaje viaje) {
        System.out.println("El viaje ya ha sido completado.");
    }

    @Override
    public void calificar(Viaje viaje, int calificacion) {
        System.out.println("El viaje ha sido calificado con " + calificacion + " estrellas.");
        // Aquí podríamos interactuar con el módulo de calificaciones
        viaje.getMediador().viajeCalificado(viaje, calificacion);
    }

    @Override
    public String getEstado() {
        return "Completado";
    }
}
