package Semana_11_Patrones_Facade_Proxy_Flyweight.Ejercicios.Facade;

public class FacadeReservaHotel {
    private ISistemaReservas reservas;
    private ISistemaPagos pagos;
    private ISistemaFacturacion facturacion;
 
    public FacadeReservaHotel() {
        this.reservas = new SistemaReservas();
        this.pagos = new SistemaPagos();
        this.facturacion = new SistemaFacturacion();
    }
 
    public void reservar() {
        reservas.verificarDisponibilidad();
        pagos.procesarPago();
        facturacion.generarFactura();
        System.out.println("Reserva completada.");
    }
}
