// Patrones de Diseño Orientado a Objetos

// Producto: Paciente
namespace co.edu.ucc.Jarvic.Builder
{
    class Paciente
    {
        private String nombre;
        private int edad;
        private String diagnostico;

        public void setNombre(String nombre)
        {
            this.nombre = nombre;
        }

        public void setEdad(int edad)
        {
            this.edad = edad;
        }

        public void setDiagnostico(String diagnostico)
        {
            this.diagnostico = diagnostico;
        }

        public void mostrarInfo()
        {
            Console.WriteLine("Paciente: " + nombre + ", Edad: " + edad + ", Diagnóstico: " + diagnostico);
        }
    }

    // Builder abstracto
    interface PacienteBuilder
    {
        void construirNombre();
        void construirEdad();
        void construirDiagnostico();
        Paciente getPaciente();
    }

    // Builder concreto para Paciente con Gripe
    class PacienteGripeBuilder : PacienteBuilder
    {
        private Paciente paciente;

        public PacienteGripeBuilder()
        {
            this.paciente = new Paciente();
        }


        public void construirNombre()
        {
            paciente.setNombre("Juan Pérez");
        }


        public void construirEdad()
        {
            paciente.setEdad(30);
        }


        public void construirDiagnostico()
        {
            paciente.setDiagnostico("Gripe");
        }


        public Paciente getPaciente()
        {
            return paciente;
        }
    }

    // Director
    class Medico
    {
        private PacienteBuilder pacienteBuilder;

        public void setPacienteBuilder(PacienteBuilder pacienteBuilder)
        {
            this.pacienteBuilder = pacienteBuilder;
        }

        public Paciente getPaciente()
        {
            return pacienteBuilder.getPaciente();
        }

        public void construirPaciente()
        {
            pacienteBuilder.construirNombre();
            pacienteBuilder.construirEdad();
            pacienteBuilder.construirDiagnostico();
        }
    }

    // Uso
    public class Builder
    {
        public static void Main(String[] args)
        {
            Medico medico = new Medico();
            PacienteBuilder pacienteGripeBuilder = new PacienteGripeBuilder();

            //Se crea instancia
            GetIdentidad identidadPrograma = new GetIdentidad("Builder");

            //Imprimimos el Encabezado            
            identidadPrograma.GetEncabezado();

            medico.setPacienteBuilder(pacienteGripeBuilder);
            medico.construirPaciente();

            Paciente paciente = medico.getPaciente();
            paciente.mostrarInfo();

            //imprimimos nombre
            identidadPrograma.GetNombre();
        }
    }

}

