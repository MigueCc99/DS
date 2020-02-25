/*
 * File: Carrera.java
 * Autoría: Miguel Ángel Campos Y Pablo *
 */
package practica1ds;
import java.util.ArrayList;

/**
 * Clase Carrera: representa instancias de carreras.
 */
public abstract class Carrera {
    protected ArrayList<Bicicleta> bicicletas;
    private int numBicicletas;

    public Carrera(){
        numBicicletas = 0;
        bicicletas = new ArrayList();
    }
    
    public Carrera(int numBicicletas){
        this.numBicicletas = numBicicletas;
        bicicletas = new ArrayList();
    }
    
    public int getNumBicicletas(){
        return numBicicletas;
    }
    
    public void startCarrera(){ // lanza las hebras de cada una de las bicicletas
        for(int i=0; i<bicicletas.size(); i++)
            bicicletas.get(i).thr.start();
    }
    
    public void añadeBicicleta(Bicicleta bici){
        bicicletas.add(bici);
    }
    
    public abstract void eliminarBicis();
    
}
