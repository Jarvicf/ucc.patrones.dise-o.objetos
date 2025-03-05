namespace co.edu.ucc.Jarvic.AbstractFactory
{
    interface Boton
    {
        void render();
    }

    interface Ventana
    {
        void mostrar();
    }

    //implementar Light
    class BotonLight : Boton
    {
        public void render()
        {
            Console.WriteLine("Renderizando botón Light");
        }
    }

    class VentanaLight : Ventana
    {
        public void mostrar()
        {
            Console.WriteLine("Renderizando ventana Linght");
        }
    }

    //implementar Dark
    class BotonDark : Boton
    {
        public void render()
        {
            Console.WriteLine("Renderizando botón Dark");
        }
    }

    class VentanaDark : Ventana
    {
        public void mostrar()
        {
            Console.WriteLine("Renderizando ventana Dark");
        }
    }

    interface GUIFactory
    {
        Boton crearBoton();
        Ventana crearVentana();
    }

    class LightFactory : GUIFactory
    {
        public Boton crearBoton()
        {
            return new BotonLight();
        }

        public Ventana crearVentana()
        {
            return new VentanaLight();
        }
    }

    class DarkFactory : GUIFactory
    {
        public Boton crearBoton()
        {
            return new BotonDark();
        }

        public Ventana crearVentana()
        {
            return new VentanaDark();
        }
    }

    public class MainClass{
        public static void Main(String[] args)
        {
            GetIdentidad getIdentidad = new GetIdentidad("Abstract Factory", "Un sistema operativo permite cambiar el tema de su interfaz gráfica (Light Mode y Dark Mode). Cada tema debe proporcionar sus propios botones y ventanas con estilos coherentes.");
            getIdentidad.GetEncabezado();

            GUIFactory factory = new DarkFactory();
            Boton boton = factory.crearBoton();
            Ventana ventana = factory.crearVentana();
            boton.render();
            ventana.mostrar();


            getIdentidad.GetNombre();
            getIdentidad.getPatron();
        }
    }

}

