package Ubber.src.com.transporte.historia_4;

import java.util.ArrayList;
import java.util.List;

import Ubber.src.com.transporte.Pasajero;
import Ubber.src.com.transporte.historia_4.SimuladorGPSAdapter;
import Ubber.src.com.transporte.historia_4.Subject;
import Ubber.src.com.transporte.historia_5.EstadoViaje;
import Ubber.src.com.transporte.historia_5.MediadorViaje;
import Ubber.src.com.transporte.historia_5.SolicitadoEstado;
import Ubber.src.com.transporte.historia_1.PerfilConductor;
import Ubber.src.com.transporte.historia_2.SolicitudViaje;

public class Viaje  implements Subject{
    private List<Observer> observadores;
    private IGPSViaje gpsAdapter;
    private Coordenada ubicacionActual;
    private Ruta rutaActual;
    private EstadoViaje estadoActual;
    private PerfilConductor conductor;
    private Pasajero pasajero;
    private MediadorViaje mediador;
    private SolicitudViaje solicitudViaje;

     public Viaje(List<Coordenada> rutaInicial, Pasajero pasajero, MediadorViaje mediador) {
        this.observadores = new ArrayList<>();
        this.gpsAdapter = new SimuladorGPSAdapter(rutaInicial);
        this.rutaActual = new Ruta(rutaInicial);
        this.ubicacionActual = gpsAdapter.obtenerUbicacionActual();
        this.estadoActual = new SolicitadoEstado(); // Estado inicial
        this.pasajero = pasajero;
        this.mediador = mediador;
    }

    public void simularMovimiento() {
        Coordenada nuevaUbicacion = gpsAdapter.obtenerUbicacionActual();
        if (nuevaUbicacion != null && !nuevaUbicacion.equals(this.ubicacionActual)) {
            this.ubicacionActual = nuevaUbicacion;
            notificarObservadores(this.ubicacionActual);
        } else if (nuevaUbicacion == null) {
            System.out.println("Viaje simulado ha finalizado.");
        }
    }

    public void simularCambioDeRuta(List<Coordenada> nuevaRuta) {
        Ruta nuevaRutaObj = new Ruta(nuevaRuta);
        if (!nuevaRutaObj.equals(this.rutaActual)) {
            this.rutaActual = nuevaRutaObj;
            this.gpsAdapter.notificarCambioRuta(nuevaRutaObj);
            this.ubicacionActual = gpsAdapter.obtenerUbicacionActual();
            notificarObservadoresRuta(this.rutaActual);
            System.out.println("¡Cambio de ruta simulado!");
        } else {
            System.out.println("La nueva ruta es la misma que la actual.");
        }
    }

    public void cancelar() {
        this.estadoActual.cancelar(this);
    }

    public void asignarConductor(PerfilConductor conductor) {
        this.estadoActual.asignarConductor(this, conductor);
    }

    public void iniciar() {
        this.estadoActual.iniciar(this);
    }

    public void completar() {
        this.estadoActual.completar(this);
    }

    public void calificar(int calificacion) {
        this.estadoActual.calificar(this, calificacion);
    }

    @Override
    public void registrarObservador(Observer observador) {
        this.observadores.add(observador);
    }

    @Override
    public void eliminarObservador(Observer observador) {
        this.observadores.remove(observador);
    }

    @Override
    public void notificarObservadores(Coordenada ubicacion) {
        for (Observer observador : this.observadores) {
            observador.actualizar(ubicacion);
        }
    }

    @Override
    public void notificarObservadoresRuta(Ruta nuevaRuta) {
        for (Observer observador : this.observadores) {
            observador.actualizarRuta(nuevaRuta);
        }
    }

    public EstadoViaje getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstadoViaje estadoActual) {
        this.estadoActual = estadoActual;
    }

    public PerfilConductor getConductor() {
        return conductor;
    }

    public void setConductor(PerfilConductor conductor) {
        this.conductor = conductor;
    }

    public MediadorViaje getMediador() {
        return mediador;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public String obtenerEstadoActual() {
        return this.estadoActual.getEstado();
    }

    public SolicitudViaje getSolicitudViaje() { 
        return solicitudViaje;
    }

    public void setSolicitudViaje(SolicitudViaje solicitudViaje) { 
        this.solicitudViaje = solicitudViaje;
    }
    
}
