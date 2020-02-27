/*
 * File: CarreraCarretera.java
 * Autoría: Miguel Ángel Campos Y Pablo *
 */
package practica1ds;
import java.util.ArrayList;

/**
 * Clase CarreraCarretera: representa instancias de carreras de carretera.
 */
public class CarreraCarretera extends Carrera{

    CarreraCarretera (int numBicicletas){
        super(numBicicletas);
        for(int i=0; i<numBicicletas; i++){
            BicicletaCarretera bc = new BicicletaCarretera(i);
            añadeBicicleta(bc);
        }
    }
    
    @Override
    public void eliminarBicis(){
        int abandona = (int)(getNumBicicletas()*0.10);
        for(int i=0; i<abandona; i++)
            bicicletas.get(i).thr.interrupt();
    }
}
