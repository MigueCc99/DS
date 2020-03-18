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

import java.util.ArrayList;
import java.util.Random;

public class Simulador extends Observable implements Runnable{
    private ArrayList<Integer> temperaturas;
    private int temperaturaActual;
    private int tMin, tMax;
    private boolean running;
    private boolean manual;
    private int tRefresco;
    
    private static int randInt(int min, int max){
        Random rand = new Random();
        return (rand.nextInt((max - min) + 1) + min);
    }
    
    public Simulador(int tMin, int tMax) {
        super();
        this.temperaturas = new ArrayList<>();
        this.running = true;
        this.manual = false;
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
    
    public int getTemperaturaMax(){
        return tMax;
    }
    
    public int getTemperaturaMin(){
        return tMin;
    }
    
    public int getTemperaturaActual(){
        return temperaturaActual;
    }
    
    public void setTemperaturaActual(int t){
        this.temperaturaActual = t;
    }

    public boolean getManual (){
        return this.manual;
    }
    
    public void setManual (boolean m){
        this.manual = m;
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
        Integer milesimas = 0;
        while (running){
            try {
                Thread.sleep(4);
                milesimas += 4;
                notifyObservers();
                if(milesimas%tRefresco == 0){
                    if(!manual)
                        temperaturaActual = randInt(tMin-1, tMax+1);
                    //actualizaTemperaturaMinMax();
                    milesimas = 0;
                }
                
            } catch(java.lang.InterruptedException e){
                e.printStackTrace();
            }
        }
   
    }
}
