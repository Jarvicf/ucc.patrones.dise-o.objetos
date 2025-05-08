package Semana_12_Patrones_Comportamiento.ChainOfResponsibility;

// Interfaz manejador
abstract class Aprobador {
    protected Aprobador siguiente;
 
    public void setSiguiente(Aprobador siguiente) {
        this.siguiente = siguiente;
    }
 
    public abstract void procesarSolicitud(double monto);
}
 
// Supervisor
class Supervisor extends Aprobador {
    public void procesarSolicitud(double monto) {
        if (monto <= 500) {
            System.out.println("Aprobado por Supervisor.");
        } else if (siguiente != null) {
            siguiente.procesarSolicitud(monto);
        }
    }
}
 
// Jefe de Departamento
class JefeDepartamento extends Aprobador {
    public void procesarSolicitud(double monto) {
        if (monto <= 5000) {
            System.out.println("Aprobado por Jefe de Departamento.");
        } else if (siguiente != null) {
            siguiente.procesarSolicitud(monto);
        }
    }
}
 
// Director Financiero
class DirectorFinanciero extends Aprobador {
    public void procesarSolicitud(double monto) {
        if (monto > 5000) {
            System.out.println("Aprobado por Director Financiero.");
        } else if (siguiente != null) {
            siguiente.procesarSolicitud(monto);
        }
    }
}
 
// Cliente
public class Main {
    public static void main(String[] args) {
        GetIdentidad getIdentidad = new GetIdentidad("Chain Of Responsibility ","Sistema de aprobación de solicitudes en una empresa multinacional.");
        getIdentidad.getEncabezado();

        Aprobador supervisor = new Supervisor();
        Aprobador jefe = new JefeDepartamento();
        Aprobador director = new DirectorFinanciero();
 
        supervisor.setSiguiente(jefe);
        jefe.setSiguiente(director);
 
        supervisor.procesarSolicitud(300);   // Supervisor
        supervisor.procesarSolicitud(3000);  // Jefe de Departamento
        supervisor.procesarSolicitud(15000); // Director Financiero

        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}
