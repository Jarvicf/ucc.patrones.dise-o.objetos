package Ubber.src.com.transporte.historia_5;

import Ubber.src.com.transporte.historia_4.Viaje;

public interface MediadorViaje {

    void viajeSolicitado(Viaje viaje);
    void viajeAsignado(Viaje viaje);
    void viajeIniciado(Viaje viaje);
    void viajeCompletado(Viaje viaje);
    void viajeCancelado(Viaje viaje);
    void viajeCalificado(Viaje viaje, int calificacion);    
} 
