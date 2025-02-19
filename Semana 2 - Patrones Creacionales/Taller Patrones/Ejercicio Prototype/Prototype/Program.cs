using System;

namespace co.edu.ucc.Jarvic.Prototype
{
    // Definición del patrón Prototipo
    interface ICuentaBancaria : ICloneable
    {
        ICuentaBancaria Clone();
        void MostrarInfo();
    }

    // Producto concreto: Cuenta de Ahorros
    class CuentaAhorros : ICuentaBancaria
    {
        private string titular;
        private double saldo;

        // Constructor
        public CuentaAhorros(string titular, double saldo)
        {
            this.titular = titular;
            this.saldo = saldo;
        }

        // Implementación de la clonación
        public ICuentaBancaria Clone()
        {
            // Realizamos una clonación superficial aquí
            return (ICuentaBancaria)this.MemberwiseClone();
        }

        // Mostrar la información de la cuenta
        public void MostrarInfo()
        {
            Console.WriteLine($"Cuenta de Ahorros - Titular: {titular}, Saldo: {saldo}");
        }

        object ICloneable.Clone()
        {
            throw new NotImplementedException();
        }
    }

    // Uso
    public class Prototype
    {
        public static void Main(string[] args)
        {
            try
            {
                //Se crea instancia
                GetIdentidad identidadPrograma = new GetIdentidad("Prototype");

                //Imprimimos el Encabezado            
                identidadPrograma.GetEncabezado();
                // Crear la cuenta original
                CuentaAhorros cuentaOriginal = new CuentaAhorros("Carlos Gómez", 1000.0);

                // Clonar la cuenta
                CuentaAhorros cuentaClonada = (CuentaAhorros)cuentaOriginal.Clone();

                // Mostrar la información de ambas cuentas
                cuentaOriginal.MostrarInfo();
                cuentaClonada.MostrarInfo();

                //imprimimos nombre
                identidadPrograma.GetNombre();

            }
            catch (Exception e)
            {
                Console.WriteLine($"Error: {e.Message}");
            }
        }
    }
}


