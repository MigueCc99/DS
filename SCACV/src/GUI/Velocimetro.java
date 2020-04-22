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

public class Velocimetro extends JPanel {
    JLabel titulo;
    JLabel kmh;
    JLabel velocidadLineal;
    
    public Velocimetro (JPanel p) {
        inicializar(p);
    }
    
    private void inicializar (JPanel p) {
        titulo = new JLabel();
        titulo.setText("VELOCÍMETRO");
        titulo.setBounds(10,50,200,20);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setForeground(Color.WHITE);
        titulo.setOpaque(true);
        titulo.setBackground(Color.BLACK);
        titulo.setFont(new Font("arial", Font.ITALIC, 15));
        p.add(titulo);
        
        kmh = new JLabel();
        kmh.setText("Km/h");
        kmh.setBounds(20,125,40,20);
        kmh.setHorizontalAlignment(SwingConstants.CENTER);
        kmh.setForeground(Color.BLACK);
        kmh.setFont(new Font("arial", Font.ITALIC, 15));
        p.add(kmh); 
        
        velocidadLineal = new JLabel();
        velocidadLineal.setText("0.0");
        velocidadLineal.setBounds(100,125,100,20);
        velocidadLineal.setHorizontalAlignment(SwingConstants.CENTER);
        velocidadLineal.setForeground(Color.RED);
        velocidadLineal.setOpaque(true);
        velocidadLineal.setBackground(Color.BLACK);
        velocidadLineal.setFont(new Font("arial", Font.ITALIC, 15));
        p.add(velocidadLineal);   
    }
    
    public void update (double velocidadLineal) {
        this.velocidadLineal.setText(String.valueOf(velocidadLineal));
    }

}
