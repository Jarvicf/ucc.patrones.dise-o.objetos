package Ubber.src.com.transporte.historia_6;

import Ubber.src.com.transporte.historia_4.Viaje;

public abstract class GeneradorFactura {
     public final Factura generarFactura(Viaje viaje) {
        double tarifaBase = calcularTarifaBase(viaje);
        double totalConDescuentosImpuestos = aplicarDescuentosImpuestos(tarifaBase, viaje);
        String contenidoFactura = generarContenidoFactura(viaje, totalConDescuentosImpuestos);
        
        Factura factura = new Factura(viaje.getPasajero().getNombre(), contenidoFactura, totalConDescuentosImpuestos,"Efectivo");
        
        postProcesarFactura(factura, viaje); 
        
        System.out.println("Factura generada para el viaje de " + viaje.getPasajero().getNombre() + " - Total: $" + String.format("%.2f", totalConDescuentosImpuestos));
        return factura;
    }

    // Métodos primitivos abstractos que deben ser implementados por las subclases
    protected abstract double calcularTarifaBase(Viaje viaje);
    protected abstract double aplicarDescuentosImpuestos(double tarifaBase, Viaje viaje);
    protected abstract String generarContenidoFactura(Viaje viaje, double total);

    protected void postProcesarFactura(Factura factura, Viaje viaje) {
    }
}
