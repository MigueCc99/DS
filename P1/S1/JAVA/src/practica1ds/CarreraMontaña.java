/*
 * File: CarreraMontaña.java
 * Autoría: Miguel Ángel Campos Y Pablo *
 */
package practica1ds;

/**
 * Clase CarreraMontaña: representa instancias de carreras de montaña.
 */
public class CarreraMontaña extends Carrera{
    
    CarreraMontaña(int numBicicletas){
        super(numBicicletas);
        for(int i=0; i<numBicicletas; i++){
            BicicletaMontaña bm = new BicicletaMontaña(i);
            añadeBicicleta(bm);
        }
    }
    
    @Override
    public void eliminarBicis(){
        int abandona = (int)(getNumBicicletas()*0.20);
        for(int i=0; i<abandona; i++)
            bicicletas.get(i).thr.interrupt();
    }
}
