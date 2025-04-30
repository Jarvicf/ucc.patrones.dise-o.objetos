package Semana_11_Patrones_Facade_Proxy_Flyweight.Ejercicios.Flyweight;

import java.util.HashMap;
 
public class FabricaLetras {
    private static final HashMap<Character, ILetra> pool = new HashMap<>();
 
    public static ILetra obtenerLetra(char simbolo) {
        if (!pool.containsKey(simbolo)) {
            pool.put(simbolo, new LetraConcreta(simbolo));
        }
        return pool.get(simbolo);
    }
}

