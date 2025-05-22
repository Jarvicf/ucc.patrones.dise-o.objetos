package Ubber.src.com.transporte.historia_2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import Ubber.src.com.transporte.Pasajero;

public class SolicitudViajeFactory {
    private Map<String, Supplier<SolicitudViaje>> tipoServicioMap = new HashMap<>();

    public SolicitudViajeFactory() {
        register("ECONOMICO", ViajeEconomico::new);
        register("EJECUTIVO", ViajeEjecutivo::new);
        register("COMPARTIDO", ViajeCompartido::new);
    }
    public void register(String tipo, Supplier<SolicitudViaje> constructor) {
        tipoServicioMap.put(tipo.toUpperCase(), constructor);
    }

    public SolicitudViaje crearSolicitud(String tipo, String puntoPartida, String destino, String metodoPago, Pasajero pasajero) {
        Supplier<SolicitudViaje> constructor = tipoServicioMap.get(tipo.toUpperCase());
        if (constructor == null) {
            throw new IllegalArgumentException("Tipo de servicio desconocido: " + tipo);
        }
        SolicitudViaje solicitud = constructor.get();
        solicitud.setPuntoPartida(puntoPartida);
        solicitud.setDestino(destino);
        solicitud.setMetodoPago(metodoPago);
        solicitud.setPasajero(pasajero);
        return solicitud;
    }

}
