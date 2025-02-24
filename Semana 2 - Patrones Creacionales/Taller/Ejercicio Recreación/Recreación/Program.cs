
/*Como usuario, quiero poder reservar una cancha de fútbol para un día y hora específicos, 
para poder jugar con mis amigos.Como usuario, quiero poder reservar una cancha de fútbol 
para un día y hora específicos, para poder jugar con mis amigos.*/

namespace co.edu.ucc.Jarvic.Recreación
{
    class CanchaReserva
    {
        private Dictionary<string, string> reservas = new Dictionary<string, string>();

        public bool reservarCancha(String fecha, String hora, String usuario)
        {
            String clave = fecha + " " + hora;
            if (reservas.ContainsKey(clave))
            {
                return false; // Ya está reservada
            }
            reservas.Add(clave, usuario);
            return true;
        }

        /// <summary>
        /// Se recorre y se muestra datos
        /// </summary>
        public void mostrarReservas()
        {
            foreach (KeyValuePair<string, string> entry in reservas)
            {
                Console.WriteLine("Fecha y Hora: " + entry.Key + ", Usuario: " + entry.Value);
               
            }            
        }
    }

    public class Recreación
    {
        public static void Main(String[] args)
        {
            //inclute el metodo getPatron y getIdentificacion
            GetIdentidad getIdentidad = new GetIdentidad("Singleton", "Como usuario, quiero poder reservar una cancha de fútbol para un día y hora específicos, \r\npara poder jugar con mis amigos.Como usuario, quiero poder reservar una cancha de fútbol \r\npara un día y hora específicos, para poder jugar con mis amigos.");
            getIdentidad.GetEncabezado();

            CanchaReserva cancha = new CanchaReserva();
            cancha.reservarCancha("2023-10-15", "18:00", "Juan Pérez");
            cancha.reservarCancha("2023-10-15", "20:00", "Carlos Gómez");
            cancha.mostrarReservas();

            getIdentidad.GetNombre();
            getIdentidad.getPatron();

        }
    }



}