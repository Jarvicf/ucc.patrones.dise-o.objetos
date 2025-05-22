package Ubber.src.com.transporte.historia_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Ubber.src.com.transporte.historia_1.PerfilConductor;
import Ubber.src.com.transporte.historia_2.SolicitudViaje;

public class EstrategiaMejorCalificado implements EstrategiaSeleccionConductor{
    @Override
    public List<PerfilConductor> seleccionar(SolicitudViaje solicitud, List<PerfilConductor> conductoresDisponibles) {
        System.out.println("Aplicando estrategia: Mejor Calificado (simulado)");
        // Simulación: Ordenar por algún criterio de calificación (aquí simulado con el nombre)
        List<PerfilConductor> ordenados = new ArrayList<>(conductoresDisponibles);
        ordenados.sort(Comparator.comparing(PerfilConductor::getNombre).reversed());
        return ordenados.size() > 1 ? ordenados.subList(0, 1) : ordenados;
    }
}
