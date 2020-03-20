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

public class CuentaKilometros extends JPanel {
    JLabel titulo;
    JLabel reciente;
    JLabel kmTotales;
    JLabel r;
    JLabel t;
    
    public CuentaKilometros (JPanel p) {
        inicializar(p);
    }
    
    private void inicializar (JPanel p) {
        titulo = new JLabel();
        titulo.setText("CUENTAKILÓMETROS");
        titulo.setBounds(10,200,200,20);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setForeground(Color.WHITE);
        titulo.setOpaque(true);
        titulo.setBackground(Color.BLACK);
        titulo.setFont(new Font("arial", Font.ITALIC, 15));
        p.add(titulo);
        
        reciente = new JLabel();
        reciente.setText("contador reciente");
        reciente.setBounds(20,280,150,20);
        reciente.setHorizontalAlignment(SwingConstants.CENTER);
        reciente.setForeground(Color.BLACK);
        reciente.setFont(new Font("arial", Font.ITALIC, 15));
        p.add(reciente); 
        
        kmTotales = new JLabel();
        kmTotales.setText("contador total");
        kmTotales.setBounds(20,365,125,20);
        kmTotales.setHorizontalAlignment(SwingConstants.CENTER);
        kmTotales.setForeground(Color.BLACK);
        kmTotales.setFont(new Font("arial", Font.ITALIC, 15));
        p.add(kmTotales); 
        
        r = new JLabel();
        r.setText("0.0");
        r.setBounds(210,280,100,20);
        r.setHorizontalAlignment(SwingConstants.CENTER);
        r.setForeground(Color.RED);
        r.setOpaque(true);
        r.setBackground(Color.BLACK);
        r.setFont(new Font("arial", Font.ITALIC, 15));
        p.add(r);   
        
        t = new JLabel();
        t.setText("0.0");
        t.setBounds(210,365,100,20);
        t.setHorizontalAlignment(SwingConstants.CENTER);
        t.setForeground(Color.RED);
        t.setOpaque(true);
        t.setBackground(Color.BLACK);
        t.setFont(new Font("arial", Font.ITALIC, 15));
        p.add(t); 
    }
    
    public void update (double distancia){
        r.setText(String.valueOf(distancia));
        t.setText(String.valueOf(distancia));
    }
}
