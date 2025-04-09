package Semana_10_Ejercicios_Patrones_Estructurales_CompositeDecorator.Ejercicios.Composite.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

interface ArchivoComponent {
    void mostrar();
}

class Archivo implements ArchivoComponent {
    private String nombre;
 
    public Archivo(String nombre) {
        this.nombre = nombre;
    }
 
    public void mostrar() {
        System.out.println("    Archivo: " + nombre);
    }
}

class Carpeta implements ArchivoComponent {
    private String nombre;
    private List<ArchivoComponent> elementos = new ArrayList<>();
 
    public Carpeta(String nombre) {
        this.nombre = nombre;
    }
 
    public void agregar(ArchivoComponent componente) {
        elementos.add(componente);
    }
 
    public void mostrar() {
        System.out.println("Carpeta: " + nombre);
        for (ArchivoComponent c : elementos) {
            c.mostrar();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GetIdentidad getIdentidad = new GetIdentidad("Patrón Composite ","Como administrador de servidores, necesito representar carpetas y archivos en una estructura jerárquica para recorrer y gestionar todo el sistema de almacenamiento de forma uniforme.");
        getIdentidad.getEncabezado();
        
        int inCatArchivos = 10;

        Carpeta carpeta = new Carpeta("Fotos");

        for (int i = 0; i < inCatArchivos; i++) {
            Archivo archivo1 = new Archivo("Archivo_" + i + ".jpg");
            carpeta.agregar(archivo1);
        }

        carpeta.mostrar();        
        

        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}
