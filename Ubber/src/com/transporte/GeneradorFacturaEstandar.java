package Ubber.src.com.transporte;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Ubber.src.com.transporte.historia_4.Viaje;
import Ubber.src.com.transporte.historia_6.GeneradorFactura;

public class GeneradorFacturaEstandar extends GeneradorFactura {
    private static final double TARIFA_BASE_KM = 0.85; // $0.85 por kilómetro simulado
    private static final double IMPUESTO_IVA = 0.19;  // 19% de IVA
    private static final double TASA_SERVICIO = 0.05; // 5% de tasa de servicio

     @Override
    protected double calcularTarifaBase(Viaje viaje) {
        // Simulación: La tarifa base podría depender de la distancia o tiempo del viaje
        // Para este ejemplo, simularemos una distancia fija para simplificar
        double distanciaSimulada = 10.0; // km
        double tarifaCalculada = distanciaSimulada * TARIFA_BASE_KM;
        System.out.println("  [GeneradorFacturaEstandar] Tarifa base calculada: $" + String.format("%.2f", tarifaCalculada));
        return tarifaCalculada;
    }

    @Override
    protected double aplicarDescuentosImpuestos(double tarifaBase, Viaje viaje) {
        double impuestos = tarifaBase * IMPUESTO_IVA;
        double tasaServicio = tarifaBase * TASA_SERVICIO;
        double total = tarifaBase + impuestos + tasaServicio;

        System.out.println("  [GeneradorFacturaEstandar] IVA (" + (IMPUESTO_IVA * 100) + "%): $" + String.format("%.2f", impuestos));
        System.out.println("  [GeneradorFacturaEstandar] Tasa de Servicio (" + (TASA_SERVICIO * 100) + "%): $" + String.format("%.2f", tasaServicio));
        System.out.println("  [GeneradorFacturaEstandar] Total con impuestos y tasas: $" + String.format("%.2f", total));
        return total;
    }

    @Override
    protected String generarContenidoFactura(Viaje viaje, double total) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaActual = now.format(formatter);

        StringBuilder contenido = new StringBuilder();
        contenido.append("--- FACTURA DE SERVICIO DE TRANSPORTE ---\n");
        contenido.append("Fecha de Emisión: ").append(fechaActual).append("\n");
        contenido.append("Pasajero: ").append(viaje.getPasajero().getNombre()).append("\n");
        contenido.append("Conductor: ").append(viaje.getConductor() != null ? viaje.getConductor().getNombre() + " " + viaje.getConductor().getApellido() : "No asignado").append("\n");
        //contenido.append("Origen: ").append(viaje.getSolicitudViaje().ubicacionActual).append("\n");
        //contenido.append("Destino: ").append(viaje.getSolicitudViaje().getDireccionDestino()).append("\n");
        contenido.append("----------------------------------------\n");
        contenido.append("Tarifa Base: $").append(String.format("%.2f", calcularTarifaBase(viaje))).append("\n");
        contenido.append("IVA (").append(String.format("%.0f", IMPUESTO_IVA * 100)).append("%): $").append(String.format("%.2f", calcularTarifaBase(viaje) * IMPUESTO_IVA)).append("\n");
        contenido.append("Tasa de Servicio (").append(String.format("%.0f", TASA_SERVICIO * 100)).append("%): $").append(String.format("%.2f", calcularTarifaBase(viaje) * TASA_SERVICIO)).append("\n");
        contenido.append("----------------------------------------\n");
        contenido.append("TOTAL A PAGAR: $").append(String.format("%.2f", total)).append("\n");
        //contenido.append("Método de Pago: ").append(viaje.getSolicitudViaje().getMedioPago()).append("\n");
        contenido.append("¡Gracias por viajar con nosotros!\n");
        return contenido.toString();
    }

}
