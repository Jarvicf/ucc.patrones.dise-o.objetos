package Semana_12_Patrones_Comportamiento.Observer;

import java.util.ArrayList;
import java.util.List;

// Interfaz del observador
interface Observador {
    void actualizar(double temperatura);
}
 
// Sujeto (Sensor)
class Sensor {
    private List<Observador> observadores = new ArrayList<>();
    private double temperatura;
 
    public void agregarObservador(Observador o) {
        observadores.add(o);
    }
 
    public void removerObservador(Observador o) {
        observadores.remove(o);
    }
 
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notificarObservadores();
    }
 
    private void notificarObservadores() {
        for (Observador o : observadores) {
            o.actualizar(temperatura);
        }
    }
}
 
// Observador 1: Notificación por correo
class NotificadorEmail implements Observador {
    public void actualizar(double temperatura) {
        if (temperatura > 8.0) {
            System.out.println("Email enviado: temperatura alta -> " + temperatura + "°C");
        }
    }
}
 
// Observador 2: Registro en sistema
class RegistroEvento implements Observador {
    public void actualizar(double temperatura) {
        if (temperatura > 8.0) {
            System.out.println("Evento registrado en base de datos -> " + temperatura + "°C");
        }
    }
}
 
// Observador 3: Orden de verificación
class OrdenTecnica implements Observador {
    public void actualizar(double temperatura) {
        if (temperatura > 8.0) {
            System.out.println("Orden de revisión técnica generada.");
        }
    }
}


public class Main {
    public static void main(String[] args) {    

         GetIdentidad getIdentidad = new GetIdentidad("Observer ","Sistema de Monitoreo de Sensores en una Planta Industrial.");
        getIdentidad.getEncabezado();

        Sensor sensor = new Sensor();
        sensor.agregarObservador(new NotificadorEmail());
        sensor.agregarObservador(new RegistroEvento());
        sensor.agregarObservador(new OrdenTecnica());
 
        sensor.setTemperatura(6.5); // no se notifica
        sensor.setTemperatura(8.5); // activa todos los observadores


        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}
