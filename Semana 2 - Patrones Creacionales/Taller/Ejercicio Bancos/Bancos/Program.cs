/*Como cliente del banco, quiero poder transferir dinero de mi cuenta a otra cuenta, 
 para poder realizar pagos o enviar dinero a familiares.*/

namespace co.edu.ucc.Jarvic.Bancos
{
    class CuentaBancaria
    {
        private String numeroCuenta;
        private double saldo;

        public CuentaBancaria(String numeroCuenta, double saldoInicial)
        {
            this.numeroCuenta = numeroCuenta;
            this.saldo = saldoInicial;
        }

        public bool transferir(CuentaBancaria destino, double monto)
        {
            if (this.saldo >= monto)
            {
                this.saldo -= monto;
                destino.saldo += monto;
                return true;
            }
            return false;
        }

        public void mostrarSaldo()
        {
            Console.WriteLine("Cuenta: " + numeroCuenta + ", Saldo: " + saldo);
        }
    }

    public class Bancos
    {
        public static void Main(String[] args)
        {
            GetIdentidad getIdentidad = new GetIdentidad("Prototype", ". Como cliente del banco, quiero poder transferir dinero de mi cuenta a otra cuenta, para poder realizar pagos o enviar dinero a familiares");
            getIdentidad.GetEncabezado();

            CuentaBancaria cuenta1 = new CuentaBancaria("123456", 1000.0);
            CuentaBancaria cuenta2 = new CuentaBancaria("654321", 500.0);

            cuenta1.transferir(cuenta2, 200.0);

            cuenta1.mostrarSaldo();
            cuenta2.mostrarSaldo();

            getIdentidad.GetNombre();
            getIdentidad.getPatron();
        }
    }

}
