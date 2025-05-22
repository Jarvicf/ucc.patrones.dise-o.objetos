package Ubber.src.com.transporte.historia_4;



public class PasajeroAppSimulado implements Observer{
    private String nombrePasajero;
    public PasajeroAppSimulado(String nombre) {
        this.nombrePasajero = nombre;
    }

    @Override
    public void actualizar(Coordenada ubicacion) {
        System.out.println(nombrePasajero + ": Ubicación del conductor actualizada a " + ubicacion);
    }

    @Override
    public void actualizarRuta(Ruta nuevaRuta) {
        System.out.println(nombrePasajero + ": ¡La ruta ha cambiado! Nueva ruta: " + nuevaRuta.getCoordenadas());
    }
}
