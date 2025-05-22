package Semana_15_ProyectoFinal.patrones.strategy;

import java.util.List;

import Semana_15_ProyectoFinal.patrones.builder.PerfilConductor;
import Semana_15_ProyectoFinal.patrones.factoryMethod.SolicitudViaje;

public class AsignacionPorProximidad implements AsignacionStrategy{

    @Override
    public PerfilConductor seleccionarConductor(List<PerfilConductor> conductores, SolicitudViaje solicitud) {
        // TODO Auto-generated method stub
        PerfilConductor seleccionado = null;
        double distanciaMinima = Double.MAX_VALUE;    
    
        for (PerfilConductor c : conductores) {
            double distancia = Math.sqrt(Math.pow(c.getLatitud() - solicitud.getLatitudOrigen(), 2) +
                                         Math.pow(c.getLongitud() - solicitud.getLongitudOrigen(), 2));
            if (distancia < distanciaMinima) {
                distanciaMinima = distancia;
                seleccionado = c;
            }
        }

        return seleccionado;
    }
    
}
