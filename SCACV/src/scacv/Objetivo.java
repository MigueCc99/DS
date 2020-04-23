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


import GUI.Scacv;

public class Objetivo {
    private static double radio = 0.15;
    private static int tiempo = 1;
    private double velocidadLineal;
    private double velocidadAngular;
    private double distancia; 
    private double automatica;
    private double velocidadLinealAutomatica;
    
    private double combustible;
    
    private double revolucionesAceite;
    private double revolucionesAceiteDesdeRevision;
    
    private double revolucionesPastillas;
    private double revolucionesPastillasDesdeRevision;
    
    private double revolucionesRevision;
    private double revolucionesRevisionDesdeRevision;
    
    private EstadoMotor estado;
    private Scacv scacv;
    
    public Objetivo () {
        estado = EstadoMotor.APAGADO;
        velocidadLineal = 0.0;
        velocidadAngular = 0.0;
        distancia = 0.0;
        automatica = 0.0;
        velocidadLinealAutomatica = 0.0;
        combustible = 500.0;
    }
    
    public double getVelocidadAngular () {
        return velocidadAngular;
    }
    
    public EstadoMotor getEstado () {
        return estado;
    }
    
    public double getAutomatica () {
        return automatica;
    }
    
    public double getVelocidadLineal () {
        return velocidadLineal;
    }
    
    public double getDistancia (){
        return distancia;
    }
    
    public double getCombustible (){
        return combustible;
    }
    
    public double getVelocidadLinealAutomatica () {
        return velocidadLinealAutomatica;
    }
    
    public void setEstado (EstadoMotor estado) {
        this.estado = estado;
    }
    
    public void setAutomatica (double revoluciones) {
        this.automatica = revoluciones;
    }
    
    public void setScacv (Scacv s){
        scacv = s;
    }
    
    public void setCombustible (double c){
        combustible = c;
    }
    
    public void calcularVelocidadLinealAutomatica (double automatica) {
        this.velocidadLinealAutomatica = 2*Math.PI*radio*automatica*0.006;
    }
    
    public void calcularConsumoCombustible (double r) {
        double consumo = ( r * r * 5 * Math.pow(10.0,-10.0) );
        if (combustible-consumo > 0) {
            combustible = combustible - consumo;
        } else {
            combustible = 0;
        }
    }
    
    public void consumirAceite (double r) {
        if (revolucionesAceite - r > 0) {
            revolucionesAceite -= r;
        } else {
            revolucionesAceite = 0;
        }
        revolucionesAceiteDesdeRevision += r;
    }
    
    public void cambiarAceite () {
        revolucionesAceite = 5.0 * Math.pow(10.0,6.0);
        revolucionesAceiteDesdeRevision = 0;
    }
    
    
    public void consumirPastillas (double r) {
        if (revolucionesPastillas - r > 0) {
            revolucionesPastillas -= r;
        } else {
            revolucionesPastillas = 0;
        }
        revolucionesPastillasDesdeRevision += r;
    }
    
    public void cambiarPastillas () {
        revolucionesPastillas = Math.pow(10.0,8.0);
        revolucionesPastillasDesdeRevision = 0;
    }
    
    public void consumirRevision (double r) {
        if (revolucionesRevision - r > 0) {
            revolucionesRevision -= r;
        } else {
            revolucionesRevision = 0;
        }
        revolucionesRevisionDesdeRevision += r;
    }
    
    public void cambiarRevision () {
        revolucionesRevision = Math.pow(10.0,8.0);
        revolucionesRevisionDesdeRevision = 0;
    }
    
    public void ejecutar (double revoluciones, EstadoMotor estado) {
        velocidadAngular = revoluciones;
        velocidadLineal = 2*Math.PI*radio*velocidadAngular*0.006;
        distancia += velocidadLineal * tiempo ;
        calcularConsumoCombustible(revoluciones);
        consumirAceite(revoluciones);
        consumirPastillas(revoluciones);
        consumirRevision(revoluciones);
    } 
}
