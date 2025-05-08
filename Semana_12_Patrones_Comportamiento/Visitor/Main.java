package Semana_12_Patrones_Comportamiento.Visitor;

import java.util.ArrayList;
import java.util.List;

// Interfaz del Visitor
interface ActivoVisitor {
    void visitar(Inmueble i);
    void visitar(Vehiculo v);
}
 
// Interfaz del elemento visitable
interface Activo {
    void aceptar(ActivoVisitor visitor);
}
 
// Elemento 1
class Inmueble implements Activo {
    public void aceptar(ActivoVisitor visitor) {
        visitor.visitar(this);
    }
 
    public double calcularValorFiscal() {
        return 100000;
    }
}
 
// Elemento 2
class Vehiculo implements Activo {
    public void aceptar(ActivoVisitor visitor) {
        visitor.visitar(this);
    }
 
    public double calcularValorFiscal() {
        return 35000;
    }
}
 
// Visitor concreto: Reporte Fiscal
class ReporteFiscalVisitor implements ActivoVisitor {
    public void visitar(Inmueble i) {
        System.out.println("Inmueble - Valor fiscal: $" + i.calcularValorFiscal());
    }
 
    public void visitar(Vehiculo v) {
        System.out.println("Vehículo - Valor fiscal: $" + v.calcularValorFiscal());
    }
}
 
// Cliente
public class Main {
    public static void main(String[] args) {
        GetIdentidad getIdentidad = new GetIdentidad("Visitor ","Sistema de contabilidad que genera diferentes reportes sobre activos.");
        getIdentidad.getEncabezado();

        List<Activo> activos = new ArrayList<>();
        activos.add(new Inmueble());
        activos.add(new Vehiculo());
 
        ActivoVisitor reporte = new ReporteFiscalVisitor();
 
        for (Activo a : activos) {
            a.aceptar(reporte);
        }

        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}
