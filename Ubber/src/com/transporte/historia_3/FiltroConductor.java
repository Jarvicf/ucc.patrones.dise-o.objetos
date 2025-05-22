package Ubber.src.com.transporte.historia_3;

import java.util.List;

import Ubber.src.com.transporte.historia_1.PerfilConductor;
import Ubber.src.com.transporte.historia_2.SolicitudViaje;

public interface FiltroConductor {
    List<PerfilConductor> filtrar(SolicitudViaje solicitud, List<PerfilConductor> conductores);
    void setSiguienteFiltro(FiltroConductor siguienteFiltro);
} 