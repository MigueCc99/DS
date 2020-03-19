/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import s3.Observable;
import s3.Observer;
import s3.Simulador;

/**
 *
 * @author pvr999
 */
public class TiempoSatelital extends JFrame implements Observer {
    private Simulador sujetoObservable;
    private ArrayList<Simulador> sujetosObservables = new ArrayList<Simulador>();
    private JPanel panel;
    private JLabel fondo;
    private JLabel TCgranada;
    private JLabel TCmadrid;
    private JLabel TCzaragoza;
    private JLabel TCoviedo;
    
    
    public TiempoSatelital (){
        setSize(630,650);                                   // Tamaño de la ventana
        setMinimumSize(new Dimension(200,200));             // Tamaño mínimo
        inicializar ();                                     // Inicializamos la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE);            // Establecemos la finalización de la aplicación al cerrar la ventana
        setTitle("Tiempo Satelital");                       // Título de la ventana
        setLocation(100,550);                               // Centramos la pantalla
        setVisible(true);
    }
    
    public void inicializar() {
        
      // Configuración del Panel
      panel = new JPanel();                                 // Creamos el panel
      panel.setLayout(null);                                // Desactivamos el layout
      this.getContentPane().add(panel);                     // Agregamos el panel a la ventana
      //panel.setBackground(Color.BLUE);                    // Cambiamos el color al panel
      
      TCgranada = new JLabel("0 ºC", SwingConstants.CENTER);
      TCgranada.setBounds(300,495,30,20);
      TCgranada.setForeground(Color.BLACK);
      TCgranada.setOpaque(rootPaneCheckingEnabled);
      TCgranada.setBackground(Color.WHITE); 
      panel.add(TCgranada);
      
      
      TCmadrid = new JLabel("0 ºC", SwingConstants.CENTER);
      TCmadrid.setBounds(295,305,30,20);
      TCmadrid.setForeground(Color.BLACK);
      TCmadrid.setOpaque(rootPaneCheckingEnabled);
      TCmadrid.setBackground(Color.WHITE); 
      panel.add(TCmadrid);
      
      TCzaragoza = new JLabel("0 ºC", SwingConstants.CENTER);
      TCzaragoza.setBounds(420,230,30,20);
      TCzaragoza.setForeground(Color.BLACK);
      TCzaragoza.setOpaque(rootPaneCheckingEnabled);
      TCzaragoza.setBackground(Color.WHITE); 
      panel.add(TCzaragoza);
      
      TCoviedo = new JLabel("0 ºC", SwingConstants.CENTER);
      TCoviedo.setBounds(195,115,30,20);
      TCoviedo.setForeground(Color.BLACK);
      TCoviedo.setOpaque(rootPaneCheckingEnabled);
      TCoviedo.setBackground(Color.WHITE); 
      panel.add(TCoviedo);
      
      // Configuración de la imagen - Mapa
      JLabel fondo = new JLabel(new ImageIcon("mapa.jpg"));
      fondo.setBounds(10, 10, 600, 600);
      panel.add(fondo);
      
    }
    
    public void setSujetosObservables(Observable o1,Observable o2,Observable o3, Observable o4) {
        sujetosObservables.add( (Simulador) o1 );
        sujetosObservables.add( (Simulador) o2 );
        sujetosObservables.add( (Simulador) o3 );
        sujetosObservables.add( (Simulador) o4 );
    }
    
    @Override
    public void update (Observable o){
        TCgranada.setText( Integer.toString( sujetosObservables.get(0).getTemperaturaActual())+"ºC");
        TCmadrid.setText( Integer.toString( sujetosObservables.get(1).getTemperaturaActual())+"ºC");
        TCzaragoza.setText( Integer.toString( sujetosObservables.get(2).getTemperaturaActual())+"ºC");
        TCoviedo.setText( Integer.toString( sujetosObservables.get(3).getTemperaturaActual())+"ºC");
    }
}
