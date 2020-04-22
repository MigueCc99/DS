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
public class CalcularVelocidad implements Filtro {
    private double incrementoVelocidad;
    private double minRev;
    private double maxRev;
    
    public CalcularVelocidad () {
        incrementoVelocidad = 0;
        minRev = 0;
        maxRev = 10000;       
    }    
    
    private void modificarIncremento (double revoluciones, EstadoMotor estado, double automatica) {
        if (estado == EstadoMotor.ACELERANDO){
            double aux = revoluciones + 500;
            if(aux < maxRev) {
                incrementoVelocidad = 500;
            }
            else{
                incrementoVelocidad = 0;
            }    
                
        }
        else if (estado == EstadoMotor.FRENANDO){
            double aux = revoluciones - 500;
            if(aux > minRev) {
                incrementoVelocidad = -500;
            }
            else{
                incrementoVelocidad = 0;
            }  
        }
        else if (estado == EstadoMotor.ACELERANDOAUTOMÁTICO){
            double aux = revoluciones + 500;
            if(aux < maxRev) {
                incrementoVelocidad = 500;
            }
            else{
                incrementoVelocidad = 0;
            }    
        }
        else if (estado == EstadoMotor.MANTENIENDOAUTOMÁTICO){
            if (revoluciones < automatica) {
                incrementoVelocidad = automatica - revoluciones;
            } else if(revoluciones > automatica) {
                incrementoVelocidad = revoluciones - automatica;
            }
            else{
                incrementoVelocidad = 0;
            }  
        }
        else {
            incrementoVelocidad = 0;
        }
    }
    
    @Override 
    public double ejecutar (double revoluciones, EstadoMotor estado, double automatica) {
        modificarIncremento(revoluciones, estado, automatica);
        
        if(estado != EstadoMotor.APAGADO)
            revoluciones = revoluciones + incrementoVelocidad;
        else
            revoluciones = 0;
        
        return revoluciones;
    }
}
