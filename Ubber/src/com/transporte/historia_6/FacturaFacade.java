package Ubber.src.com.transporte.historia_6;

import Ubber.src.com.transporte.GeneradorFacturaEstandar;
import Ubber.src.com.transporte.historia_4.Viaje;

public class FacturaFacade {
     private final RepositorioFacturasSimulado repositorioFacturas;
    private final ServicioEnvioCorreoSimulado servicioEnvioCorreo;
    private final GeneradorFactura generadorFactura; // Usamos la abstracción del Template Method

    public FacturaFacade() {
        this.repositorioFacturas = new RepositorioFacturasSimulado();
        this.servicioEnvioCorreo = new ServicioEnvioCorreoSimulado();
        this.generadorFactura = new GeneradorFacturaEstandar(); // Podría ser inyectado o seleccionado dinámicamente
    }

    // Método principal para generar una factura
    public Factura generarYAlmacenarFactura(Viaje viaje) {
        System.out.println("\n[FacturaFacade] Iniciando generación y almacenamiento de factura...");
        Factura factura = generadorFactura.generarFactura(viaje);
        repositorioFacturas.guardarFactura(factura);
        System.out.println("[FacturaFacade] Factura " + factura.getId() + " generada y almacenada con éxito.");
        return factura;
    }

    // Métodos para las operaciones de alto nivel que el Facade expone
    public Factura consultarFactura(String idFactura) {
        System.out.println("\n[FacturaFacade] Consultando factura " + idFactura + "...");
        return repositorioFacturas.obtenerFactura(idFactura);
    }

    public void reenviarFactura(String idFactura, String emailDestino) {
        System.out.println("\n[FacturaFacade] Reenviando factura " + idFactura + " a " + emailDestino + "...");
        Factura factura = repositorioFacturas.obtenerFactura(idFactura);
        if (factura != null) {
            servicioEnvioCorreo.adjuntarFactura(emailDestino, factura);
            System.out.println("[FacturaFacade] Factura " + idFactura + " reenviada con éxito.");
        } else {
            System.out.println("[FacturaFacade] Error: Factura " + idFactura + " no encontrada para reenviar.");
        }
    }

    // Simulación de descarga de factura (en un sistema real podría generar un PDF)
    public void descargarFactura(String idFactura) {
        System.out.println("\n[FacturaFacade] Solicitando descarga de factura " + idFactura + "...");
        Factura factura = repositorioFacturas.obtenerFactura(idFactura);
        if (factura != null) {
            System.out.println("[FacturaFacade] Contenido de la factura " + idFactura + " listo para descarga:\n" + factura.getContenido());
            System.out.println("[FacturaFacade] Simulación de descarga completada.");
        } else {
            System.out.println("[FacturaFacade] Error: Factura " + idFactura + " no encontrada para descargar.");
        }
    }
}
