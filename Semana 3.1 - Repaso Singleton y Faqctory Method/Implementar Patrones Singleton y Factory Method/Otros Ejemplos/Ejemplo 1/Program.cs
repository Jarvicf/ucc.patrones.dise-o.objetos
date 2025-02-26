namespace co.edu.ucc.Jarvic.Ejemplo1
{
    class Database
    {
        private static Database instance;
        private Database() { Console.WriteLine("Conectando a la base de datos..."); }
        public static Database getInstance()
        {
            if (instance == null)
            {
                instance = new Database();
            }
            return instance;
        }
        public void ejecutarConsulta(String consulta)
        {
            Console.WriteLine("Ejecutando: " + consulta);
        }
    }

    public class MainCalss
    {
        public static void Main(String[] args)
        {
            GetIdentidad getIdentidad = new GetIdentidad("Singleton ", ": Un sistema de gestión de pedidos necesita que la conexión a la base de datos sea única para evitar conflictos y mejorar el rendimiento.");
            getIdentidad.GetEncabezado();

            Database db1 = Database.getInstance();
            db1.ejecutarConsulta("SELECT * FROM pedidos");

            getIdentidad.GetNombre();
            getIdentidad.getPatron();
        }
    }

}

