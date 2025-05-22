package Semana_15_ProyectoFinal.patrones.chainOfResponsibility;

public class ConfiguracionFiltros {
    public static FiltroConductor crearCadenaFiltros(String tipoVehiculo, double reputacionMinima) {
        FiltroConductor filtro1 = new FiltroDisponibilidad();
        FiltroConductor filtro2 = new FiltroTipoVehiculo(tipoVehiculo);
        FiltroConductor filtro3 = new FiltroSeguro();
        FiltroConductor filtro4 = new FiltroReputacion(reputacionMinima);

        filtro1.setSiguiente(filtro2);
        filtro2.setSiguiente(filtro3);
        filtro3.setSiguiente(filtro4);

        return filtro1;
    }
}
