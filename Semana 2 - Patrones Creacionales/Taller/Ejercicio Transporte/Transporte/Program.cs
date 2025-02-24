/*Como pasajero, quiero poder comprar un boleto de autobús para un viaje específico, 
para poder viajar a mi destino.*/
namespace co.edu.ucc.Jarvic.Transporte
{
    class Boleto
    {
        private String viaje;
        private String pasajero;

        public Boleto(String viaje, String pasajero)
        {
            this.viaje = viaje;
            this.pasajero = pasajero;
        }

        public void mostrarBoleto()
        {
            Console.WriteLine("Viaje: " + viaje + ", Pasajero: " + pasajero);
        }
    }

    class Autobus
    {
        public Boleto comprarBoleto(String viaje, String pasajero)
        {
            return new Boleto(viaje, pasajero);
        }
    }

    public class Transporte
    {
        public static void Main(String[] args)
        {
            GetIdentidad getIdentidad = new GetIdentidad("Factory Method", "Como pasajero, quiero poder comprar un boleto de autobús para un viaje específico, para poder viajar a mi destino");
            getIdentidad.GetEncabezado();

            Autobus autobus = new Autobus();
            Boleto boleto = autobus.comprarBoleto("Ciudad A - Ciudad B", "Juan Pérez");
            boleto.mostrarBoleto();

            getIdentidad.GetNombre();
            getIdentidad.getPatron();
        }
    }

}
