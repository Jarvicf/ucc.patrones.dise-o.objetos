package Ubber.src.com.transporte.historia_2;

import Ubber.src.com.transporte.Pasajero;

public class ViajeEjecutivo implements SolicitudViaje{
    private String puntoPartida;
    private String destino;
    private String metodoPago;
    private Pasajero pasajero;
    private final String tipoServicio = "EJECUTIVO";

    public ViajeEjecutivo() {}

    @Override
    public String getPuntoPartida() {
        return puntoPartida;
    }

    @Override
    public void setPuntoPartida(String puntoPartida) {
        this.puntoPartida = puntoPartida;
    }

    @Override
    public String getDestino() {
        return destino;
    }

    @Override
    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String getMetodoPago() {
        return metodoPago;
    }

    @Override
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    @Override
    public Pasajero getPasajero() {
        return pasajero;
    }

    @Override
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    @Override
    public String getTipoServicio() {
        return tipoServicio;
    }
}
