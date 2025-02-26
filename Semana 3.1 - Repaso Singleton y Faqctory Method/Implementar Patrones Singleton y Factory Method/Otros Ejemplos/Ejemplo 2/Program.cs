
namespace co.edu.ucc.Jarvic.Ejemplo2
{
    interface Figura
    {
        void dibujar();
    }

    class Circulo : Figura
    {
        public void dibujar()
        {
            Console.WriteLine("Dibujando un círculo");
        }
}

    class Cuadrado : Figura
    {
        public void dibujar()
        {
            Console.WriteLine("Dibujando un cuadrado");
        }
    }
 
    class FiguraFactory
    {
        public static Figura crearFigura(String tipo)
        {
            if (tipo == "circulo") return new Circulo();
            else if (tipo == "cuadrado") return new Cuadrado();
            return null;
        }
    }

    public class MainClass
    {
        public static void Main(String[] args)
        {
            GetIdentidad getIdentidad = new GetIdentidad("Factory Method", "Una empresa automotriz fabrica autos eléctricos y a gasolina. Se requiere una fábrica que genere instancias sin especificar directamente la clase concreta.");
            getIdentidad.GetEncabezado();


            Figura f1 = FiguraFactory.crearFigura("circulo");
            f1.dibujar();

            getIdentidad.GetNombre();
            getIdentidad.getPatron();
        }
    }

}