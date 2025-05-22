package Semana_15_ProyectoFinal.patrones.factoryMethod;

public abstract class SolicitudViaje {
    protected String origen;
    protected String destino;
    protected String metodoPago;
    private String tipoVehiculo;
    private double latitudOrigen;
    private double longitudOrigen;

    public SolicitudViaje(String origen, String destino, String metodoPago,String tipoVehiculo, double latitudOrigen, double longitudOrigen) {
        this.origen = origen;
        this.destino = destino;
        this.metodoPago = metodoPago;
         this.tipoVehiculo = tipoVehiculo;
        this.latitudOrigen = latitudOrigen;
        this.longitudOrigen = longitudOrigen;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public double getLatitudOrigen() {
        return latitudOrigen;
    }

    public double getLongitudOrigen() {
        return longitudOrigen;
    }
    public abstract void mostrarDetalles();

}
