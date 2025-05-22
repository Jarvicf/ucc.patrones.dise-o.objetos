package Semana_15_ProyectoFinal.patrones.strategy;

import java.util.List;

import Semana_15_ProyectoFinal.patrones.builder.PerfilConductor;
import Semana_15_ProyectoFinal.patrones.factoryMethod.SolicitudViaje;

public class AsignacionPorCalificacion implements AsignacionStrategy{

    @Override
    public PerfilConductor seleccionarConductor(List<PerfilConductor> conductores, SolicitudViaje solicitud) {
        // TODO Auto-generated method stub
        PerfilConductor mejor = null;
        double mejorReputacion = 0.0;

        for (PerfilConductor c : conductores) {
            if (c.getReputacion() > mejorReputacion) {
                mejorReputacion = c.getReputacion();
                mejor = c;
            }
        }

        return mejor;
    }
    
}
