package Semana_15_ProyectoFinal.patrones.chainOfResponsibility;

import Semana_15_ProyectoFinal.patrones.builder.PerfilConductor;

public class FiltroSeguro extends FiltroConductor{

    @Override
    public boolean filtrar(PerfilConductor conductor) {
        // TODO Auto-generated method stub
        if (!conductor.tieneSeguro()) {
            return false;
        }
        return siguiente == null || siguiente.filtrar(conductor);    
    }    
}
