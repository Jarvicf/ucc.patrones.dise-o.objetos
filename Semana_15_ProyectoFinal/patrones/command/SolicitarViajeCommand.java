package Semana_15_ProyectoFinal.patrones.command;

import Semana_15_ProyectoFinal.patrones.factoryMethod.SolicitudViaje;

public class SolicitarViajeCommand implements CommandViaje{
        private SolicitudViaje solicitud;

        public SolicitarViajeCommand(SolicitudViaje solicitud) {
        this.solicitud = solicitud;
    }

        @Override
        public void ejecutar() {
            // TODO Auto-generated method stub
            System.out.println("Ejecutando solicitud de viaje...");
            solicitud.mostrarDetalles();
        }

        @Override
        public void cancelar() {
            // TODO Auto-generated method stub
            System.out.println("Solicitud de viaje cancelada.");
        }
}
