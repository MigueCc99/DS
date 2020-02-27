/*
 * File: Cliente.java
 * Autoría: Miguel Ángel Campos Y Pablo *
 */
package practica1ds;
import java.util.Scanner;

/**
 * Clase Cliente: esta clase representa al cliente que interactua con el
 * software diseñado. 
 */
public class Cliente {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        FactoriaCarreraYBicicleta factoria;
        Carrera carreraMontaña;
        Carrera carreraCarretera;
        
        System.out.println("Introduce el número de bicicletas: ");
        int N = sc.nextInt();
        sc.close();
        
        factoria = new FactoriaMontaña();
        carreraMontaña = factoria.crearCarrera(N);
        factoria = new FactoriaCarretera();
        carreraCarretera = factoria.crearCarrera(N);
        
        carreraMontaña.startCarrera();
        carreraCarretera.startCarrera();
        carreraMontaña.eliminarBicis();
        carreraCarretera.eliminarBicis();
        
    }
    
}
