package Ubber.src.com.transporte.historia_4;

import java.util.List;

public class SimuladorGPSAdapter implements IGPSViaje{
    private List<Coordenada> rutaSimulada;
    private int indiceActual = 0;

    public SimuladorGPSAdapter(List<Coordenada> ruta) {
        this.rutaSimulada = ruta;
    }

    @Override
    public Coordenada obtenerUbicacionActual() {
        if (indiceActual < rutaSimulada.size()) {
            return rutaSimulada.get(indiceActual++);
        }
        return null; // Fin de la ruta simulada
    }

    public void simularDesviacion(Coordenada nuevaUbicacion) {
        rutaSimulada.add(nuevaUbicacion);
    }

    @Override
    public Ruta obtenerRuta(Coordenada inicio, Coordenada fin) {
        // En la simulación, podríamos simplemente devolver la ruta predefinida
        return new Ruta(rutaSimulada);
    }

    @Override
    public void notificarCambioRuta(Ruta nuevaRuta) {
        this.rutaSimulada = nuevaRuta.getCoordenadas();
        this.indiceActual = 0; // Reiniciar el índice al cambiar la ruta
    }

    // Método para reiniciar la simulación (si es necesario)
    public void reiniciarSimulacion() {
        this.indiceActual = 0;
    }
}
