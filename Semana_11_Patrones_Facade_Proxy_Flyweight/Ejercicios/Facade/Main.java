package Semana_11_Patrones_Facade_Proxy_Flyweight.Ejercicios.Facade;



public class Main {
    public static void main(String[] args) {

        GetIdentidad getIdentidad = new GetIdentidad("Patrón Facade","Como usuario, quiero reservar un hotel en línea sin tener que interactuar con reservas, pagos y facturación manualmente");
        getIdentidad.getEncabezado();

        FacadeReservaHotel facade = new FacadeReservaHotel();
        facade.reservar();

        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}
