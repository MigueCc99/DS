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

import GUI.WindowApp;

public class S4 {

    public static void main(String[] args) {
        WindowApp wa = WindowApp.getInstance();
        
        Despachador despachador = new Despachador (wa);
        
        Filtro fVelocidad = new Velocidad ();
        Filtro fDistancia = new Distancia ();
        Filtro fDeposito = new Deposito ();
        
        despachador.setFiltro(fVelocidad);
        despachador.setFiltro(fDistancia);
        despachador.setFiltro(fDeposito);
        
        Cliente cliente = new Cliente ();
        cliente.SetDespachador(despachador);
        cliente.solicitar(500);
        
    }
    
}
