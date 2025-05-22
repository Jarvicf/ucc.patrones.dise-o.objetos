package Ubber.src.com.transporte.historia_5;

import Ubber.src.com.transporte.historia_4.Viaje;
import Ubber.src.com.transporte.historia_6.FacturaFacade;

public class MediadorViajeImpl implements MediadorViaje {
    private ModuloPagosSimulado moduloPagos;
    private ModuloCalificacionesSimulado moduloCalificaciones;
    private ModuloNotificacionesSimulado moduloNotificaciones;
    private ModuloSoporteSimulado moduloSoporte;
    private FacturaFacade facturaFacade;


    public MediadorViajeImpl() {
        this.moduloPagos = new ModuloPagosSimulado();
        this.moduloCalificaciones = new ModuloCalificacionesSimulado();
        this.moduloNotificaciones = new ModuloNotificacionesSimulado();
        this.moduloSoporte = new ModuloSoporteSimulado();
        this.facturaFacade = new FacturaFacade();
    }

    @Override
    public void viajeSolicitado(Viaje viaje) {
        moduloSoporte.registrarSolicitud(viaje);
        moduloNotificaciones.notificarSolicitud(viaje);
        moduloPagos.autorizarPago(viaje); // Simulación de autorización al solicitar
    }

    @Override
    public void viajeAsignado(Viaje viaje) {
        moduloNotificaciones.notificarAsignacion(viaje);
        moduloSoporte.actualizarEstado(viaje, viaje.obtenerEstadoActual());
    }

    @Override
    public void viajeIniciado(Viaje viaje) {
        moduloNotificaciones.notificarInicio(viaje);
        moduloSoporte.actualizarEstado(viaje, viaje.obtenerEstadoActual());
    }

    @Override
    public void viajeCompletado(Viaje viaje) {
        moduloNotificaciones.notificarCompletado(viaje);
        moduloCalificaciones.permitirCalificacion(viaje);
        moduloPagos.procesarPagoFinal(viaje);
        moduloSoporte.actualizarEstado(viaje, viaje.obtenerEstadoActual());
        facturaFacade.generarYAlmacenarFactura(viaje);
    }

    @Override
    public void viajeCancelado(Viaje viaje) {
        moduloNotificaciones.notificarCancelacion(viaje);
        moduloPagos.reembolsarPago(viaje);
        moduloSoporte.registrarCancelacion(viaje);
        moduloSoporte.actualizarEstado(viaje, viaje.obtenerEstadoActual());
    }

    @Override
    public void viajeCalificado(Viaje viaje, int calificacion) {
        moduloCalificaciones.registrarCalificacion(viaje, calificacion);
    }
}
