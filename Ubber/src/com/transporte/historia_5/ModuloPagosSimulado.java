package Ubber.src.com.transporte.historia_5;

import Ubber.src.com.transporte.historia_4.Viaje;

public class ModuloPagosSimulado {
     public void autorizarPago(Viaje viaje) {
        System.out.println("Modulo de Pagos: Pago autorizado para el viaje de " + viaje.getPasajero().getNombre());
    }

    public void reembolsarPago(Viaje viaje) {
        System.out.println("Modulo de Pagos: Pago reembolsado para el viaje de " + viaje.getPasajero().getNombre());
    }

    public void procesarPagoFinal(Viaje viaje) {
        System.out.println("Modulo de Pagos: Pago final procesado para el viaje de " + viaje.getPasajero().getNombre());
    }
}
