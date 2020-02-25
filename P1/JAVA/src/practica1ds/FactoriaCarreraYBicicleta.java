/*
 * File: FactoriaCarreraYBicicleta.java
 * Autoría: Miguel Ángel Campos Y Pablo *
 */
package practica1ds;

/**
 * Clase FactoriaCarreraYBicicleta: generador de carreras y bicicletas.
 */
public interface FactoriaCarreraYBicicleta {
    public Carrera crearCarrera(int numBicicletas);
    public Bicicleta crearBicicleta(int id);
}
