package Ubber.src.com.transporte.historia_4;

public interface Observer {
    void actualizar(Coordenada ubicacion);
    void actualizarRuta(Ruta nuevaRuta);
}
