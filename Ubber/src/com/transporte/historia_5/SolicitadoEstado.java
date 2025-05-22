package Ubber.src.com.transporte.historia_5;

import Ubber.src.com.transporte.historia_1.PerfilConductor;
import Ubber.src.com.transporte.historia_4.Viaje;

public class SolicitadoEstado implements EstadoViaje{
    
     @Override
    public void cancelar(Viaje viaje) {
        System.out.println("Viaje cancelado desde el estado Solicitado.");
        viaje.setEstadoActual(new CanceladoEstado());
        viaje.getMediador().viajeCancelado(viaje);
    }

    @Override
    public void asignarConductor(Viaje viaje, PerfilConductor conductor) {
        System.out.println("Conductor asignado al viaje.");
        viaje.setConductor(conductor);
        viaje.setEstadoActual(new AsignadoEstado());
        viaje.getMediador().viajeAsignado(viaje);
    }

    @Override
    public void iniciar(Viaje viaje) {
        System.out.println("El viaje no puede iniciarse desde el estado Solicitado. Debe ser asignado primero.");
    }

    @Override
    public void completar(Viaje viaje) {
        System.out.println("El viaje no puede completarse desde el estado Solicitado.");
    }

    @Override
    public void calificar(Viaje viaje, int calificacion) {
        System.out.println("El viaje no puede calificarse desde el estado Solicitado.");
    }

    @Override
    public String getEstado() {
        return "Solicitado";
    }
}
