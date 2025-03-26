package Semana_8_Patrones_Adapter_Bridge.Taller.SectorTransporte;

interface LocalizadorWeb {
    void mostrarUbicacion(String coordenadas);
}
 
class GPSCamion {
    public String obtenerUbicacion() {
        return "Lat: 4.60971, Lon: -74.08175";
    }
}
 
class AdaptadorGPS implements LocalizadorWeb {
    private GPSCamion gps;
 
    public AdaptadorGPS(GPSCamion gps) {
        this.gps = gps;
    }
 
    public void mostrarUbicacion(String coordenadas) {
        String ubicacion = gps.obtenerUbicacion();
        System.out.println("Ubicación del camión: " + ubicacion);
    }
}
 
public class Main {
    public static void main(String[] args) {
        GetIdentidad getIdentidad = new GetIdentidad("Patrón Bridge","Como administrador de flotas, necesito integrar el sistema GPS de los camiones, que usa un protocolo diferente, con la plataforma web de monitoreo de rutas en tiempo real.");
        getIdentidad.getEncabezado();
        LocalizadorWeb localizador = new AdaptadorGPS(new GPSCamion());
        localizador.mostrarUbicacion("");
        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}
