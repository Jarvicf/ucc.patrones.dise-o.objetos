package Semana_15_ProyectoFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Semana_15_ProyectoFinal.patrones.builder.Conductores;
import Semana_15_ProyectoFinal.patrones.builder.PerfilConductor;
import Semana_15_ProyectoFinal.patrones.chainOfResponsibility.FiltroDisponibilidad;
import Semana_15_ProyectoFinal.patrones.chainOfResponsibility.FiltroTipoVehiculo;
import Semana_15_ProyectoFinal.patrones.command.CommandViaje;
import Semana_15_ProyectoFinal.patrones.command.InvocadorViaje;
import Semana_15_ProyectoFinal.patrones.command.SolicitarViajeCommand;
import Semana_15_ProyectoFinal.patrones.factoryMethod.SolicitadorViaje;
import Semana_15_ProyectoFinal.patrones.factoryMethod.SolicitudViaje;

public class Uber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Registro de Conductor ===");
        List<PerfilConductor> todos = (List<PerfilConductor>) new RegistroConductores();

        
        // === HISTORIA 2 === Solicitud de viaje
        System.out.println("\n=== Solicitud de viaje ===");
        System.out.print("Origen: ");
        String origen = sc.nextLine();
        System.out.print("Destino: ");
        String destino = sc.nextLine();
        System.out.print("Tipo de viaje (economico, ejecutivo, compartido): ");
        String tipo = sc.nextLine();
        System.out.print("Método de pago: ");
        String metodoPago = sc.nextLine();

        SolicitudViaje solicitud = SolicitadorViaje.crearSolicitud(tipo, origen, destino, metodoPago);
        CommandViaje comando = new SolicitarViajeCommand(solicitud);
        InvocadorViaje invocador = new InvocadorViaje();
        invocador.setComando(comando);
        invocador.ejecutarComando();
        sc.close();

        // === HISTORIA 3 === Asignación automática del conductor
        // Filtros (Chain of Responsibility)

        FiltroDisponibilidad filtro = new FiltroDisponibilidad();
        filtro.setSiguiente(new FiltroTipoVehiculo(solicitud.getTipoVehiculo()));
        
    }
}
