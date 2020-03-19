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
import GUI.TiempoSatelital;

public class S3 {

    public static void main(String[] args) {
        PantallaTemperatura pantallaT = new PantallaTemperatura();
        BotonCambio botonC = new BotonCambio();
        GraficaTemperatura graficaT = new GraficaTemperatura("Graficas de Temperaturas", 
         "Temperatura ºC - ºF");
        TiempoSatelital tiempoS = new TiempoSatelital();
        Simulador simuladorGranada = new Simulador(0,60);
        Simulador simuladorMadrid = new Simulador(0,60);
        Simulador simuladorBarcelona = new Simulador(0,60);
        Simulador simuladorOviedo = new Simulador(0,60);
        
        simuladorGranada.addObserver(pantallaT);
        simuladorGranada.addObserver(botonC);
        simuladorGranada.addObserver(graficaT);
        simuladorGranada.addObserver(tiempoS);
        
        tiempoS.setSujetosObservables(simuladorGranada, simuladorMadrid, simuladorBarcelona, simuladorOviedo);
        
        Thread t1 = new Thread(simuladorGranada);
        t1.start();
        Thread t2 = new Thread(simuladorMadrid);
        t2.start();
        Thread t3 = new Thread(simuladorBarcelona);
        t3.start();
        Thread t4 = new Thread(simuladorOviedo);
        t4.start();
        
    }
  
}
