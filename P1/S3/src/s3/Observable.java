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

public abstract class Observable {
    ArrayList<Observer> observers;
    
    public Observable(){
        observers = new ArrayList<Observer>();
    }
    
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    
    public void notifyObservers(int temperatura){
        for(Observer o : observers)
            o.update(this, temperatura);
    }
    
    
}
