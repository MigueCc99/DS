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

import java.util.ArrayList;
import GUI.WindowApp;

public class CambioFiltro {
    private ArrayList <Filtro> filtros;
    private WindowApp window;
    
    public CambioFiltro () {
        filtros = new ArrayList <Filtro> ();
    }

    public void añadirFiltro (Filtro f) {
        filtros.add(f);
    }
    
    public void setObjetivo (WindowApp w) {
        window = w;
    }
    
    public void ejecutar (double peticion) {
        for (int i=0; i<filtros.size(); i++)
            System.out.println(filtros.get(i).toString(peticion));
        window.ejecutar(peticion);
    }
            
}
