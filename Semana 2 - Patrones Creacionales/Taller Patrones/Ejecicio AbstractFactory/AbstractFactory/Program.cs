// Patrones de Diseño Orientado a Objetos

namespace co.edu.ucc.Jarvic.factoryMethod
{
    // Producto abstracto: Cuenta
    interface Cuenta
    {
        void abrir();
    }

    // Producto concreto: Cuenta Corriente
    class CuentaCorriente : Cuenta
    {
        public void abrir()
        {
            Console.WriteLine("Abriendo cuenta corriente.");
        }
    }

    // Producto concreto: Cuenta Ahorros
    class CuentaAhorros : Cuenta
    {
        public void abrir()
        {
            Console.WriteLine("Abriendo cuenta de ahorros.");
        }
    }

    // Producto abstracto: Tarjeta
    interface Tarjeta
    {
        void emitir();
    }

    // Producto concreto: Tarjeta Débito
    class TarjetaDebito : Tarjeta
    {
        public void emitir()
        {
            Console.WriteLine("Emitiendo tarjeta de débito.");
        }
    }

    // Producto concreto: Tarjeta Crédito
    class TarjetaCredito : Tarjeta
    {
        public void emitir()
        {
            Console.WriteLine("Emitiendo tarjeta de crédito.");
        }
    }

    // Fábrica abstracta
    interface BancoFactory
    {
        Cuenta crearCuenta();
        Tarjeta crearTarjeta();
    }

    // Fábrica concreta para Cuenta Corriente y Tarjeta Débito
    class BancoCorrienteFactory : BancoFactory
    {
        public Cuenta crearCuenta()
        {
            return new CuentaCorriente();
        }

        public Tarjeta crearTarjeta()
        {
            return new TarjetaDebito();
        }
    }

    // Fábrica concreta para Cuenta Ahorros y Tarjeta Crédito
    class BancoAhorrosFactory : BancoFactory
    {

        public Cuenta crearCuenta()
        {
            return new CuentaAhorros();
        }
        public Tarjeta crearTarjeta()
        {
            return new TarjetaCredito();
        }
    }

    // Uso
    public class AbstractFactory
    {
        public static void Main(String[] args)
        {
            //Se crea instancia
            GetIdentidad identidadPrograma = new GetIdentidad("Abstract Factory");

            //Imprimimos el Encabezado            
            identidadPrograma.GetEncabezado();

            BancoFactory bancoCorriente = new BancoCorrienteFactory();
            Cuenta cuentaCorriente = bancoCorriente.crearCuenta();
            Tarjeta tarjetaDebito = bancoCorriente.crearTarjeta();
            cuentaCorriente.abrir();
            tarjetaDebito.emitir();

            BancoFactory bancoAhorros = new BancoAhorrosFactory();
            Cuenta cuentaAhorros = bancoAhorros.crearCuenta();
            Tarjeta tarjetaCredito = bancoAhorros.crearTarjeta();
            cuentaAhorros.abrir();
            tarjetaCredito.emitir();

            //imprimimos nombre
            identidadPrograma.GetNombre();
        }
    }
}

