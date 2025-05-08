package Semana_12_Patrones_Comportamiento.Memento;

import java.util.Stack;

// Originador
class EditorTexto {
    private String contenido = "";
 
    public void escribir(String texto) {
        contenido += texto;
    }
 
    public String getContenido() {
        return contenido;
    }
 
    public Memento guardar() {
        return new Memento(contenido);
    }
 
    public void restaurar(Memento memento) {
        this.contenido = memento.getEstado();
    }
 
    // Memento interno
    public static class Memento {
        private final String estado;
 
        private Memento(String estado) {
            this.estado = estado;
        }
 
        private String getEstado() {
            return estado;
        }
    }
}
 
// Caretaker
class Historial {
    private Stack<EditorTexto.Memento> pila = new Stack<>();
 
    public void guardar(EditorTexto.Memento m) {
        pila.push(m);
    }
 
    public EditorTexto.Memento deshacer() {
        if (!pila.isEmpty()) {
            return pila.pop();
        }
        return null;
    }
}
 
// Cliente
public class Main {
    public static void main(String[] args) {
        GetIdentidad getIdentidad = new GetIdentidad("Momento ",":Editor de texto con funcionalidad de deshacer.");
        getIdentidad.getEncabezado();

        EditorTexto editor = new EditorTexto();
        Historial historial = new Historial();
 
        editor.escribir("Hola");
        historial.guardar(editor.guardar());
 
        editor.escribir(" mundo");
        historial.guardar(editor.guardar());
 
        editor.escribir(" cruel");
 
        System.out.println("Actual: " + editor.getContenido()); // Hola mundo cruel
 
        editor.restaurar(historial.deshacer());
        System.out.println("Undo 1: " + editor.getContenido()); // Hola mundo
 
        editor.restaurar(historial.deshacer());
        System.out.println("Undo 2: " + editor.getContenido()); // Hola

        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}
