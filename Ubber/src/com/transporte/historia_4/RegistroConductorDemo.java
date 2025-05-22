package Ubber.src.com.transporte.historia_4;

import java.util.List;
import java.util.Scanner;

import Ubber.src.com.transporte.Pasajero;
import Ubber.src.com.transporte.historia_1.PerfilConductor;
import Ubber.src.com.transporte.historia_2.SolicitudViaje;
import Ubber.src.com.transporte.historia_2.SolicitudViajeCommand;
import Ubber.src.com.transporte.historia_2.SolicitudViajeFactory;
import Ubber.src.com.transporte.historia_3.Command;
import Ubber.src.com.transporte.historia_3.EstrategiaMasCercano;
import Ubber.src.com.transporte.historia_3.ServicioAsignacionConductoresImpl;
import Ubber.src.com.transporte.historia_5.MediadorViajeImpl;
import Ubber.src.com.transporte.historia_6.Factura;


public class RegistroConductorDemo {
        private static PerfilConductor conductorAsignado; // Campo para almacenar el conductor asignado

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        String nombre = input.nextLine();

        // Historia 2: Creación de Solicitudes de Viaje
        System.out.println("--- Historia 2: Creación de Solicitudes de Viaje ---");
        SolicitudViajeFactory factory = new SolicitudViajeFactory();
        Pasajero pasajero1 = new Pasajero(nombre);

        // Historia 3: Asignación Automática de Conductores (Modificado para almacenar el conductor)
        ServicioAsignacionConductoresImpl servicioAsignacion = new ServicioAsignacionConductoresImpl(new EstrategiaMasCercano()) {
            @Override
            public void asignarConductor(SolicitudViaje solicitud) {
                super.asignarConductor(solicitud);
                // Simulación de la asignación de un conductor (podríamos usar la lista de conductores registrados)
                if (!conductoresRegistrados.isEmpty()) {
                    conductorAsignado = conductoresRegistrados.get(0); // Simplemente asignamos el primero
                }
            }
        };
        
        // Historia 2: Creación de Solicitudes de Viaje (interactivo)
        System.out.print("Selecciona el tipo de viaje (ECONOMICO/EJECUTIVO/COMPARTIDO): ");
        String tipoViaje = input.nextLine().toUpperCase();

        System.out.print("Direccion Origen: ");
        String direccionOrigen = input.nextLine();
        System.out.print("Direccion Destino: ");
        String direccionDestino = input.nextLine();

        System.out.print("Ingrese medio de pago (Efectivo/Tarjeta): ");
        String medioPago = input.nextLine();

        SolicitudViaje solicitudViaje = factory.crearSolicitud(tipoViaje, direccionOrigen, direccionDestino, medioPago, pasajero1);
        Command comandoViaje = new SolicitudViajeCommand(solicitudViaje, servicioAsignacion);
        comandoViaje.ejecutar();
        System.out.println("--- Fin Historia 2 ---\n");

        // **Historia 5: Gestión de estados del viaje y Mediator (Conectado con Historia 3)**
        System.out.println("--- Historia 5: Gestión de estados del viaje y Mediator ---");
        MediadorViajeImpl mediador = new MediadorViajeImpl();
        List<Coordenada> rutaInicial = List.of(new Coordenada(0.0, 0.0), new Coordenada(0.1, 0.1));
        Viaje viajeEnCurso = new Viaje(rutaInicial, pasajero1, mediador);
        viajeEnCurso.setSolicitudViaje(solicitudViaje);

        System.out.println("Estado inicial del viaje: " + viajeEnCurso.obtenerEstadoActual());

        // Asignar el conductor (ahora debería ser el que se "asignó" en la Historia 3)
        if (conductorAsignado != null) {
            viajeEnCurso.asignarConductor(conductorAsignado);
        } else {
            System.out.println("No se pudo asignar un conductor automáticamente.");
            viajeEnCurso.asignarConductor(new PerfilConductor.Builder("Conductor Manual", "Apellido", "email").build()); // Si no se asignó, usamos uno manual
        }
        
        viajeEnCurso.iniciar();
        viajeEnCurso.simularMovimiento();
        viajeEnCurso.completar();
        viajeEnCurso.calificar(5);

        System.out.println("Estado final del viaje: " + viajeEnCurso.obtenerEstadoActual());
        System.out.println("--- Fin Historia 5 ---\n");

        input.close();
    
    }
}
