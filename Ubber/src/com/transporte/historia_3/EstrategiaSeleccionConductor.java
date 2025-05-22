package Ubber.src.com.transporte.historia_3;

import java.util.List;

import Ubber.src.com.transporte.historia_1.PerfilConductor;
import Ubber.src.com.transporte.historia_2.SolicitudViaje;

public interface EstrategiaSeleccionConductor {
        List<PerfilConductor> seleccionar(SolicitudViaje solicitud, List<PerfilConductor> conductoresDisponibles);
}
