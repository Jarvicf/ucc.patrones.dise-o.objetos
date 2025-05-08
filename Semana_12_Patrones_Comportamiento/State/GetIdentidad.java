package Semana_12_Patrones_Comportamiento.State;

import java.util.Base64;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetIdentidad {
    private String nombre = "Jarvic Balanta";
    private String patron;
    private String encabezado;

    public GetIdentidad(String patron, String encabezado) {
        this.patron = patron;
        this.encabezado = encabezado;
    }

    private String getBase64(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }

    public void getPatron() {
        System.out.println("---------------------------------------------------------");
        System.out.println("Patrón Identificado: " + patron);
        System.out.println("---------------------------------------------------------");
    }

    public void getNombre() {
        System.out.println("---------------------------------------------------------");
        System.out.println("Proyecto realizado por: " + getBase64(nombre));
        System.out.println("---------------------------------------------------------");
    }

    public void getEncabezado() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fecha = sdf.format(new Date());
        System.out.println("---------------------------------------------------------");
        System.out.println("Materia: Patrones de Diseño - UCC");
        System.out.println("Fecha de ejecución: " + fecha);
        System.out.println("Docente: Harold Adrian");
        // System.out.println("Patrón de diseño: " + patron);
        System.out.println("Encabezado: " + encabezado);
        System.out.println("---------------------------------------------------------");
    }
}
