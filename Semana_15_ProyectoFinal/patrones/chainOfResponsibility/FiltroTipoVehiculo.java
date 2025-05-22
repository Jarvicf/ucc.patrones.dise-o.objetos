package Semana_15_ProyectoFinal.patrones.chainOfResponsibility;

import Semana_15_ProyectoFinal.patrones.builder.PerfilConductor;

public class FiltroTipoVehiculo  extends FiltroConductor{
    private String tipoRequerido;

    public FiltroTipoVehiculo(String tipoRequerido) {
        this.tipoRequerido = tipoRequerido;
    }
    @Override
    public boolean filtrar(PerfilConductor conductor) {
        // TODO Auto-generated method stub
        if (!conductor.getTipoVehiculo().equalsIgnoreCase(tipoRequerido)) {
            return false;
        }
        return siguiente == null || siguiente.filtrar(conductor);
    }
    
}
