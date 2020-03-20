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
package GUI;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class WindowApp {
    private static WindowApp INSTANCE = new WindowApp();
    private BotonesPanel bp;
    private JFrame frame;
    
    private WindowApp () {
        frame = new JFrame("Sistema de Gestión Automática del Vehículo");
        frame.setResizable(false);
        frame.setBounds(100,100,450,150);
        bp = new BotonesPanel();
        frame.getContentPane().add(bp);
        
	frame.addWindowListener (new WindowAdapter(){ 
            @Override
            public void windowClosing(WindowEvent e){
		System.exit(0);
            }
	});
    }
    
    public static WindowApp getInstance () {
        return INSTANCE;
    }
    
    public void ejecutar (Object o) {
        frame.setVisible(true);
    }
}
