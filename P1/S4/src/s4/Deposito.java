/**
 * Universidad de Granada - Grado en Informatica : 2020  
 * 
 * Asignatura: Desarrollo de Software
 * Practica 1 - Sesión 3
 * 
 * @author Miguel Ángel Campos Cubillas
 * @email miguecc99@correo.ugr.es
 * 
 */
package s4;

import java.util.Random;

public class Deposito implements Filtro {
    private double d;
    
    public Deposito () {
        d = 0;
    }
    
    public static int randInt (int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    
    @Override
    public double ejecutar (Object o) {
        Double aux = (Double)o;
        Integer auxI = aux.intValue();
        
        int dAux = randInt(0, auxI);
        
        if (dAux > (auxI/2))
            d = 1.0;
        else if (dAux > (auxI/4))
            d = 2.0;
        else
            d = 0.0;
        
        return d;
    }
    
    @Override 
    public String toString (Object o) {
        String msg = "Deposito: ";
        double deposito = ejecutar(o);
        
        if (deposito == 0.0)
            msg += "Vacio";
        else if (deposito == 1.0)
            msg += "Lleno";
        else
            msg += "Medio Deposito";
        
        return msg;
    }
}
