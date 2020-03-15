/**
 * Universidad de Granada - Grado en Informatica : 2016  
 * 
 * Asignatura: Desarrollo de Software
 * Practica 1 - Sesión 3
 * 
 * @author Miguel Ángel Campos Cubillas
 * @email miguecc99@correo.ugr.es
 * 
 */
package s3;

import GUI.PantallaTemperatura;

public class S3 {

    public static void main(String[] args) {
        PantallaTemperatura pantallaT = new PantallaTemperatura ();
        Simulador simulador = new Simulador(0,60);
        pantallaT.setVisible(true);
        
        simulador.addObserver(pantallaT);
        
        Thread t1 = new Thread(simulador);
        t1.start();
    }
    
}
