package Semana_12_Patrones_Comportamiento.Mediator;

import java.util.ArrayList;
import java.util.List;

// Interfaz del Mediador
interface TorreControl {
    void enviarMensaje(String mensaje, Participante emisor);
    void registrarParticipante(Participante p);
}
 
// Participantes abstractos
abstract class Participante {
    protected TorreControl torre;
    protected String nombre;
 
    public Participante(String nombre, TorreControl torre) {
        this.nombre = nombre;
        this.torre = torre;
        torre.registrarParticipante(this);
    }
 
    public abstract void recibir(String mensaje);
    public void enviar(String mensaje) {
        torre.enviarMensaje(mensaje, this);
    }
 
    public String getNombre() {
        return nombre;
    }
}
 
// Participante concreto: Avión
class Avion extends Participante {
    public Avion(String nombre, TorreControl torre) {
        super(nombre, torre);
    }
 
    public void recibir(String mensaje) {
        System.out.println("Avión " + nombre + " recibe: " + mensaje);
    }
}
 
// Participante concreto: Controlador
class Controlador extends Participante {
    public Controlador(String nombre, TorreControl torre) {
        super(nombre, torre);
    }
 
    public void recibir(String mensaje) {
        System.out.println("Controlador " + nombre + " recibe: " + mensaje);
    }
}
 
// Participante concreto: Pista
class Pista extends Participante {
    public Pista(String nombre, TorreControl torre) {
        super(nombre, torre);
    }
 
    public void recibir(String mensaje) {
        System.out.println("Pista " + nombre + " recibe: " + mensaje);
    }
}
 
// Mediador concreto
class TorreDeControl implements TorreControl {
    private List<Participante> participantes = new ArrayList<>();
 
    public void registrarParticipante(Participante p) {
        participantes.add(p);
    }
 
    public void enviarMensaje(String mensaje, Participante emisor) {
        for (Participante p : participantes) {
            if (p != emisor) {
                p.recibir(mensaje + " (de " + emisor.getNombre() + ")");
            }
        }
    }
}
 
// Cliente
public class Main {
    public static void main(String[] args) {
        GetIdentidad getIdentidad = new GetIdentidad("Mediator  ","Sistema de mensajería entre componentes en una torre de control de vuelos.");
        getIdentidad.getEncabezado();

        TorreControl torre = new TorreDeControl();
 
        Participante avion1 = new Avion("LATAM 123", torre);
        Participante controlador = new Controlador("ATC Norte", torre);
        Participante pista = new Pista("Pista A", torre);
 
        avion1.enviar("Solicito autorización para aterrizar");
        controlador.enviar("Autorizado a aterrizar");

        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}

