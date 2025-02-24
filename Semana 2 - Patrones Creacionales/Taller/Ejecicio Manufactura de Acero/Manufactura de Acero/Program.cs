
/*Como supervisor de producción, quiero poder registrar la cantidad de acero producido por cada máquina en un turno,
 * para poder llevar un control de la producción*/


using System.Collections;

namespace co.edu.ucc.Jarvic.ManufacturadDeAcero
{
    class Maquina
    {
        private String nombre;
        private double aceroProducido;

        public Maquina(String nombre)
        {
            this.nombre = nombre;
            this.aceroProducido = 0;
        }

        public void producirAcero(double cantidad)
        {
            this.aceroProducido += cantidad;
        }

        public String getNombre()
        {
            return nombre;
        }

        public double getAceroProducido()
        {
            return aceroProducido;
        }
    }

    class Turno
    {
        private List<Maquina> maquinas = new List<Maquina>();

        public void agregarMaquina(Maquina maquina)
        {
            maquinas.Add(maquina);
        }

        public void mostrarProduccion()
        {
            foreach (var maquina in maquinas)
            {
                Console.WriteLine("Máquina: " + maquina.getNombre() + ", Acero Producido: " + maquina.getAceroProducido() + " toneladas");

            }
        }
    }
    public class ManufacturadeAcero
    {
        public static void Main(String[] args)
        {
            GetIdentidad getIdentidad = new GetIdentidad("Builder", "Como supervisor de producción, quiero poder registrar la cantidad de acero producido por cada máquina en un turno, para poder llevar un control de la producción");
            getIdentidad.GetEncabezado();

            Turno turno = new Turno();
            Maquina maquina1 = new Maquina("Máquina 1");
            Maquina maquina2 = new Maquina("Máquina 2");

            maquina1.producirAcero(5.3);
            maquina2.producirAcero(7.8);

            turno.agregarMaquina(maquina1);
            turno.agregarMaquina(maquina2);

            turno.mostrarProduccion();

            getIdentidad.GetNombre();
            getIdentidad.getPatron();
        }
    }
}
