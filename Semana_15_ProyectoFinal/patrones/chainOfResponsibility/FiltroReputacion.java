package Semana_15_ProyectoFinal.patrones.chainOfResponsibility;

import Semana_15_ProyectoFinal.patrones.builder.PerfilConductor;

public class FiltroReputacion  extends FiltroConductor{
    private double reputacionMinima;

    public FiltroReputacion(double reputacionMinima) {
        this.reputacionMinima = reputacionMinima;
    }

    @Override
    public boolean filtrar(PerfilConductor conductor) {
        // TODO Auto-generated method stub
        if (conductor.getReputacion() < reputacionMinima) {
            return false;
        }
        return siguiente == null || siguiente.filtrar(conductor);   
    }    
}
