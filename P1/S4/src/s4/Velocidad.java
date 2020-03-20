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

public class Velocidad implements Filtro {
    private double velocidad;
    private double diametro;
    
    public Velocidad () {
        velocidad = 0;
        diametro = 60;      // diametro 60 cm
    }
    
    @Override
    public double ejecutar (Object o) {
        double velocidadAngular = (2 * Math.PI * (double)o)/60;
        
        velocidad = (velocidadAngular * (diametro/100)) * (3600/1000);
        
        return velocidad;
    }
    
    @Override
    public String toString (Object o) {
        return "Velocidad: " + ejecutar(o) + "km/h";
    }
}
