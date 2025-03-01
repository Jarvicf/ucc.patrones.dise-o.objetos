using System;
using System.Text;

public class GetIdentidad
{
    private string nombre = "Jarvic Balanta";
    private string patron;
    private string encabezado;

    public GetIdentidad(string _patron, string encabezado)
    {
        this.patron = _patron;
        this.encabezado = encabezado;
    }

    private string GetBase64(string input)
    {
        byte[] bytes = Encoding.UTF8.GetBytes(input);
        return Convert.ToBase64String(bytes);
    }

    public void getPatron()
    {
        Console.WriteLine("---------------------------------------------------------");
        Console.WriteLine("Patrón Identificado: " + patron);
        Console.WriteLine("---------------------------------------------------------");
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
        Console.WriteLine(" Materia: Patrones de Diseño - UCC");
        Console.WriteLine(" Fecha de ejecución: " + fecha);
        Console.WriteLine(" Docente: Harold Adrian");
        //Console.WriteLine(" Patrón de diseño: " + patron);
        Console.WriteLine(" Encabezado: " + encabezado);
        Console.WriteLine("---------------------------------------------------------");
    }
}
