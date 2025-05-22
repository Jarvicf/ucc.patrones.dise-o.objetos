package Ubber.src.com.transporte.historia_5;

import Ubber.src.com.transporte.historia_1.PerfilConductor;
import Ubber.src.com.transporte.historia_4.Viaje;

public class CanceladoEstado implements EstadoViaje{
    @Override
    public void cancelar(Viaje viaje) {
        System.out.println("El viaje ya ha sido cancelado.");
    }

    @Override
    public void asignarConductor(Viaje viaje, PerfilConductor conductor) {
        System.out.println("Un viaje cancelado no puede tener un conductor asignado.");
    }

    @Override
    public void iniciar(Viaje viaje) {
        System.out.println("Un viaje cancelado no puede ser iniciado.");
    }

    @Override
    public void completar(Viaje viaje) {
        System.out.println("Un viaje cancelado no puede ser completado.");
    }

    @Override
    public void calificar(Viaje viaje, int calificacion) {
        System.out.println("Un viaje cancelado no puede ser calificado.");
    }

    @Override
    public String getEstado() {
        return "Cancelado";
    }
}
