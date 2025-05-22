package Ubber.src.com.transporte.historia_3;

import java.util.List;

import Ubber.src.com.transporte.historia_1.PerfilConductor;
import Ubber.src.com.transporte.historia_2.SolicitudViaje;

public class EstrategiaMasCercano implements EstrategiaSeleccionConductor{
    @Override
    public List<PerfilConductor> seleccionar(SolicitudViaje solicitud, List<PerfilConductor> conductoresDisponibles) {
        System.out.println("Aplicando estrategia: Más Cercano (simulado)");
        // Simulación: Devolver los primeros dos conductores disponibles
        return conductoresDisponibles.size() > 2 ? conductoresDisponibles.subList(0, 2) : conductoresDisponibles;
    }
}
