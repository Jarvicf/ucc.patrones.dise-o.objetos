using System.Threading.Tasks;

namespace co.edu.ucc.Jarvic.SectorFinanciero
{
    interface Prestamo
    {
        void mostrarDetalles();
    }

    class PrestamoHipotecario : Prestamo
    {
        public void mostrarDetalles()
        {
            Console.WriteLine("Préstamo Hipotecario: tasa 5%, plazo 30 años");
        }
    }

    class PrestamoAutomotriz : Prestamo
    {
        public void mostrarDetalles()
        {
            Console.WriteLine("Préstamo Automotriz: tasa 7%, plazo 5 años");
        }
    }
 
    class PrestamoPersonal : Prestamo
    {
    public void mostrarDetalles()
        {
            Console.WriteLine("Préstamo Personal: tasa 10%, plazo 3 años");
        }
    }
 
    class FabricaPrestamo
    {
        public static Prestamo obtenerPrestamo(String tipo)
        {
            switch (tipo)
            {
                case "hipotecario": return new PrestamoHipotecario();
                case "automotriz": return new PrestamoAutomotriz();
                case "personal": return new PrestamoPersonal();
                default: throw new Exception("Tipo de préstamo no válido");
            }
        }
    }

    public class MainClass
    {
        public static void Main(String[] args)
        {
            GetIdentidad getIdentidad = new GetIdentidad("Factory Method", "Como desarrollador de un banco digital, necesito un sistema que permita a los clientes solicitar diferentes tipos de préstamos (hipotecario, automotriz, personal) con diferentes tasas de interés y plazos. El sistema debe garantizar que las reglas de negocio sean aplicadas correctamente según el tipo de préstamo seleccionado.");
            getIdentidad.GetEncabezado();

            Prestamo p1 = FabricaPrestamo.obtenerPrestamo("personal");
            p1.mostrarDetalles();

            getIdentidad.GetNombre();
            getIdentidad.getPatron();
        }
    }

}