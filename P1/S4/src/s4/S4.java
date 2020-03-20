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
package s4;

import GUI.Salpicadero;
import GUI.PanelBotones;

public class S4 {

    public static void main(String[] args) {
        
        Salpicadero salpicadero = new Salpicadero();
        
        GestorFiltros gestorFiltros = new GestorFiltros();
        
        Filtro fCalcularVelocidad = new CalcularVelocidad();
        Filtro fRepercutirRozamiento = new RepercutirRozamiento();
        
        gestorFiltros.addFiltro(fCalcularVelocidad);
        gestorFiltros.addFiltro(fRepercutirRozamiento);
        
        Cliente cliente = new Cliente (gestorFiltros);
        
        Objetivo obj = new Objetivo (salpicadero);
        
        cliente.setObjetivo(obj);
        
        gestorFiltros.setObjetivo(obj);
        
        PanelBotones panelBotones = new PanelBotones(obj);
        
        Thread t1 = new Thread(cliente);
        t1.start();
    }
    
}
