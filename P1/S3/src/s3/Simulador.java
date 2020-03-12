/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3;

/**
 *
 * @author pvr999
 */
public class Simulador extends Observable {
    float temperaturaActual;
    
    public Simulador(float t) {
        temperaturaActual = 0;
    }
    
    public float getTemperaturaActual() {
        return temperaturaActual;
    }
    
    public void setTemperaturaActual(float t) {
        temperaturaActual = t;
    }
}
