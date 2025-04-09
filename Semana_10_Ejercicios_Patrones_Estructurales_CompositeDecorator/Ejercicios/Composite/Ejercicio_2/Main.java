package Semana_10_Ejercicios_Patrones_Estructurales_CompositeDecorator.Ejercicios.Composite.Ejercicio_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


interface ElementoMenu {
    void mostrar();
}

class Opcion implements ElementoMenu {
    private String nombre;

    public Opcion(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println("    Opción: " + nombre);
    }
}

class Menu implements ElementoMenu {
    private String nombre;
    private List<ElementoMenu> elementos = new ArrayList<>();

    public Menu(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ElementoMenu elemento) {
        elementos.add(elemento);
    }

    public void mostrar() {
        System.out.println("Menú: " + nombre);
        for (ElementoMenu e : elementos) {
            e.mostrar();
        }
    }
}


public class Main {
    public static void main(String[] args) {
        GetIdentidad getIdentidad = new GetIdentidad("Patrón Composite ","Como diseñador de interfaz, quiero crear menús que puedan tener submenús y opciones, y que puedan recorrerse uniformemente sin importar su nivel.");
        getIdentidad.getEncabezado();
        
        Menu menu = new Menu("");

        Random rand = new Random();
        int inMenu = rand.nextInt(10) + 1;
        int inItem = 0;
        for (int i = 0; i < inMenu; i++) {
            menu = new Menu("Menu " +i);

            inItem = rand.nextInt(5)+1;
            for (int j = 0; j < args.length; j++) {
                Opcion opcion = new Opcion("Opción " + j);
                menu.agregar(opcion);
            }     
            menu.mostrar();       
        }

        
        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}
