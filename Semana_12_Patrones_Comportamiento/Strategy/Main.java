package Semana_12_Patrones_Comportamiento.Strategy;

// Estrategia
interface EstrategiaImpuesto {
    double calcular(double monto);
}
 
// Implementación para Colombia
class ImpuestoColombia implements EstrategiaImpuesto {
    public double calcular(double monto) {
        return monto * 0.19;
    }
}
 
// Implementación para Argentina
class ImpuestoArgentina implements EstrategiaImpuesto {
    public double calcular(double monto) {
        return monto * 0.21;
    }
}
 
// Implementación para Ecuador
class ImpuestoEcuador implements EstrategiaImpuesto {
    public double calcular(double monto) {
        return 0.0;
    }
}
 
// Contexto
class CalculadoraImpuesto {
    private EstrategiaImpuesto estrategia;
 
    public void setEstrategia(EstrategiaImpuesto estrategia) {
        this.estrategia = estrategia;
    }
 
    public double calcularImpuesto(double monto) {
        return estrategia.calcular(monto);
    }
}
 
// Cliente
public class Main {
    public static void main(String[] args) {    

         GetIdentidad getIdentidad = new GetIdentidad("Strategy ","Aplicación de cálculo de impuestos en un ERP de una empresa logística.");
        getIdentidad.getEncabezado();

        CalculadoraImpuesto calculadora = new CalculadoraImpuesto();
 
        calculadora.setEstrategia(new ImpuestoColombia());
        System.out.println("Colombia: " + calculadora.calcularImpuesto(100000));
 
        calculadora.setEstrategia(new ImpuestoArgentina());
        System.out.println("Argentina: " + calculadora.calcularImpuesto(100000));
 
        calculadora.setEstrategia(new ImpuestoEcuador());
        System.out.println("Ecuador: " + calculadora.calcularImpuesto(100000));

        getIdentidad.getNombre();
        getIdentidad.getPatron();
    }
}
