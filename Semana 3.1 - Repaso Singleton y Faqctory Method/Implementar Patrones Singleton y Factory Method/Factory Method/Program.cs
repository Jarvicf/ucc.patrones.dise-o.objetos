
namespace co.edu.ucc.Jarvic.FactoryMethod
{
    interface Vehiculo
    {
        void conducir();
    }

    class CarroElectrico : Vehiculo
    {
    public void conducir()
    {
        Console.WriteLine("Conduciendo un carro eléctrico");
    }
    }

    class CarroGasolina : Vehiculo
    {
        public void conducir()
    {
        Console.WriteLine("Conduciendo un carro a gasolina");
    }
    }
 
    class FabricaVehiculos
    {
        public static Vehiculo crearVehiculo(String tipo)
        {
            if (tipo == "electrico") return new CarroElectrico();
            else if (tipo == "gasolina") return new CarroGasolina();
            return null;
        }
    }

    public class MainClass
    {
        public static void Main(String[] args)
        {
            GetIdentidad getIdentidad = new GetIdentidad("Builder", "Una empresa automotriz fabrica autos eléctricos y a gasolina. Se requiere una fábrica que genere instancias sin especificar directamente la clase concreta.");
            getIdentidad.GetEncabezado();


            Vehiculo v1 = FabricaVehiculos.crearVehiculo("electrico");
            v1.conducir();

            getIdentidad.GetNombre();
            getIdentidad.getPatron();
        }
    }


}

