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

import java.util.ArrayList;
import java.util.Random;

public class Simulador extends Observable implements Runnable{
    private ArrayList<Integer> temperaturas;
    private int temperaturaActual;
    private int tMin, tMax;
    private boolean running;
    private int tRefresco;
    
    private static int randInt(int min, int max){
        Random rand = new Random();
        return (rand.nextInt((max - min) + 1) + min);
    }
    
    public Simulador(int tMin, int tMax) {
        super();
        this.temperaturas = new ArrayList<>();
        this.running = true;
        this.tMin = tMin;
        this.tMax = tMax;
        this.tRefresco = 1000; // refresco x segundo
        
        for(int i=tMin; i<tMax; i++) // Generamos todo el intervalo de temperaturas desde tMin a TMax
            temperaturas.add(i);
    }
    
    public void stop() {
        running = false;
    }
    
    public void running() {
        running = true;
    }
    
    public int getTemperaturaActual(){
        return temperaturaActual;
    }

    public void actualizaTemperaturaMinMax(){
        if(temperaturaActual > tMax){
            tMax = temperaturaActual;
            temperaturas.remove(0);
            temperaturas.add(tMax);
        }
        
        if(temperaturaActual < tMin){
            tMin = temperaturaActual;
            temperaturas.remove(temperaturas.size()-1);
            temperaturas.add(0, tMin);
        }
        
        temperaturas.clear();
        
        for(int i = tMin; i<=tMax; i++)
            temperaturas.add(i);
    }
 
    @Override
    public void run() {
        Integer minutos = 0, segundos = 0, milesimas = 0;
        while (running){
            this.temperaturaActual = randInt(tMin-1, tMax+1);
            try {
                Thread.sleep(4);
                milesimas += 4;
                
                if(milesimas%tRefresco == 0){
                    actualizaTemperaturaMinMax();
                    notifyObservers(this.temperaturaActual);
                    milesimas = 0;
                }
                
            } catch(java.lang.InterruptedException e){
                e.printStackTrace();
            }
        }
   
    }
}
