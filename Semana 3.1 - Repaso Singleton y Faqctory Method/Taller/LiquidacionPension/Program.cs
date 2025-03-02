using LiquidacionPension;
using System.Collections.Generic;
using System;

namespace co.edu.ucc.Jarvic.Liquidacion
{
    interface Liquidacion
    {
        void Pagar();
    }

    public class Ley78(decimal salario, string empleado) : Liquidacion
    {
        public void Pagar()
        {
            decimal sal = salario * 15;
            Console.WriteLine(empleado + sal);
        }
    }

    public class Ley86(decimal salario, string empleado) : Liquidacion
    {
        public void Pagar()
        {
            decimal sal = salario * 5;
            Console.WriteLine(empleado + sal);
        }
    }

    public class Ley98(decimal salario, string empleado) : Liquidacion
    {
        public void Pagar()
        {
            decimal sal = salario * 2;
            Console.WriteLine(empleado + sal);
        }
    }

    public class Ley100(decimal salario, string empleado) : Liquidacion
    {
        public void Pagar()
        {
            Console.WriteLine(empleado + salario);
        }
    }

    public class leyPetro(decimal salario, string empleado) : Liquidacion
    {
        public void Pagar()
        {
            decimal sal = salario;

            if (salario >= 3500000)
            {
                sal = salario / 70 * 100;
            }
            Console.WriteLine(empleado + sal);
        }
    }

    //Liquidar
    class Liquidar
    {
        public static Liquidacion liquidacion(decimal Salario, string ley, string empleado)
        {
            try
            {
                if (ley == "Ley 78")
                {
                    return new Ley78(Salario, empleado);

                }
                else if (ley == "Ley 86")
                {
                    return new Ley86(Salario, empleado);
                }
                else if (ley == "Ley 98")
                {
                    return new Ley98(Salario, empleado);
                }
                else if (ley == "Ley 100")
                {
                    return new Ley100(Salario, empleado);
                }
                else if (ley == "Ley Petro")
                {
                    return new leyPetro(Salario, empleado);
                }

            }
            catch (Exception ex)
            {

                throw ex;
            }
            return null;

        }
    }

    public class MainClass
    {
        public static void Main(String[] args)
        {

            try
            {
                GetIdentidad getIdentidad = new GetIdentidad("Factory Method", "Un sistema de liquidación de pensiones requiere procesar varias leyes de liquidación de pensión para realizar el pago mensual, para ello se necesita que el salario de pensión sea liquidado con base en la ley a la que pertenece, con los siguientes datos.");
                getIdentidad.GetEncabezado();

                List<Empleado> empleados = new List<Empleado>();
                //ruta Archivo
                string ruta = "C:\\Users\\jdrom\\OneDrive\\Desktop\\archivoBase\\archivoDatos.txt";

                //Se lee el archivo
                empleados = new General().leerArchivo(ruta);

                for (int i = 0; i < empleados.Count; i++)
                {
                    Liquidacion l1 = Liquidar.liquidacion(empleados[i].Salario, empleados[i].Ley, "El empleado " + empleados[i].Nombre + " se debe liquidar con $");
                    l1.Pagar();
                }


                getIdentidad.GetNombre();
                getIdentidad.getPatron();
            }
            catch (Exception ex)
            {

                throw ex;
            }

        }
    }
}
