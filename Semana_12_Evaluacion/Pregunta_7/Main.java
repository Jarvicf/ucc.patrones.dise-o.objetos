package Semana_12_Evaluacion.Pregunta_7;

class HistoriaMedica implements Cloneable {
    private String nombrePaciente;
    private String diagnostico;
    private String observaciones;


    public HistoriaMedica(String nombrePaciente, String diagnostico, String observaciones) {
        this.nombrePaciente = nombrePaciente;
        this.diagnostico = diagnostico;
        this.observaciones = observaciones;
    }

    public void mostrarHistoria(){
        System.out.println("Nombre Paciente:: " + nombrePaciente +", diagnostico: " + diagnostico + ", observaciones: " + observaciones);
    }

    public void setAgregarObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    protected HistoriaMedica clone() throws CloneNotSupportedException{
        return (HistoriaMedica) super.clone();
    }
}

public class Main {
    public static void main(String[] args) throws Exception{
        HistoriaMedica historiaMedicaOriginal = new HistoriaMedica("Jarvic Balanta", "Gripe Aguda", "No");
        HistoriaMedica historiaMedicaClonar = historiaMedicaOriginal.clone();

        historiaMedicaClonar.setAgregarObservaciones("Vuelve por que la gripa no se le ha quitado");

        historiaMedicaOriginal.mostrarHistoria();
        historiaMedicaClonar.mostrarHistoria();

    }    
}
