namespace co.edu.ucc.Jarvic.SectorAeroportuario
{
    using System;

    class Boleto
    {
        private int clase;
        private bool equipajeExtra;
        private bool seleccionAsiento;
        private bool comidaEspecial;

        private Boleto(BoletoBuilder builder)
        {
            this.clase = builder.Clase;
            this.equipajeExtra = builder.EquipajeExtra;
            this.seleccionAsiento = builder.SeleccionAsiento;
            this.comidaEspecial = builder.ComidaEspecial;
        }

        public void MostrarDetalles()
        {
            Console.WriteLine($"Clase: {clase}, Equipaje Extra: {equipajeExtra}, Selección de Asiento: {seleccionAsiento}, Comida Especial: {comidaEspecial}");
        }

        public class BoletoBuilder
        {
            public int Clase { get; }
            public bool EquipajeExtra { get; private set; }
            public bool SeleccionAsiento { get; private set; }
            public bool ComidaEspecial { get; private set; }

            public BoletoBuilder(int clase)
            {
                this.Clase = clase;
            }

            public BoletoBuilder AgregarEquipajeExtra()
            {
                this.EquipajeExtra = true;
                return this;
            }

            public BoletoBuilder SeleccionarAsiento()
            {
                this.SeleccionAsiento = true;
                return this;
            }

            public BoletoBuilder AgregarComidaEspecial()
            {
                this.ComidaEspecial = true;
                return this;
            }

            public Boleto Build()
            {
                return new Boleto(this);
            }
        }
    }

    class Program
    {
        static void Main()
        {
            GetIdentidad getIdentidad = new GetIdentidad("Builder", "Como ingeniero de software en una aerolínea, necesito un sistema de gestión de reservas de vuelos que permita a los clientes personalizar su boleto eligiendo la clase del vuelo (económica, ejecutiva, primera clase) y los servicios adicionales (equipaje extra, selección de asiento, comida especial). El sistema debe facilitar la creación de boletos personalizados sin alterar la lógica principal.");
            getIdentidad.GetEncabezado();

            Boleto boleto = new Boleto.BoletoBuilder(1)
                .AgregarEquipajeExtra()
                .SeleccionarAsiento()
                .AgregarComidaEspecial()
                .Build();

            boleto.MostrarDetalles();

            getIdentidad.GetNombre();
            getIdentidad.getPatron();
        }
    }

}