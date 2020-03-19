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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import s3.Observable;
import s3.Observer;
import s3.Simulador;

public class BotonCambio extends JFrame implements Observer {
    private Simulador sujetoObservable;
    private JPanel panel;
    private JLabel Titulo;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    
    public BotonCambio (){
        setSize(500,300);
        setMinimumSize(new Dimension(200,200));
        inicializar ();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Gestión de Temperatura");
        setLocation(200,200);
        setVisible(true);
    }
    
    private void inicializar (){
    // Configuración del Panel
        panel = new JPanel();           
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
    // Configuración del "Título"
        Titulo = new JLabel();
        Titulo.setText("MODIFICADOR DE TEMPERATURA");
        Titulo.setBounds(100,30,300,50);
        Titulo.setHorizontalAlignment(SwingConstants.CENTER);
        Titulo.setForeground(Color.RED);
        Titulo.setOpaque(rootPaneCheckingEnabled);
        Titulo.setBackground(Color.BLACK);
        Titulo.setFont(new Font("arial", Font.BOLD, 16));
        panel.add(Titulo);
    
    // Configuración de botones
    // Boton1 (disminuir temperatura)
        boton1 = new JButton();
        boton1.setText("Disminuir Temperatura");
        boton1.setBounds(30,150,200,50);
    //  boton1.setMnemonic('-');
        boton1.setForeground(Color.BLUE);
        boton1.setFont(new Font("arial", Font.ITALIC, 13));
        panel.add(boton1);
    // Boton2 (aumentar temperatura)
        boton2 = new JButton();
        boton2.setText("Aumentar Temperatura");
        boton2.setBounds(275,150,200,50);
    //  boton2.setMnemonic('+');
        boton2.setForeground(Color.RED);
        boton2.setFont(new Font("arial", Font.ITALIC, 13));
        panel.add(boton2);
    // boton3 (manual on/off)
        boton3 = new JButton();
        boton3.setText("Manual ON/OFF");
        boton3.setBounds(150,210,200,50);
        boton3.setForeground(Color.BLACK);
        boton3.setFont(new Font("arial", Font.ITALIC, 13));        
        panel.add(boton3);
        
        gestionarEventos();
    }
    
    private void gestionarEventos(){
    // Agregamos ActionListener para gestionar eventos al pulsar los botones
        ActionListener al1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(sujetoObservable.getTemperaturaMin() < sujetoObservable.getTemperaturaActual())
                    sujetoObservable.setTemperaturaActual(sujetoObservable.getTemperaturaActual()-1);
            }
        };
        
        boton1.addActionListener(al1);
        
        ActionListener al2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(sujetoObservable.getTemperaturaMax() > sujetoObservable.getTemperaturaActual())
                    sujetoObservable.setTemperaturaActual(sujetoObservable.getTemperaturaActual()+1);
            }
        };
        
        boton2.addActionListener(al2);
        
        ActionListener al3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(sujetoObservable.getManual())
                    sujetoObservable.setManual(false);
                else
                    sujetoObservable.setManual(true);
            }
        };
        
        boton3.addActionListener(al3);        
    }
    
    @Override
    public void update(Observable o) {
        sujetoObservable = (Simulador)o;
    }
}
