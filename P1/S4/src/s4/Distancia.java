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

public class Distancia implements Filtro {
    private double distancia;
    private double diametro;
    private int tiempo;
    
    public Distancia () {
        distancia = 0.0;
        diametro = 60;      // 60 cm
        tiempo = 5;         // Se recalcula la distancia cada 5 segundos
    }
    
    @Override
    public double ejecutar (Object o) {
        double velocidadAngular = (2 * Math.PI * (double)o)/60;
        
        double velocidad = (velocidadAngular * (diametro/100));     //m/s
        
        distancia = velocidad * tiempo;     // distancia
        
        return distancia;
    }
    
    @Override
    public String toString (Object o) {
        return "Se ha recorrido en 5s: " + ejecutar(o) + "metros";
    }
    
}
