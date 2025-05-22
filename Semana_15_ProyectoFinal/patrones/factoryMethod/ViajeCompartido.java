package Semana_15_ProyectoFinal.patrones.factoryMethod;

public class ViajeCompartido  extends SolicitudViaje{

    public ViajeCompartido(String origen, String destino, String metodoPago, String tipoVehiculo, double latitudOrigen, double longitudOrigen) {
        super(origen, destino, metodoPago, metodoPago, latitudOrigen, latitudOrigen);
    }
    @Override
    public void mostrarDetalles() {
        // TODO Auto-generated method stub
        System.out.println("Viaje COMPARTIDO de " + origen + " a " + destino + ", pago: " + metodoPago);
    }
    
}
