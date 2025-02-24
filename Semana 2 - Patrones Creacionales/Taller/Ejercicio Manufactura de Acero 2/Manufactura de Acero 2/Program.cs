/*Como gerente de planta, quiero poder calcular el costo total de producción de un lote de acero, 
 para poder planificar el presupuesto.*/
namespace co.edu.ucc.Jarvic.ManufacturadeAcero
{
    class LoteAcero
    {
        private double cantidad; // en toneladas
        private double costoPorTonelada;

        public LoteAcero(double cantidad, double costoPorTonelada)
        {
            this.cantidad = cantidad;
            this.costoPorTonelada = costoPorTonelada;
        }

        public double calcularCostoTotal()
        {
            return cantidad * costoPorTonelada;
        }
    }

    public class ManufacturadeAcero
    {
        public static void Main(String[] args)
        {
            GetIdentidad getIdentidad = new GetIdentidad("Factory Method", "Como gerente de planta, quiero poder calcular el costo total de producción de un lote de acero, para poder planificar el presupuesto");
            getIdentidad.GetEncabezado();

            LoteAcero lote = new LoteAcero(50.0, 1200.0);
            Console.WriteLine("Costo total del lote: $" + lote.calcularCostoTotal());

            getIdentidad.GetNombre();
            getIdentidad.getPatron();
        }
    }

}


