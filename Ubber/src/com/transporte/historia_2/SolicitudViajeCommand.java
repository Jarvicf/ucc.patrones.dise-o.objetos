package Ubber.src.com.transporte.historia_2;

import Ubber.src.com.transporte.historia_3.Command;
import Ubber.src.com.transporte.historia_3.ServicioAsignacionConductores;

public class SolicitudViajeCommand implements Command{
    private SolicitudViaje solicitud;
    private ServicioAsignacionConductores servicioAsignacion; // Aún no hemos creado esta interfaz

    public SolicitudViajeCommand(SolicitudViaje solicitud, ServicioAsignacionConductores servicioAsignacion) {
        this.solicitud = solicitud;
        this.servicioAsignacion = servicioAsignacion;
    }

    @Override
    public void ejecutar() {
        servicioAsignacion.asignarConductor(solicitud);
        System.out.println("Ejecutando la solicitud de viaje de " + solicitud.getPasajero().getNombre() +
                           " desde " + solicitud.getPuntoPartida() + " hasta " + solicitud.getDestino() +
                           " (Tipo: " + solicitud.getTipoServicio() + ")");
    }

    public SolicitudViaje getSolicitud() {
        return solicitud;
    }
}
