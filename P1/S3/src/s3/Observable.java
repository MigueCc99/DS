/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3;

import java.util.ArrayList;

/**
 *
 * @author pvr999
 */
public abstract class Observable {
    ArrayList<Observer> observers;
    
    protected Observable(){
        observers = new ArrayList<Observer>();
    }
    
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    
    public void notifyObservers(){
        
    }
    
    
}
