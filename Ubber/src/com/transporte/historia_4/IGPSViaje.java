package Ubber.src.com.transporte.historia_4;

import java.util.List;

public interface IGPSViaje {
    Coordenada obtenerUbicacionActual();
    Ruta obtenerRuta(Coordenada inicio, Coordenada fin);
    void notificarCambioRuta(Ruta nuevaRuta);
}

class Coordenada {
    double latitud;
    double longitud;

    public Coordenada(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    @Override
    public String toString() {
        return "(" + latitud + ", " + longitud + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordenada that = (Coordenada) o;
        return Double.compare(that.latitud, latitud) == 0 && Double.compare(that.longitud, longitud) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Double.hashCode(latitud);
        result = 31 * result + Double.hashCode(longitud);
        return result;
    }
}

class Ruta {
    List<Coordenada> coordenadas;

    public Ruta(List<Coordenada> coordenadas) {
        this.coordenadas = coordenadas;
    }

    public List<Coordenada> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(List<Coordenada> coordenadas) {
        this.coordenadas = (List<Coordenada>) coordenadas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ruta ruta = (Ruta) o;
        return coordenadas.equals(ruta.coordenadas);
    }

    @Override
    public int hashCode() {
        return coordenadas.hashCode();
    }
}
