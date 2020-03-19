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
import GUI.GraficaTemperatura;

public class S3 {

    public static void main(String[] args) {
        PantallaTemperatura pantallaT = new PantallaTemperatura();
        BotonCambio botonC = new BotonCambio();
        GraficaTemperatura graficaT = new GraficaTemperatura("Graficas de Temperaturas", 
         "Temperatura ºC - ºF");
        Simulador simulador = new Simulador(0,60);
        
        simulador.addObserver(pantallaT);
        simulador.addObserver(botonC);
        simulador.addObserver(graficaT);

        Thread t1 = new Thread(simulador);
        t1.start();
    }
  
}
