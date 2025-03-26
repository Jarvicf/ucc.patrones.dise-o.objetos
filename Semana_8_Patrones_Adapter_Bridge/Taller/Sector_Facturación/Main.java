package Semana_8_Patrones_Adapter_Bridge.Taller.Sector_Facturación;

interface ReporteNuevo {
    void generar(String datos);
}
 
class SistemaContableAntiguo {
    public void exportar(String contenido) {
        System.out.println("Exportando a sistema contable antiguo: " + contenido);
    }
}
 
class AdaptadorReporte implements ReporteNuevo {
    private SistemaContableAntiguo sistema;
 
    public AdaptadorReporte(SistemaContableAntiguo sistema) {
        this.sistema = sistema;
    }
 
    public void generar(String datos) {
        sistema.exportar(datos);
    }
}
 
public class Main {
    public static void main(String[] args) {
        GetIdentidad getIdentidad = new GetIdentidad("Patrón Adapter","Como analista financiero, necesito que el nuevo sistema de facturación pueda generar reportes compatibles con el sistema contable antiguo de la empresa, sin cambiar la lógica principal del sistema nuevo.");
        getIdentidad.getEncabezado();
        ReporteNuevo reporte = new AdaptadorReporte(new SistemaContableAntiguo());
        reporte.generar("Factura #123 - Total: $50000");
        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}
