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

public class Despachador {

    private CambioFiltro cambiador;

    public Despachador (WindowApp wa) {
        cambiador = new CambioFiltro();
        cambiador.setObjetivo(wa);
    }

    public void setFiltro (Filtro f) {
        cambiador.añadirFiltro(f);
    }

    public void solicitarFiltro (double peticion) {
        cambiador.ejecutar(peticion);
    }
}
