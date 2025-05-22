package Ubber.src.com.transporte.historia_5;

import Ubber.src.com.transporte.historia_1.PerfilConductor;
import Ubber.src.com.transporte.historia_4.Viaje;

public class AsignadoEstado implements EstadoViaje{
     @Override
    public void cancelar(Viaje viaje) {
        System.out.println("Viaje cancelado desde el estado Asignado.");
        viaje.setEstadoActual(new CanceladoEstado());
        viaje.getMediador().viajeCancelado(viaje);
    }

    @Override
    public void asignarConductor(Viaje viaje, PerfilConductor conductor) {
        System.out.println("El conductor ya ha sido asignado.");
    }

    @Override
    public void iniciar(Viaje viaje) {
        System.out.println("Iniciando el viaje.");
        viaje.setEstadoActual(new EnCursoEstado());
        viaje.getMediador().viajeIniciado(viaje);
    }

    @Override
    public void completar(Viaje viaje) {
        System.out.println("El viaje debe estar en curso para poder completarse.");
    }

    @Override
    public void calificar(Viaje viaje, int calificacion) {
        System.out.println("El viaje no puede calificarse hasta que se complete.");
    }

    @Override
    public String getEstado() {
        return "Asignado";
    }
}
