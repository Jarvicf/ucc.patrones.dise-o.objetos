package Semana_15_ProyectoFinal;

import java.util.ArrayList;
import java.util.List;

import Semana_15_ProyectoFinal.patrones.builder.PerfilConductor;


public class RegistroConductores {
     public static List<PerfilConductor> registrarConductores() {
        List<PerfilConductor> lista = new ArrayList<>();

        PerfilConductor juan = new PerfilConductor.Builder()
            .setNombre("Juan")
            .setVehiculo("economico")
            .setPolizaSeguro("12ab")
            .setTipoLicencia("B2")
            .build();         
      
        lista.add(juan);
        return lista;
    }
}
