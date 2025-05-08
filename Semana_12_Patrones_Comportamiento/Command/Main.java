package Semana_12_Patrones_Comportamiento.Command;

// Interfaz comando
interface Comando {
    void ejecutar();
}
 
// Receptor 1: Luz
class Luz {
    public void encender() {
        System.out.println("Luz encendida.");
    }
}
 
// Receptor 2: Cortina
class Cortina {
    public void subir() {
        System.out.println("Cortina subida.");
    }
}
 
// Comando concreto: Encender Luz
class ComandoEncenderLuz implements Comando {
    private Luz luz;
 
    public ComandoEncenderLuz(Luz luz) {
        this.luz = luz;
    }
 
    public void ejecutar() {
        luz.encender();
    }
}
 
// Comando concreto: Subir Cortina
class ComandoSubirCortina implements Comando {
    private Cortina cortina;
 
    public ComandoSubirCortina(Cortina cortina) {
        this.cortina = cortina;
    }
 
    public void ejecutar() {
        cortina.subir();
    }
}
 
// Invocador: Botón configurable
class Boton {
    private Comando comando;
 
    public Boton(Comando comando) {
        this.comando = comando;
    }
 
    public void presionar() {
        comando.ejecutar();
    }
}
 
// Cliente
public class Main {
    public static void main(String[] args) {
        GetIdentidad getIdentidad = new GetIdentidad("Command ","Panel de control en una aplicación de automatización de oficinas.");
        getIdentidad.getEncabezado();

        Luz luz = new Luz();
        Cortina cortina = new Cortina();
 
        Comando cmdLuz = new ComandoEncenderLuz(luz);
        Comando cmdCortina = new ComandoSubirCortina(cortina);
 
        Boton boton1 = new Boton(cmdLuz);
        Boton boton2 = new Boton(cmdCortina);
 
        boton1.presionar(); // Luz encendida
        boton2.presionar(); // Cortina subida

        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}
