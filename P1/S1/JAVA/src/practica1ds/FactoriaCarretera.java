/*
 * File: FactoriaCarretera.java
 * Autoría: Miguel Ángel Campos Y Pablo *
 */
package practica1ds;
import java.util.Random;

/**
 * Clase FactoriaCarretera: generador de carreras de carretera y bicicletas de carretera.
 */
public class FactoriaCarretera implements FactoriaCarreraYBicicleta{
    
    public FactoriaCarretera(){}
    
    @Override
    public CarreraCarretera crearCarrera(int numBicicletas) {
        return new CarreraCarretera(numBicicletas);
    }
    
    @Override
    public BicicletaCarretera crearBicicleta(int id) {
        return new BicicletaCarretera(id);
    }    
}
