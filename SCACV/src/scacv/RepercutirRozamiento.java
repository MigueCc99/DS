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
package scacv;

public class RepercutirRozamiento implements Filtro {
    private double rozamiento;
    private double minRev;            
    
    public RepercutirRozamiento () {
        rozamiento = 10;
        minRev = 0;
    }
    
    @Override 
    public double ejecutar (double revoluciones, EstadoMotor estado, double automatica) {
        if (estado != EstadoMotor.APAGADO && estado != EstadoMotor.ENCENDIDO){
            if(revoluciones-rozamiento > minRev)
                revoluciones -= rozamiento;
        }
        return revoluciones;
    }
}
