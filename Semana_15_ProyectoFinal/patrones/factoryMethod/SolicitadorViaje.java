package Semana_15_ProyectoFinal.patrones.factoryMethod;

public class SolicitadorViaje {
    public static SolicitudViaje crearSolicitud(String tipo, String origen, String destino, String metodoPago) {
        switch (tipo.toLowerCase()) {
            case "economico":
                return new ViajeEconomico(origen, destino, metodoPago, metodoPago, 0, 0);
            case "ejecutivo":
                return new ViajeEjecutivo(origen, destino, metodoPago, metodoPago, 0, 0);
            case "compartido":
                return new ViajeCompartido(origen, destino, metodoPago, metodoPago, 0, 0);
            default:
                throw new IllegalArgumentException("Tipo de viaje no válido");
        }
    }
}
