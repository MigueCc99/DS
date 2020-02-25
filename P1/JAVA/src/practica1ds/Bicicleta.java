/*
 * File: Bicicleta.java
 * Autoría: Miguel Ángel Campos Y Pablo *
 */
package practica1ds;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase Bicicleta: representa instancias de bicicletas que participan en una carrera.
 */
public abstract class Bicicleta extends Thread{
    private int idBicicleta;
    private boolean running;
    public Thread thr;
    
    public Bicicleta() {
        idBicicleta = 0;
	this.thr = new Thread(this);
    }
    
    public Bicicleta (int id){
        idBicicleta = id;
        this.thr = new Thread(this);
    }
    
    public int getIdBicicleta(){
        return idBicicleta;
    }

    @Override
    public void run() {
        try {
            System.out.println("Bicicleta " + idBicicleta + " corriendo.");
            Thread.sleep(60);
        } catch (InterruptedException ex) {
            System.out.println(toString()+" - ABANDONA");;
        }
    }

    /*
    @Override
    public void run(){
        System.out.println("Bicicleta " + idBicicleta + " corriendo.");
	try {
            while(running){
            // parar la hebra aleatoriamente
		Thread.sleep((long) ((Math.random()*1)*1000));
            }
	} catch(Exception e) {
            e.getStackTrace();
    	}
    }
    */
    @Override
    public String toString() {
	return "Bicicleta - " + idBicicleta;
    }
}
