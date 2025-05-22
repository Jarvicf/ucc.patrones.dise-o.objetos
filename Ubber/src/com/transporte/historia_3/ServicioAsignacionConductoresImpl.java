package Ubber.src.com.transporte.historia_3;

import java.util.ArrayList;
import java.util.List;

import Ubber.src.com.transporte.historia_1.PerfilConductor;
import Ubber.src.com.transporte.historia_2.SolicitudViaje;

public class ServicioAsignacionConductoresImpl implements ServicioAsignacionConductores{
    private EstrategiaSeleccionConductor estrategiaSeleccion;
    private FiltroConductor primerFiltro;
    protected List<PerfilConductor> conductoresRegistrados; // Simulación de la base de datos de conductores

    public ServicioAsignacionConductoresImpl(EstrategiaSeleccionConductor estrategiaSeleccion) {
        this.estrategiaSeleccion = estrategiaSeleccion;
        this.conductoresRegistrados = new ArrayList<>();
        // Simulación de algunos conductores registrados
        conductoresRegistrados.add(new PerfilConductor.Builder("Carlos", "Rojas", "carlos.rojas@email.com").vehiculoMarca("Nissan").vehiculoModelo("Sentra").build());
        conductoresRegistrados.add(new PerfilConductor.Builder("Laura", "Vargas", "laura.vargas@email.com").vehiculoMarca("Chevrolet").vehiculoModelo("Onix").build());
        conductoresRegistrados.add(new PerfilConductor.Builder("Andrés", "Pineda", "andres.pineda@email.com").vehiculoMarca("Kia").vehiculoModelo("Picanto").build());
        conductoresRegistrados.add(new PerfilConductor.Builder("Sofía", "Gómez", "sofia.gomez@email.com").vehiculoMarca("Renault").vehiculoModelo("Duster").build());

        // Configuración de la cadena de responsabilidad
        FiltroConductor filtroDisponibilidad = new FiltroDisponibilidad();
        FiltroConductor filtroCompatibilidad = new FiltroCompatibilidadVehiculo();
        FiltroConductor filtroReputacion = new FiltroReputacionMinima();

        filtroDisponibilidad.setSiguienteFiltro(filtroCompatibilidad);
        filtroCompatibilidad.setSiguienteFiltro(filtroReputacion);
        this.primerFiltro = filtroDisponibilidad;
    }

    public void setEstrategiaSeleccion(EstrategiaSeleccionConductor estrategiaSeleccion) {
        this.estrategiaSeleccion = estrategiaSeleccion;
    }

    @Override
    public void asignarConductor(SolicitudViaje solicitud) {
        System.out.println("\n--- Intentando asignar conductor para la solicitud de " + solicitud.getPasajero().getNombre() + " ---");
        List<PerfilConductor> conductoresPotenciales = estrategiaSeleccion.seleccionar(solicitud, conductoresRegistrados);
        List<PerfilConductor> conductoresFiltrados = primerFiltro.filtrar(solicitud, conductoresPotenciales);

        if (!conductoresFiltrados.isEmpty()) {
            PerfilConductor conductorAsignado = conductoresFiltrados.get(0); // Simplemente asignamos el primero que pasa los filtros
            System.out.println("Conductor asignado: " + conductorAsignado.getNombre() + " " + conductorAsignado.getApellido() +
                               " (Vehículo: " + conductorAsignado.getVehiculoMarca() + " " + conductorAsignado.getVehiculoModelo() + ")");
        } else {
            System.out.println("No se encontraron conductores disponibles que cumplan con los criterios.");
        }
    }
}
