package Semana_12_Patrones_Comportamiento.State;

// Interfaz de Estado
interface EstadoCajero {
    void insertarTarjeta();
    void ingresarPin(int pin);
    void retirarDinero(double monto);
}
 
// Estado: sin tarjeta
class SinTarjeta implements EstadoCajero {
    private Cajero cajero;
 
    public SinTarjeta(Cajero cajero) {
        this.cajero = cajero;
    }
 
    public void insertarTarjeta() {
        System.out.println("Tarjeta insertada.");
        cajero.setEstado(new ConTarjeta(cajero));
    }
 
    public void ingresarPin(int pin) {
        System.out.println("Primero inserte una tarjeta.");
    }
 
    public void retirarDinero(double monto) {
        System.out.println("Primero inserte una tarjeta.");
    }
}
 
// Estado: con tarjeta (esperando PIN)
class ConTarjeta implements EstadoCajero {
    private Cajero cajero;
 
    public ConTarjeta(Cajero cajero) {
        this.cajero = cajero;
    }
 
    public void insertarTarjeta() {
        System.out.println("Ya hay una tarjeta insertada.");
    }
 
    public void ingresarPin(int pin) {
        if (pin == 1234) {
            System.out.println("PIN correcto.");
            cajero.setEstado(new Autenticado(cajero));
        } else {
            System.out.println("PIN incorrecto.");
        }
    }
 
    public void retirarDinero(double monto) {
        System.out.println("Debe ingresar su PIN primero.");
    }
}
 
// Estado: autenticado
class Autenticado implements EstadoCajero {
    private Cajero cajero;
 
    public Autenticado(Cajero cajero) {
        this.cajero = cajero;
    }
 
    public void insertarTarjeta() {
        System.out.println("Ya autenticado. No necesita reiniciar.");
    }
 
    public void ingresarPin(int pin) {
        System.out.println("Ya autenticado.");
    }
 
    public void retirarDinero(double monto) {
        System.out.println("Retirando $" + monto);
        cajero.setEstado(new SinTarjeta(cajero));
    }
}
 
// Contexto: Cajero
class Cajero {
    private EstadoCajero estado;
 
    public Cajero() {
        this.estado = new SinTarjeta(this);
    }
 
    public void setEstado(EstadoCajero estado) {
        this.estado = estado;
    }
 
    public void insertarTarjeta() {
        estado.insertarTarjeta();
    }
 
    public void ingresarPin(int pin) {
        estado.ingresarPin(pin);
    }
 
    public void retirarDinero(double monto) {
        estado.retirarDinero(monto);
    }
}
 
// Cliente
public class Main {
    public static void main(String[] args) {

        GetIdentidad getIdentidad = new GetIdentidad("State ","Cajero automático con múltiples estados de operación.");
        getIdentidad.getEncabezado();

        Cajero cajero = new Cajero();
 
        cajero.insertarTarjeta();
        cajero.ingresarPin(1111);
        cajero.ingresarPin(1234);
        cajero.retirarDinero(200);

        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}

