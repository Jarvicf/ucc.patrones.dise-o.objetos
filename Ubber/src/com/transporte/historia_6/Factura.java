package Ubber.src.com.transporte.historia_6;

public class Factura {
    private String id; 
    private String pasajeroNombre;
    private String contenido; // Detalles del viaje, costo, tasas, etc.
    private double montoTotal;
    private String metodoPago;
    private long fechaEmision; 

    public Factura(String pasajeroNombre, String contenido, double montoTotal, String metodoPago) {
        this.id = "FACT-" + System.currentTimeMillis(); // Generar un ID simple
        this.pasajeroNombre = pasajeroNombre;
        this.contenido = contenido;
        this.montoTotal = montoTotal;
        this.metodoPago = metodoPago;
        this.fechaEmision = System.currentTimeMillis();
    }
    // Getters para acceder a la información de la factura
    public String getId() {
        return id;
    }

    public String getPasajeroNombre() {
        return pasajeroNombre;
    }

    public String getContenido() {
        return contenido;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public long getFechaEmision() {
        return fechaEmision;
    }

    // Opcional: un método toString para una representación fácil
    @Override
    public String toString() {
        return "Factura [ID=" + id + ", Pasajero=" + pasajeroNombre + ", Monto=$" + String.format("%.2f", montoTotal) +
               ", Método de Pago=" + metodoPago + ", Fecha Emisión=" + new java.util.Date(fechaEmision) + "]";
    }
}
