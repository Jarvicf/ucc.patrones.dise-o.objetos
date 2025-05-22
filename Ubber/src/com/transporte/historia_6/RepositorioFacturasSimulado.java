package Ubber.src.com.transporte.historia_6;

import java.util.HashMap;
import java.util.Map;

public class RepositorioFacturasSimulado {
     private final Map<String, Factura> facturasAlmacenadas;

    public RepositorioFacturasSimulado() {
        this.facturasAlmacenadas = new HashMap<>();
    }

    public void guardarFactura(Factura factura) {
        facturasAlmacenadas.put(factura.getId(), factura);
        System.out.println("  [RepositorioFacturasSimulado] Factura " + factura.getId() + " guardada.");
    }

    public Factura obtenerFactura(String idFactura) {
        System.out.println("  [RepositorioFacturasSimulado] Buscando factura " + idFactura + "...");
        return facturasAlmacenadas.get(idFactura);
    }

    public void eliminarFactura(String idFactura) {
        facturasAlmacenadas.remove(idFactura);
        System.out.println("  [RepositorioFacturasSimulado] Factura " + idFactura + " eliminada.");
    }
}
