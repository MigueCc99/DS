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

import java.util.ArrayList;

public class CadenaFiltros {
    private ArrayList <Filtro> filtros;
    private Objetivo obj;
    
    public CadenaFiltros () {
        filtros = new ArrayList <Filtro>();
    }
    
    public void addFiltro (Filtro f) {
        filtros.add(f);
    }
    
    public void setObjetivo (Objetivo obj){
        this.obj = obj;
    }
    
    public void ejecutar (double revoluciones, EstadoMotor estado) {
        double aux = 0.0;
        for(int i=0; i<filtros.size(); i++)
            aux += filtros.get(i).ejecutar(revoluciones, estado);
        obj.ejecutar(aux, estado);
    }
}
