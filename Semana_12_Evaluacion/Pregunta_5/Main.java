package Semana_12_Evaluacion.Pregunta_5;

class Auto{
    private String motor;
    private String sistemaAudio;
    private String sensorProximidad;

    public void setMotor(String motor){
        this.motor = motor;
    }

    public void setSistemaAudio(String sistemaAudio){
        this.sistemaAudio = sistemaAudio;
    }

    public void setSensorProximidad(String sensorProximidad){
        this.sensorProximidad = sensorProximidad;
    }

    public void mostrarCarro(){
        System.out.println(" Carro con  motor a: " + motor +", sistema de audio: " + sistemaAudio +", Con Sensor de proximidad: " + sensorProximidad);
    }
}

interface autoBuilder{

    void tipoMotor();
    void tipoSistemaAudio();
    void sensorProximidad();
    Auto getAuto();
}

//Builder concreto: Auto gasolina estandar no sensores
class autoGasolinaEstandarNoSensores  implements autoBuilder{

    private Auto auto;

    public autoGasolinaEstandarNoSensores(){
        this.auto = new Auto();
    }

    @Override
    public void tipoMotor() {
        auto.setMotor("Gasolina");
    }

    @Override
    public void tipoSistemaAudio() {
        auto.setSistemaAudio("Estándar");
    }

    @Override
    public void sensorProximidad() {
        auto.setSensorProximidad("No");
    }

    @Override
    public Auto getAuto() {
        return auto;
    }

}

//Builder concreto: Auto electrico estandar no sensores
class autoElectricoEstandarNoSensores  implements autoBuilder{

    private Auto auto;

    public autoElectricoEstandarNoSensores(){
        this.auto = new Auto();
    }

    @Override
    public void tipoMotor() {
        auto.setMotor("Electrico");
    }

    @Override
    public void tipoSistemaAudio() {
        auto.setSistemaAudio("Estándar");
    }

    @Override
    public void sensorProximidad() {
        auto.setSensorProximidad("No");
    }

    @Override
    public Auto getAuto() {
        return auto;
    }

}

//Builder concreto: Auto gasolina estandar con sensores
class autoGasolinaEstandarConSensores  implements autoBuilder{

    private Auto auto;

    public autoGasolinaEstandarConSensores(){
        this.auto = new Auto();
    }

    @Override
    public void tipoMotor() {
        auto.setMotor("Gasolina");
    }

    @Override
    public void tipoSistemaAudio() {
        auto.setSistemaAudio("Estándar");
    }

    @Override
    public void sensorProximidad() {
        auto.setSensorProximidad("Si");
    }

    @Override
    public Auto getAuto() {
        return auto;
    }

}

//Builder concreto: Auto electrico estandar con sensores
class autoElectricoEstandarConSensores  implements autoBuilder{

    private Auto auto;

    public autoElectricoEstandarConSensores(){
        this.auto = new Auto();
    }

    @Override
    public void tipoMotor() {
        auto.setMotor("Electrico");
    }

    @Override
    public void tipoSistemaAudio() {
        auto.setSistemaAudio("Estándar");
    }

    @Override
    public void sensorProximidad() {
        auto.setSensorProximidad("Si");
    }

    @Override
    public Auto getAuto() {
        return auto;
    }

}

//Builder concreto: Auto gasolina premium no sensores
class autoGasolinaPremiumNoSensores  implements autoBuilder{

    private Auto auto;

    public autoGasolinaPremiumNoSensores(){
        this.auto = new Auto();
    }

    @Override
    public void tipoMotor() {
        auto.setMotor("Gasolina");
    }

    @Override
    public void tipoSistemaAudio() {
        auto.setSistemaAudio("Premium");
    }

    @Override
    public void sensorProximidad() {
        auto.setSensorProximidad("No");
    }

    @Override
    public Auto getAuto() {
        return auto;
    }

}

//Builder concreto: Auto electrico estandar no sensores
class autoElectricoPremiumNoSensores  implements autoBuilder{

    private Auto auto;

    public autoElectricoPremiumNoSensores(){
        this.auto = new Auto();
    }

    @Override
    public void tipoMotor() {
        auto.setMotor("Electrico");
    }

    @Override
    public void tipoSistemaAudio() {
        auto.setSistemaAudio("Premium");
    }

    @Override
    public void sensorProximidad() {
        auto.setSensorProximidad("No");
    }

    @Override
    public Auto getAuto() {
        return auto;
    }

}

//Builder concreto: Auto gasolina premium con sensores
class autoGasolinaPremiunConSensores  implements autoBuilder{

    private Auto auto;

    public autoGasolinaPremiunConSensores(){
        this.auto = new Auto();
    }

    @Override
    public void tipoMotor() {
        auto.setMotor("Gasolina");
    }

    @Override
    public void tipoSistemaAudio() {
        auto.setSistemaAudio("Premium");
    }

    @Override
    public void sensorProximidad() {
        auto.setSensorProximidad("Si");
    }

    @Override
    public Auto getAuto() {
        return auto;
    }

}

//Builder concreto: Auto electrico premium con sensores
class autoElectricoPremiumConSensores  implements autoBuilder{

    private Auto auto;

    public autoElectricoPremiumConSensores(){
        this.auto = new Auto();
    }

    @Override
    public void tipoMotor() {
        auto.setMotor("Electrico");
    }

    @Override
    public void tipoSistemaAudio() {
        auto.setSistemaAudio("Premuim");
    }

    @Override
    public void sensorProximidad() {
        auto.setSensorProximidad("Si");
    }

    @Override
    public Auto getAuto() {
        return auto;
    }

}

// Director
class Director{
    private autoBuilder autobuilder;

    public void setAutoBuiler(autoBuilder autobuilder){
        this.autobuilder = autobuilder;
    }

    public Auto getAuto(){
        return autobuilder.getAuto();
    }

    public void construirAuto(){
        autobuilder.tipoMotor();
        autobuilder.tipoSistemaAudio();
        autobuilder.sensorProximidad();
    }
}

public class Main {
    public static void main(String[] args){
        
        Director director = new Director();
        autoBuilder autoGasolinaEstandarNoSensores = new autoGasolinaEstandarNoSensores();
    
        director.setAutoBuiler(autoGasolinaEstandarNoSensores);
        director.construirAuto();

        Auto auto = director.getAuto();
        auto.mostrarCarro();
    }  
    
}
