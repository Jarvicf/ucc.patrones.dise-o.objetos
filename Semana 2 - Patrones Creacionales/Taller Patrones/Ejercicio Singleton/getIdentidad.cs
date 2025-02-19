using System;
using System.Text;

public class GetIdentidad
{
    private string nombre = "Jarvic Balanta";
    private string patron;

    public GetIdentidad(string _patron)
    {
        this.patron = _patron;
    }

    private string GetBase64(string input)
    {
        byte[] bytes = Encoding.UTF8.GetBytes(input);
        return Convert.ToBase64String(bytes);
    }

    public void GetNombre()
    {
        Console.WriteLine("---------------------------------------------------------");
        Console.WriteLine("Proyecto realizado por: " + GetBase64(nombre));
        Console.WriteLine("---------------------------------------------------------");

    }

    public void GetEncabezado()
    {
        string fecha = DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss");
        Console.WriteLine("---------------------------------------------------------");
        Console.WriteLine(" Patrones de Diseño Orientado a Objetos - UCC");
        Console.WriteLine(" Fecha de ejecución: " + fecha);
        Console.WriteLine(" Docente: HHarold Adrián Bolaños Rodríguez ");
        Console.WriteLine(" Patrón de diseño: " + patron);
        Console.WriteLine("---------------------------------------------------------");
    }
}
