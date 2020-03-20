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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CuentaRevoluciones extends JPanel {
    JLabel titulo;
    JLabel revoluciones;
    JLabel rev;
    
    public CuentaRevoluciones (JPanel p) {
        inicializar(p);
    }
    
    private void inicializar (JPanel p) {
        titulo = new JLabel();
        titulo.setText("CUENTAREVOLUCIONES");
        titulo.setBounds(10,450,200,20);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setForeground(Color.WHITE);
        titulo.setOpaque(true);
        titulo.setBackground(Color.BLACK);
        titulo.setFont(new Font("arial", Font.ITALIC, 15));
        p.add(titulo);

        revoluciones = new JLabel();
        revoluciones.setText("RPM");
        revoluciones.setBounds(20,500,40,20);
        revoluciones.setHorizontalAlignment(SwingConstants.CENTER);
        revoluciones.setForeground(Color.BLACK);
        revoluciones.setFont(new Font("arial", Font.ITALIC, 15));
        p.add(revoluciones); 
        
        rev = new JLabel();
        rev.setText("0.0");
        rev.setBounds(100,500,100,20);
        rev.setHorizontalAlignment(SwingConstants.CENTER);
        rev.setForeground(Color.RED);
        rev.setOpaque(true);
        rev.setBackground(Color.BLACK);
        rev.setFont(new Font("arial", Font.ITALIC, 15));
        p.add(rev);   
    }    
}
