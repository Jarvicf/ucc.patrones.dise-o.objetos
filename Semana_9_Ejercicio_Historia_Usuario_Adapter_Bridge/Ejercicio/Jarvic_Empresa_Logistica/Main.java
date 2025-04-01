package Semana_9_Ejercicio_Historia_Usuario_Adapter_Bridge.Ejercicio.Jarvic_Empresa_Logistica;
//Como ingeniero de integración en una empresa de logística nacional, necesito que nuestro sistema de rastreo de vehículos sea capaz de integrarse con múltiples dispositivos GPS de diferentes marcas (Garmin, TomTom, Huawei), cada uno con su propia API, para mostrar de forma unificada los datos de ubicación y estado del vehículo en una aplicación móvil y de escritorio.
//Además, quiero poder modificar la interfaz gráfica del panel de rastreo dependiendo de si el usuario accede desde escritorio o desde el celular, sin tener que cambiar toda la lógica del sistema.
public class Main 
{
    public static void main(String[] args) 
    {
        GetIdentidad getIdentidad = new GetIdentidad("Patrón Adapter","Como analista financiero, necesito que el nuevo sistema de facturación pueda generar reportes compatibles con el sistema contable antiguo de la empresa, sin cambiar la lógica principal del sistema nuevo.");
        getIdentidad.getEncabezado();

        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }    
}
