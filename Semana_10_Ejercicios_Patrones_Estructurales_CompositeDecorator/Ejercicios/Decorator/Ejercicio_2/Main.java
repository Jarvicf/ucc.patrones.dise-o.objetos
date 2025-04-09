package Semana_10_Ejercicios_Patrones_Estructurales_CompositeDecorator.Ejercicios.Decorator.Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        GetIdentidad getIdentidad = new GetIdentidad("Patrón Decorator.","Como barista digital en una app de pedidos, necesito permitir a los usuarios personalizar su café con azúcar, leche, sabores, sin modificar la clase base.");
        getIdentidad.getEncabezado();
        
        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}
