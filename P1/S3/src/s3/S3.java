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
package s3;

import GUI.PantallaTemperatura;
import GUI.BotonCambio;

public class S3 {

    public static void main(String[] args) {
        PantallaTemperatura pantallaT = new PantallaTemperatura ();
        BotonCambio botonC = new BotonCambio();
        Simulador simulador = new Simulador(0,60);
        
        simulador.addObserver(pantallaT);
        simulador.addObserver(botonC);

        Thread t1 = new Thread(simulador);
        t1.start();
/*     
        while(true)
            System.out.println("Temperatura: " + simulador.getTemperaturaActual() + " Manual: " + simulador.getManual() + "\n");
*/    
    }
  
}
