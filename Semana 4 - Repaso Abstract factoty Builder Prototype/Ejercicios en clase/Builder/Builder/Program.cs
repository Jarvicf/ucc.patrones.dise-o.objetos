
namespace co.edu.ucc.Jarvic.Builder
{
    using System;

    class Usuario
    {
        private string nombre;
        private int edad;
        private string direccion;
        private string telefono;

        private Usuario(UsuarioBuilder builder)
        {
            this.nombre = builder.Nombre;
            this.edad = builder.Edad;
            this.direccion = builder.Direccion;
            this.telefono = builder.Telefono;
        }

        public class UsuarioBuilder
        {
            public string Nombre { get; }
            public int Edad { get; private set; }
            public string Direccion { get; private set; }
            public string Telefono { get; private set; }

            public UsuarioBuilder(string nombre)
            {
                Nombre = nombre;
            }

            public UsuarioBuilder SetEdad(int edad)
            {
                this.Edad = edad;
                return this;
            }

            public UsuarioBuilder SetDireccion(string direccion)
            {
                this.Direccion = direccion;
                return this;
            }

            public UsuarioBuilder SetTelefono(string telefono)
            {
                this.Telefono = telefono;
                return this;
            }

            public Usuario Build()
            {
                return new Usuario(this);
            }
        }

        public override string ToString()
        {
            return $"Usuario: {nombre}, Edad: {edad}, Dirección: {direccion}, Teléfono: {telefono}";
        }
    }

    public class MainClass
    {
        public static void Main(String[] args)
        {
            GetIdentidad getIdentidad = new GetIdentidad("Builder", "En una aplicación, los usuarios pueden configurarse con diferentes atributos como nombre, edad, dirección y número de teléfono. No todos los atributos son obligatorios, por lo que es conveniente usar Builder para evitar múltiples constructores..");
            getIdentidad.GetEncabezado();

            var usuario = new Usuario.UsuarioBuilder("Juan Pérez")
                .SetEdad(30)
                .SetDireccion("Av. Principal 123")
                .SetTelefono("123456789")
                .Build();

            Console.WriteLine(usuario);

            getIdentidad.GetNombre();
            getIdentidad.getPatron();
        }
    }
}

