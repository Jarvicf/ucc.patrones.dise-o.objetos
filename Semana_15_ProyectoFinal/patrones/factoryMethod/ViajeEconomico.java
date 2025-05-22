package Semana_15_ProyectoFinal.patrones.factoryMethod;

public class ViajeEconomico extends SolicitudViaje{

    public ViajeEconomico(String origen, String destino, String metodoPago,String tipoVehiculo, double latitudOrigen, double longitudOrigen) {
        super(origen, destino, metodoPago, tipoVehiculo, longitudOrigen, longitudOrigen);
    }

    @Override
    public void mostrarDetalles() {
        // TODO Auto-generated method stub
        System.out.println("Viaje ECONÓMICO de " + origen + " a " + destino + ", pago: " + metodoPago);
    }
    
}
