/*
 * File: FactoriaMontaña.java
 * Autoría: Miguel Ángel Campos Y Pablo *
 */
package practica1ds;

/**
 * Clase FactoriaMontaña: generador de carreras de montaña y bicicletas de montaña.
 */
public class FactoriaMontaña implements FactoriaCarreraYBicicleta{
    
    public FactoriaMontaña(){}
    
    @Override
    public CarreraMontaña crearCarrera(int numBicicletas) {
        return new CarreraMontaña(numBicicletas);
    }
    
    @Override
    public BicicletaMontaña crearBicicleta(int id) {
        return new BicicletaMontaña(id);
    }
}
