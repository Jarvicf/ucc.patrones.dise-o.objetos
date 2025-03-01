namespace co.edu.ucc.Jarvic.Vehiculo
{
    //interfaz Vehiculo
    interface Vehiculo
    {
        void Crear();
    }

    //Clase carro electrico
    public class carroElectrico : Vehiculo
    {
        public void Crear()
        {
            Console.WriteLine("Carro Electrico Creado");
        }
    }

    //Clase carro a Gasolina
    public class CarroGasolina : Vehiculo
    {
        public void Crear()
        {
            Console.WriteLine("Carro a Gasolina Creado");
        }
    }       

    //Fabrica
    class Fabricar
    {
        public static Vehiculo crearVehiculo(string tipoCarro)
        {
            if(tipoCarro == "Electrico")
            {
                return new carroElectrico();

            }else if (tipoCarro == "Gasolina")
            {
                return new CarroGasolina();
            }
            else
            {
                Console.WriteLine("aun no ensanblamos carros tipo " + tipoCarro);
            }
            return null;
        }
    }

    public class MainClass
    {
        public static void Main(String[] args)
        {
            GetIdentidad getIdentidad = new GetIdentidad("Factory Method", "Un sistema de vehículos necesita eliminar la creación manual de objetos y aplicar Factory Method.");
            getIdentidad.GetEncabezado();

            Vehiculo v1 = Fabricar.crearVehiculo("Electrico");
            if (v1 != null)
                v1.Crear();

            getIdentidad.GetNombre();
            getIdentidad.getPatron();

            
        }        
    }
}


