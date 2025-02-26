
namespace co.edu.ucc.Jarvic.Singleton
{
    class Logger
    {
        private static Logger instance;
        private Logger() { }
        public static Logger getInstance()
        {
            if (instance == null)
            {
                instance = new Logger();
            }
            return instance;
        }
        public void log(String message)
        {
            Console.WriteLine("[LOG] " + message);
        }
    }

    public class MainClass
    {
        public static void Main(String[] args)
        {
            GetIdentidad getIdentidad = new GetIdentidad("Singleton ", "Una aplicación bancaria necesita registrar eventos de usuario (inicio de sesión, transacciones, errores). Para evitar múltiples instancias del Logger y asegurar un control centralizado, se implementa el patrón Singleton.");
            getIdentidad.GetEncabezado();


            Logger logger1 = Logger.getInstance();
            logger1.log("Inicio de sesión");
            Logger logger2 = Logger.getInstance();
            logger2.log("Transacción realizada");

            getIdentidad.GetNombre();
            getIdentidad.getPatron();
        }
    }
}

