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

public class Cliente implements Runnable {
    private GestorFiltros gestorFiltros;
    private Objetivo obj;
    
    public Cliente (GestorFiltros gf) {
        gestorFiltros = gf;
    }
    
    public void solicitar (double revoluciones, EstadoMotor estado){
        gestorFiltros.solicitarFiltro(revoluciones, estado);
    }
    
    public void setObjetivo (Objetivo o) {
        obj = o;
    }
    
    @Override 
    public void run() {
        Integer milesimas = 0;
        while (true){    
            try {
                Thread.sleep(4);
                if(milesimas % 1000 == 0){
                    solicitar(obj.getVelocidadAngular(),EstadoMotor.ACELERANDO);
                    milesimas = 0;
                }
            } catch(java.lang.InterruptedException e){
                e.printStackTrace();
            }   
        }
    }
}    

