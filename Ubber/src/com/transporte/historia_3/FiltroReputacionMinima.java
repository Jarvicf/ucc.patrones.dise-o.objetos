package Ubber.src.com.transporte.historia_3;

import java.util.ArrayList;
import java.util.List;

import Ubber.src.com.transporte.historia_1.PerfilConductor;
import Ubber.src.com.transporte.historia_2.SolicitudViaje;

public class FiltroReputacionMinima implements FiltroConductor{
    private FiltroConductor siguienteFiltro;
    private double reputacionMinima = 4.0; // Simulación de una reputación mínima

    @Override
    public List<PerfilConductor> filtrar(SolicitudViaje solicitud, List<PerfilConductor> conductores) {
        System.out.println("Filtrando por reputación mínima (simulado)");
        List<PerfilConductor> conBuenaReputacion = new ArrayList<>();
        for (PerfilConductor conductor : conductores) {
            // Simulación: Asumimos que todos tienen buena reputación para este ejemplo
            conBuenaReputacion.add(conductor);
        }
        if (siguienteFiltro != null) {
            return siguienteFiltro.filtrar(solicitud, conBuenaReputacion);
        }
        return conBuenaReputacion;
    }

    @Override
    public void setSiguienteFiltro(FiltroConductor siguienteFiltro) {
        this.siguienteFiltro = siguienteFiltro;
    }
}
