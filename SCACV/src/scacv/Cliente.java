/**
 * Universidad de Granada - Grado en Informatica : 2020  
 * 
 * Asignatura: Desarrollo de Software
 * Practica 1 - Sesión 4
 * 
 * @author Miguel Ángel Campos Cubillas
 * @email miguecc99@correo.ugr.es
 * 
 */
package scacv;

import GUI.PanelBotones;

public class Cliente implements Runnable {
    private GestorFiltros gestorFiltros;
    private Objetivo obj;
    private PanelBotones pb;
    
    public Cliente (GestorFiltros gf) {
        gestorFiltros = gf;
    }
    
    public void solicitar (double revoluciones, EstadoMotor estado, double automatica){
        gestorFiltros.solicitarFiltro(revoluciones, estado, automatica);
    }
    
    public void setObjetivo (Objetivo o) {
        obj = o;
    }
    
    @Override 
    public void run() {
        Integer milesimas = 0;
        while (true){    
            try {
                Thread.sleep(4);
                milesimas += 4;
                if(milesimas % 1000 == 0){
                    solicitar(obj.getVelocidadAngular(), obj.getEstado(), obj.getAutomatica());
                    milesimas = 0;
                }
            } catch(java.lang.InterruptedException e){
                e.printStackTrace();
            }   
        }
    }
}    

