package Ubber.src.com.transporte.historia_1;

public class PerfilConductor implements Cloneable{
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String vehiculoMarca;
    private String vehiculoModelo;
    private String licenciaConduccion;
    private String polizaSeguro;
    private String antecedentes;

    private PerfilConductor(Builder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.email = builder.email;
        this.telefono = builder.telefono;
        this.vehiculoMarca = builder.vehiculoMarca;
        this.vehiculoModelo = builder.vehiculoModelo;
        this.licenciaConduccion = builder.licenciaConduccion;
        this.polizaSeguro = builder.polizaSeguro;
        this.antecedentes = builder.antecedentes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getVehiculoMarca() {
        return vehiculoMarca;
    }

    public String getVehiculoModelo() {
        return vehiculoModelo;
    }

    public String getLicenciaConduccion() {
        return licenciaConduccion;
    }

    public String getPolizaSeguro() {
        return polizaSeguro;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public PerfilConductor clone() {
        try {
            return (PerfilConductor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static class Builder {
        private String nombre;
        private String apellido;
        private String email;
        private String telefono;
        private String vehiculoMarca;
        private String vehiculoModelo;
        private String licenciaConduccion;
        private String polizaSeguro;
        private String antecedentes;

        public Builder(String nombre, String apellido, String email) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.email = email;
        }

        public Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder vehiculoMarca(String vehiculoMarca) {
            this.vehiculoMarca = vehiculoMarca;
            return this;
        }

        public Builder vehiculoModelo(String vehiculoModelo) {
            this.vehiculoModelo = vehiculoModelo;
            return this;
        }

        public Builder licenciaConduccion(String licenciaConduccion) {
            this.licenciaConduccion = licenciaConduccion;
            return this;
        }

        public Builder polizaSeguro(String polizaSeguro) {
            this.polizaSeguro = polizaSeguro;
            return this;
        }

        public Builder antecedentes(String antecedentes) {
            this.antecedentes = antecedentes;
            return this;
        }

        public PerfilConductor build() {
            return new PerfilConductor(this);
        }
    }
}
