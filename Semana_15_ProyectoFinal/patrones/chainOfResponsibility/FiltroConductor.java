package Semana_15_ProyectoFinal.patrones.chainOfResponsibility;

import Semana_15_ProyectoFinal.patrones.builder.PerfilConductor;

public abstract class FiltroConductor {
    protected FiltroConductor siguiente;

    public void setSiguiente(FiltroConductor siguiente) {
        this.siguiente = siguiente;
    }

    public abstract boolean filtrar(PerfilConductor conductor);
}
