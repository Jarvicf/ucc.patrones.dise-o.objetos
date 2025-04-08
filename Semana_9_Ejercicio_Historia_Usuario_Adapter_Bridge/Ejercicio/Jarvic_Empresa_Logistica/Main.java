package Semana_9_Ejercicio_Historia_Usuario_Adapter_Bridge.Ejercicio.Jarvic_Empresa_Logistica;

    //Interface
    interface GPS{
        String obtenerUbicacion(String stUbicacion);
        String obtenerEstado(String stEstado);
    }

    //Interface
    interface Plataforma {
        void mostrarDatos(String stUbicacion, String stEstado);
    }    
       
    //Garmin Api
     class GarminGPS {
        public String getPosicion(String stUbicacion) {
            return "Garmin: Ubicaciíon es: " + stUbicacion;
        }

        public String getEstado(String stEstado){
            return "Garmin: Estado es: " + stEstado;
        }
    }
    
    // TomTom Api
    class TomTomGPS {
        public String getPosicion(String stUbicacion) {
            return "TomTom: Ubicaciíon es:" + stUbicacion;
        }
        public String getEstado(String stEstado){
            return "TomTom: Estado es: " + stEstado;
        }
    }
    
    // Huawei API
    class HuaweiGPS {
        public String getPosicion(String stUbicacion) {
            return "Huawei: Ubicaciíon es:" + stUbicacion;
        }
        public String getEstado(String stEstado){
            return "Huawei: Estado es: " + stEstado;
        }
    }
   
    //adaptador Garmin
    class GarminAdapter implements GPS{
        private GarminGPS dispositivo;

        //Constructor
        public GarminAdapter(GarminGPS dispositivo) {
            this.dispositivo = dispositivo;
        }

        //Metodos
        public String obtenerUbicacion(String stUbicacion) {
            return dispositivo.getPosicion(stUbicacion);
        }

        public String obtenerEstado(String stEstado){
            return dispositivo.getEstado(stEstado);
        }
    }

     //adaptador TomTom
     class TomTomAdapter implements GPS{
        private TomTomGPS dispositivo;

        //Constructor
        public TomTomAdapter(TomTomGPS dispositivo) {
            this.dispositivo = dispositivo;
        }

        //Metodos
        public String obtenerUbicacion(String stUbicaciíon) {
            return dispositivo.getPosicion(stUbicaciíon);
        }

        public String obtenerEstado(String stEstado){
            return dispositivo.getEstado(stEstado);
        }
    }

     //adaptador Huawei
     class HuaweiAdapter implements GPS{
        private HuaweiGPS dispositivo;

        //Constructor
        public HuaweiAdapter(HuaweiGPS dispositivo) {
            this.dispositivo = dispositivo;
        }

        //Metodos
        public String obtenerUbicacion(String stUbicacion) {
            return dispositivo.getPosicion(stUbicacion);
        }

        public String obtenerEstado(String stEstado){
            return dispositivo.getEstado(stEstado);
        }
    }

    //Implementacines
    class VisualizacionMovil implements Plataforma{

        @Override
        public void mostrarDatos(String stUbicacion, String stEstado) {
        System.out.println("📱App Móvil📱");
        System.out.println("Ubicación: " + stUbicacion);
        System.out.println("Estado: " + stEstado);
        }
        
    } 

    class VisualizacionEscritorio  implements Plataforma{

        @Override
        public void mostrarDatos(String stUbicacion, String stEstado) {
            System.out.println("🖥️ Aplicación de Escritorio 🖥️");
            System.out.println("Ubicación: " + stUbicacion);
            System.out.println("Estado: " + stEstado);
        }

    }

    //Abstracción 
    abstract class RastreadorVehiculo {
        protected GPS gps;
        protected Plataforma plataforma;

        public RastreadorVehiculo(GPS gps, Plataforma plataforma) {
            this.gps = gps;
            this.plataforma = plataforma;
        }
    
        public abstract void mostrarDatos(String ubicacion, String estado);
    }

    //Abstracción
    class RastreadorVehiculoGPS extends RastreadorVehiculo {

        public RastreadorVehiculoGPS(GPS gps, Plataforma plataforma) {
            super(gps, plataforma);
        }       

        @Override
        public void mostrarDatos(String ubicacion, String estado) {
        String ubicacionStr = gps.obtenerUbicacion(ubicacion);
        String estadoStr = gps.obtenerEstado(estado);
        plataforma.mostrarDatos(ubicacionStr, estadoStr);
        }
    }
    
    public class Main 
{
    public static void main(String[] args) 
    {
        GetIdentidad getIdentidad = new GetIdentidad("Patrón Adapter y Bridge","Como ingeniero de integración en una empresa de logística nacional, necesito que nuestro sistema de rastreo de vehículos sea capaz de integrarse con múltiples dispositivos GPS de diferentes marcas (Garmin, TomTom, Huawei), cada uno con su propia API, para mostrar de forma unificada los datos de ubicación y estado del vehículo en una aplicación móvil y de escritorio. Además, quiero poder modificar la interfaz gráfica del panel de rastreo dependiendo de si el usuario accede desde escritorio o desde el celular, sin tener que cambiar toda la lógica del sistema.");
        getIdentidad.getEncabezado();

        GPS gpsGarmin = new GarminAdapter(new GarminGPS());
        GPS gpsTomTom = new TomTomAdapter(new TomTomGPS());
        GPS gpsHuawei = new HuaweiAdapter(new HuaweiGPS());

        // Interfaces gráficas
        Plataforma appMovil = new VisualizacionMovil();
        Plataforma appEscritorio = new VisualizacionEscritorio();

        // Rastreador con Bridge (combinación libre)
        RastreadorVehiculo rastreadorGarminMovil = new RastreadorVehiculoGPS(gpsGarmin, appMovil);
        RastreadorVehiculo rastreadorTomTomEscritorio = new RastreadorVehiculoGPS(gpsTomTom, appEscritorio);
        RastreadorVehiculo rastreadorHuaweiMovil = new RastreadorVehiculoGPS(gpsHuawei, appEscritorio);

        // Mostrar resultados con datos personalizados
        rastreadorGarminMovil.mostrarDatos("Lat: 4.7110, Lon: -74.0721", "Quiero");
        rastreadorTomTomEscritorio.mostrarDatos("Lat: 3.4516, Lon: -76.5320", "En movimiento");
        rastreadorHuaweiMovil.mostrarDatos("Lat: 4.7110, Lon: -74.0721", "En movimiento");


        /*//Garmin
        System.out.println(gpsGarmin.obtenerUbicacion("Lat: 4.7110, Lon: -74.0721"));
        System.out.println(gpsGarmin.obtenerUbicacion("Quiero"));
        //TomTom
        System.out.println(gpsTomTom.obtenerUbicacion(" Lat: 3.4516, Lon: -76.5320"));
        System.out.println(gpsTomTom.obtenerEstado("En movimiento"));
        //Huawei
        System.out.println(gpsHuawei.obtenerUbicacion("Lat: 4.7110, Lon: -74.0721"));
        System.out.println(gpsHuawei.obtenerEstado("En movimiento"));*/

        //Auditoria
        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }    
}
