package Ubber.src.com.transporte.historia_3;

import java.util.List;

import Ubber.src.com.transporte.historia_1.PerfilConductor;
import Ubber.src.com.transporte.historia_2.SolicitudViaje;

public class FiltroDisponibilidad implements FiltroConductor{
    private FiltroConductor siguienteFiltro;

    @Override
    public List<PerfilConductor> filtrar(SolicitudViaje solicitud, List<PerfilConductor> conductores) {
        System.out.println("Filtrando por disponibilidad (simulado)");
        // Simulación: Devolver todos los conductores (asumimos todos están disponibles para simplificar)
        if (siguienteFiltro != null) {
            return siguienteFiltro.filtrar(solicitud, conductores);
        }
        return conductores;
    }

    @Override
    public void setSiguienteFiltro(FiltroConductor siguienteFiltro) {
        this.siguienteFiltro = siguienteFiltro;
    }
}
