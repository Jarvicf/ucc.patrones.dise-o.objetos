package Ubber.src.com.transporte.historia_4;

public class CentroMonitoreoSimulado implements Observer{
    private String nombreCentro;

    public CentroMonitoreoSimulado(String nombre) {
        this.nombreCentro = nombre;
    }

    @Override
    public void actualizar(Coordenada ubicacion) {
        System.out.println(nombreCentro + ": Registrando ubicación del conductor en " + ubicacion);
        // Aquí podríamos tener lógica para detectar desviaciones, retrasos, etc.
    }

    @Override
    public void actualizarRuta(Ruta nuevaRuta) {
        System.out.println(nombreCentro + ": Se ha notificado un cambio de ruta: " + nuevaRuta.getCoordenadas());
        // Aquí podríamos tener lógica para validar la nueva ruta
    }

}
