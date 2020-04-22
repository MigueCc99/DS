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

public class GestorFiltros {
    private CadenaFiltros cadenaFiltros;
    
    public GestorFiltros () {
        cadenaFiltros = new CadenaFiltros();
    }
    
    public void addFiltro (Filtro f) {
        cadenaFiltros.addFiltro(f);
    }
    
    public void setObjetivo (Objetivo obj){
        cadenaFiltros.setObjetivo(obj);
    }
    
    public void solicitarFiltro (double revoluciones, EstadoMotor estado) {
        cadenaFiltros.ejecutar(revoluciones, estado);
    }
}
