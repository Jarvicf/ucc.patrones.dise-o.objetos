// Patrones de Diseño Orientado a Objetos

namespace co.edu.ucc.Jarvic.singlleton
{
    public class Banco
    {
        //Variables
        private string nombreBanco;
        private static Banco instance;

        /// <summary>
        /// Contructor Banco
        /// </summary>
        private Banco()
        {
            nombreBanco = "Banco Central";
        }

        /// <summary>
        /// 
        /// </summary>
        /// <returns></returns>
        public static Banco getInstance()
        {
            if (instance == null)
            {
                instance = new Banco();
            }

            return instance;
        }

        /// <summary>
        /// Imprime Nombre
        /// </summary>
        public void mostrarNombre()
        {
            Console.WriteLine("Bienvenido al " + nombreBanco);
        }
    }

    public class Singlleton
    {
        public static void Main(String[] args)
        {
            //Se crea instancia
            GetIdentidad identidadPrograma = new GetIdentidad("Singlleton");

            //Imprimimos el Encabezado            
            identidadPrograma.GetEncabezado();

            //Progama
            Banco banco = Banco.getInstance();
            banco.mostrarNombre();

            //imprimimos nombre
            identidadPrograma.GetNombre();

        }


    }
}
