package Ubber.src.com.transporte.historia_3;

import java.util.ArrayList;
import java.util.List;

import Ubber.src.com.transporte.historia_1.PerfilConductor;
import Ubber.src.com.transporte.historia_2.SolicitudViaje;

public class FiltroCompatibilidadVehiculo implements FiltroConductor {
    private FiltroConductor siguienteFiltro;

    @Override
    public List<PerfilConductor> filtrar(SolicitudViaje solicitud, List<PerfilConductor> conductores) {
        System.out.println("Filtrando por compatibilidad de vehículo (simulado)");
        List<PerfilConductor> compatibles = new ArrayList<>();
        for (PerfilConductor conductor : conductores) {
            // Simulación: Permitir todos los vehículos para este ejemplo
            compatibles.add(conductor);
        }
        if (siguienteFiltro != null) {
            return siguienteFiltro.filtrar(solicitud, compatibles);
        }
        return compatibles;
    }

    @Override
    public void setSiguienteFiltro(FiltroConductor siguienteFiltro) {
        this.siguienteFiltro = siguienteFiltro;
    }
}
