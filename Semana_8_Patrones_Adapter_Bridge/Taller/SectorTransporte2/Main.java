package Semana_8_Patrones_Adapter_Bridge.Taller.SectorTransporte2;

interface ModoReporte {
    void imprimir(String contenido);
}
 
class Consola implements ModoReporte {
    public void imprimir(String contenido) {
        System.out.println("Reporte en consola: " + contenido);
    }
}
 
class ArchivoTexto implements ModoReporte {
    public void imprimir(String contenido) {
        System.out.println("Guardando en archivo: " + contenido);
    }
}
 
abstract class ReporteVehiculo {
    protected ModoReporte salida;
 
    public ReporteVehiculo(ModoReporte salida) {
        this.salida = salida;
    }
 
    public abstract void generar(String estado);
}
 
class ReporteEstado extends ReporteVehiculo {
    public ReporteEstado(ModoReporte salida) {
        super(salida);
    }
 
    public void generar(String estado) {
        salida.imprimir("Estado del vehículo: " + estado);
    }
}
 
public class Main {
    public static void main(String[] args) {
        GetIdentidad getIdentidad = new GetIdentidad("Patrón Bridge","Como supervisor de mantenimiento, quiero que el sistema de monitoreo pueda generar reportes del estado de los vehículos con distintas salidas: en pantalla, archivo de texto o correo electrónico, sin modificar la lógica de captura de datos.");
        getIdentidad.getEncabezado();
        ReporteVehiculo reporte = new ReporteEstado(new Consola());
        reporte.generar("Motor funcionando, llantas en buen estado");
        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}

