
namespace co.edu.ucc.Jarvic.Prototype
{
    class Documento : ICloneable
    {
        private string contenido;

        public Documento(string contenido)
        {
            this.contenido = contenido;
        }

        public void Mostrar()
        {
            Console.WriteLine("Contenido del documento: " + contenido);
        }

        public object Clone()
        {
            return this.MemberwiseClone();
        }
    }

    class Program
    {
        static void Main()
        {
            try
            {
                GetIdentidad getIdentidad = new GetIdentidad("Prototype", "Un sistema de gestión documental permite a los usuarios crear documentos a partir de una plantilla preexistente en lugar de configurarlos manualmente desde cero.");
                getIdentidad.GetEncabezado();

                Documento docOriginal = new Documento("Plantilla Base");
                Documento docClonado = (Documento)docOriginal.Clone();

                docOriginal.Mostrar();
                docClonado.Mostrar();

                getIdentidad.GetNombre();
                getIdentidad.getPatron();
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }
        }
    }
}