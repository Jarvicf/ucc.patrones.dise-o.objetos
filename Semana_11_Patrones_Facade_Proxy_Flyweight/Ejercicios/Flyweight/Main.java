package Semana_11_Patrones_Facade_Proxy_Flyweight.Ejercicios.Flyweight;
public class Main {
    public static void main(String[] args) {

        GetIdentidad getIdentidad = new GetIdentidad("Patrón Flyweight","Como desarrollador, quiero ahorrar memoria en el editor de texto reutilizando las mismas letras en diferentes posiciones.");
        getIdentidad.getEncabezado();

        ILetra letraA1 = FabricaLetras.obtenerLetra('A');
        ILetra letraA2 = FabricaLetras.obtenerLetra('A');
        ILetra letraB = FabricaLetras.obtenerLetra('B');
 
        letraA1.mostrar("1");
        letraA2.mostrar("2");
        letraB.mostrar("3");

        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}

