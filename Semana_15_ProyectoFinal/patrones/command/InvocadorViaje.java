package Semana_15_ProyectoFinal.patrones.command;

public class InvocadorViaje {
    private CommandViaje comando;

    public void setComando(CommandViaje comando) {
        this.comando = comando;
    }

    public void ejecutarComando() {
        if (comando != null) comando.ejecutar();
    }

    public void cancelarComando() {
        if (comando != null) comando.cancelar();
    }

}
