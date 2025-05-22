package Ubber.src.com.transporte.historia_5;

import Ubber.src.com.transporte.historia_1.PerfilConductor;
import Ubber.src.com.transporte.historia_4.Viaje;

public interface EstadoViaje {
    void cancelar(Viaje viaje);
    void asignarConductor(Viaje viaje, PerfilConductor conductor);
    void iniciar(Viaje viaje);
    void completar(Viaje viaje);
    void calificar(Viaje viaje, int calificacion);
    String getEstado();
}
