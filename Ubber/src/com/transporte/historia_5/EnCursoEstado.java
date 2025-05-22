package Ubber.src.com.transporte.historia_5;

import Ubber.src.com.transporte.historia_1.PerfilConductor;
import Ubber.src.com.transporte.historia_4.Viaje;

public class EnCursoEstado implements EstadoViaje{
    @Override
    public void cancelar(Viaje viaje) {
        System.out.println("El viaje no puede cancelarse mientras está en curso. Contacte a soporte.");
    }

    @Override
    public void asignarConductor(Viaje viaje, PerfilConductor conductor) {
        System.out.println("El conductor ya ha sido asignado y el viaje está en curso.");
    }

    @Override
    public void iniciar(Viaje viaje) {
        System.out.println("El viaje ya está en curso.");
    }

    @Override
    public void completar(Viaje viaje) {
        System.out.println("Completando el viaje.");
        viaje.setEstadoActual(new CompletadoEstado());
        viaje.getMediador().viajeCompletado(viaje);
    }

    @Override
    public void calificar(Viaje viaje, int calificacion) {
        System.out.println("El viaje no puede calificarse hasta que se complete.");
    }

    @Override
    public String getEstado() {
        return "EnCurso";
    }
}
