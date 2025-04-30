package Semana_11_Patrones_Facade_Proxy_Flyweight.Ejercicios.Proxy;

public class ProxyReporte implements IReporte {
    private ReporteReal reporteReal;
    private String rolUsuario;
 
    public ProxyReporte(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }
 
    public void mostrar() {
        if ("gerente".equalsIgnoreCase(rolUsuario)) {
            if (reporteReal == null) {
                reporteReal = new ReporteReal();
            }
            reporteReal.mostrar();
        } else {
            System.out.println("Acceso denegado: " + rolUsuario);
        }
    }
}

