package Semana_10_Ejercicios_Patrones_Estructurales_CompositeDecorator.Ejercicios.Decorator.Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        GetIdentidad getIdentidad = new GetIdentidad("Patrón Decorator","Como responsable de comunicación, quiero que las notificaciones puedan enviarse por email, SMS y notificaciones push sin modificar el código base.");
        getIdentidad.getEncabezado();
        
        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}
