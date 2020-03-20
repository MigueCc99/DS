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

public class CalcularVelocidad implements Filtro {
    private double incrementoVelocidad;
    private double minRev;
    private double maxRev;
    
    public CalcularVelocidad () {
        incrementoVelocidad = 0;
        minRev = 0;
        maxRev = 5000;       
    }    
    
    private void modificarIncremento (double revoluciones, EstadoMotor estado) {
        if (estado == EstadoMotor.ACELERANDO){
            if(revoluciones+100 <= maxRev)
                incrementoVelocidad += 100;
        }
        else if (estado == EstadoMotor.FRENANDO){
            if(revoluciones-100 >= minRev)
                incrementoVelocidad -=100;
        }
        else{
            incrementoVelocidad = 0;
        }           
    }
    
    @Override 
    public double ejecutar (double revoluciones, EstadoMotor estado) {
        modificarIncremento(revoluciones, estado);
        
        revoluciones += incrementoVelocidad;
        
        return revoluciones;
    }
}
