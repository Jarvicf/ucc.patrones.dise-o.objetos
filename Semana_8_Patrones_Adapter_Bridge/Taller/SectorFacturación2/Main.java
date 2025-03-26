package Semana_8_Patrones_Adapter_Bridge.Taller.SectorFacturación2;

interface FormatoFactura {
    void generarFactura(String datos);
}
 
class FormatoPDF implements FormatoFactura {
    public void generarFactura(String datos) {
        System.out.println("Generando factura en PDF: " + datos);
    }
}
 
class FormatoXML implements FormatoFactura {
    public void generarFactura(String datos) {
        System.out.println("Generando factura en XML: " + datos);
    }
}
 
abstract class Factura {
    protected FormatoFactura formato;
 
    public Factura(FormatoFactura formato) {
        this.formato = formato;
    }
 
    public abstract void emitir(String datos);
}
 
class FacturaElectronica extends Factura {
    public FacturaElectronica(FormatoFactura formato) {
        super(formato);
    }
 
    public void emitir(String datos) {
        formato.generarFactura(datos);
    }
}
 
public class Main {
    public static void main(String[] args) {
        GetIdentidad getIdentidad = new GetIdentidad("Patrón Adapter","Como analista financiero, necesito que el nuevo sistema de facturación pueda generar reportes compatibles con el sistema contable antiguo de la empresa, sin cambiar la lógica principal del sistema nuevo.");
        getIdentidad.getEncabezado();
        Factura factura1 = new FacturaElectronica(new FormatoPDF());
        factura1.emitir("Factura #789 - Total: $1.200.000");
        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}
