package Semana_11_Patrones_Facade_Proxy_Flyweight.Ejercicios.Proxy;

public class ReporteReal implements IReporte {
    public void mostrar() {
        System.out.println("Mostrando reporte confidencial.");
    }
}
