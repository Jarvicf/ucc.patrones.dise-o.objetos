package Ubber.src.com.transporte.historia_3;

import java.util.ArrayList;
import java.util.List;

import Ubber.src.com.transporte.historia_1.PerfilConductor;
import Ubber.src.com.transporte.historia_2.SolicitudViaje;

public class EstrategiaMejorDesempeno implements EstrategiaSeleccionConductor{
    @Override
    public List<PerfilConductor> seleccionar(SolicitudViaje solicitud, List<PerfilConductor> conductoresDisponibles) {
        System.out.println("Aplicando estrategia: Mejor Desempeño (simulado)");
        // Simulación: Devolver el último conductor disponible
        return conductoresDisponibles.isEmpty() ? new ArrayList<>() : List.of(conductoresDisponibles.get(conductoresDisponibles.size() - 1));
    }
}
