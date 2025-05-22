package Ubber.src.com.transporte.historia_2;

import Ubber.src.com.transporte.Pasajero;

public interface  SolicitudViaje {
    String getPuntoPartida();
    void setPuntoPartida(String puntoPartida);
    String getDestino();
    void setDestino(String destino);
    String getMetodoPago();
    void setMetodoPago(String metodoPago);
    Pasajero getPasajero();
    void setPasajero(Pasajero pasajero);
    String getTipoServicio();
}
