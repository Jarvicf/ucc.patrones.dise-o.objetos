package Semana_15_ProyectoFinal.patrones.builder;

public class PerfilConductor implements PerfilConductorPrototype {
    private String nombre;
    private String cedula;
    private String tipoLicencia;
    private String vehiculo;
    private String polizaSeguro;
    private String antecedentes;
    private String tipoVehiculo;
    private boolean disponible;
    private boolean tieneSeguro;
    private double reputacion;
    private double latitud;
    private double longitud;

    // Constructor privado
    private PerfilConductor() {}

    // Getters
    public String getNombre() { return nombre; }

    public boolean estaDisponible() {
        return disponible;
    }

    public boolean tieneSeguro() {
        return tieneSeguro;
    }

    public double getReputacion() {
        return reputacion;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public String getResumen() {
        return "Nombre: " + nombre + ", Cédula: " + cedula + ", Vehículo: " + vehiculo +
               ", Licencia: " + tipoLicencia +
               (polizaSeguro != null ? ", Póliza: " + polizaSeguro : "") +
               (antecedentes != null ? ", Antecedentes: " + antecedentes : "");
    }

    // Clonación (Prototype)
    @Override
    public PerfilConductor clonar() {
        PerfilConductor clon = new PerfilConductor();
        clon.nombre = this.nombre;
        clon.cedula = this.cedula;
        clon.tipoLicencia = this.tipoLicencia;
        clon.vehiculo = this.vehiculo;
        clon.polizaSeguro = this.polizaSeguro;
        clon.antecedentes = this.antecedentes;
        return clon;
    }

    // Builder anidado
    public static class Builder {
        private PerfilConductor perfil = new PerfilConductor();

        public Builder setNombre(String nombre) {
            perfil.nombre = nombre;
            return this;
        }

        public Builder setCedula(String cedula) {
            perfil.cedula = cedula;
            return this;
        }

        public Builder setTipoLicencia(String tipoLicencia) {
            perfil.tipoLicencia = tipoLicencia;
            return this;
        }

        public Builder setVehiculo(String vehiculo) {
            perfil.vehiculo = vehiculo;
            return this;
        }

        public Builder setPolizaSeguro(String poliza) {
            perfil.polizaSeguro = poliza;
            return this;
        }

        public Builder setAntecedentes(String antecedentes) {
            perfil.antecedentes = antecedentes;
            return this;
        }

        public PerfilConductor build() {
            return perfil;
        }
    }
}
