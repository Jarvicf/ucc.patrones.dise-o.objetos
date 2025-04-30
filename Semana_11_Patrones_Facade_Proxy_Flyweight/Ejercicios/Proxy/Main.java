package Semana_11_Patrones_Facade_Proxy_Flyweight.Ejercicios.Proxy;

public class Main {
    public static void main(String[] args) {
        GetIdentidad getIdentidad = new GetIdentidad("Patrón Proxy","    Como gerente, quiero visualizar reportes confidenciales solo si tengo permisos válidos.");
        getIdentidad.getEncabezado();

        IReporte reporte1 = new ProxyReporte("gerente");
        reporte1.mostrar();
 
        IReporte reporte2 = new ProxyReporte("empleado");
        reporte2.mostrar();

        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}
