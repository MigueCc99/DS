/**
 * Universidad de Granada - Grado en Informatica : 2020  
 * 
 * Asignatura: Desarrollo de Software
 * Practica 1 - Sesión 4
 * 
 * @author Miguel Ángel Campos Cubillas
 * @email miguecc99@correo.ugr.es
 * 
 */
package s4;

import GUI.Salpicadero;

public class Objetivo {
    private static double radio = 0.15;
    private static int tiempo = 1;
    private double velocidadLineal;
    private double velocidadAngular;
    private double distancia; 
    private Salpicadero salpicadero;
    
    public Objetivo (Salpicadero s) {
        salpicadero = s;
        velocidadLineal = 0.0;
        velocidadAngular = 0.0;
        distancia = 0.0;
    }
    
    public void ejecutar (double revoluciones, EstadoMotor estado) {
        velocidadAngular = revoluciones;
        velocidadLineal = 2*Math.PI*radio*velocidadAngular*(60/1000);
        distancia += velocidadLineal * tiempo ;
        
        //System.out.println("RPM: " + velocidadAngular + " VL: " + velocidadLineal + " Distancia: " + distancia);
        update();
    }
    
    public void update (){
        salpicadero.update(velocidadLineal, velocidadAngular, distancia);
    }
    
}
