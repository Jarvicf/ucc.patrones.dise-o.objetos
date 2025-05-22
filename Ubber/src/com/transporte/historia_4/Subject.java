package Ubber.src.com.transporte.historia_4;

public interface Subject {
    void registrarObservador(Observer observador);
    void eliminarObservador(Observer observador);
    void notificarObservadores(Coordenada ubicacion);
    void notificarObservadoresRuta(Ruta nuevaRuta);
}
