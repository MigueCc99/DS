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
package s4;

public class Cliente {
    private GestorFiltros gestorFiltros;
    
    public Cliente (GestorFiltros gf) {
        gestorFiltros = gf;
    }
    
    public void solicitar (double revoluciones, EstadoMotor estado){
        gestorFiltros.solicitarFiltro(revoluciones, estado);
    }
}
