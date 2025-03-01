using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LiquidacionPension
{
    public class General
    {
        public List<Empleado> leerArchivo(string ruta)
        {
            try
            {
                List<Empleado> empleados = new List<Empleado>();

                empleados = ConvertirArchivo(ruta,empleados);

                if (empleados.Count == 0)
                    throw new Exception("Informacion ingresada es incorrecta");

                return empleados;
            }
            catch (Exception ex)
            {

                throw ex;
            }
        }

        private List<Empleado> ConvertirArchivo(string ruta, List<Empleado> empleados)
        {
            try
            {
                foreach (string linea in File.ReadLines(ruta))
                {
                    string[] datos = linea.Split(',');
                    if (datos.Length == 4)
                    {
                        empleados.Add(new Empleado
                        {
                            Nombre = datos[0].Trim(),
                            Cedula = datos[1].Trim(),
                            Salario = decimal.Parse(datos[2].Trim()),
                            Ley = datos[3].Trim()
                        });
                    }
                }

                return empleados;
            }
            catch (Exception ex)
            {

                throw ex;
            }
        }

    }
}
