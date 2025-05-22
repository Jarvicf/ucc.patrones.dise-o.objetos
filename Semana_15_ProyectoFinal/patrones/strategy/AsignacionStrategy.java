package Semana_15_ProyectoFinal.patrones.strategy;

import java.util.List;

import Semana_15_ProyectoFinal.patrones.builder.PerfilConductor;
import Semana_15_ProyectoFinal.patrones.factoryMethod.SolicitudViaje;

public interface AsignacionStrategy {
        PerfilConductor seleccionarConductor(List<PerfilConductor> conductores, SolicitudViaje solicitud);
}
