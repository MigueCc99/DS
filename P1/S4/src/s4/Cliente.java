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

public class Cliente {
    private Despachador despachador;
    
    public Cliente () {
        despachador = null;
    }
    
    public void SetDespachador (Despachador d) {
        despachador = d;
    }
    
    public void solicitar (double peticion) {
        despachador.solicitarFiltro(peticion);
    }
}
