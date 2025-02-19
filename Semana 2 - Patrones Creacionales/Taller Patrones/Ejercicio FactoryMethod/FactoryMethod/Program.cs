// Patrones de Diseño Orientado a Objetos

using System.Dynamic;

namespace co.edu.ucc.Jarvic.factoryMethod
{
    interface Medicamento
    {
        void administrar();
    }

    //producto concreto: Analgesico
    class Analgesico : Medicamento
    {
        public void administrar()
        {
            Console.WriteLine("Administrando analgesico para el dolor.");
        }
    }

    //producto concreto: Antibiotico
    class Antibiotico : Medicamento
    {
        public void administrar()
        {
            Console.WriteLine("Administrando antibiotico para la infeccion.");
        }
    }

    //creador abstracto
    abstract class Farmacia
    {
        public abstract Medicamento crearMedicamento();
        public void recetarMedicamento()
        {
            Medicamento medicamento = crearMedicamento();
            medicamento.administrar();
        }
    }

    //crear concreto para Analgesico
    class FarmaciaAnalgesico : Farmacia
    {
        public override Medicamento crearMedicamento()
        {
            return new Analgesico();
        }
    }

    class FarmaciaAntibiotico : Farmacia
    {
        public override Medicamento crearMedicamento()
        {
            return new Antibiotico();
        }
    }

    public class FactoryMethod
    {
        public static void Main(String[] args)
        {
            //Se crea instancia
            GetIdentidad identidadPrograma = new GetIdentidad("Factory Method");

            //Imprimimos el Encabezado            
            identidadPrograma.GetEncabezado();


            Farmacia farmaciaAnalgesico = new FarmaciaAnalgesico();
            farmaciaAnalgesico.recetarMedicamento();

            Farmacia farmaciaAntibiotico = new FarmaciaAntibiotico();
            farmaciaAntibiotico.recetarMedicamento();

            //imprimimos nombre
            identidadPrograma.GetNombre();
        }
    }
}

